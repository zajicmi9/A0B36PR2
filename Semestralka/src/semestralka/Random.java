/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package semestralka;

/**
 *
 * @author Milan
 */
public class Random {
    
    public static int Random() {
        int rnd;
        java.util.Random r = new java.util.Random();
        rnd = r.nextInt(37);
        if (rnd > 36 || rnd < 0) {
            Random();
        }
        return rnd;
    }
    
}
