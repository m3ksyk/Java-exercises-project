
package lista;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
 
public class Main extends JFrame {
public Main(){
initComponents();
}
   public void initComponents()
   {
   this.setTitle("lista");
   this.setBounds(300,300,300,200);
   
  
   panelListy.add(scrollListy);
   panelKomunikatu.add(komunikat);
   lista.setVisibleRowCount(1); //ustawienie ilośći widocznych wierszy listy
   lista.setFixedCellHeight(30);
   lista.addListSelectionListener(new ListSelectionListener(){
       @Override
       public void valueChanged(ListSelectionEvent e) {
        System.out.println("Zmieniło się" +(++i));
        if(e.getValueIsAdjusting())
            System.out.println("Czymię button myszy!!");
        else 
            System.out.println("Puściłżech!");
//        if(!e.getValueIsAdjusting())
//        {
//        Object[] wartoscWLiscie;
//            wartoscWLiscie = ((JList)e.getSource()).getSelectedValues();
//        String przedmioty ="";
//        for(int i = 0; i<wartoscWLiscie.length; i++)
//            przedmioty += (String)wartoscWLiscie[i]; 
//            
//            System.out.println(przedmioty);
//        }
        
       }
   
   });
   DefaultListModel model = new DefaultListModel();
   model.addElement("a");
   model.addElement("b");
   model.addElement("x");
   JList lista2 = new JList(model);
   lista2.addListSelectionListener(new ListSelectionListener(){
       @Override
       public void valueChanged(ListSelectionEvent lse) {
          model.remove(1);
       }
   
   });
   panel3.add(lista2);
   this.getContentPane().add(panelListy,BorderLayout.NORTH);
    this.getContentPane().add(panelKomunikatu,BorderLayout.CENTER);
    this.getContentPane().add(panel3,BorderLayout.SOUTH);
    this.setDefaultCloseOperation(3);
  // lista.setSelectionBackground(Color.green); // wybrana opcja bedzie miała zmienione tło na podany kolor
   }
   private int i = 0;
   private JList lista = new JList(new String[]{"Matma","Fiza","Biola","Chemia","Infa"});
   private JPanel panelListy = new JPanel();
   private JScrollPane scrollListy = new JScrollPane(lista); //scroll do przewijania listy
   private JPanel panelKomunikatu = new JPanel();
   private JPanel panel3 = new JPanel();
   private JLabel komunikat = new JLabel();
   public static void main(String[] args) {
        new Main().setVisible(true);
    }
    
}
