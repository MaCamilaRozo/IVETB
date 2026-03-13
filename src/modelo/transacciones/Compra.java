package modelo.transacciones;

import modelo.personas.Proveedor;
import java.sql.Timestamp;
import java.util.List;

public class Compra {

    private int idCompra;
    private Proveedor proveedor;
    private Timestamp fechaCompra;
    private double totalCompra;
    private String estadoCompra;
    private List<DetalleCompra> detalles;

    // Constructor vacío
    public Compra() {
    }

    // Constructor con parámetros
    public Compra(int idCompra, Proveedor proveedor, Timestamp fechaCompra,
            double totalCompra, String estadoCompra,
            List<DetalleCompra> detalles) {

        this.idCompra = idCompra;
        this.proveedor = proveedor;
        this.fechaCompra = fechaCompra;
        this.totalCompra = totalCompra;
        this.estadoCompra = estadoCompra;
        this.detalles = detalles;
    }

    // Getters

    public int getIdCompra() {
        return idCompra;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public Timestamp getFechaCompra() {
        return fechaCompra;
    }

    public double getTotalCompra() {
        return totalCompra;
    }

    public String getEstadoCompra() {
        return estadoCompra;
    }

    public List<DetalleCompra> getDetalles() {
        return detalles;
    }

    // Setters

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public void setFechaCompra(Timestamp fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public void setTotalCompra(double totalCompra) {
        this.totalCompra = totalCompra;
    }

    public void setEstadoCompra(String estadoCompra) {
        this.estadoCompra = estadoCompra;
    }

    public void setDetalles(List<DetalleCompra> detalles) {
        this.detalles = detalles;
    }

    // Método de visualización

    public void mostrarCompra() {

        System.out.println("ID Compra: " + idCompra);
        System.out.println("Proveedor: " + proveedor.getRazonSocial());
        System.out.println("Fecha Compra: " + fechaCompra);
        System.out.println("Total Compra: " + totalCompra);
        System.out.println("Estado: " + estadoCompra);

        if (detalles != null) {
            System.out.println("Detalles de la compra:");
            for (DetalleCompra d : detalles) {
                d.mostrarDetalleCompra();
            }
        }
    }
}