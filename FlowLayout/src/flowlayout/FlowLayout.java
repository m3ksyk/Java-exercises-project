
package flowlayout;


import javax.swing.*;
import java.awt.*;

public class FlowLayout extends JFrame{
    public FlowLayout()
    {
        this.setBounds(300, 300, 300, 200);
        initComponents();
        this.setDefaultCloseOperation(3);
    }
public void initComponents()
{
    
    
    
    panel1.add(przycisk1);
    panel1.add(przycisk2);
    panel1.add(anuluj);
    this.getContentPane().add(panel1, BorderLayout.PAGE_START);
}
        JPanel panel1 = new JPanel();

      JButton  przycisk1 = new JButton("Przycisk"); 
      JButton  przycisk2 = new JButton("Przycisk2"); 
      JButton  przycisk3 = new JButton("Przycisk3"); 
      JButton  przycisk4 = new JButton("Przycisk4");
      JButton  anuluj = new JButton("anuluj");
public static void main(String[] args)
{
    new FlowLayout().setVisible(true);
}
}
