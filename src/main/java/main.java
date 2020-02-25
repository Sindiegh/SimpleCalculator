public class main {

    public static void main(String[] args) {
        Add(1,2,3,7);

        Multiply(4,8);

    }

    public static int Add(int... num1)
    {
        int sum =0;
        for (int i = 0; i<num1.length;i++) {
            sum += num1[i];
        }
        System.out.println(sum);
        return sum;
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
}
