package tablas;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import listados.Listados;
import modelos.Camion;

public class TablaCamionesModel extends AbstractTableModel {
private static final String[] COLUMNAS = { "Patente", "Marca", "Modelo", "Tipo", "Seguro", "Propio" };
private List<Camion> camiones = new Listados().ObtenerCamiones();

    public TablaCamionesModel(List<Camion> camiones) {
        this.camiones = camiones;
        System.out.println("camiones: " + this.camiones);
    }

    @Override
    public int getRowCount() {
        return this.camiones.size();
    }
    
    @Override
    public String getColumnName(int index) {
        return COLUMNAS[index];
    }

    @Override
    public int getColumnCount() {
        return COLUMNAS.length;
    }    

    @Override
    
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        Object retorno = null;
        Camion camion = camiones.get(rowIndex);
        
        // según la columna deseada obtenemos el valor a mostrar
        //String patente, String marca, String modelo, String tipo, String seguro, Boolean propio
        switch (columnIndex) {
            case 0:
                retorno = camion.getPatente();
                break;
            case 1:
                retorno = camion.getMarca();
                break;
            case 2:
                retorno = camion.getModelo();
                break;
            case 3:
                retorno = camion.getTipo();
                break;
            case 4:
                retorno = camion.getSeguro();
                break;
            case 5:
                retorno = camion.getPropio();
                break;
        }
        
        return retorno;
    }
    
}
