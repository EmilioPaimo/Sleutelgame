/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sleutelbarricadev1;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author macan
 */
public class frame extends SleutelBarricadeV1{
    protected static int x = 10;
    protected static int y = 10;
    
    public void speelveldToevoegen(){
        JFrame frame = new JFrame();
        JPanel[][] speelVeld = new JPanel[x][y];
        frame.setLayout(new GridLayout(x,y));
        
        for(int n = 0; n < x; n++){
            for(int m = 0; m < y; m++){
              speelVeld[n][m] = new JPanel();
              frame.add(speelVeld[n][m]);
              speelVeld[n][m].setBackground(Color.DARK_GRAY);
              speelVeld[n][m].setBorder(BorderFactory.createMatteBorder(2, 5, 2, 2, Color.white));
            }
        }
        
        frame.setSize(900,700);
        frame.setTitle("Sleutel Barricade");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
       
    }
   
    

    
    
}
