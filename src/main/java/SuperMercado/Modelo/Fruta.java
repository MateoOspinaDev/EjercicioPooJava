package SuperMercado.Modelo;

public class Fruta extends Producto{
    private String unidadDeVenta;
    public Fruta(String nombre, int precio, String unidadDeVenta) {
        super(nombre, precio);
        this.unidadDeVenta = unidadDeVenta;
    }

    @Override
    public String toString() {
        return "Nombre: "+getNombre()+" /// Precio: $"+getPrecio()+" /// Unidad de venta: "+unidadDeVenta;
    }

}
