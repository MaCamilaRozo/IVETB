package modelo.productos;

public class LimpionCortado extends Producto {

    private String dimensiones;
    private double gramaje;

    public LimpionCortado() {
    }

    public LimpionCortado(int idProducto, UnidadMedida unidadMedida, String nombre,
            String tipoProducto, String descripcion,
            String dimensiones, double gramaje) {

        super(idProducto, unidadMedida, nombre, tipoProducto, descripcion);
        this.dimensiones = dimensiones;
        this.gramaje = gramaje;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public double getGramaje() {
        return gramaje;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public void setGramaje(double gramaje) {
        this.gramaje = gramaje;
    }

    public void mostrarLimpionCortado() {

        mostrarProducto();

        System.out.println("Dimensiones: " + dimensiones);
        System.out.println("Gramaje: " + gramaje);
    }
}