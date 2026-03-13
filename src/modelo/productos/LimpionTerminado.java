package modelo.productos;

public class LimpionTerminado extends Producto {

    private String presentacion;
    private double precioVenta;

    public LimpionTerminado() {
    }

    public LimpionTerminado(int idProducto, UnidadMedida unidadMedida, String nombre,
            String tipoProducto, String descripcion,
            String presentacion, double precioVenta) {

        super(idProducto, unidadMedida, nombre, tipoProducto, descripcion);
        this.presentacion = presentacion;
        this.precioVenta = precioVenta;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public void mostrarLimpionTerminado() {

        mostrarProducto();

        System.out.println("Presentación: " + presentacion);
        System.out.println("Precio Venta: " + precioVenta);
    }
}