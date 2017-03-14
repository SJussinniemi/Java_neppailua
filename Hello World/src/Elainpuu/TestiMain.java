/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elainpuu;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Sami Jussinniemi
 */
public class TestiMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Kissa miukeli = new Kissa();
        Kissa maukeli = new Kissa("kippurassa");
        Kissa mau = new Kissa(12, 6, 35, 30);
        Opettaja Jokke = new Opettaja();
        Opettaja Pekka = new Opettaja(50);
        Opettaja Tommi = new Opettaja("punaiset");
        Opettaja Matti = new Opettaja("Siniset", 25);

//kissatestit 
        //viiksitestit
        System.out.println(miukeli.getViikset());
        System.out.println(maukeli.getViikset());
        maukeli.setViikset("Suorat");
        System.out.println(maukeli.getViikset());
        //painotestit
        miukeli.setPaino(-100);
        System.out.println("Miukelin paino on: " + miukeli.getPaino());
        miukeli.setPaino(25);
        System.out.println("Miukelin paino on: " + miukeli.getPaino());

//opettajatestit 
        //ika ja silmatestit
        System.out.println("Pekan ikä on: " + Pekka.getIka());
        Jokke.setIka(50.0);
        System.out.println("joken ikä on: " + Jokke.getIka());
        System.out.println("Tommin ikä: " + Tommi.getIka() + " Tommin silmät ovat: " + Tommi.getSilmienVari());
        System.out.println("Matti ikä: " + Matti.getIka() + " Matti silmät ovat: " + Matti.getSilmienVari());
        //karttakeppi ja kalja testit
        Matti.setKarttakeppitaidot(500);
        System.out.println(Matti.getKarttakeppitaidot());
        Matti.lisaaKarttakeppitaitoa(400);
        System.out.println(Matti.getKarttakeppitaidot());

        Matti.juoKaljaa();


    }
}
