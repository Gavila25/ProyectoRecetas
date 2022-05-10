import org.junit.experimental.theories.suppliers.TestedOn;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class CestaTest{
    
    
    Cesta cesta=null;

    /**
     * Rigorous Test :-)
     */
    
    
    @Test
    public void constructorPorDefectoTest(){
        cesta=new Cesta();
        Assertions.assertNotNull(cesta, "La cesta no puede ser nula");
    }
}