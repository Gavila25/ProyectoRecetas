package es.iesptodelacruz.proyectoRecetas.modelo;

public class Repartidor extends Usuario{


    /**
     * Constructor por defecto
     */
    public Repartidor(){}

    /**
     * Constructor con 7 parametros del repartidor
     * @param nombre
     * @param apellido
     * @param direccion
     * @param correo
     * @param edad
     * @param contraseña
     * @param idUsuario
     */
    public Repartidor(String nombre, String apellido, String direccion, String correo, Integer edad, String contraseña, String idUsuario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.correo = correo;
        this.edad = edad;
        this.contrasenia = contraseña;
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return "Repartidor{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", correo='" + correo + '\'' +
                ", edad=" + edad +
                ", contrasenia='" + contrasenia + '\'' +
                ", idUsuario='" + idUsuario + '\'' +
                '}';
    }
}
