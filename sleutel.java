/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sleutelbarricadev1;

/**
 *
 * @author macan
 */
public class sleutel extends objectSoort{
    int sleutelWaarde;
    boolean sleutelGepaakt;
    
    public void verwijderSleutel(){
        
    }

    public int getSleutelWaarde() {
        return sleutelWaarde;
    }

    public boolean isSleutelGepaakt() {
        return sleutelGepaakt;
    }

    public void setSleutelWaarde(int sleutelWaarde) {
        this.sleutelWaarde = sleutelWaarde;
    }

    public void setSleutelGepaakt(boolean sleutelGepaakt) {
        this.sleutelGepaakt = sleutelGepaakt;
    }
    
    
}
