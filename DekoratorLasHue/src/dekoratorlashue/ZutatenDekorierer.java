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
public abstract class ZutatenDekorierer extends Getränk{
    private Getränk g;
    
    public ZutatenDekorierer(String be, Getränk ge) {
        super(be);
        g = ge;
    }
    
    @Override
    public abstract String getBeschreibung();

}
