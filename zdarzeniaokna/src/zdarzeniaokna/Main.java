/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zdarzeniaokna;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements WindowListener{
    public Main(){
    initComponents();
            
    }
    public void initComponents()
    {
    this.setTitle("zdarzenia_okna");
    this.setBounds(300,300,300,200);
    this.addWindowListener(this);
    this.setDefaultCloseOperation(3);
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Main().setVisible(true);
    }

    @Override
    public void windowOpened(WindowEvent we) {
    JOptionPane.showMessageDialog(rootPane, "Welcome");
    }

    @Override
    public void windowClosing(WindowEvent we) {
      int option = JOptionPane.showConfirmDialog(rootPane, "Are you sure?");
    if (option == 0)
        this.dispose();
    }

    @Override
    public void windowClosed(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
