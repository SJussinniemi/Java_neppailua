
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sami1531
 */
public class Alkuluvut {

    public static ArrayList<Integer> luo(int luku) {
        ArrayList<Integer> alkuluvut = new ArrayList<Integer>();

        int jakaja = 2;
        while (luku > 1) {
            
            while (luku % jakaja == 0) {                
                alkuluvut.add(jakaja);
                luku /= jakaja;  // luku / 2;
            }
            jakaja++;
        }

        return alkuluvut;
    }
}
