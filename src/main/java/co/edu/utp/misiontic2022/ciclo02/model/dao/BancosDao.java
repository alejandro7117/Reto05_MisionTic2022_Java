package co.edu.utp.misiontic2022.ciclo02.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.edu.utp.misiontic2022.ciclo02.model.vo.BancosVo;
import co.edu.utp.misiontic2022.ciclo02.util.JDBCUtilities;

public class BancosDao {
    public List<BancosVo> listarNombresBancos() throws SQLException {
        List<BancosVo> respuesta = new ArrayList<>();
        var conn = JDBCUtilities.getConnection();
        PreparedStatement stmt = null;
        ResultSet rset = null;
        try {
            var query = "SELECT Banco_Vinculado AS \"Banco\"" 
            + " FROM Proyecto" 
            + " GROUP BY Banco_Vinculado";
            stmt = conn.prepareStatement(query);
            rset = stmt.executeQuery();
            while (rset.next()) {
                var vo = new BancosVo();
                vo.setNombreBanco(rset.getString("Banco"));

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