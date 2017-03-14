package Elainpuu;

public abstract class Nisakas extends Elain {

    private int imetysaika; // keskimääräinen imetysaika päivissä    
    private double ruumiinlampo; // kuten ihmisellä n. 36.7 astetta

    Nisakas() {
        imetysaika = -1; // Mitä sanotte tästä?
        ruumiinlampo = -1; // ja tästä
                            // hyh mitä arvoja
    }

    Nisakas(int i, double r) {
        imetysaika = i; // tarvitsikos järkevyystarkastusta??
        ruumiinlampo = r;
    }

    public double getRuumiinlampo() {
        return ruumiinlampo;
    }

    public void setRuumiinlampo(double ruumiinlampo) {
        this.ruumiinlampo = ruumiinlampo;
    }

    public int getImetysaika() {
        return imetysaika;
    }

    public void setImetysaika(int imetysaika) {
        this.imetysaika = imetysaika;
    }

    protected abstract void imeta();
    
}
