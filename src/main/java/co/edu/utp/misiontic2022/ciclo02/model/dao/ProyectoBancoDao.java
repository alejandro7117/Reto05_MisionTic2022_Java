package co.edu.utp.misiontic2022.ciclo02.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.edu.utp.misiontic2022.ciclo02.model.vo.ProyectoBancoVo;
import co.edu.utp.misiontic2022.ciclo02.util.JDBCUtilities;

public class ProyectoBancoDao {
    public List<ProyectoBancoVo> listarProyectosBanco(String banco) throws SQLException {
        List<ProyectoBancoVo> respuesta = new ArrayList<>();
        var conn = JDBCUtilities.getConnection();
        PreparedStatement stmt = null;
        ResultSet rset = null;
        try {
            var query = "SELECT ID_Proyecto AS \"ID\", Constructora , Ciudad , Clasificacion ,"
                    + " (SELECT Estrato FROM Tipo WHERE TIPO.ID_Tipo = Proyecto.ID_Tipo) AS \"Estrato\","
                    + " (SELECT Nombre || \" \" || Primer_Apellido || \" \" || Segundo_Apellido FROM Lider WHERE Lider.ID_Lider = Proyecto.ID_Lider) AS \"Lider\""
                    + " FROM Proyecto" + " WHERE  Banco_Vinculado = ?"
                    + " ORDER BY Fecha_Inicio DESC , Ciudad , Constructora";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, banco);
            rset = stmt.executeQuery();
            while (rset.next()) {
                var vo = new ProyectoBancoVo();
                vo.setId(rset.getInt("id"));
                vo.setCiudad(rset.getString("ciudad"));
                vo.setConstructora(rset.getString("constructora"));
                vo.setEstrato(rset.getInt("estrato"));
                vo.setLider(rset.getString("lider"));
                vo.setClasificacion(rset.getString("clasificacion"));

                respuesta.add(vo);

            }
        } finally {
            if (rset != null) {
                rset.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }

        }

        return respuesta;
    }

}
