package es.iesptodelacruz.proyectoRecetas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.print.DocFlavor;

public class RestauranteTest {
    public static final String nombre="nombre";
    public static final String dir="direccion";
    Restaurante rest=null;



    @Test
    public void constructorPorDefectoTest(){
        rest=new Restaurante();
        Assertions.assertNotNull(rest,"El restaurante no puede ser nulo");
    }

    @Test
    public void contructor2paramsTest(){
        rest=new Restaurante(nombre,dir);
        Assertions.assertNotNull(rest,"El constructor no ha recibido los parametros");
    }
}
