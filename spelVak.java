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
public class spelVak extends spelVeld{
    int xLocatie;
    int yLocatie;
    int vakGrootte;
    String kleur;

    public int getxLocatie() {
        return xLocatie;
    }
    
    public int getyLocatie() {
        return yLocatie;
    }
    
    public int getVakGrootte() {
        return vakGrootte;
    }

    public String getKleur() {
        return kleur;
    }
    
    public void setxLocatie(int xLocatie) {
        this.xLocatie = xLocatie;
    }

    public void setyLocatie(int yLocatie) {
        this.yLocatie = yLocatie;
    }

    public void setVakGrootte(int vakGrootte) {
        this.vakGrootte = vakGrootte;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }
    
    
}
