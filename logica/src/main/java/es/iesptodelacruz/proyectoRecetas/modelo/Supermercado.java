package es.iesptodelacruz.proyectoRecetas.modelo;

import java.util.ArrayList;

/**
 * Clase para almacenar la informacion de los supermercados
 */
public class Supermercado {
    String nombre;
    String direccion;
    ArrayList<Ingrediente> productos;

    /**
     * Constructor por defecto
     */
    public Supermercado(){}

    
    /**
    * Constructor con dos parametros
    * @param nombre del supermercado
    * @param direccion del supermercado
    */
    public Supermercado(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }


}
