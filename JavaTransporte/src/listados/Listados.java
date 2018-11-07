package listados;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import modelos.Camion;
import modelos.Ciudad;
import modelos.Cliente;
import modelos.Empleado;

public class Listados {
    
    List<Empleado> empleados = ObtenerEmpleados();
    
    public List ObtenerChoferes(){        
        List<Empleado> choferes = new ArrayList();        
        Iterator<Empleado> itE = empleados.iterator();
        while(itE.hasNext()){
            Empleado e = itE.next();
            if(e.esChofer()){
                choferes.add(e);
            }
        }        
        return choferes;
    }
    
    public List ObtenerEmpleados(){
        List<Empleado> empleados = new ArrayList();        
        // puesto,  nombre,  apellido,  tipoDocumento,  numeroDocumento,  direccion,  ciudad
        empleados.add(new Empleado("Secretaria","Juana","García","DNI","23456789","Colón 1234",null));
        empleados.add(new Empleado("Chofer","Juan","García","DNI","23456789","Colón 1234",null));
        empleados.add(new Empleado("Chofer","Diego","Lopez","DNI","23456789","Colón 1234",null));
        empleados.add(new Empleado("Chofer","Pedro","Martinez","DNI","23456789","Colón 1234",null));
        empleados.add(new Empleado("Chofer","Claudio","Pareto","DNI","23456789","Colón 1234",null));
        empleados.add(new Empleado("Chofer de Reparto","Daniel","Pareto","DNI","23456789","Colón 1234",null));        
        empleados.add(new Empleado("Receptor","Juan Jose","Pareto","DNI","23456789","Colón 1234",null));
        empleados.add(new Empleado("Administrativo","Pepe","Mujica","DNI","23456789","Colón 1234",null));
        
        return empleados;
    }
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
