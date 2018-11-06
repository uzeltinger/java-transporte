package modelos;
public class Ciudad {
    private int id;
    private String nombre;
    private Provincia provincia;

    public Ciudad() {
    }

    public Ciudad(int id, String nombre, Provincia provincia) {
        this.id = id;
        this.nombre = nombre;
        this.provincia = provincia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
    
    public String obtenerNombreYProvincia(){
        return this.nombre + " - " + this.provincia.toString();
    }
    
    @Override
    public String toString() {
        return nombre;
    }
    
    
}
