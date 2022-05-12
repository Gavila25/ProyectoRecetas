package es.iesptodelacruz.proyectoRecetas.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RepartidorTest {
    Repartidor rep=null;
    public static final String nombre="Nombre";
    public static final String apellido="Apellido";
    public static final String dir="Dir";
    public static final String correo="correo@gmail.com";
    public static final int edad=21;
    public static final String contra="1q2w3e4r";
    public static final String idUsr="Repartidor1";

    @BeforeEach
    public void beforeEach(){
        if(rep==null){
            rep=new Repartidor(nombre,apellido,dir,correo,edad,contra,idUsr);
        }
    }


    @Test
    public void constructorPorDefectoTest(){
        rep=new Repartidor();
        Assertions.assertNotNull(rep,"El usuario no puede ser nulo");
    }

    @Test
    public void constructor7ParamTest(){
        rep=new Repartidor(nombre,apellido,dir,correo,edad,contra,idUsr);
        Assertions.assertNotNull(rep,"El constructor no esta recibiendo los parametros");
    }

    @Test
    public void toStringTest(){
        Assertions.assertNotNull(rep.toString(),"El to string esta siendo nulo");
        Assertions.assertTrue(rep.toString().contains(nombre),"El to string no tiene el nombre del repartidor");
        Assertions.assertTrue(rep.toString().contains(apellido),"El to string no tiene el apellido del repartidor");
    }
}
