package modelo.productos;

import java.sql.Timestamp;

public class Stock {

    private int idStock;
    private Producto producto;
    private double cantidadDisponible;
    private double puntoReorden;
    private String ubicacion;
    private Timestamp actualizadoEn;

    // Constructor sin parámetros
    public Stock() {
    }

    // Constructor con parámetros
    public Stock(int idStock, Producto producto, double cantidadDisponible,
            double puntoReorden, String ubicacion, Timestamp actualizadoEn) {

        this.idStock = idStock;
        this.producto = producto;
        this.cantidadDisponible = cantidadDisponible;
        this.puntoReorden = puntoReorden;
        this.ubicacion = ubicacion;
        this.actualizadoEn = actualizadoEn;
    }

    // Getters

    public int getIdStock() {
        return idStock;
    }

    public Producto getProducto() {
        return producto;
    }

    public double getCantidadDisponible() {
        return cantidadDisponible;
    }

    public double getPuntoReorden() {
        return puntoReorden;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public Timestamp getActualizadoEn() {
        return actualizadoEn;
    }

    // Setters

    public void setIdStock(int idStock) {
        this.idStock = idStock;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setCantidadDisponible(double cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public void setPuntoReorden(double puntoReorden) {
        this.puntoReorden = puntoReorden;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setActualizadoEn(Timestamp actualizadoEn) {
        this.actualizadoEn = actualizadoEn;
    }

    // Método de visualización

    public void mostrarStock() {

        System.out.println("ID Stock: " + idStock);
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Cantidad Disponible: " + cantidadDisponible);
        System.out.println("Punto de Reorden: " + puntoReorden);
        System.out.println("Ubicación: " + ubicacion);
        System.out.println("Actualizado En: " + actualizadoEn);
    }

}