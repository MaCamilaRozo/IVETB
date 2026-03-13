package modelo.personas;

import java.sql.Timestamp;

public class Proveedor {

    private int idProveedor;
    private String razonSocial;
    private String documentoIdentidad;
    private String correo;
    private String contacto;
    private String telefono;
    private String direccion;
    private Timestamp fechaRegistro;

    // Constructor sin parámetros
    public Proveedor() {
    }

    public Proveedor(int idProveedor, String razonSocial, String documentoIdentidad,
            String correo, String contacto, String telefono,
            String direccion, Timestamp fechaRegistro) {

        this.idProveedor = idProveedor;
        this.razonSocial = razonSocial;
        this.documentoIdentidad = documentoIdentidad;
        this.correo = correo;
        this.contacto = contacto;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fechaRegistro = fechaRegistro;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContacto() {
        return contacto;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public Timestamp getFechaRegistro() {
        return fechaRegistro;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setFechaRegistro(Timestamp fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public void mostrarProveedor() {

        System.out.println("ID Proveedor: " + idProveedor);
        System.out.println("Razón Social: " + razonSocial);
        System.out.println("Documento Identidad: " + documentoIdentidad);
        System.out.println("Correo: " + correo);
        System.out.println("Contacto: " + contacto);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Dirección: " + direccion);
        System.out.println("Fecha Registro: " + fechaRegistro);
    }

}
