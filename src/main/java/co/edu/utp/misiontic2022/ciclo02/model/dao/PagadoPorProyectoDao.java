package co.edu.utp.misiontic2022.ciclo02.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.edu.utp.misiontic2022.ciclo02.model.vo.PagadoPorProyectoVo;
import co.edu.utp.misiontic2022.ciclo02.util.JDBCUtilities;

public class PagadoPorProyectoDao {
    public List<PagadoPorProyectoVo> listarPagoProyecto(Double limiteinferior) throws SQLException {
        List<PagadoPorProyectoVo> respuesta = new ArrayList<>();
        var conn = JDBCUtilities.getConnection();
        PreparedStatement stmt = null;
        ResultSet rset = null;
        try {
            var query = "SELECT Compra.ID_Proyecto AS \"ID\", SUM(mc.Precio_Unidad * Compra.Cantidad ) AS \"Valor\""
                    + " FROM Compra" + " INNER JOIN MaterialConstruccion mc"
                    + " ON mc.ID_MaterialConstruccion = Compra.ID_MaterialConstruccion" 
                    + " WHERE Compra.Pagado = 'Si'"
                    + " GROUP BY Compra.ID_Proyecto" + " HAVING Valor > ?" 
                    + " ORDER BY Valor DESC";
            stmt = conn.prepareStatement(query);
            stmt.setDouble(1, limiteinferior);
            rset = stmt.executeQuery();

            while (rset.next()) {
                var vo = new PagadoPorProyectoVo();
                vo.setId(rset.getInt("id"));
                vo.setValor(rset.getDouble("valor"));

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
