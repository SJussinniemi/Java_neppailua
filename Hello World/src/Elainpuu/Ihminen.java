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
public abstract class Ihminen extends Nisakas {
    
    private String silmienvari;
    
    Ihminen(){
       this.silmienvari = "sininen";
       
    }
    
    public String getSilmienVari(){
        return silmienvari;
    }
    
    public void setSilmienVari(String v){
        silmienvari = v;
    }
    

    @Override
    public void syo() {
        System.out.println("Otan haarukan ja veitsen käteen ja syön");
    }

    @Override
    public void liiku() {
        System.out.println("käynnistän auton ja ajan");
    }

    @Override
    protected void imeta() {
        System.out.println("Imetän kuin ihminen");
    }

    public abstract void juoKaljaa(); //olutta!
}
