package main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.InputMismatchException;

public class Controller implements Serializable {
    private final Menu menu;

    public Controller(Menu menu) {
        this.menu = menu;
    }

    DecimalFormat format1 = new DecimalFormat("#.00");
    DecimalFormat format2 = new DecimalFormat("#.000");


    public double getFieldValue(JTextField field) {

        Double val = null;
        try {
            if (Double.valueOf(field.getText()) >= 0) {
                val = Double.valueOf(field.getText());
                System.out.println(val);

                //this does not work!!
            } else if (field.getText().isEmpty()) {
                System.out.println("No value entered. Please enter value in the field.");

                JOptionPane.showMessageDialog(null,
                        "No value entered. Please enter value in the field.",
                        "Warning",
                        JOptionPane.WARNING_MESSAGE);


            } else {
                System.out.println("Value cannot be lower than 0");
                field.setText(null);
                JOptionPane.showMessageDialog(null,
                        "Value cannot be lower than 0",
                        "Warning",
                        JOptionPane.WARNING_MESSAGE);
            }

        } catch (NumberFormatException exc) {
            field.setText(null);
            System.out.println("Wrong input. Use numbers only.");
                        JOptionPane.showMessageDialog(null,
                                "Wrong input. Use numbers only.",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);
                       exc.getMessage();
        }
        return val;
    }

    void obliczPasteryzacjeActionPerformed(ActionEvent evt) {
        if (menu.getTempPas() >= 60) {
            menu.setPasteurizationResult((int) Math.pow((menu.getPasteurizationTime() * 1.393), (menu.getTempPas() - 60)));
            System.out.println("" + menu.getPasteurizationResult());
            menu.getPasteurizationResultField().setText("" + menu.getPasteurizationResult());
        } else {
           //PL // System.out.println("Za niska temperatura. Podaj wartosc powyzej 60 degC");
//            JOptionPane.showMessageDialog(null,
//                    "Za niska temperatura. Podaj wartosc powyzej 60 degC",
//                    "Warning",
//                    JOptionPane.WARNING_MESSAGE);
//            return;
            System.out.println("Temperature value too low. Input value greater than 60 degC");
            JOptionPane.showMessageDialog(null,
                    "Temperature value too low. Input value greater than 60 degC",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
    }

    void obliczEnergieActionPerformed(ActionEvent evt) {
        menu.setEnergyResult((int) ((menu.getPower2() * menu.getTime2()) / 1000));
        System.out.println("" + menu.getEnergyResult());
        menu.getEnergyResultField().setText("" + (format2.format(menu.getEnergyResult())));
    }

    void obliczCzasActionPerformed(ActionEvent evt) {
        menu.setTimeResult((int) (((menu.getTk() - menu.getTp()) * menu.getVolume() * 1.16 * 60) / (menu.getPower1() * menu.getEfficiency1())));
        System.out.println("" + menu.getTimeResult());
        menu.getTimeResultField().setText("" + menu.getTimeResult());
    }

    void obliczWydajnoscZacieruActionPerformed(ActionEvent evt) {
        menu.setMashEfficiencyResult((int) ((menu.getPractExtract() / menu.getTheorExtract()) * 100));
        System.out.println("" + menu.getMashEfficiencyResult());
        menu.getMashEfficiencyResultField().setText("" + (format1.format(menu.getMashEfficiencyResult())));
    }

    void obliczWydajnoscWarzelniActionPerformed(ActionEvent evt) {
        menu.setBreweryEfficiencyResult((menu.getExtract() / menu.getMaltMass()));
        System.out.println("" + menu.getBreweryEfficiencyResult());
        menu.getBreweryEfficiencyResultField().setText("" + (format1.format(menu.getBreweryEfficiencyResult())));
    }

    void obliczWodeActionPerformed(ActionEvent evt) {
        menu.setWaterResult(((menu.getPower() * menu.getEfficiency() * menu.getTime()) / 626));
        System.out.println("" + menu.getWaterResult());
        menu.getWaterResultField().setText("" + (format1.format(menu.getWaterResult())));
    }

    void obliczIBUActionPerformed(ActionEvent evt) {
        menu.setIbuResult(((menu.getHopMass() * menu.getAlphaAcids() * menu.getUtilization()) / (menu.getWortVolume() * 10)));
        System.out.println("" + menu.getIbuResult());
        menu.getIbuResultField().setText("" + (format1.format(menu.getIbuResult())));
    }

    void obliczChmielActionPerformed(ActionEvent evt) {
        menu.setHopResult((menu.getIb() * menu.getWortVolume1() * 10) / (menu.getAlphaAcids1() * menu.getUtilization1()));
        System.out.println("" + menu.getHopResult());
        menu.getHopsResultField().setText("" + (format1.format(menu.getHopResult())));
    }

    void calculateAttenuationActionPerformed(ActionEvent evt) {
        menu.setAttenuationResult((int) (100 * ((menu.getBlgP() - menu.getBlgK()) / menu.getBlgP())));
        System.out.println("" + menu.getAttenuationResult());
        menu.getAttenuationResultField().setText("" + (format1.format(menu.getAttenuationResult())));
    }
}