package modelo.operaciones;

import modelo.personas.Colaboradora;

import java.sql.Timestamp;

public class RendimientoColaboradora {

    private int idRendimiento;

    private Colaboradora colaboradora;
    private EntregaRetazos entrega;
    private DevolucionLimpiones devolucion;

    private Timestamp fechaRegistro;

    private double cantidadEntregada;
    private double cantidadDevuelta;

    // Constructor vacío
    public RendimientoColaboradora() {
    }

    // Constructor con parámetros
    public RendimientoColaboradora(int idRendimiento,
            Colaboradora colaboradora,
            EntregaRetazos entrega,
            DevolucionLimpiones devolucion,
            Timestamp fechaRegistro,
            double cantidadEntregada,
            double cantidadDevuelta) {

        this.idRendimiento = idRendimiento;
        this.colaboradora = colaboradora;
        this.entrega = entrega;
        this.devolucion = devolucion;
        this.fechaRegistro = fechaRegistro;
        this.cantidadEntregada = cantidadEntregada;
        this.cantidadDevuelta = cantidadDevuelta;
    }

    // Método que calcula el porcentaje de pérdida
    public double calcularPorcentajePerdida() {

        if (cantidadEntregada > 0) {
            return (cantidadDevuelta / cantidadEntregada) * 100;
        }

        return 0;
    }

    public void mostrarRendimiento() {

        System.out.println("ID Rendimiento: " + idRendimiento);
        System.out.println("Colaboradora: " + colaboradora.getNombre() + " " + colaboradora.getApellido());
        System.out.println("ID Entrega: " + entrega.getIdEntrega());

        if (devolucion != null) {
            System.out.println("ID Devolución: " + devolucion.getIdDevolucion());
        } else {
            System.out.println("Devolución: No registrada");
        }

        System.out.println("Fecha registro: " + fechaRegistro);
        System.out.println("Cantidad entregada: " + cantidadEntregada);
        System.out.println("Cantidad devuelta: " + cantidadDevuelta);

        System.out.println("Porcentaje pérdida: " + calcularPorcentajePerdida() + "%");
    }

    // GETTERS

    public int getIdRendimiento() {
        return idRendimiento;
    }

    public Colaboradora getColaboradora() {
        return colaboradora;
    }

    public EntregaRetazos getEntrega() {
        return entrega;
    }

    public DevolucionLimpiones getDevolucion() {
        return devolucion;
    }

    public Timestamp getFechaRegistro() {
        return fechaRegistro;
    }

    public double getCantidadEntregada() {
        return cantidadEntregada;
    }

    public double getCantidadDevuelta() {
        return cantidadDevuelta;
    }

    // SETTERS

    public void setIdRendimiento(int idRendimiento) {
        this.idRendimiento = idRendimiento;
    }

    public void setColaboradora(Colaboradora colaboradora) {
        this.colaboradora = colaboradora;
    }

    public void setEntrega(EntregaRetazos entrega) {
        this.entrega = entrega;
    }

    public void setDevolucion(DevolucionLimpiones devolucion) {
        this.devolucion = devolucion;
    }

    public void setFechaRegistro(Timestamp fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public void setCantidadEntregada(double cantidadEntregada) {
        this.cantidadEntregada = cantidadEntregada;
    }

    public void setCantidadDevuelta(double cantidadDevuelta) {
        this.cantidadDevuelta = cantidadDevuelta;
    }
}