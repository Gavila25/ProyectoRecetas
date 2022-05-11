package es.iesptodelacruz.proyectoRecetas.modelo;

import java.util.Map;
import java.util.TreeMap;

/**
 * Clase para tener guardar los ingredientes que se quieran comprar
 * esta clase emula una lista de la compra
 */
public class Cesta {
    Usuario usuario;
    private Map<Ingrediente,Integer> productosComprados=new TreeMap<>();

    /**
     * Constructor por defecto
     */
    public Cesta(){}

    public Map<Ingrediente,Integer> getProductosComprados(){
        return productosComprados;
    }

}
