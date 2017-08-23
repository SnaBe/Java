public class Cylinder 
{

    public static void main(String[] args) 
    {
        //Vi bruger double da en cylinder kan have en radius eller hoejde der indholde decimal tal
        double radius,hight;
        
        //Lad brugeren indtaste radius den kendte radius af cylinderen
        System.out.println("Indtast radius: ");
        radius = Keyboard.readDouble();
        
        //Lad brugeren indtaste den kendte hoejde af cylinderen
        System.out.println("Indtast hoejde");
        hight = Keyboard.readDouble();
        
        //Java beregner rumfanget af brugerns valgte cylinder
        double volumen = radius * radius * hight * 3.14;
        
        //Java printer brugerns cylinders radius, hoejde samt den beregned volume
        System.out.println("Cylinderens hoejde: " + hight);
        System.out.println("Cylinderens radius: " + radius);
        System.out.println("Cylinderens volume: " + volumen);
    }
    
}
