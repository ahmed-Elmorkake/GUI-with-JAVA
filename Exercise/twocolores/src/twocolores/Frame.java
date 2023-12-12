//Ahmed mansour
package twocolores;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame extends JFrame{
    
    
    
Frame()
{
    Run();
}
    
private void Run()
{

this.setVisible(true);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setSize( 600, 800);
this.setLocation(550, 100);
this.setLayout(null);
p1.setBackground(Color.red);
p2.setBackground(Color.BLUE);
p1.setBounds(WIDTH, WIDTH,600 , 400);
p2.setBounds(WIDTH, 400,600 ,400);

this.add(p1);
this.add(p2);

}
    


// Variables declaration - do not modify
    JPanel p1=new JPanel();
    JPanel p2=new JPanel();
    
}
