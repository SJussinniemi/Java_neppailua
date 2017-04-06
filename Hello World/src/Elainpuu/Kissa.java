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
public class Kissa extends Nisakas {

    private String viikset; //suorat tai kippurassa

    Kissa() {
        viikset = "Suorat";
    }
	// testikommentti gittia varten
    Kissa(String v) {
        viikset = v;
    }

    public String getViikset() {

        return viikset;
    }
    
    Kissa(double paino, double ika, int imetys, double lampo ){
        this.setPaino(paino);
        this.setIka(ika);
        this.setImetysaika(imetys);
        this.setRuumiinlampo(lampo);
    }

    public void setViikset(String v) {
        if (v.equalsIgnoreCase("SUORAT") || v.equalsIgnoreCase("KIPPURASSA")) {
            viikset = v;
        }
    }

    @Override
    protected void imeta() {
        System.out.println("Imetän kuin Kissa");
    }

    @Override
    public void syo() {
        System.out.println("Syön kuin Kissa");
    }

    @Override
    public void liiku() {
        System.out.println("Liikun eteenpäin kuin Kissa");
    }
}
