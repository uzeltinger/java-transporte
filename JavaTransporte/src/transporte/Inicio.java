package transporte;

import java.util.List;
import listados.Listados;
import modelos.Camion;
import vistas.PantallaListaDeCamiones;

public class Inicio {

    public static void main(String[] args) {
        new PantallaListaDeCamiones().setVisible(true);
        List<Camion> camiones = new Listados().ObtenerCamiones();
        //System.out.println("Camiones: " + camiones.toString());
    }
    
}
