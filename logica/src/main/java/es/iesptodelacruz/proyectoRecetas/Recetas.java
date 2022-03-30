package es.iesptodelacruz.proyectoRecetas;

/**
 * Clase para almacenar todas las recetas
 */
public class Recetas {
    Ingredientes ingrediente;
    String nombre;

    /**
     * Constructor con un solo campo
     * @param nombre de la receta
     */
    public Recetas(String nombre) {
        this.nombre = nombre;
    }

    public Ingredientes getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingredientes ingrediente) {
        this.ingrediente = ingrediente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
