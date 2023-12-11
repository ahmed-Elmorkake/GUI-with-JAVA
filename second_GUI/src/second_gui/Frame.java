/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package second_gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Frame extends JFrame{
    
    JButton b1= new JButton("show1");
    JButton b2= new JButton("save2");
    JButton b3= new JButton("save3");
    JButton b4= new JButton("save4");
    JButton b5= new JButton("save5");
    
 public Frame()
    {
    this.setVisible(true);
    this.setTitle("second project");
    this.setSize(750, 350);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new BorderLayout(10,20));
    
    this.add(b1,BorderLayout.CENTER); this.add(b2,BorderLayout.NORTH); 
    this.add(b3,BorderLayout.EAST); this.add(b4,BorderLayout.SOUTH);
     this.add(b5,BorderLayout.WEST);
    

    this.setLocation(500, 200);
    
    }    
}
