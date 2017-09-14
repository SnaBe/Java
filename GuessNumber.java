/**
 *
 * @author Simon S. Sørensen
 */
public class GuessNumber 
{
    public static void main(String[] args) 
    {
        int num;
        int tal;
        int count = 1;
        
        String Input;
        
        num = (int) (Math.random()*100+1);
        
        //Test så jeg kan se hvad tallet er.
        System.out.println("Tallet er: " + num);
        
        System.out.println("Er du klar på at gætte et tal mellem 0 og 100 (Hvis Ja, tast 'Ja' eller tast '' for at afvise)");
        System.out.println("Husk du har kun 10 forsøg i alt!");
        
        Input = Keyboard.readString();
        
        if(Input.contains("Ja"))
        {  
        System.out.println("Klar, parat - Indtast dit gæt: ");
        tal = Keyboard.readInt(); 
        
        while(num != tal && count <= 10)
        {
            System.out.println("Forkert tal, du har har " + (10-count) + " forsøg tilbage.");
            
            if(tal > num)
            {
                System.out.println("Dit gæt er større end tallet.");
            }
            else if(tal < num)
            {
                System.out.println("Dit gæt er mindre end tallet.");
            }
            
            System.out.println("Prøv igen. Indtast et nyt gæt: ");
            tal = Keyboard.readInt();
            count += 1;
        }

            if(count <=10)
            {
                System.out.println("Du har gættet rigtigt! Tallet var " + num); 
                System.out.println("Du brugte " + count + " ud af 10 forsøg.");
            }
            else 
            {
                System.out.println("Du har brugt alle dine forsøg.");
            }
        }
        else 
        {
            System.out.println("Hvorfor har du så åbnet dette program?");
        }
    }
    
}
