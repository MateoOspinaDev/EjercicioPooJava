package SuperMercado.Modelo;

public class Shampoo extends Producto {
    private int contenido;
    public Shampoo(String nombre, int contenido, int precio) {
        super(nombre, precio);
        this.contenido=contenido;
    }

    @Override
    public String toString() {
        return "Nombre: "+getNombre()+" /// Contenido: "+contenido+"ml /// Precio: $"+getPrecio();
    }

}
