package Servicio;

import SuperMercado.Modelo.Producto;

import java.util.ArrayList;

public class SuperMercadoServicio {

    public static void mostrarListaDeProductos(ArrayList<Producto> productos){
        productos.forEach(producto -> System.out.println(producto));
    }

    public static Producto productoMasCaro(ArrayList<Producto> productos) {
        Producto productoMasCaro = productos.get(0);
        for (Producto producto : productos) {
            if (producto.compareTo(productoMasCaro) > 0) {
                productoMasCaro = producto;
            }
        }
    return productoMasCaro;
    }

    public static Producto productoMasBarato(ArrayList<Producto> productos){
        Producto productoMasBarato= productos.get(0);
        for (Producto producto : productos){
            if (producto.compareTo(productoMasBarato) < 0) {
                productoMasBarato = producto;
            }
        }
        return productoMasBarato;
    }

    public static void mostrarComparacionDeProductos(Producto caro, Producto barato){
        System.out.println("=============================");
        System.out.println("Producto más caro: "+caro.getNombre()+"\n" +
                "Producto más barato: "+barato.getNombre()+"\n");
    }

    }


