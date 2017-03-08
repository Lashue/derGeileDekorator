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
public class Milchschaum extends ZutatenDekorierer{
    private Getränk ge;
    public Milchschaum(String be, Getränk ge) {
        super("Milchschaum", ge);
    }

    @Override
    public String getBeschreibung() {
        return "";
    }

    @Override
    public double getPreis() {
        return 0.10;
    }
    
}
