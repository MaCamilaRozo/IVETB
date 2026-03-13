package modelo.productos;

public class Producto {

    protected int idProducto;
    protected UnidadMedida unidadMedida;
    protected String nombre;
    protected String tipoProducto;
    protected String descripcion;

    public Producto() {
    }

    public Producto(int idProducto, UnidadMedida unidadMedida, String nombre, String tipoProducto, String descripcion) {
        this.idProducto = idProducto;
        this.unidadMedida = unidadMedida;
        this.nombre = nombre;
        this.tipoProducto = tipoProducto;
        this.descripcion = descripcion;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void mostrarProducto() {

        System.out.println("ID Producto: " + idProducto);
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipoProducto);
        System.out.println("Descripción: " + descripcion);

        if (unidadMedida != null) {
            System.out.println("Unidad: " + unidadMedida.getNombre());
        }
    }
}