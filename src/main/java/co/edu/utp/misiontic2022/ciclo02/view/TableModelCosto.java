/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.misiontic2022.ciclo02.view;

import co.edu.utp.misiontic2022.ciclo02.model.vo.PagadoPorProyectoVo;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import java.util.List;

/**
 *
 * @author ALEJANDRO
 */
public class TableModelCosto extends AbstractTableModel {
    private List<PagadoPorProyectoVo> pagos;

    public TableModelCosto() {
        this(new ArrayList<>());
    }

    public TableModelCosto(List<PagadoPorProyectoVo> pagos) {
        this.pagos = pagos;
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Id";
            case 1:
                return "Valor";   
        }
        return super.getColumnName(column);
    }
    

   @Override
    public int getRowCount() {
        return pagos.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int row, int column) {
        var pago = pagos.get(row);
        switch (column) {
            case 0:
                return pago.getId();
            case 1:
                return pago.getValor();
        }
        return null;
    }
	

}
