package es.iesptodelacruz.proyectoRecetas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SupermercadoTest {

    public static final String nombre="nombre";
    public static final String dir="dir";
    Supermercado supermercado=null;

    @BeforeEach
    public void beforeEach(){
        if(supermercado==null){
            supermercado=new Supermercado(nombre,dir);
        }
    }

    @Test
    public void constructorPorDefectoTest(){
        supermercado=new Supermercado();
        Assertions.assertNotNull(supermercado,"El supermercado no puede ser nulo");
    }

    @Test
    public void contructor2paramTest(){
        supermercado=new Supermercado(nombre,dir);
        Assertions.assertNotNull(supermercado,"El supermercado no ha recibido sus dos parametros");
    }
}
