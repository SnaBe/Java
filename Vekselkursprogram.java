/**
 *
 * @author Simon S. Sørensen
 */
public class Vekselkursprogram 
{
    public static void main(String[] args) 
    {
        //Vores beløb, kurs og kommisions rest kan fremkomme som reelle tal
        double dkk, euro, kurs;
        double kommissionRest = 0.98;
        
        //Vi laver et par strings, så vi kan læse almindelig tekst
        String danske = "1";
        String euroS = "2";
        String Input;
        
        //Vi spørg brugeren om hvilken valuta din ønsker at veksle til. 
        System.out.println("Hvad ønsker du at veksle, Danske kr. til Euro (Tast 1) eller Euro til Danske kr. (Tast 2) ");
        Input = Keyboard.readString();
        
        //Hvis vores strings input er ligmed 'danske' så kør koden nedenfor og ignorer koden nedenunder dette statement.
        if(Input.contains(danske)) 
            {
                System.out.println("Du har valgt Danske kr. til Euro.");
                
                //Vi spørg brugeren om deres beløb i danske kroner og sætter det ligmed vores dkk variable.
                System.out.print("Indtast nu dit beløb i DKK: ");
                dkk = Keyboard.readDouble();
                
                //Vi spørg brugeHren om den nuværende kurs og sætter det ligmed vores kurs variable.
                System.out.print("\nIndtast nu den givende Euro kurs: ");
                kurs = Keyboard.readDouble();
                
                //Vi opsætter en formel til at beregne vores Danske kroner til Euro og derefter trække kommision fra.
                double formelDKK = (dkk/kurs)*kommissionRest;
                
                //Hvis resultatet af vores formelDKK er større eller ligmed 0.5, kan vi veksle ellers ikke.
                if(formelDKK >= 0.5)
                {
                   //Vi viser brugeren hvor meget de får tilbage efter vi har trukket kommision.
                   System.out.println("Dit beløb " + dkk + " kr. vekslet til euro med en kommission på 2% er " + formelDKK + " Euro."); 
                }
                else 
                {
                   //Der er et minimum krav på hvor meget man skal veksle. 
                   System.out.println("Jeg veksler ikke så små beløb. Minimum 4 Kr. eller mere. :) ");
                }
            }
            //Hvis vores strings input er ligmed 'euroS' så kør koden nedenfor og ignorer koden ovenfor dette statement.
            else if(Input.contains(euroS))
            {            
                System.out.println("Du har valgt Euro til Danske kr.");

                //Vi spørg brugeren om deres beløb i deuro og sætter det ligmed vores euro variable.
                System.out.print("Indtast nu dit beløb i Euro: ");
                euro = Keyboard.readDouble();
                
            //Hvis resultatet af vores euro formel er større eller ligmed 0.5, kan vi veksle ellers ikke.
            if(euro >= 0.5)
            {     
                //Vi spørg brugeren om den nuværende kurs og sætter det ligmed vores kurs variable.
                System.out.print("\nIndtast nu den givende Euro kurs: ");
                kurs = Keyboard.readDouble();

                //Vores beløb, kurs og kommisions rest kan fremkomme som reelle tal
                double formelEuro = (euro*kurs)*kommissionRest;
                
                //Vi viser brugeren hvor meget de får tilbage efter vi har trukket kommision.
                System.out.println("Dit beløb " + euro + " vekslet til DKK med en kommission på 2% er " + formelEuro + " kr."); 
            }
            else
            {
                //Der er et minimum krav på hvor meget man skal veksle. 
                System.out.println("Jeg veksler ikke så små beløb. Minimum 0.5 Euro eller mere. :) ");
            }    
        }
        else
        {
            //Hvis brugeren ikke har valgt en gyldig mulighed, fortæller vi dem det. 
            System.out.println("Du har ikke skrevet et gyldigt svar. Tast 1 eller 2. ");
        }
    }    
}
