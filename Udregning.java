import java.util.Scanner;

/**
 *
 * @author Simon S. Sørensen
 */
public class Udregning 
{
    public static void main(String[] args) 
    {
        //Vi bruger Scanner istedet for Keyboard.java
        Scanner tast = new Scanner(System.in);
        
        //Vi sætter a, b og c til at være reelle tal
        double a,b,c;
        
        //Brugeren skal indtaste 3 værdier a,b, og c
        System.out.print("Indtast a: ");
        a = tast.nextDouble();
        System.out.print("Indtast b: ");
        b = tast.nextDouble();
        System.out.print("Indtast c: ");
        c = tast.nextDouble();
        
        //Vi sætter vores variabler ligmed formler for diskriminanten 
        double d = b*b-4*a*c;
        //Math.sqrt er kvadratroden af et givet tal, i dette tilfælde d
        double x1 = -b+Math.sqrt(d)/(2*a);
        double x2 = -b-Math.sqrt(d)/(2*a);
        
        //Vi laver et par strings med formler, så vi ikke skal skrive dem senere
        String formel = "b^2-4*ac";
        String formelx1 = "-b+sqrt(d)/(2*a)";
        String formelx2 = "-b-sqrt(d)/(2*a)";
        
        //Et out print med hvilken formel vi bruger til udregningen af diskriminanten 
        System.out.println("Nu beregnes diskriminanten med formlen " +formel);
        
        //Vi bruger if statements da der kan fremkomme flere løsninger til beregningen af diskriminanten
        //Hvis der intet svar er til x1 eller x2 er svaret ikke et tal men NaN.
        
        //Hvis d er størrer end 0 er der 2 løsninger      
        if(d>0) 
        {
            System.out.println("Din diskriminant er større end 0, derfor er der 2 løsninger");
            System.out.println("d = " +d);
            System.out.println("Vi udregner nu dit x1 med formlen: " +formelx1);
            System.out.println("x1 = " +x1);
            System.out.println("Vi udregner nu dit x2 med formlen: " +formelx2);
            System.out.println("x2 = " +x2);
        }
        //Hvis d er størrer end 0 er der 1 løsning
        else if(d==0)
        {
            System.out.println("Din diskriminant er lige med 0, derfor er der 1 løsning");
            System.out.println("d = " +d);
            System.out.println("Vi udregner nu x1 med formlen: " +formelx1);
            System.out.println("x1 = " +x1);
            System.out.println("Vi udregner nu x2 med formlen: " +formelx2);
            System.out.println("x2 = " +x2);
        }
        //Hvis d er størrer end 0 er der 0 løsninger
        else if(d<0)
        {
            System.out.println("Din diskriminant er mindre end 0, derfor er der 0 løsninger");
            System.out.println("d = " +d);
            System.out.println("vi udregner nu x1 med formlen: " +formelx1);
            System.out.println("x1 = " +x1);
            System.out.println("Vi udregner nu x2 med formlen: " +formelx2);
            System.out.println("x2 = " +x2);
        }
        //Hvis det skulle ske at ingen af de 3 løsnings muligheder var opfyldt udprinter vi en error til brugeren 
        else
        {
            System.out.println("Har du indtastet de rigtige værdier/tal?");
        }
    }
    
}