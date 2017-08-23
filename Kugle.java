//Et java program der beregner en kugles volume (rumfang)
public class Kugle 
{ 
    public static void main(String[] args) 
    {
        //Vi bruger double da kan fremkomme reelle tal i vores radius.
        double radius;
        
        System.out.print("Indtast kuglens radius: ");
        //Vi sætter radius lig med et reelt tal som brugeren indtaster.
        radius = Keyboard.readDouble();
        
        //Vi bruger double da vores beregning kan indeholde reelle tal.
        double volumen = 4./3 * Math.PI * radius * radius * radius;
        
        //Java printer kuglens volume. 
        System.out.println("Du har indtastet din kugles radius til at vaere: " + radius);
        System.out.println("Rumfang af en kugle findes med formlen; V_kugle = 4/3 * Pi * radius^3");
        System.out.println("Kuglens rumfang er: " + volumen);
    } 
}
