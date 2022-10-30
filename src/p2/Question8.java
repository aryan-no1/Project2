/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;


/**
 *
 * @author Aditya Sharma
 */
public class Question8 extends JFrame{
    
    public Question8() {
        this.setSize(1000, 500);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setLayout(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.BLUE);
        panel.setSize(1000, 500);
        this.add(panel);

        JLabel qua1 = new JLabel("Question. Who is the prime minister of NZ.");
        qua1.setFont(new Font("Helvetica", Font.BOLD, 20));
        qua1.setLocation(100, 20);
        qua1.setSize(900, 150);

        JButton button2 = new JButton("EXIT");
        button2.setSize(150, 30);
        button2.setLocation(100, 400);
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                  System.exit(0);
            }
        });
        
         JButton button3 = new JButton("NEXT");
        button3.setSize(150, 30);
        button3.setLocation(800, 400);
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                  Question9 ab = new Question9();
            }
        });

        panel.add(qua1);
        panel.add(button2);
        panel.add(button3);
        this.setVisible(true);
    }

    
}
