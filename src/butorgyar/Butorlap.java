package butorgyar;

public class Butorlap {
    private double szeleseg;
    private double hoszusag;
    private boolean tartolapE;
    private final int tartolapAr = 5000;
    private final int hatlapAr = 500;

    public Butorlap(double szeleseg, double hoszusag, boolean tartolapE) {
        this.szeleseg = szeleseg/100;
        this.hoszusag = hoszusag/100;
        this.tartolapE = tartolapE;
    }
    
    public double arSzamol()
    {
        return hoszusag*szeleseg*(this.tartolapE ? tartolapAr : hatlapAr);
    }
}
