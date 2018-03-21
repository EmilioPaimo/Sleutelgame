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
public class objectSoort {
    sleutel objectSleutel;
    muur objectMuur;
    barricade objectBarricade;
    eindveld objectEindveld;

    public sleutel getObjectSleutel() {
        return objectSleutel;
    }

    public muur getObjectMuur() {
        return objectMuur;
    }

    public barricade getObjectBarricade() {
        return objectBarricade;
    }

    public eindveld getObjectEindveld() {
        return objectEindveld;
    }

    public void setObjectSleutel(sleutel objectSleutel) {
        this.objectSleutel = objectSleutel;
    }

    public void setObjectMuur(muur objectMuur) {
        this.objectMuur = objectMuur;
    }

    public void setObjectBarricade(barricade objectBarricade) {
        this.objectBarricade = objectBarricade;
    }

    public void setObjectEindveld(eindveld objectEindveld) {
        this.objectEindveld = objectEindveld;
    }
    
    
}
