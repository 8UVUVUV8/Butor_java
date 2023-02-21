package futato;

import butorgyar.Butor;
import butorgyar.Butorlap;

public class NewClass {
    public static void main(String[] tomb)
    {
        Butor loca = new Butor();
        Butorlap a = new Butorlap(35,180,true);
        Butorlap b = new Butorlap(35,100,false);
        Butorlap c = new Butorlap(35,50,true);
        
        loca.lapHozzaad(a);
        loca.lapHozzaad(b);
        loca.lapHozzaad(c);
        
        System.out.println("Loca" + loca);
    }
}
