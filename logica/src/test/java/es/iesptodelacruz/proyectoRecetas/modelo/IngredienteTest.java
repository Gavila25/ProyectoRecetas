package es.iesptodelacruz.proyectoRecetas.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IngredienteTest {
    public static final String nombre="nombre";
    public static final double precio=2.50;
    public static final int cantidad=1;
    Ingrediente ingrediente=null;

    @BeforeEach
    public void beforeEach(){
        if(ingrediente==null) {
            ingrediente= new Ingrediente(nombre,precio,cantidad);
        }
    }

    @Test
    public void constructorPorDefectoTest(){
        ingrediente=new Ingrediente();
        Assertions.assertNotNull(ingrediente,"El ingrediente no puede ser nulo");
    }

    @Test
    public void contructor2paramTest(){
        ingrediente=new Ingrediente(nombre,cantidad);
        Assertions.assertNotNull(ingrediente,"El ingrediente no puede ser nulo");
    }



    @Test
    public void constructor3Test(){
        ingrediente=new Ingrediente("nombre", 2.50 , 1);
        Assertions.assertNotNull(ingrediente,"El ingrediente no puede ser nulo");
    }

    @Test
    public void toStringTest(){
        Assertions.assertNotNull(ingrediente.toString(),"El metodo to string no puede ser nulo");
        Assertions.assertTrue(ingrediente.toString().contains(nombre),"El to string no contiene el nombre");
    }
}