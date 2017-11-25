
package pasekmenu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Main extends JFrame {
  public Main()
  {
  initComponents();
  }

   
     public void initComponents()
     {
     this.setTitle("pasekMenu");
     this.setBounds(300,300,300,200);
     this.setJMenuBar(pasekMenu);
     //pasekMenu.add(new JMenu("plik"));
     JMenu menuPlik = new JMenu("plik");
     pasekMenu.add(menuPlik);
     menuPlik.add("Nowy");
     menuPlik.addSeparator();
     JMenuItem podMenuZapisz = menuPlik.add("Zapisz");
     menuPlik.add(new JMenuItem("Wczytaj"));
     menuPlik.addSeparator();
    // menuPlik.add(new JMenu("opcje"));
     JMenu menuOpcje = new JMenu("opcje");
     menuPlik.add(menuOpcje);
     menuOpcje.add(new JMenuItem("1"));
     menuOpcje.add(new JMenuItem("2"));
     menuOpcje.add(new JMenuItem("3"));
     menuOpcje.add(dupa);
     dupa.addActionListener(new ActionListener()
     {
         @Override
         public void actionPerformed(ActionEvent e) {
            if(dupa.isSelected()) 
         podMenuZapisz.setEnabled(false);
            else
            podMenuZapisz.setEnabled(true);
            
                }
         
     });
     JMenu menuPomoc = pasekMenu.add(new JMenu("Pomoc"));
     menuPomoc.add(new JMenuItem("FAQ"));
     menuPomoc.add(new JMenuItem("Instrukcja"));
     
     
     this.setDefaultCloseOperation(3);
     }
     
     private JMenuBar pasekMenu = new JMenuBar();
     private JCheckBoxMenuItem dupa= new JCheckBoxMenuItem("DUPA");
     
    public static void main(String[] args) {
        new Main().setVisible(true);
    }
    
}
