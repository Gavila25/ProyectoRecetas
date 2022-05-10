package es.iesptodelacruz.proyectoRecetas;

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
    /**
     * Constructor de 3 parametros
     */
    @Test
    public void constructor3Test(){
        ingrediente=new Ingrediente("nombre", 2.50 , 1);
        Assertions.assertNotNull(ingrediente,"El ingrediente no puede ser nulo");
    }
    @Test
    public void toStringTest(){
        Assertions.assertNotNull(ingrediente.toString(),"La respuesta es nula");
        Assertions.assertTrue(ingrediente.toString().contains(nombre),"No contiene el nombre");

    
}