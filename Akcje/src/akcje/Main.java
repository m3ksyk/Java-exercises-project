
package akcje;

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
     podMenuZapisz.setEnabled(false);
     podMenuZapisz.addActionListener(new ActionListener(){
     
         @Override
         public void actionPerformed(ActionEvent e) {
             System.out.println("SAVING");
             podMenuZapisz.setEnabled(FlagaTekst=false);
         }
         
             });
     
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
     
     obszarTekstowy.addKeyListener(new KeyAdapter() {
     public void keyTyped(KeyEvent e) 
     {
     if (dupa.isSelected())
         e.consume();
     }
     public void keyPressed(KeyEvent e) 
     {
       if (dupa.isSelected())
           e.consume();
       else if ((obszarTekstowy.getText() + e.getKeyChar()).equals(przedZmiana)&& isASCII(e.getKeyChar()) )
       {
       przedZmiana = obszarTekstowy.getText();
       podMenuZapisz.setEnabled(FlagaTekst=true);
       }
       System.out.println(obszarTekstowy.getText()+e.getKeyChar());
       
     }
     
     
     });
     this.getContentPane().setLayout(new GridLayout(2,1));
     this.getContentPane().add(obszarTekstowy);
     this.setDefaultCloseOperation(3);
     }
     
     private JMenuBar pasekMenu = new JMenuBar();
     private JCheckBoxMenuItem dupa= new JCheckBoxMenuItem("DUPA");
     private JTextArea obszarTekstowy = new JTextArea();
     private boolean FlagaTekst = false;
     private String przedZmiana = "";
    private boolean isASCII(char ch)
    {
    for (int i = 0; i<256; i++)
     if (ch == 1)
       return true;
      return false;
    }
     
     
     public static void main(String[] args) {
        new Main().setVisible(true);
    }
    
}