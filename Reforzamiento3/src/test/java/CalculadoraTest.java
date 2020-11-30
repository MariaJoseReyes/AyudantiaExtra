import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void numAleatorioTest(){
        int min = 0;
        int max = 1;
        int esperado = Calculadora.numAleatorio(min, max);
        //Assert.assertEquals(2, esperado);
        Assert.assertNotEquals(2, esperado);

    }

}