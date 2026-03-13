package modelo.operaciones;

import modelo.personas.Empleado;
import modelo.productos.Producto;
import java.sql.Timestamp;

public class Movimiento {

    private int idMovimiento;
    private Empleado empleado;
    private Producto producto;

    private TipoMovimiento tipoMov;
    private double cantidad;
    private String motivo;

    private Timestamp fechaMov;

    // ENUM equivalente al ENUM de SQL
    public enum TipoMovimiento {
        entrada,
        salida,
        ajuste
    }

    // Constructor vacío
    public Movimiento() {
    }

    // Constructor con parámetros
    public Movimiento(int idMovimiento,
            Empleado empleado,
            Producto producto,
            TipoMovimiento tipoMov,
            double cantidad,
            String motivo,
            Timestamp fechaMov) {

        this.idMovimiento = idMovimiento;
        this.empleado = empleado;
        this.producto = producto;
        this.tipoMov = tipoMov;
        this.cantidad = cantidad;
        this.motivo = motivo;
        this.fechaMov = fechaMov;
    }

    public void mostrarMovimiento() {

        System.out.println("ID Movimiento: " + idMovimiento);
        System.out.println("Empleado: " + empleado.getNombre() + " " + empleado.getApellido());
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Tipo movimiento: " + tipoMov);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Motivo: " + motivo);
        System.out.println("Fecha: " + fechaMov);
    }

    // GETTERS Y SETTERS

    public int getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(int idMovimiento) {
        this.idMovimiento = idMovimiento;
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

    public TipoMovimiento getTipoMov() {
        return tipoMov;
    }

    public void setTipoMov(TipoMovimiento tipoMov) {
        this.tipoMov = tipoMov;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Timestamp getFechaMov() {
        return fechaMov;
    }

    public void setFechaMov(Timestamp fechaMov) {
        this.fechaMov = fechaMov;
    }
}