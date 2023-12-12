/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package third_project;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
        
/**
 *
 * @author Mr
 */
public class Frame  extends JFrame{
    
    Frame()
    {
        b1=new JButton("saving");
        b2=new JButton("loading");
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(600,400 );
    
    this.setLocation(300, 200);
    
    this.setLayout(null);
    b1.setBounds(159, 100, 90, 44);
    b2.setBounds(319, 100, 90, 44);
    t1.setBounds(159, 200, 251, 44);
   
    this.add(b1);
    this.add(b2);
    this.add(t1);
    
    }
 
    // Variables declaration - do not modify
 
 private JButton b1;
 private JButton b2=new JButton();
 private JTextField t1=new  JTextField(); 
    
    
}
