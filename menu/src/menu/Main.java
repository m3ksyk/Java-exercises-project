package menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main  extends JFrame{
public Main()
{
initComponents();
}
public void initComponents()
{

this.setTitle("Menu");
this.setBounds(300, 300, 300, 200);

panelMenu.setLayout(new GridLayout(3,1));
panelMenu.add(menu1);
panelMenu.add(menu2);
panelMenu.add(menu3);

kontener.add(panelMenu);
this.setDefaultCloseOperation(3);
}
 
private Container kontener = this.getContentPane();

private JPanel panelMenu = new JPanel();

private MenuButton menu1 = new MenuButton("1.Dodaj");
private MenuButton menu2 = new MenuButton("2.usun");
private MenuButton menu3 = new MenuButton("3.zmien");
private int i = 0;

private class MenuButton extends JButton implements FocusListener, ActionListener
        {
    public MenuButton(String nazwa)
            {
            super(nazwa);
            this.addFocusListener(this);
            this.addKeyListener(new KeyAdapter() {               

                @Override
                public void keyPressed(KeyEvent ke)
                {
                    keypressedHandler(ke);
                }
            });
            this.setBackground(kFocusLost);
            }

        @Override
        public void focusGained(FocusEvent fe) {
         this.setBackground(kFocusGained);   
        }

        @Override
        public void focusLost(FocusEvent fe) {
            this.setBackground(kFocusLost);
                }
         private void keypressedHandler(KeyEvent ke)
         {
             int dlMenu = panelMenu.getComponentCount();
         if (i==0) i = 10*dlMenu;  
         if(ke.getKeyCode() == KeyEvent.VK_DOWN)
            {
            panelMenu.getComponent(++i%dlMenu).requestFocus();
            }
         else if(ke.getKeyCode() == KeyEvent.VK_UP)
            {
            panelMenu.getComponent(--i%dlMenu).requestFocus();
            }
         else if(ke.getKeyCode() == KeyEvent.VK_ENTER)
            {
            ((MenuButton)ke.getSource()).doClick();            
            }
         }
       private int i = 0;
         private Color kFocusGained = Color.RED;
        private Color kFocusLost = Color.yellow;    

        @Override
        public void actionPerformed(ActionEvent ke) {
            JOptionPane.showMessageDialog(this,((MenuButton)ke.getSource()).getText());
            }
    }        
    public static void main(String[] args) {
        new Main().setVisible(true);
    }    
}