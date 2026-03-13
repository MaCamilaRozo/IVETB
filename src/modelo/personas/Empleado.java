package modelo.personas;

public class Empleado {

    // Atributos
    private int idEmpleado;
    private String nombre;
    private String apellido;
    private String correo;
    private String cargo;
    private String documentoIdentidad;

    // Constructor sin parámetros
    public Empleado() {
    }

    // Constructor con parámetros
    public Empleado(int idEmpleado, String nombre, String apellido, String correo, String cargo,
            String documentoIdentidad) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.cargo = cargo;
        this.documentoIdentidad = documentoIdentidad;
    }

    // Getters

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public String getCargo() {
        return cargo;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    // Setters

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    // Método para visualizar datos

    public void mostrarEmpleado() {
        System.out.println("ID Empleado: " + idEmpleado);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Correo: " + correo);
        System.out.println("Cargo: " + cargo);
        System.out.println("Documento de Identidad: " + documentoIdentidad);
    }
}