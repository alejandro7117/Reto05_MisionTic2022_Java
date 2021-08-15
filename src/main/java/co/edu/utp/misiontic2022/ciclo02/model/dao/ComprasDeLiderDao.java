package co.edu.utp.misiontic2022.ciclo02.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.edu.utp.misiontic2022.ciclo02.model.vo.ComprasDeLiderVo;
import co.edu.utp.misiontic2022.ciclo02.util.JDBCUtilities;

public class ComprasDeLiderDao {
    public List<ComprasDeLiderVo> lsitarComprasLider() throws SQLException {
        List<ComprasDeLiderVo> respuesta = new ArrayList<>();
        var conn = JDBCUtilities.getConnection();
        PreparedStatement stmt = null;
        ResultSet rset = null;
        try {
            var query = "SELECT (Lider.Nombre || \" \" || Lider.Primer_Apellido || \" \" || Lider.Segundo_Apellido ) AS \"Lider\", SUM(mc.Precio_Unidad * Compra.Cantidad ) AS \"Valor\""
                    + " FROM Lider" 
                    + " INNER JOIN Proyecto" 
                    + " ON Proyecto.ID_Lider  = Lider.ID_Lider"
                    + " INNER JOIN Compra" 
                    + " ON Proyecto.ID_Proyecto = Compra.ID_Proyecto"
                    + " INNER JOIN MaterialConstruccion mc"
                    + " ON mc.ID_MaterialConstruccion = Compra.ID_MaterialConstruccion" 
                    + " GROUP BY Lider.ID_Lider"
                    + " ORDER by Valor ASC" 
                    + " LIMIT 10";
            stmt = conn.prepareStatement(query);
            rset = stmt.executeQuery();
            while (rset.next()) {
                var vo = new ComprasDeLiderVo();
                vo.setLider(rset.getString("lider"));
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
