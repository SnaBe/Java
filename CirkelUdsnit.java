//Et java program der beregner arealet fra udsnittet af en cirkel.

public class CirkelUdsnit 
{
    public static void main(String[] args) 
    {
        //Vi bruger double da kan fremkomme reelle tal i vores radius og vinkel.
        double radius, vinkel;
        
        System.out.print("Indtast din cirkels radius: ");
        //Vi sætter radius lig med et reelt tal som brugeren indtaster.
        radius = Keyboard.readDouble();
        
        System.out.print("\nIndtast nu din cirkelens oenskede areals vinkel: ");
        //Vi sætter vinkel lig med et reelt tal som brugeren indtaster.
        vinkel = Keyboard.readDouble();
        
        //Vi bruger double da vores beregning kan indeholde reelle tal.
        double cirkelUdsnit = Math.PI * radius * radius * vinkel/360;
        
        //Java printer arealet af cirkeludsnittet . 
        System.out.println("Du har indtastet din cirkels radius til at vaere: " + radius);
        System.out.println("Du kar indtastet din cirkels vinkel til at vaere: " + vinkel);
        System.out.println("Vi bruger formlen for cirkeludsnittets areal; Pi * r^2 * v/360");
        System.out.println("Arealet af cirkeludsnittet er: " + cirkelUdsnit);
    }  
}
