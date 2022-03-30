package es.iesptodelacruz.proyectoRecetas;

import java.util.TreeMap;

/**
 * Clase donde se almacenaran los usuarios de la aplicación
 * @author Guillermo Avila Martín
 */

public class Usuarios {
    String nombre;
    String apellido;
    String direccion;
    String correo;
    Integer edad;
    String contrasenia;
    String idUsuario;

    TreeMap<String,Usuarios> historialUsuarios=new TreeMap<>();

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

    public Usuarios(String nombre, String apellido, String direccion, String correo, Integer edad, String contraseña, String idUsuario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.correo = correo;
        this.edad = edad;
        this.contrasenia = contraseña;
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString(){
        return this.idUsuario+""+this.nombre+""+this.apellido+""+this.direccion+""+this.edad+""+this.correo;
    }
}
