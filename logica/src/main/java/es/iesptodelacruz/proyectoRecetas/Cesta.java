package es.iesptodelacruz.proyectoRecetas;

import java.util.ArrayList;

/**
 * Clase para tener guardar los ingredientes que se quieran comprar
 * esta clase emula una lista de la compra
 */
public class Cesta {
    Usuarios usuario;
    ArrayList<Ingredientes> carritoDeLaCompra;
    Ingredientes ingrediente;

    /**
     * Constructor por defecto
     */
    public Cesta(){}

    /**
     * Metodo para obtener la lista del carrito de la compra
     * @return los valores del carrito
     */
    String getProductos(){
        return carritoDeLaCompra.stream()
                .toString();
    }

    void setProductos(){}


    /**
     * Metodo para guardar los productos en el carrito de la compra
     * @param ingrediente de la receta
     */
    void anadirProductos(Ingredientes ingrediente){
        carritoDeLaCompra.add(ingrediente);
    }

}
