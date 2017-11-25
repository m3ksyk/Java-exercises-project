/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listakombinowana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame
{

   public Main()
   {
   initComponents();
   }
   public void initComponents()
   {
   this.setTitle("Listy kombinowane - java combobox");
   this.setBounds(300,300,300,200);
   
   
   
   Kombo.addActionListener( new ActionListener(){
   
   public void actionPerformed(ActionEvent e)
   {
  ColorHandler Handler = (ColorHandler) ((JComboBox)e.getSource()).getSelectedItem();
       ((JComboBox)(e.getSource())).setBackground(Handler.getColor());
   }
   
   });
   panel.add(Kombo);
   
   Kombo.addItem(new ColorHandler("czarny", Color.BLACK));
   Kombo.addItem(new ColorHandler("Zielony", Color.GREEN));
   Kombo.addItem(new ColorHandler("Czerwony", Color.RED));
   
   this.getContentPane().add(panel);
   this.setDefaultCloseOperation(3);
   }
   private class ColorHandler{
   public ColorHandler(String colorName, Color kolor)
   {
       this.kolor = kolor;
       this.colorName = colorName;
   }
   public String toString()
   {
   return this.colorName;
   }
   public Color getColor(){
   return this.kolor;
   }
   private Color kolor;
   private String colorName;
   }
   private JPanel panel = new JPanel();
   private JComboBox Kombo = new JComboBox();
   
   
    public static void main(String[] args) {
        new Main().setVisible(true);
    }
    
}
