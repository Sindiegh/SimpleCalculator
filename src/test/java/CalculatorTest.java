import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
  
    @Test
    public void AddTest() {
        Assert.assertEquals(main.Add(1,2), 3);

    }
  
    @Test
    public void MultiplyTest() {
        Assert.assertEquals(main.Multiply(1,2), 2);

    }



}
