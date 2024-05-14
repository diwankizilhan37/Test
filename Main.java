
public class Main
{
    public static void main(String args[])
    {
        int obereGrenze = 75;
        
        int summe = 0;
        
        for(int i = 1; i <= obereGrenze; ++i)

        {
            summe += 1;
        }
        
        double mult = 1;
        
        for(int i = 2; i <= obereGrenze; ++i)

        {
            mult *= i;
        }
        
        System.out.println("Summe: " + summe + "Multiplikation: " + mult);
    }
}
