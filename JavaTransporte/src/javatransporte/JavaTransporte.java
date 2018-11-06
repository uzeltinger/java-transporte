
package javatransporte;

import java.util.Iterator;
import java.util.List;
import listados.Listados;
import modelos.Cliente;
import vistas.PantallaListaDeCamiones;


public class JavaTransporte {

 
    public static void main(String[] args) {
        // TODO code application logic here
       // new PantallaListaDeCamiones().setVisible(true);
        List<Cliente> clientes = new Listados().Obtenerclientes();
        //System.out.println("Clientes: "+clientes.get(1).datosC());
        Iterator<Cliente> iterador = clientes.iterator();
        while(iterador.hasNext()){
            Cliente c = iterador.next();
            System.out.println("Cliente "+c.datosC());
        }
    }
    
}
