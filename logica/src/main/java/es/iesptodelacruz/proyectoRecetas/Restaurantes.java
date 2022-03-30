package es.iesptodelacruz.proyectoRecetas;

/**
 * Clase para almacenar la información de los Restaurantes
 */
public class Restaurantes {
    String nombre;
    String direccion;

    /**
     * Constructor con dos parametros
     * @param nombre del restaurante
     * @param direccion del restaurante
     */
    public Restaurantes(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
