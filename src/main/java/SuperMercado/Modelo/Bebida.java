package SuperMercado.Modelo;

public class Bebida extends Producto {
    private Double tamaño;
    public Bebida(String nombre,Double tamaño, int precio) {
        super(nombre, precio);
        this.tamaño=tamaño;
    }


    @Override
    public String toString() {
        return  "Nombre: "+getNombre()+" /// Litros: "+tamaño+" /// Precio: $"+getPrecio();
    }
}
