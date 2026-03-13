package modelo.personas;

public class Colaboradora {

    // Atributos
    private int idColaboradora;
    private String nombre;
    private String apellido;
    private String direccion;
    private String documentoIdentidad;
    private String telefono;

    // Constructor sin parámetros
    public Colaboradora() {
    }

    // Constructor con parámetros
    public Colaboradora(int idColaboradora, String nombre, String apellido, String direccion,
            String documentoIdentidad, String telefono) {
        this.idColaboradora = idColaboradora;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.documentoIdentidad = documentoIdentidad;
        this.telefono = telefono;
    }

    // Getters

    public int getIdColaboradora() {
        return idColaboradora;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public String getTelefono() {
        return telefono;
    }

    // Setters

    public void setIdColaboradora(int idColaboradora) {
        this.idColaboradora = idColaboradora;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Método para visualizar datos

    public void mostrarColaboradora() {
        System.out.println("ID Colaboradora: " + idColaboradora);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Dirección: " + direccion);
        System.out.println("Documento de Identidad: " + documentoIdentidad);
        System.out.println("Teléfono: " + telefono);
    }
}