package co.edu.utp.misiontic2022.ciclo02.view;

import co.edu.utp.misiontic2022.ciclo02.model.vo.ProyectoBancoVo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author ALEJANDRO
 */
public class TableModelBanco extends AbstractTableModel {
    private List<ProyectoBancoVo> proyectos;

    public TableModelBanco() {
        this(new ArrayList<>());
    }

    public TableModelBanco(List<ProyectoBancoVo> proyectos) {
        this.proyectos = proyectos;
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Id";
            case 1:
                return "Constructora";
            case 2:
                return "Ciudad";
            case 3:
                return "Clasificacion";
            case 4:
                return "Estrato";
            case 5:
                return "Lider";
            
        }
        return super.getColumnName(column);
    }
    
    
    @Override
    public int getRowCount() {
        return proyectos.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int row, int column) {
        var proyecto = proyectos.get(row);
        switch (column) {
            case 0:
                return proyecto.getId();
            case 1:
                return proyecto.getConstructora();
            case 2:
                return proyecto.getCiudad();
            case 3:
                return proyecto.getClasificacion();
            case 4:
                return proyecto.getEstrato();
            case 5:
                return proyecto.getLider();
            
        }
        return null;
    }
	
}
