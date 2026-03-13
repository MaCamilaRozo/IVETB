package modelo.personas;

import java.sql.Timestamp;

public class Cliente {

    private int idCliente;
    private String nombre;
    private String apellido;
    private String documentoIdentidad;
    private String correo;
    private String telefono;
    private String direccion;
    private String ciudad;
    private Timestamp fechaRegistro;

    // Constructor sin parámetros
    public Cliente() {
    }

    // Constructor con parámetros
    public Cliente(int idCliente, String nombre, String apellido,
            String documentoIdentidad, String correo,
            String telefono, String direccion,
            String ciudad, Timestamp fechaRegistro) {

        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.documentoIdentidad = documentoIdentidad;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.fechaRegistro = fechaRegistro;
    }

    // Getters

    public int getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public Timestamp getFechaRegistro() {
        return fechaRegistro;
    }

    // Setters

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setFechaRegistro(Timestamp fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    // Método para mostrar los datos

    public void mostrarCliente() {

        System.out.println("ID Cliente: " + idCliente);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Documento Identidad: " + documentoIdentidad);
        System.out.println("Correo: " + correo);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Dirección: " + direccion);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Fecha Registro: " + fechaRegistro);
    }
}
