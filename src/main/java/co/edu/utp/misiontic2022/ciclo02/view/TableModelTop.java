/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.misiontic2022.ciclo02.view;

import co.edu.utp.misiontic2022.ciclo02.model.vo.ComprasDeLiderVo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ALEJANDRO
 */
class TableModelTop extends AbstractTableModel {
    private List<ComprasDeLiderVo> tops;

    public TableModelTop() {
        this(new ArrayList<>());
    }

    public TableModelTop(List<ComprasDeLiderVo> tops) {
        this.tops = tops;
    }

    
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Lider";
            case 1:
                return "Valor";   
        }
        return super.getColumnName(column);
    }
    

   @Override
    public int getRowCount() {
        return tops.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int row, int column) {
        var top = tops.get(row);
        switch (column) {
            case 0:
                return top.getLider();
            case 1:
                return top.getValor();
        }
        return null;
    }
}
