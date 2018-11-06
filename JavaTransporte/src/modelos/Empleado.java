package modelos;

public class Empleado extends Persona {
    private String puesto;

    public Empleado() {
    }

    public Empleado(String puesto) {
        this.puesto = puesto;
    }

    public Empleado(String puesto, String nombre, String apellido, String tipoDocumento, String numeroDocumento, String direccion, Ciudad ciudad) {
        super(nombre, apellido, tipoDocumento, numeroDocumento, direccion, ciudad);
        this.puesto = puesto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    
    
    
}
