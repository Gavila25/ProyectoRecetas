package es.iesptodelacruz.GuillermoAM;

/**
 * Clase para almacenar la informacion de los supermercados
 */
public class Supermercados {
    String nombre;
    String direccion;

    /**
     * Constructor con dos parametros
     * @param nombre del supermercado
     * @param direccion del supermercado
     */
    public Supermercados(String nombre, String direccion) {
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
