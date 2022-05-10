package es.iesptodelacruz.proyectoRecetas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RecetasTest {
    Recetas recetas=null;

    @Test
    public void constructorPorDefecto(){
        recetas=new Recetas();
        Assertions.assertNotNull(recetas,"Las recetas no pueden ser nulas");
    }

    @Test
    public void constructor1paramTest(){
        recetas=new Recetas("Nombre");
        Assertions.assertNotNull(recetas,"El constructor no está recibiendo los parametros esperados");
    }
}
