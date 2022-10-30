/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 * @author Aditya Sharma
 */
public class P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                JFrame trame = new JFrame();
        JPanel panel = new JPanel();
        
        panel.setBounds(0,0,1000,500);
        panel.setBackground(Color.red);
        
        JLabel label = new JLabel("Who wants to be a Billionaire?");
        label.setBounds(200, 10, 500, 100);
        label.setFont(new Font("Helvetica", Font.BOLD, 30));
        
        JLabel play = new JLabel("To play the game");
        play.setBounds(200, 150, 300, 50);
        play.setFont(new Font("Helvetica", Font.BOLD, 20));
        
        JLabel exit = new JLabel("To exit the game");
        exit.setBounds(200, 250, 300, 50);
        exit.setFont(new Font("Helvetica", Font.BOLD, 20));
                      
        JButton button3 = new JButton("PLAY");
        button3.setBounds(500, 150, 100, 30);
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Question1 ab = new Question1();
            }

        });
        
        JButton button4 = new JButton("EXIT");
        button4.setBounds(500, 250, 100, 30);
         button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        
        trame.setSize(1000, 500);
        trame.setBackground(Color.CYAN);
        trame.setVisible(true);
        trame.setTitle("Game");
        trame.setDefaultCloseOperation(trame.EXIT_ON_CLOSE);  
        trame.add(panel);
        panel.setLayout(null);
        panel.add(label);
        panel.add(play);
        panel.add(exit);
        panel.add(button3);
        panel.add(button4);
       
        trame.setLayout(null);
       
    }

        
}
    

