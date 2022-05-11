package es.iesptodelacruz.proyectoRecetas.modelo;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Clase para almacenar todas las recetas
 */
public class Recetas {
    Ingrediente ingrediente;
    String nombre;
    private HashMap<Recetas,Ingrediente> ingredientes=new HashMap<>();

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

    /**
     * Metodo para agregar ingedientes a la receta
     * @param recetas la receta a la que va asignada el ingrediente
     * @param ingrediente que lleva la receta
     */
    public void agregarIngredientes(Recetas recetas,Ingrediente ingrediente){
        ingredientes.put(recetas,ingrediente);
    }

}
