package modelo.transacciones;

import modelo.personas.Cliente;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Venta {

    private int idVenta;
    private Cliente cliente;
    private double totalVenta;
    private EstadoVenta estadoVenta;
    private Timestamp fechaVenta;

    private List<DetalleVenta> detalles;

    // ENUM equivalente al SQL ENUM
    public enum EstadoVenta {
        pendiente,
        pagada,
        anulada
    }

    // Constructor vacío
    public Venta() {
        this.detalles = new ArrayList<>();
    }

    // Constructor con parámetros
    public Venta(int idVenta, Cliente cliente, double totalVenta, EstadoVenta estadoVenta, Timestamp fechaVenta) {
        this.idVenta = idVenta;
        this.cliente = cliente;
        this.totalVenta = totalVenta;
        this.estadoVenta = estadoVenta;
        this.fechaVenta = fechaVenta;
        this.detalles = new ArrayList<>();
    }

    public void agregarDetalle(DetalleVenta detalle) {
        detalles.add(detalle);
    }

    public void mostrarVenta() {
        System.out.println("ID Venta: " + idVenta);
        System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getApellido());
        System.out.println("Estado: " + estadoVenta);
        System.out.println("Total: " + totalVenta);
        System.out.println("Fecha: " + fechaVenta);

        System.out.println("----- Detalles -----");

        for (DetalleVenta d : detalles) {
            d.mostrarDetalleVenta();
        }
    }

    // GETTERS Y SETTERS

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }

    public EstadoVenta getEstadoVenta() {
        return estadoVenta;
    }

    public void setEstadoVenta(EstadoVenta estadoVenta) {
        this.estadoVenta = estadoVenta;
    }

    public Timestamp getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Timestamp fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public List<DetalleVenta> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetalleVenta> detalles) {
        this.detalles = detalles;
    }
}