public class solution{
    public static boolean isPrime(int i)
    {
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
        System.out.print(isPrime(21));
    }
    
    
}
