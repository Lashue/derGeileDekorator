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
public class Milch extends ZutatenDekorierer{

    public Milch(String be, Getränk ge) {
        super(be, ge);
    }

    @Override
    public String getBeschreibung() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPreis() {
        return 0.1;
    }
    
}
