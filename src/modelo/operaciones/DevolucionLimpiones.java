package modelo.operaciones;

import modelo.personas.Empleado;
import modelo.personas.Colaboradora;
import modelo.productos.Producto;

import java.sql.Timestamp;

public class DevolucionLimpiones {

    private int idDevolucion;

    private Colaboradora colaboradora;
    private Empleado empleado;
    private Producto producto;

    private double cantidadDevuelta;
    private Timestamp fechaDevolucion;

    // Constructor vacío
    public DevolucionLimpiones() {
    }

    // Constructor con parámetros
    public DevolucionLimpiones(int idDevolucion,
            Colaboradora colaboradora,
            Empleado empleado,
            Producto producto,
            double cantidadDevuelta,
            Timestamp fechaDevolucion) {

        this.idDevolucion = idDevolucion;
        this.colaboradora = colaboradora;
        this.empleado = empleado;
        this.producto = producto;
        this.cantidadDevuelta = cantidadDevuelta;
        this.fechaDevolucion = fechaDevolucion;
    }

    public void mostrarDevolucionLimpiones() {

        System.out.println("ID Devolución: " + idDevolucion);
        System.out.println("Colaboradora: " + colaboradora.getNombre() + " " + colaboradora.getApellido());
        System.out.println("Empleado: " + empleado.getNombre() + " " + empleado.getApellido());
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Cantidad devuelta: " + cantidadDevuelta);
        System.out.println("Fecha devolución: " + fechaDevolucion);
    }

    // GETTERS Y SETTERS

    public int getIdDevolucion() {
        return idDevolucion;
    }

    public void setIdDevolucion(int idDevolucion) {
        this.idDevolucion = idDevolucion;
    }

    public Colaboradora getColaboradora() {
        return colaboradora;
    }

    public void setColaboradora(Colaboradora colaboradora) {
        this.colaboradora = colaboradora;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double getCantidadDevuelta() {
        return cantidadDevuelta;
    }

    public void setCantidadDevuelta(double cantidadDevuelta) {
        this.cantidadDevuelta = cantidadDevuelta;
    }

    public Timestamp getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Timestamp fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
}