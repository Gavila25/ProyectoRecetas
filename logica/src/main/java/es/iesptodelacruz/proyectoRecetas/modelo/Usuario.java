package es.iesptodelacruz.proyectoRecetas.modelo;



/**
 * Clase donde se almacenaran los usuarios de la aplicación
 * @author Guillermo Avila Martín
 */

public class Usuario {
    String nombre;
    String apellido;
    String direccion;
    String correo;
    int edad;
    String contrasenia;
    String idUsuario;
    Cesta cesta;

    /**
     * Constructor por defecto
     */
    public Usuario(){
    }



    /**
    * Constructor con siete parametros
    * @param nombre del usuario
    * @param apellido del usuario
    * @param direccion del usuario
    * @param correo del usuario
    * @param edad del usuario
    * @param contraseña del usuario
    * @param idUsuario del usuario
    */

    public Usuario(String nombre, String apellido, String direccion, String correo, Integer edad, String contraseña, String idUsuario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.correo = correo;
        this.edad = edad;
        this.contrasenia = contraseña;
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString(){
        return this.idUsuario+""+this.nombre+""+this.apellido+""+this.direccion+""+this.edad+""+this.correo;
    }
}
