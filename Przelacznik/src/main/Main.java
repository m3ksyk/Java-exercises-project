
package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Main extends JFrame {
    public Main(){
    initComponents();
    }
    public void initComponents()
    {
    
    this.setTitle("grupy przelacznikow radio");
    this.setBounds(300, 300, 300, 200);
    panel2.add(etykieta);
   
//    JRadioButton przelacznik = new JRadioButton("Mały");
//    JRadioButton sredniprzelacznik = new JRadioButton("Sredni");
    zbudujPrzelacznikRozmiar("Maly", 15);
    zbudujPrzelacznikRozmiar("Sredni", 20);
    zbudujPrzelacznikRozmiar("Duzy", 25);
    zbudujPrzelacznikKolor("zielony", Color.GREEN);
    zbudujPrzelacznikKolor("marzena", Color.MAGENTA);
    zbudujPrzelacznikKolor("niebieski", Color.BLUE);
    
    
    
    this.getContentPane().add(panel, BorderLayout.NORTH);
    this.getContentPane().add(panel2, BorderLayout.CENTER);
    this.getContentPane().add(panel3, BorderLayout.SOUTH);
  
//    przelacznik.addActionListener(new ActionListener()
//    { 
//        public void actionPerformed(ActionEvent e)
//    {
//     etykieta.setFont(new Font("Monospaced", Font.PLAIN, 15));   
//    }
//    });
//    groupSize.add(przelacznik);
//    groupSize.add(sredniprzelacznik);
//   
//    panel.add(przelacznik);
//   panel.add(sredniprzelacznik);
//  
   this.setDefaultCloseOperation(3);
   this.setVisible(true); 
    }
  public void zbudujPrzelacznikRozmiar(String nazwa, int rozmiar)
  {
  JRadioButton przelacznik = new JRadioButton(nazwa);
  przelacznik.addActionListener(new ActionListener()
  { public void actionPerformed(ActionEvent e)
  { etykieta.setFont(new Font("Monospaced", Font.PLAIN, rozmiar));
          }
  });
  groupSize.add(przelacznik);
  panel.add(przelacznik);
  }
  
  public void zbudujPrzelacznikKolor(String nazwa, final Color k)
  {
  JRadioButton przelacznikKolor = new JRadioButton(nazwa);
  przelacznikKolor.addActionListener(new ActionListener()
  { public void actionPerformed(ActionEvent e)
  { etykieta.setForeground(k);
   }
  });
  groupColor.add(przelacznikKolor);
  panel3.add(przelacznikKolor);
  }
JPanel panel = new JPanel();
JPanel panel2 = new JPanel();
JPanel panel3 = new JPanel();
JLabel etykieta = new JLabel("Cos");
ButtonGroup groupSize = new ButtonGroup();
ButtonGroup groupColor = new ButtonGroup();
    
    public static void main(String[] args) {
      new Main().setVisible(true);
    }
    
}
