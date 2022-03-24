package Test;

import Servicio.SuperMercadoServicio;
import SuperMercado.Modelo.*;

import java.util.ArrayList;

public class SuperMercadoTest {
    public static void main(String[] args) {
        ArrayList<Producto> ListaDeProductos = new ArrayList();
        ListaDeProductos.add(new Bebida("Coca-Cola Zero", 1.5, 20));
        ListaDeProductos.add(new Bebida("Coca-Cola", 1.5, 18));
        ListaDeProductos.add(new Shampoo("Shampoo Sedal", 500, 19));
        ListaDeProductos.add(new Fruta("Frutillas ", 64, "Kilo"));

        SuperMercadoServicio.mostrarListaDeProductos(ListaDeProductos);

        SuperMercadoServicio.mostrarComparacionDeProductos(SuperMercadoServicio.productoMasCaro(ListaDeProductos),
                SuperMercadoServicio.productoMasBarato(ListaDeProductos)
        );
    }



}
