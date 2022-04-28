package es.iesptodelacruz.proyectoRecetas;

/**
 * Clase para guardar todos los ingredientes
 */
public class Ingrediente {
    String nombre;
    int cantidad;
    double precio;

    /**
    * Constructor por defecto
    */
    public Ingrediente(){
    }


    /**
    * Constructor con dos parametros
    * @param nombre del ingrediente
    * @param cantidad del ingrediente
    */
    public Ingrediente(String nombre, Integer cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
