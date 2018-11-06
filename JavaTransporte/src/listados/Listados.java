package listados;

import java.util.ArrayList;
import java.util.List;
import modelos.Camion;
import modelos.Cliente;

public class Listados {
    public List ObtenerCamiones(){
        List<Camion> camiones = new ArrayList();
        Camion Mercedes_1 = new Camion();
        Mercedes_1.setPatente("AAA777");
        Mercedes_1.setMarca("Mercede Benz");
        Mercedes_1.setModelo("1114");
        Mercedes_1.setPropio(true);
        Mercedes_1.setSeguro("San Cristobal");
        Mercedes_1.setTipo("Camión");
        camiones.add(Mercedes_1);
        
        //String patente, String marca, String modelo, String tipo, String seguro, Boolean propio
        camiones.add(new Camion("VBN445","Fiat","673","Camión","Federal",true));
        camiones.add(new Camion("GHK553","Fiat","619","Camión","Sancor",true));
        camiones.add(new Camion("OPT557","Scania","112","Camión","Sancor",true));
        camiones.add(new Camion("ASE229","Scania","114","Camión","Sancor",true));
        camiones.add(new Camion("TER555","Scania","111","Camión","Sancor",true));        
        
        return camiones;
    }
    public List Obtenerclientes(){
        //String nombreEmpresa, String cuitEmpresa,String nombre, String apellido, String tipoDocumento, String numeroDocumento, String direccion, Ciudad ciudad
        List <Cliente> listadoClientes = new ArrayList();
        listadoClientes.add(new Cliente("Fox","21341565220","Martin","Benitez","DNI","23154542","Av.Siempre vivas",null));
        listadoClientes.add(new Cliente("Tyc","21341565444","Martin","Benitez","DNI","23154542","Av.Siempre vivas",null));
        return listadoClientes;
        
    }
}
