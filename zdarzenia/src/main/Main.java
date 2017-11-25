/*
ZDARZENIA
 */
package main;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame 
{
    public Main()
    {
    super("Zdarzenia");
    this.setBounds(300, 300, 300, 200);
    initComponents();
    this.setDefaultCloseOperation(3);
    }
    public void initComponents()
    {
        kolorczerwony = new JButton("RED");
         kolorczarny = new JButton("BLACK");
        kolorczerwony.addActionListener(new sluchaczKoloru(Color.RED));
        kolorczarny.addActionListener(new sluchaczKoloru(Color.BLACK));
        panel.add(kolorczerwony);
         panel.add(kolorczarny);
        
         buildButton("Green", Color.GREEN);
         this.getContentPane().add(panel);
    }
    JPanel panel = new JPanel();
    JButton kolorczerwony;
    JButton kolorczarny;
    
    public void buildButton(String name, Color k){
    JButton Button = new JButton(name);
    Button.addActionListener(new sluchaczKoloru(k));
    panel.add(Button);
    }
    
   private class sluchaczKoloru implements ActionListener
   {
    public sluchaczKoloru(Color k)
    { this.kolor = k;}
       
    public void actionPerformed(ActionEvent ae) 
    {
        panel.setBackground(kolor);
        }
    Color kolor;
   }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
   new Main().setVisible(true);
    }
    
}
