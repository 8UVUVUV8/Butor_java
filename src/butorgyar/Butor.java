package butorgyar;

public class Butor 
{
    int lapokSzama;
    Butorlap[] lapok;
    
    public Butor()
    {
        this.lapokSzama=0;
        this.lapok = new Butorlap[100];
    }
    
    public void lapHozzaad(Butorlap lap)
    {
        this.lapok[lapokSzama++]=lap;
    }
    
    public double butorAr()
    {
        double ar=0;
        for (int i = 0; i < this.lapokSzama; i++) {
            ar+=this.lapok[i].arSzamol();
        }
        return ar;
    }

    @Override
    public String toString() {
        return "Butor - lapokSzama=" + lapokSzama + ", ar: " + butorAr();
    }
    
}
