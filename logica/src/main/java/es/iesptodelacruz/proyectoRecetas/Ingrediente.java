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
    public Ingrediente(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    /**
     * Constructor con tres parametros
     * @param nombre del ingrediente
     * @param precio del ingrediente
     * @param cantidad del ingrediente
     */
    public Ingrediente(String nombre, double precio, int cantidad){
        this.nombre=nombre;
        this.precio=precio;
        this.cantidad=cantidad;
    }

    @Override
    public String toString(){
        return this.nombre+""+this.cantidad+""+this.precio;
    }
}
