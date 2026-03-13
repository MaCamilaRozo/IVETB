package modelo.productos;

public class Retazo extends Producto {

    private String color;
    private double pesoPorUnidad;

    public Retazo() {
    }

    public Retazo(int idProducto, UnidadMedida unidadMedida, String nombre,
            String tipoProducto, String descripcion,
            String color, double pesoPorUnidad) {

        super(idProducto, unidadMedida, nombre, tipoProducto, descripcion);
        this.color = color;
        this.pesoPorUnidad = pesoPorUnidad;
    }

    public String getColor() {
        return color;
    }

    public double getPesoPorUnidad() {
        return pesoPorUnidad;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPesoPorUnidad(double pesoPorUnidad) {
        this.pesoPorUnidad = pesoPorUnidad;
    }

    public void mostrarRetazo() {

        mostrarProducto();

        System.out.println("Color: " + color);
        System.out.println("Peso por unidad: " + pesoPorUnidad);
    }
}