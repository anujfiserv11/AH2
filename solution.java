public class solution{
    public static boolean isPrime(int i)
    {
        if(i == 0 || i == 1)
        {
            return false;
        }
        for(int j = 2; j <=i/2;j++)
        {
            if(i%j == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        System.out.println(isPrime(2));
        System.out.println(isPrime(0));
        System.out.println(isPrime(1));
        System.out.println(isPrime(31));

    }
    
    
}
