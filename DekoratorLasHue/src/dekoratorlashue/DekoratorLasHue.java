/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dekoratorlashue;

/**
 *
 * @author lashue
 */
public class DekoratorLasHue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DunkleRöstung dR = new DunkleRöstung("dunkle Röstung");
        System.out.println(dR.getBeschreibung());
    }
    
}
