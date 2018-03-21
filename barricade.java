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
public class barricade extends objectSoort{
    int barricadeWaarde;
    int barricadeSleutel;
    
    public void open(){
        
    }
    
    public boolean isSleutelAanwezig(){
        boolean sleutelAanwezig = false;
        
        return sleutelAanwezig;
    }
    
    public void verdwijnNaOpenen(){
        
    }
    
    public boolean veerkeerdeSleutel(){
        boolean sleutelJuist = false;
        
        return sleutelJuist;
    }

    public int getBarricadeWaarde() {
        return barricadeWaarde;
    }

    public int getBarricadeSleutel() {
        return barricadeSleutel;
    }

    public void setBarricadeWaarde(int barricadeWaarde) {
        this.barricadeWaarde = barricadeWaarde;
    }

    public void setBarricadeSleutel(int barricadeSleutel) {
        this.barricadeSleutel = barricadeSleutel;
    }
    
    
}
