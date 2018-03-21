/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sleutelbarricadev1;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author macan
 */
public class spelVeld extends SleutelBarricadeV1 {
    protected static int aantalVelden;
    protected static int x = 10;
    protected static int y = 10;
    
    
    public void speelveldAanmaken(){
        JFrame frame = new JFrame();
        JPanel[][] speelVak = new JPanel[x][y];
        frame.setLayout(new GridLayout(x,y));
        
        for(int n = 0; n < x; n++){
            for(int m = 0; m < y; m++){
              speelVak[n][m] = new JPanel();
              frame.add(speelVak[n][m]);
              speelVak[n][m].setBackground(Color.white);
              speelVak[n][m].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
            }
        }
        
        frame.setSize(900,700);
        frame.setTitle("Sleutel Barricade");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    
    
    
}

