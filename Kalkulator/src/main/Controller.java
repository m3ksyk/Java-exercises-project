package main;



import javax.swing.*;
import java.util.InputMismatchException;

import static java.lang.Double.valueOf;
import static java.lang.Math.pow;

public class Controller {

//this controller does NOTHING at the moment. To be fixed in foreseeable future


    //get it WORKING!!
    public void getFieldValue(JTextField field) {

        try {
            if (valueOf(field.getText()) >= 0){
                Double  val = valueOf(field.getText());
                System.out.println(val);
            }else if(field.getText().isEmpty()){
                System.out.println("No value entered. Please enter a value in the field.");
                //add an alert here
            }
            else {
                System.out.println("Value cannot be lower than 0");
                //add an alert or something
            }

        } catch (InputMismatchException exc) {
            System.out.println("Wrong input. Use numbers only.");
            exc.getMessage();
        }

    }


}
