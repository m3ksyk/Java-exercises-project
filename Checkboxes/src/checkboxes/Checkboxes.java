
package checkboxes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Checkboxes extends JFrame{
public Checkboxes(){
initComponents();
        }
public void initComponents(){

this.setTitle("Pola wyboru");
this.setBounds(300, 300, 300, 200);

ActionListener sluchacz = new CheckBoxHandler();
Bold.addActionListener(sluchacz);
Pochyl.addActionListener(sluchacz);
panel1.add(Bold);
panel1.add(Pochyl);

panel2.add(etykieta);

this.getContentPane().add(panel1, BorderLayout.NORTH);
this.getContentPane().add(panel2, BorderLayout.CENTER);

this.setDefaultCloseOperation(3);

}
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
   
    JCheckBox Bold = new JCheckBox("BOLD");
    JCheckBox Pochyl = new JCheckBox("Pochyl");
    JLabel etykieta = new JLabel("IT WERKZ!!");
    
    public class CheckBoxHandler implements ActionListener
    {
    public void actionPerformed(ActionEvent e){
        int style = Font.PLAIN;
        
        if (Bold.isSelected()) style += Font.BOLD;
        if (Pochyl.isSelected()) style += Font.ITALIC;
        etykieta.setFont(new Font("Monospaced", style, 20));
    }
    }
    public static void main(String[] args) {
        new Checkboxes().setVisible(true);
    }
    
}
