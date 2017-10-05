/**
 *
 * @author euc
 */
public class beregnMetode 
{
    public static void main(String[] args) 
    {
        int indData, faktor, udData;
        faktor = 4;
        
        System.out.print("Indtast nu det tal der skal krypteres: ");
        indData = Keyboard.readInt();
        
        udData = krypter(faktor,indData);
        
        System.out.println("Det krypterede tal er: " + udData);
    }
    public static int krypter(int faktor,int tal)
    {
        int ud = tal * faktor + 5;
        return ud;
    }
    
}
