import java.math.*;

public class Main
{
    public static void main(String args[])
    {
        int obereGrenze = 75;
        
        int summe = 0;
        
        for(int i = 1; i <= obereGrenze; ++i)

        {
            summe += i;
        }
        
        BigInteger mult = new BigInteger("1");
        
        for(int i = 2; i <= obereGrenze; ++i)

        {
            mult = mult.multiply(BigInteger.valueOf(i)); //Integerwert wird genommen und ein Objekt von BigInteger wird erstellt
        }
        
        System.out.println("Summe: " + summe + " Multiplikation: " + mult);
        
        //Master Update 1
    }
}
