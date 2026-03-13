package modelo.transacciones;

import modelo.productos.Producto;

public class DetalleVenta {

    private int idDetalleVenta;
    private Venta venta;
    private Producto producto;

    private double cantidad;
    private double precioUnitario;
    private double subtotal;

    // Constructor vacío
    public DetalleVenta() {
    }

    // Constructor con parámetros
    public DetalleVenta(int idDetalleVenta, Venta venta, Producto producto,
            double cantidad, double precioUnitario) {

        this.idDetalleVenta = idDetalleVenta;
        this.venta = venta;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.subtotal = cantidad * precioUnitario;
    }

    public void calcularSubtotal() {
        this.subtotal = cantidad * precioUnitario;
    }

    public void mostrarDetalleVenta() {

        calcularSubtotal();

        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: " + precioUnitario);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("------------------");
    }

    // GETTERS Y SETTERS

    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
        calcularSubtotal();
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
        calcularSubtotal();
    }

    public double getSubtotal() {
        return subtotal;
    }
}