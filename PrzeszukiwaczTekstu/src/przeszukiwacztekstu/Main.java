
package przeszukiwacztekstu;

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
        this.setTitle("przeszukiwacz tekstu");
        this.setBounds(300, 300, 300, 200);
       
        panelSzukania.add(znajdz);
         panelSzukania.add(szukany);
         panelSzukania.add(zamien);
         panelSzukania.add(zmiana);
        
        //obszarTekstowy.selectAll(); - zaznacza cały tekst
        //obszarTekstowy.select(0, 2); //- zaznacza podany obszar tekstu 
       //obszarTekstowy.replaceSelection("ugabuga"); - zamienia podany obszar tekstu
       //obszarTekstowy.replaceRange("Twój tekst został porwany dla okupu", 0, 21);  zamienia na podany string w podanym zasiegu
    // obszarTekstowy.insert("hue hue", 0);
      //obszarTekstowy.append("dolepione na koniec"); //dolepia tekst na koniec
 //    obszarTekstowy.select(obszarTekstowy.getText().indexOf("test"),obszarTekstowy.getText().indexOf("test"));
       znajdz.addActionListener(new znajdowanieHandler());
      zamien.addActionListener(new zmienianieHandler());
       
        this.getContentPane().add(obszarPrzewijania, BorderLayout.NORTH);
         this.getContentPane().add(panelSzukania,BorderLayout.CENTER);
         
  
        this.setDefaultCloseOperation(3);
   }
   
   private JTextArea obszarTekstowy = new JTextArea("to jest testowy tekst", 5, 10);
   private JScrollPane obszarPrzewijania =  new JScrollPane(obszarTekstowy);
   private JPanel panelSzukania = new JPanel(); 
   private JButton znajdz = new JButton("ZNAJDZ");
   private JButton zamien = new JButton("Zamien");
   private JTextField szukany = new JTextField(4);
   private JTextField zmiana = new JTextField(4);

    
   
   private class znajdowanieHandler implements ActionListener
   {
              private int poczatekSzukanego = 0;

       public void actionPerformed(ActionEvent e)
       {
       
       
       poczatekSzukanego = obszarTekstowy.getText().indexOf(szukany.getText(), poczatekSzukanego+szukany.getText().length());
      System.out.println(poczatekSzukanego);
      
      if (poczatekSzukanego == -1)
          poczatekSzukanego = obszarTekstowy.getText().indexOf(szukany.getText());
      
      if (poczatekSzukanego >= 0 && szukany.getText().length() > 0)
      {
          obszarTekstowy.requestFocus();
          obszarTekstowy.select(poczatekSzukanego, poczatekSzukanego+szukany.getText().length());
      }
       }
   }
    private class zmienianieHandler implements ActionListener
   {
        public void actionPerformed(ActionEvent e)
        {
       
          if(obszarTekstowy.getSelectionStart() != obszarTekstowy.getSelectionEnd())
          {
           //najdz.doClick();
            obszarTekstowy.replaceRange(zmiana.getText(),obszarTekstowy.getSelectionStart(),obszarTekstowy.getSelectionEnd() );
          } 
          else znajdz.doClick();
        }
        
   }
          

   public static void main(String[] args)
    {
       new Main().setVisible(true);
    }
    
}
