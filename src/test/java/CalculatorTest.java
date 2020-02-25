import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    public static int Add(int... num1)
    {
        int sum =0;
        for (int i = 0; i<num1.length;i++) {
            sum += num1[i];
        }
        System.out.println(sum);
        return sum;
    }
    @Test
    public void AddTest() {
        Assert.assertEquals(Add(1,2), 3);

    }
    public static int Multiply(int... num1)
    {
        int product =1;
        for (int i = 0; i<num1.length;i++) {
            product *= num1[i];
        }
        System.out.println(product);
        return product;
    }
    @Test
    public void MultiplyTest() {
        Assert.assertEquals(Multiply(1,2), 2);

    }



}
