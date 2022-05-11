package es.iesptodelacruz.proyectoRecetas.modelo;

import java.util.ArrayList;

/**
 * Clase para almacenar todas las recetas
 */
public class Recetas {
    Ingrediente ingrediente;
    String nombre;
    ArrayList<Ingrediente> ingredientes;

    /**
     * Constructor por defecto
     */
    public Recetas(){}

    /**
     * Constructor con un solo campo
     * @param nombre de la receta
     */
    public Recetas(String nombre) {
        this.nombre = nombre;
    }


}
