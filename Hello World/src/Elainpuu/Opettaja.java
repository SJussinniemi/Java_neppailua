/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elainpuu;

import java.util.Calendar;

/**
 *
 * @author Sami Jussinniemi
 */
public class Opettaja extends Ihminen {

    private int karttakeppitaidot;

    public Opettaja() {
    }

    Opettaja(String v) {
        this.setSilmienVari(v);
    }

    Opettaja(double i) {    //opettajan ikä
        this.setIka(i);
    }

    Opettaja(String v, double i) {
        this.setSilmienVari(v);
        this.setIka(i);
    }

    public int getKarttakeppitaidot() {
        return karttakeppitaidot;
    }

    public void setKarttakeppitaidot(int i) {
        karttakeppitaidot = i;
    }

    public void lisaaKarttakeppitaitoa(int i) {
        karttakeppitaidot += i;
    }

    @Override
    public void juoKaljaa() {
        if(Calendar.DAY_OF_WEEK == 6 ){
            System.out.println("PERJANTAI!! KALAJAA");
        }
        else{
            System.out.println("EI EDES PERJANTAI MUTTA KALAJAA!");
        }
    }
}
