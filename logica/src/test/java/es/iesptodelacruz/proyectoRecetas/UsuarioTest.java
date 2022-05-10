package es.iesptodelacruz.proyectoRecetas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UsuarioTest {
    public static final String nombre="Nombre";
    public static final String apellido="Apellido";
    public static final String dir="Dir";
    public static final String correo="correo@gmail.com";
    public static final int edad=21;
    public static final String contra="1q2w3e4r";
    public static final String idUsr="Gavila25";
    Usuario usr=null;
    @BeforeEach
    public void beforeEach(){
        if(usr==null) {
            usr = new Usuario(nombre,apellido,dir,correo,edad,contra,idUsr);
        }
    }

    @Test
    public void constructorPorDefectoTest(){
        usr=new Usuario();
        Assertions.assertNotNull(usr,"El usuario no puede ser nulo");
    }
    @Test
    public void constructor7paramTest(){
        usr=new Usuario("Guillermo","Avila","Calle bla bla","guillermo@gmail.com",21,"1Q2W3E4R","Gavila25");
        Assertions.assertNotNull(usr,"El usuario no puede ser nulo");
    }


    @Test
    public void toStringTest(){
        Assertions.assertNotNull(usr.toString(),"La respuesta es nula");
        Assertions.assertTrue(usr.toString().contains(nombre),"No contiene el nombre");
        Assertions.assertTrue(usr.toString().contains(apellido),"No contiene el apellido");
    }

}
