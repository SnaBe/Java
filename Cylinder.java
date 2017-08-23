//Prototype of a Cylinder calcalculator. 
//Current verson onyl handles the calcalculation of a cylinders volume.

public class Cylinder 
{
    public static void main(String[] args) 
    {
        //Vi bruger double, da en cylinder kan have en radius eller hoejde der indholder, et eller flere decimal tal.
        double radius,height;
        
        //Lad brugeren indtaste en given radius (Den kendte radius af cylinderen)
        System.out.println("Indtast radius: ");
        radius = Keyboard.readDouble();
        
        //Lad brugeren indtaste en given hoejde (Den kendte hoejde af cylinderen)
        System.out.println("Indtast hoejde");
        height = Keyboard.readDouble();
        
        //Java beregner rumfanget af brugerns valgte cylinder.
        double volumen = radius * radius * height * Math.PI;
        
        //Java printer brugerns cylinders radius, hoejde samt den beregnet volume.
        System.out.println("Cylinderens hoejde: " + height);
        System.out.println("Cylinderens radius: " + radius);
        System.out.println("Cylinderens volume: " + volumen);
    }
}
