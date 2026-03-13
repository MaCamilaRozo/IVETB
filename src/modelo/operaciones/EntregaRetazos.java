package modelo.operaciones;

import modelo.personas.Empleado;
import modelo.personas.Colaboradora;
import modelo.productos.Producto;

import java.sql.Timestamp;

public class EntregaRetazos {

    private int idEntrega;
    private Producto producto;
    private Empleado empleado;
    private Colaboradora colaboradora;

    private double cantidadEntregada;
    private Timestamp fechaEntrega;

    // Constructor vacío
    public EntregaRetazos() {
    }

    // Constructor con parámetros
    public EntregaRetazos(int idEntrega,
            Producto producto,
            Empleado empleado,
            Colaboradora colaboradora,
            double cantidadEntregada,
            Timestamp fechaEntrega) {

        this.idEntrega = idEntrega;
        this.producto = producto;
        this.empleado = empleado;
        this.colaboradora = colaboradora;
        this.cantidadEntregada = cantidadEntregada;
        this.fechaEntrega = fechaEntrega;
    }

    public void mostrarEntregaRetazos() {

        System.out.println("ID Entrega: " + idEntrega);
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Empleado: " + empleado.getNombre() + " " + empleado.getApellido());
        System.out.println("Colaboradora: " + colaboradora.getNombre() + " " + colaboradora.getApellido());
        System.out.println("Cantidad entregada: " + cantidadEntregada);
        System.out.println("Fecha entrega: " + fechaEntrega);
    }

    // GETTERS Y SETTERS

    public int getIdEntrega() {
        return idEntrega;
    }

    public void setIdEntrega(int idEntrega) {
        this.idEntrega = idEntrega;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Colaboradora getColaboradora() {
        return colaboradora;
    }

    public void setColaboradora(Colaboradora colaboradora) {
        this.colaboradora = colaboradora;
    }

    public double getCantidadEntregada() {
        return cantidadEntregada;
    }

    public void setCantidadEntregada(double cantidadEntregada) {
        this.cantidadEntregada = cantidadEntregada;
    }

    public Timestamp getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Timestamp fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
}