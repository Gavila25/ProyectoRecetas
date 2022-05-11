package es.iesptodelacruz.proyectoRecetas.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
    public void contructor2paramTest(){
        rest=new Restaurante(nombre,dir);
        Assertions.assertNotNull(rest,"El constructor no ha recibido los parametros");
    }
}
