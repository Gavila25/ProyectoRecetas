package es.iesptodelacruz.proyectoRecetas;

import java.util.ArrayList;

/**
 * Clase para almacenar la información de los Restaurantes
 */
public class Restaurante {
    String nombre;
    String direccion;
    ArrayList<Recetas> carta;


    /**
     * Constructor por defecto
     */
    public Restaurante(){}

    /**
    * Constructor con dos parametros
    * @param nombre del restaurante
    * @param direccion del restaurante
    */
    public Restaurante(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }


}
