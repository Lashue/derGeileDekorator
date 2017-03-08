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
public abstract class Getränk {
    private final String beschreibung;
    
    public Getränk(String be){
        beschreibung = be;
    }
    
    public String getBeschreibung(){
        return beschreibung;
    }
    
    public abstract double getPreis();
}
