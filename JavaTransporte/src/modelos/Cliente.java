package modelos;

public class Cliente extends Persona {
    private String nombreEmpresa;
    private String cuitEmpresa;
    
    public Cliente() {
    }
    
    public Cliente(String nombreEmpresa, String cuitEmpresa, String nombre, String apellido, String tipoDocumento, String numeroDocumento, String direccion, Ciudad ciudad) {
        super(nombre, apellido, tipoDocumento, numeroDocumento, direccion, ciudad);
        this.nombreEmpresa = nombreEmpresa;
        this.cuitEmpresa = cuitEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getCuitEmpresa() {
        return cuitEmpresa;
    }

    public void setCuitEmpresa(String cuitEmpresa) {
        this.cuitEmpresa = cuitEmpresa;
    }

       
}
