/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elainpuu;

/**
 *
 * @author Sami Jussinniemi
 */
public abstract class Elain {

    private double paino;
    private double ika;

    Elain() {

    }

    Elain(double p, double i) {
        paino = p;
        ika = i;
    }

    public double getPaino() {
        return paino;
    }

    public void setPaino(double paino) {
        if(paino > 0 && paino < 9999){
            this.paino = paino;
        }   
    }

    public double getIka() {
        return ika;
    }

    public void setIka(double ika) {
        if(ika > 0){
            this.ika = ika;
        }
        
    }

    public abstract void syo();
    public abstract void liiku();

}
