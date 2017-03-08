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
public class Hausmischung extends Getränk{

    public Hausmischung(String be) {
        super(be);
    }

    @Override
    public double getPreis() {
        return 2.5;
    }
    
}
