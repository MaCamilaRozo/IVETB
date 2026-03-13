package modelo.productos;

public class UnidadMedida {

    private int idUnidad;
    private String nombre;
    private String abreviatura;

    // Constructor sin parámetros
    public UnidadMedida() {
    }

    // Constructor con parámetros
    public UnidadMedida(int idUnidad, String nombre, String abreviatura) {
        this.idUnidad = idUnidad;
        this.nombre = nombre;
        this.abreviatura = abreviatura;
    }

    // Getters

    public int getIdUnidad() {
        return idUnidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    // Setters

    public void setIdUnidad(int idUnidad) {
        this.idUnidad = idUnidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    // Método para mostrar datos

    public void mostrarUnidadMedida() {

        System.out.println("ID Unidad: " + idUnidad);
        System.out.println("Nombre: " + nombre);
        System.out.println("Abreviatura: " + abreviatura);
    }
}