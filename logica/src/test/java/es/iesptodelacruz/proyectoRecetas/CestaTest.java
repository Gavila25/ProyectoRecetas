import es.iesptodelacruz.proyectoRecetas.Cesta;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CestaTest{

    Cesta cesta=null;

    @Test
    public void constructorPorDefectoTest(){
        cesta=new Cesta();
        Assertions.assertNotNull(cesta,"La cesta no puede ser nula");
    }
}