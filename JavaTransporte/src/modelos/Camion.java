package modelos;

public class Camion {
    private String patente;
    private String marca;
    private String modelo;
    private String tipo;
    private String seguro;
    private Boolean propio;
    private Empleado chofer;

    public Camion() {
    }

    public Camion(String patente, String marca, String modelo, String tipo, String seguro, Boolean propio) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.seguro = seguro;
        this.propio = propio;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSeguro() {
        return seguro;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }

    public Boolean getPropio() {
        return propio;
    }

    public void setPropio(Boolean propio) {
        this.propio = propio;
    }

    public Empleado getChofer() {
        return chofer;
    }

    public void setChofer(Empleado chofer) {
        this.chofer = chofer;
    }
  
    @Override
    public String toString() {
        return this.patente;
    }
    
    
}