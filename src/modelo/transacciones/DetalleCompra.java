package modelo.transacciones;

import modelo.productos.Producto;

public class DetalleCompra {

    private int idDetalleCompra;
    private Compra compra;
    private Producto producto;
    private double cantidad;
    private double costoUnitario;
    private double subtotal;

    // Constructor vacío
    public DetalleCompra() {
    }

    // Constructor con parámetros
    public DetalleCompra(int idDetalleCompra, Compra compra, Producto producto,
            double cantidad, double costoUnitario) {

        this.idDetalleCompra = idDetalleCompra;
        this.compra = compra;
        this.producto = producto;
        this.cantidad = cantidad;
        this.costoUnitario = costoUnitario;
        this.subtotal = cantidad * costoUnitario;
    }

    // Getters

    public int getIdDetalleCompra() {
        return idDetalleCompra;
    }

    public Compra getCompra() {
        return compra;
    }

    public Producto getProducto() {
        return producto;
    }

    public double getCantidad() {
        return cantidad;
    }

    public double getCostoUnitario() {
        return costoUnitario;
    }

    public double getSubtotal() {
        return subtotal;
    }

    // Setters

    public void setIdDetalleCompra(int idDetalleCompra) {
        this.idDetalleCompra = idDetalleCompra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void setCostoUnitario(double costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

    public void calcularSubtotal() {
        this.subtotal = cantidad * costoUnitario;
    }

    // Visualización

    public void mostrarDetalleCompra() {

        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Costo Unitario: " + costoUnitario);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("--------------------");
    }
}