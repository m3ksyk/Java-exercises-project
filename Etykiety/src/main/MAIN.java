
package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MAIN extends JFrame 
{
    public MAIN()
    {
    super("zegarek");
    this.setBounds(300, 300, 300, 200);
    initComponents();
    this.setDefaultCloseOperation(3);
    }
    
    public void initComponents()
    {
    panel.add(label);
    panel.add(czas);
    
    ActionListener stoper = new Zegar();
    Timer zegar = new Timer(1000, stoper );
    zegar.start();
    
    this.getContentPane().add(panel);
    }
    
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Time: ");
    JLabel czas = new JLabel();
    
    private class Zegar implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
           GregorianCalendar kalendar = new GregorianCalendar();
           String h = ""+kalendar.get(Calendar.HOUR_OF_DAY);
           String min = ""+kalendar.get(Calendar.MINUTE);
           String sek = ""+kalendar.get(Calendar.SECOND);
           
           if (Integer.parseInt(h) < 10)
               h = "0"+h;
           if (Integer.parseInt(min) < 10)
               min = "0"+min;
           if (Integer.parseInt(sek) < 10)
               sek = "0"+sek;
           
           czas.setText(""+h+":"+min+":"+sek);
        }
    }
    
    
//   public String pobierzCzas()  //<--insza metoda wtdy w czas.setText trzba zwrócić ten string
//   {
//       GregorianCalendar kalendar = new GregorianCalendar();
//           String h = ""+kalendar.get(Calendar.HOUR_OF_DAY);
//           String min = ""+kalendar.get(Calendar.MINUTE);
//           String sek = ""+kalendar.get(Calendar.SECOND);
//           
//           if (Integer.parseInt(h) < 10)
//               h = "0"+h;
//           if (Integer.parseInt(min) < 10)
//               min = "0"+min;
//           if (Integer.parseInt(sek) < 10)
//               sek = "0"+sek;
//   return h+":"+min+":"+sek
//   }
    public static void main(String[] args) {
      new MAIN().setVisible(true);
    }
    
}
