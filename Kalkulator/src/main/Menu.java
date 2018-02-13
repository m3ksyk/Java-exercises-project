/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.InputMismatchException;
import javax.swing.*;
import static java.lang.Double.valueOf;
import static java.lang.Math.pow;

/**
 * @author M3ksyk (m3ksyk@gmail.com)
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     *  method returns alphaAcids value from text field
     * @return
     */
    public double getFieldValue(JTextField field) {

        Double val = null;
        try {
            if (valueOf(field.getText()) >= 0) {
                val = valueOf(field.getText());
                System.out.println(val);
            } else if (field.getText().isEmpty()) {
                System.out.println("No value entered. Please enter value in the field.");
                //add an alert here
            } else {
                System.out.println("Value cannot be lower than 0");
                //add an alert or something
            }

        } catch (InputMismatchException exc) {
            System.out.println("Wrong input. Use numbers only.");
            exc.getMessage();
        }
        return val;
    }

    public double getHopMass() {
        //return hopMass = valueOf(masaChmielu.getText());
        return this.getFieldValue(masaChmielu);
    }

    public double getPasteurizationTime() {
       // return pasteurizationTime = valueOf(czasPasteryzacji.getText());
        return this.getFieldValue(czasPasteryzacji);
    }

    public double getTheorExtract() {
        //return theorExtract = valueOf(ekstraktTeor.getText());
        return this.getFieldValue(ekstraktTeor);
    }


    public double getPractExtract() {
        //return PractExtract = valueOf(ekstrakt1.getText());
        return this.getFieldValue(ekstrakt1);
    }

    public double getExtract() {
        //return extract = valueOf(ekstrakt.getText());
        return this.getFieldValue(ekstrakt);
    }

    public double getUtilization1() {
        //return utilization1 = valueOf(utylizacja1.getText());
        return this.getFieldValue(utylizacja1);
    }

    public double getAlphaAcids1() {
//        return alphaAcids1 = valueOf(alfaKwasy1.getText());
        return this.getFieldValue(alfaKwasy1);
    }

    public double getWortVolume1() {
      //  return wortVolume1 = valueOf(objBrzeczki1.getText());
        return this.getFieldValue(objBrzeczki1);
    }

    public double getIb() {
        //return ib = valueOf(ibu.getText());
        return this.getFieldValue(ibu);
    }

    public double getMaltMass() {
//        return maltMass = valueOf(zasyp.getText());
    return this.getFieldValue(zasyp);
    }

    public double getBlgK() {
//        return blgK = valueOf(blgKonc.getText());
    return this.getFieldValue(blgKonc);
    }

    public double getBlgP() {
        //return blgP = valueOf(blgPocz.getText());
        return this.getFieldValue(blgPocz);
    }

    public double getAlphaAcids() {
//        return alphaAcids = valueOf(alfaKwasy.getText());
    return this.getFieldValue(alfaKwasy);
    }

    public double getUtilization() {
//        return utilization = valueOf(utylizacja.getText());
    return this.getFieldValue(utylizacja);
    }

    public double getWortVolume() {
        //return wortVolume = valueOf(objBrzeczki.getText());
        return this.getFieldValue(objBrzeczki);
    }

    public double getTime() {
        //return time = valueOf(czas.getText());
        return this.getFieldValue(czas);
    }
// FIND IT!!
    public double getPower() {
        return this.getFieldValue(Moc);
    }

    public double getEfficiency1() {
//        return efficiency1 = valueOf(wydajnosc1.getText());
    return this.getFieldValue(wydajnosc1);
    }

    public double getPower1() {
//        return power1 = valueOf(moc1.getText());
    return this.getFieldValue(moc1);
    }

    public double getVolume() {
//        return volume = valueOf(objetosc.getText());
    return this.getFieldValue(objetosc);
    }


    public double getTk() {
        //return tk = valueOf(tempKonc.getText());
        return this.getFieldValue(tempKonc);
    }

    public double getTp() {
       // return tp = valueOf(tempPocz.getText());
        return this.getFieldValue(tempPocz);
    }

    public double getTime2() {
//        return time2 = valueOf(czas2.getText());
    return this.getFieldValue(czas2);
    }

    public double getPower2() {
//        return power2 = valueOf(moc2.getText());
    return this.getFieldValue(moc2);
    }

    public double getTempPas() {
//        return tempPas = valueOf(temperaturaPasteryzacji.getText());
        return this.getFieldValue(temperaturaPasteryzacji);
    }

    public double getEfficiency() {
//        return efficiency = valueOf(wydajnosc.getText());
    return this.getFieldValue(wydajnosc);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        calculateIBUButton = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        masaChmielu = new javax.swing.JTextField();
        alfaKwasy = new javax.swing.JTextField();
        utylizacja = new javax.swing.JTextField();
        objBrzeczki = new javax.swing.JTextField();
        ibuResultField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        obliczChmiel = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        ibu = new javax.swing.JTextField();
        objBrzeczki1 = new javax.swing.JTextField();
        alfaKwasy1 = new javax.swing.JTextField();
        utylizacja1 = new javax.swing.JTextField();
        hopsResultField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        czasPasteryzacji = new javax.swing.JTextField();
        temperaturaPasteryzacji = new javax.swing.JTextField();
        pasteurizationResultField = new javax.swing.JTextField();
        obliczPasteryzacje = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        obliczWydajnoscWarzelni = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        breweryEfficiencyResultField = new javax.swing.JTextField();
        zasyp = new javax.swing.JTextField();
        ekstrakt = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        obliczWydajnoscZacieru = new javax.swing.JButton();
        ekstrakt1 = new javax.swing.JTextField();
        ekstraktTeor = new javax.swing.JTextField();
        mashEfficiencyResultField = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        obliczOdfermentowanie = new javax.swing.JButton();
        attenuationResultField = new javax.swing.JTextField();
        blgKonc = new javax.swing.JTextField();
        blgPocz = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        obliczWode = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        Moc = new javax.swing.JTextField();
        wydajnosc = new javax.swing.JTextField();
        czas = new javax.swing.JTextField();
        waterResultField = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        obliczCzas = new javax.swing.JButton();
        tempPocz = new javax.swing.JTextField();
        tempKonc = new javax.swing.JTextField();
        objetosc = new javax.swing.JTextField();
        moc1 = new javax.swing.JTextField();
        wydajnosc1 = new javax.swing.JTextField();
        timeResultField = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        obliczEnergie = new javax.swing.JButton();
        moc2 = new javax.swing.JTextField();
        czas2 = new javax.swing.JTextField();
        energyResultField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kalkulator piwowarski");

        jPanel1.setName("IBU");

        jLabel31.setText("masa chmielu [g]");

        jLabel32.setText("AA [%]");

        jLabel33.setText("Utylizacja [%]");

        jLabel34.setText("V brzeczki [L]");

        calculateIBUButton.setText("Oblicz");
//        calculateIBUButton.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                obliczIBUActionPerformed(evt);
//            }
//        });

        jLabel35.setText("IBU");

        masaChmielu.setName("masaChmielu");
//        masaChmielu.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                masaChmieluActionPerformed(evt);
//            }
//        });

//        alfaKwasy.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                alfaKwasyActionPerformed(evt);
//            }
//        });
//
//        utylizacja.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                utylizacjaActionPerformed(evt);
//            }
//        });

//        objBrzeczki.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                objBrzeczkiActionPerformed(evt);
//            }
//        });

        ibuResultField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));


        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(jLabel35)
                                        .addComponent(calculateIBUButton)
                                        .addComponent(jLabel34)
                                        .addComponent(jLabel33)
                                        .addComponent(jLabel32)
                                        .addComponent(jLabel31))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ibuResultField, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                        .addComponent(objBrzeczki)
                                        .addComponent(utylizacja)
                                        .addComponent(alfaKwasy)
                                        .addComponent(masaChmielu))
                                .addContainerGap(167, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel31)
                                        .addComponent(masaChmielu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel32)
                                        .addComponent(alfaKwasy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel33)
                                        .addComponent(utylizacja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel34)
                                        .addComponent(objBrzeczki, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(calculateIBUButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel35)
                                        .addComponent(ibuResultField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(72, Short.MAX_VALUE))
        );

        masaChmielu.getAccessibleContext().setAccessibleName("masaChmielu");

        jTabbedPane1.addTab("IBU", jPanel1);

        jPanel2.setName("ilość Chmielu"); // NOI18N

        jLabel26.setText("IBU");

        jLabel27.setText("V brzeczki [L]");

        jLabel28.setText("AA [%]");

        jLabel29.setText("utylizacja [%]");

        obliczChmiel.setText("Oblicz");
        obliczChmiel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obliczChmielActionPerformed(evt);
            }
        });

        jLabel30.setText("ilosc chmielu [g]");

//        ibu.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                ibuActionPerformed(evt);
//            }
//        });
//
//        objBrzeczki1.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                objBrzeczki1ActionPerformed(evt);
//            }
//        });
//
//        alfaKwasy1.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                alfaKwasy1ActionPerformed(evt);
//            }
//        });
//
//        utylizacja1.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                utylizacja1ActionPerformed(evt);
//            }
//        });


        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(jLabel26)
                                        .addComponent(jLabel27)
                                        .addComponent(jLabel28)
                                        .addComponent(jLabel29)
                                        .addComponent(obliczChmiel)
                                        .addComponent(jLabel30))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(utylizacja1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                                .addComponent(alfaKwasy1)
                                                .addComponent(objBrzeczki1)
                                                .addComponent(ibu))
                                        .addComponent(hopsResultField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(176, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ibu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel27)
                                        .addComponent(objBrzeczki1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel28)
                                        .addComponent(alfaKwasy1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel29)
                                        .addComponent(utylizacja1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(obliczChmiel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel30)
                                        .addComponent(hopsResultField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(62, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ilość Chmielu", jPanel2);

        jPanel3.setName("pasteryzacja"); // NOI18N

        jLabel1.setText("Czas [min]");

        jLabel2.setText("Temperatura [degC]");

        jLabel3.setText("Jednostki pasteryzacja");

//        czasPasteryzacji.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                czasPasteryzacjiActionPerformed(evt);
//            }
//        });
//
//        temperaturaPasteryzacji.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                temperaturaPasteryzacjiActionPerformed(evt);
//            }
//        });

        pasteurizationResultField.setMaximumSize(new java.awt.Dimension(214, 2147483647));


        obliczPasteryzacje.setText("Oblicz");
        obliczPasteryzacje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obliczPasteryzacjeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(jLabel3)
                                        .addComponent(obliczPasteryzacje)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(pasteurizationResultField, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                        .addComponent(temperaturaPasteryzacji)
                                        .addComponent(czasPasteryzacji))
                                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(czasPasteryzacji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(temperaturaPasteryzacji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(obliczPasteryzacje)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(pasteurizationResultField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(80, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("pasteryzacja", jPanel3);

        jPanel4.setName("wyd warzelni"); // NOI18N

        jLabel23.setText("ekstrakt [g]");

        jLabel24.setText("zasyp [g]");

        obliczWydajnoscWarzelni.setText("Oblicz");
        obliczWydajnoscWarzelni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obliczWydajnoscWarzelniActionPerformed(evt);
            }
        });

        jLabel25.setText("wydajnosc");


//        zasyp.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                zasypActionPerformed(evt);
//            }
//        });
//
//        ekstrakt.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                ekstraktActionPerformed(evt);
//            }
//        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(obliczWydajnoscWarzelni)
                                        .addComponent(jLabel25)
                                        .addComponent(jLabel24)
                                        .addComponent(jLabel23))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(breweryEfficiencyResultField, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                        .addComponent(zasyp)
                                        .addComponent(ekstrakt))
                                .addContainerGap(156, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel23)
                                        .addComponent(ekstrakt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel24)
                                        .addComponent(zasyp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(obliczWydajnoscWarzelni)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel25)
                                        .addComponent(breweryEfficiencyResultField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(80, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("wyd warzelni", jPanel4);

        jPanel5.setName("wyd zacieru");

        jLabel20.setText("ekstrakt [g]");

        jLabel21.setText("ekstrakt teor [g]");

        jLabel22.setText("wydajnosc");

        obliczWydajnoscZacieru.setText("Oblicz");
        obliczWydajnoscZacieru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obliczWydajnoscZacieruActionPerformed(evt);
            }
        });

//        ekstrakt1.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                ekstrakt1ActionPerformed(evt);
//            }
//        });
//
//        ekstraktTeor.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                ekstraktTeorActionPerformed(evt);
//            }
//        });


        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(obliczWydajnoscZacieru)
                                .addGap(89, 237, Short.MAX_VALUE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(jLabel21)
                                        .addComponent(jLabel20)
                                        .addComponent(jLabel22))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(ekstraktTeor)
                                                        .addComponent(ekstrakt1)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(mashEfficiencyResultField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(94, 94, 94))
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel20)
                                        .addComponent(ekstrakt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel21)
                                        .addComponent(ekstraktTeor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(obliczWydajnoscZacieru)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel22)
                                        .addComponent(mashEfficiencyResultField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(97, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("wyd zacieru", jPanel5);

        jPanel6.setName("odfermentowanie");

        jLabel17.setText("BLG p");

        jLabel18.setText("BLG k");

        jLabel19.setText("Odfermentowanie");

        obliczOdfermentowanie.setText("Oblicz");
        obliczOdfermentowanie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateAttenuationActionPerformed(evt);
            }
        });

//        blgKonc.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                blgKoncActionPerformed(evt);
//            }
//        });
//
//        blgPocz.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                blgPoczActionPerformed(evt);
//            }
//        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(jLabel19)
                                        .addComponent(obliczOdfermentowanie)
                                        .addComponent(jLabel18)
                                        .addComponent(jLabel17))
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addComponent(attenuationResultField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(blgKonc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(blgPocz, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel17)
                                        .addComponent(blgPocz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel18)
                                        .addComponent(blgKonc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addComponent(obliczOdfermentowanie)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel19)
                                        .addComponent(attenuationResultField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(93, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("odfermentowanie", jPanel6);

        jPanel7.setName("woda odpar");

        jLabel13.setText("Moc [W]");

        jLabel14.setText("Wydajnosc");

        jLabel15.setText("Czas [h]");

        obliczWode.setText("Oblicz");
        obliczWode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obliczWodeActionPerformed(evt);
            }
        });

        jLabel16.setText("odparowana woda [L]");

//        Moc.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                MocActionPerformed(evt);
//            }
//        });
//
//        wydajnosc.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                wydajnoscActionPerformed(evt);
//            }
//        });
//
//        czas.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                czasActionPerformed(evt);
//            }
//        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel15)
                                        .addComponent(obliczWode)
                                        .addComponent(jLabel16))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(czas, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                                .addComponent(wydajnosc)
                                                .addComponent(Moc))
                                        .addComponent(waterResultField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel13)
                                        .addComponent(Moc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel14)
                                        .addComponent(wydajnosc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel15)
                                        .addComponent(czas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(obliczWode)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel16)
                                        .addComponent(waterResultField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(70, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("woda odpar", jPanel7);

        jPanel8.setName("czas Grzania");

        jLabel7.setText("Tp [degC]");

        jLabel8.setText("Tk [degC]");

        jLabel9.setText("obj [L]");

        jLabel10.setText("moc [W]");

        jLabel11.setText("wydajnosc");

        jLabel12.setText("Czas");

        obliczCzas.setText("Oblicz");
        obliczCzas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obliczCzasActionPerformed(evt);
            }
        });

//        tempPocz.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                tempPoczActionPerformed(evt);
//            }
//        });
//
//        tempKonc.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                tempKoncActionPerformed(evt);
//            }
//        });
//
//        objetosc.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                objetoscActionPerformed(evt);
//            }
//        });
//
//        moc1.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                moc1ActionPerformed(evt);
//            }
//        });
//
//        wydajnosc1.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                wydajnosc1ActionPerformed(evt);
//            }
//        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel11)
                                        .addComponent(obliczCzas)
                                        .addComponent(jLabel12))
                                .addGap(57, 57, 57)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(moc1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                        .addComponent(tempKonc)
                                        .addComponent(tempPocz)
                                        .addComponent(objetosc)
                                        .addComponent(wydajnosc1)
                                        .addComponent(timeResultField))
                                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(tempPocz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(tempKonc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(objetosc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(moc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel11)
                                        .addComponent(wydajnosc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(obliczCzas)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabel12))
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(timeResultField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(34, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("czas Grzania", jPanel8);

        jPanel9.setName("energia"); // NOI18N

        jLabel4.setText("Moc [W]");

        jLabel5.setText("Czas [h]");

        jLabel6.setText("Energia [kWh]");

        obliczEnergie.setText("Oblicz");
        obliczEnergie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obliczEnergieActionPerformed(evt);
            }
        });

//        moc2.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                moc2ActionPerformed(evt);
//            }
//        });
//
//        czas2.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                czas2ActionPerformed(evt);
//            }
//        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(jLabel6)
                                        .addComponent(obliczEnergie)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(moc2, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                        .addComponent(czas2)
                                        .addComponent(energyResultField))
                                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(moc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(czas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addComponent(obliczEnergie)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(energyResultField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(97, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("energia", jPanel9);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTabbedPane1)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pack();
    }

    private void obliczPasteryzacjeActionPerformed(java.awt.event.ActionEvent evt) {
        if(getTempPas() > 60) {
            pasteurizationResult = (int) pow((getPasteurizationTime() * 1.393), (getTempPas() - 60));
            System.out.println("" + pasteurizationResult);
            pasteurizationResultField.setText("" + pasteurizationResult);
        }else{
            System.out.println("Za niska temperatura. Podaj wartosc powyzej 60 degC");
            this.dispose();
        }
    }

    private void obliczEnergieActionPerformed(java.awt.event.ActionEvent evt) {
        energyResult = (int) ((getPower2() * getTime2()) / 1000);
        System.out.println("" + energyResult);
        energyResultField.setText("" + energyResult);
    }

    private void obliczCzasActionPerformed(java.awt.event.ActionEvent evt) {
        timeResult = (int) (((getTk() - getTp()) * getVolume() * 1.16 * 60) / (getPower1() * getEfficiency1()));
        System.out.println("" + timeResult);
        timeResultField.setText("" + timeResult);

    }

    private void obliczWydajnoscZacieruActionPerformed(java.awt.event.ActionEvent evt) {
        mashEfficiencyResult = (int) ((getPractExtract() / getTheorExtract()) * 100);
        System.out.println("" + mashEfficiencyResult);
        mashEfficiencyResultField.setText("" + mashEfficiencyResult);
    }

    private void obliczWydajnoscWarzelniActionPerformed(java.awt.event.ActionEvent evt) {
        breweryEfficiencyResult = (getExtract() / getMaltMass());
        System.out.println("" + breweryEfficiencyResult);
        breweryEfficiencyResultField.setText("" + breweryEfficiencyResult);
    }

    private void obliczWodeActionPerformed(java.awt.event.ActionEvent evt) {
        waterResult = ((getPower() * getEfficiency() * getTime()) / 626);
        System.out.println("" + waterResult);
        waterResultField.setText("" + waterResult);
    }

    private void obliczIBUActionPerformed(java.awt.event.ActionEvent evt) {
        ibuResult = ((getHopMass() * getAlphaAcids() * getUtilization()) / (getWortVolume() * 10));
        System.out.println("" + ibuResult);
        ibuResultField.setText("" + ibuResult);
    }

//    private void masaChmieluActionPerformed(java.awt.event.ActionEvent evt) {
//        String mc = masaChmielu.getText();
//        System.out.println(mc);
//        hopMass = Double.parseDouble(mc);
//    }

//    private void alfaKwasyActionPerformed(java.awt.event.ActionEvent evt) {
//        String ak = alfaKwasy.getText();
//        System.out.println(ak);
//        alphaAcids = Double.parseDouble(ak);
//    }
//
//    private void utylizacjaActionPerformed(java.awt.event.ActionEvent evt) {
//        String ut = utylizacja.getText();
//        System.out.println(ut);
//        utilization = Double.parseDouble(ut);
//    }
//
//    private void objBrzeczkiActionPerformed(java.awt.event.ActionEvent evt) {
//        String obj = objBrzeczki.getText();
//        System.out.println(obj);
//        wortVolume = Double.parseDouble(obj);
//    }
//
//    private void ibuActionPerformed(java.awt.event.ActionEvent evt) {
//        String i = ibu.getText();
//        System.out.println(i);
//        ib = Double.parseDouble(i);
//    }
//
//    private void objBrzeczki1ActionPerformed(java.awt.event.ActionEvent evt) {
//        String obj1 = objBrzeczki1.getText();
//        System.out.println(obj1);
//        wortVolume1 = Double.parseDouble(obj1);
//    }

//    private void alfaKwasy1ActionPerformed(java.awt.event.ActionEvent evt) {
//        String ak1 = alfaKwasy1.getText();
//        System.out.println(ak1);
//        alphaAcids1 = Double.parseDouble(ak1);
//    }
//
//    private void utylizacja1ActionPerformed(java.awt.event.ActionEvent evt) {
//        String ut1 = utylizacja1.getText();
//        System.out.println(ut1);
//        utilization1 = Double.parseDouble(ut1);
//    }
//
//    private void ekstraktActionPerformed(java.awt.event.ActionEvent evt) {
//        String ekstr = ekstrakt.getText();
//        System.out.println(ekstr);
//        extract = Double.parseDouble(ekstr);
//    }
//
//    private void zasypActionPerformed(java.awt.event.ActionEvent evt) {
//        String zas = zasyp.getText();
//        System.out.println(zas);
//        maltMass = Double.parseDouble(zas);
//    }

//    private void ekstrakt1ActionPerformed(java.awt.event.ActionEvent evt) {
//        String ekstr1 = ekstrakt1.getText();
//        System.out.println(ekstr1);
//        practExtract = Double.parseDouble(ekstr1);
//    }
//
//    private void ekstraktTeorActionPerformed(java.awt.event.ActionEvent evt) {
//        String ekstrTeor = ekstraktTeor.getText();
//        System.out.println(ekstrTeor);
//        theorExtract = Double.parseDouble(ekstrTeor);
//    }

//    private void blgPoczActionPerformed(java.awt.event.ActionEvent evt) {
////       String blgPoc = blgPocz.getText();
////       System.out.println(blgPoc);
////       blgP =  Double.parseDouble(blgPoc);
//        try {
//            blgP = valueOf(blgPocz.getText());
//            System.out.println(blgP);
//        } catch (InputMismatchException exc) {
//            System.out.println("Wrong input. Use numbers only.");
//            exc.getMessage();
//        }
//    }

//    private void blgKoncActionPerformed(ActionEvent evt) {

        //  blgKonc.getFieldValue(); //dont work!!
//       String blgKon = blgKonc.getText();
//       System.out.println(blgKon);
//       blgK =  Double.parseDouble(blgKon);
//    }

//    private void czasPasteryzacjiActionPerformed(java.awt.event.ActionEvent evt) {
//        String czasPast = czasPasteryzacji.getText();
//        System.out.println(czasPast);
//        pasteurizationTime = Double.parseDouble(czasPast);
//    }

//    private void temperaturaPasteryzacjiActionPerformed(java.awt.event.ActionEvent evt) {
//        String tempPast = temperaturaPasteryzacji.getText();
//        System.out.println(tempPast);
//        tempPas = Double.parseDouble(tempPast);
//        if (tempPas < 60) {
//            System.out.println("Za niska wartosc temperatury");
//            this.dispose();
//            Alert pasteurAlert = new Alert(Alert.AlertType.WARNING);
//            pasteurAlert.setContentText("Temperature too low for procees to take place. Input value greater than 60 degC.");
//            //check if the element works!!
//        }
//    }

//    private void moc2ActionPerformed(java.awt.event.ActionEvent evt) {
//        String mocDwa = moc2.getText();
//        System.out.println(mocDwa);
//        power2 = Double.parseDouble(mocDwa);
//    }
//
//    private void czas2ActionPerformed(java.awt.event.ActionEvent evt) {
//        String cz2 = czas2.getText();
//        System.out.println(cz2);
//        time2 = Double.parseDouble(cz2);
//    }
//
//    private void tempPoczActionPerformed(java.awt.event.ActionEvent evt) {
//        String tempP = tempPocz.getText();
//        System.out.println(tempP);
//        tp = Double.parseDouble(tempP);
//    }

//    private void tempKoncActionPerformed(java.awt.event.ActionEvent evt) {
//        String tempK = tempKonc.getText();
//        System.out.println(tempK);
//        tk = Double.parseDouble(tempK);
//    }

//    private void objetoscActionPerformed(java.awt.event.ActionEvent evt) {
//        String obj = objetosc.getText();
//        System.out.println(obj);
//        volume = Double.parseDouble(obj);
//    }

//    private void moc1ActionPerformed(java.awt.event.ActionEvent evt) {
////       String mocJeden = moc1.getText();
////       System.out.println(mocJeden);
////       power1 = Double.parseDouble(mocJeden);
//      //  this.getPower1();
//    }

//    private void wydajnosc1ActionPerformed(java.awt.event.ActionEvent evt) {
//        String wyd1 = wydajnosc1.getText();
//        System.out.println(wyd1);
//        efficiency1 = Double.parseDouble(wyd1);
//    }
//
//    private void MocActionPerformed(java.awt.event.ActionEvent evt) {
//        String MocString = Moc.getText();
//        System.out.println(MocString);
//        M = Double.parseDouble(MocString);
//    }

//    private void wydajnoscActionPerformed(java.awt.event.ActionEvent evt) {
//        String wyd = wydajnosc.getText();
//        System.out.println(wyd);
//        efficiency = Double.parseDouble(wyd);
//    }
//
//    private void czasActionPerformed(java.awt.event.ActionEvent evt) {
//        String cz = czas.getText();
//        System.out.println(cz);
//        time = Double.parseDouble(cz);
//    }

    private void obliczChmielActionPerformed(java.awt.event.ActionEvent evt) {
        hopResult = (getIb() * getWortVolume1() * 10) / (getAlphaAcids1() * getUtilization1());
        System.out.println("" + hopResult);
        hopsResultField.setText("" + hopResult);
    }

    private void calculateAttenuationActionPerformed(java.awt.event.ActionEvent evt) {
        attenuationResult = (int) (100 * ((getBlgP() - getBlgK()) / getBlgP()));
        System.out.println("" + attenuationResult);
        attenuationResultField.setText("" + attenuationResult);
    }

    /**
     * variables and fields declaration. DO NOT MODIFY
     * @param args the command line arguments
     */

    private double hopMass;
    private double alphaAcids;
    private double utilization;
    private double wortVolume;
    private double ibuResult;
    private double hopResult;
    private double time;
    private double power;
    private double efficiency1;
    private double power1;
    private double volume;
    private double tk;
    private double tp;
    private double time2;
    private double power2;
    private double tempPas;
    private double efficiency;
    private double M;
    private double pasteurizationTime;
    private double theorExtract;
    private double practExtract;
    private double extract;
    private double utilization1;
    private double alphaAcids1;
    private double wortVolume1;
    private double ib;
    private double maltMass;
    private double breweryEfficiencyResult;
    private double waterResult;
    private double blgK;
    private double blgP;
    private int attenuationResult;
    private int pasteurizationResult;
    private int mashEfficiencyResult;
    private int energyResult;
    private int timeResult;

    private javax.swing.JTextField hopsResultField;
    private javax.swing.JTextField Moc;
    private javax.swing.JTextField alfaKwasy;
    private javax.swing.JTextField alfaKwasy1;
    private javax.swing.JTextField blgKonc;
    private javax.swing.JTextField blgPocz;
    private javax.swing.JTextField czas;
    private javax.swing.JTextField czas2;
    private javax.swing.JTextField czasPasteryzacji;
    private javax.swing.JTextField timeResultField;
    private javax.swing.JTextField ekstrakt;
    private javax.swing.JTextField ekstrakt1;
    private javax.swing.JTextField ekstraktTeor;
    private javax.swing.JTextField energyResultField;
    private javax.swing.JTextField ibu;
    private javax.swing.JTextField ibuResultField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTextField pasteurizationResultField;
    private javax.swing.JTextField masaChmielu;
    private javax.swing.JTextField moc1;
    private javax.swing.JTextField moc2;
    private javax.swing.JTextField objBrzeczki;
    private javax.swing.JTextField objBrzeczki1;
    private javax.swing.JTextField objetosc;
    private javax.swing.JButton obliczChmiel;
    private javax.swing.JButton obliczCzas;
    private javax.swing.JButton obliczEnergie;
    private javax.swing.JButton calculateIBUButton;
    private javax.swing.JButton obliczOdfermentowanie;
    private javax.swing.JButton obliczPasteryzacje;
    private javax.swing.JButton obliczWode;
    private javax.swing.JButton obliczWydajnoscWarzelni;
    private javax.swing.JButton obliczWydajnoscZacieru;
    private javax.swing.JTextField attenuationResultField;
    private javax.swing.JTextField waterResultField;
    private javax.swing.JTextField tempKonc;
    private javax.swing.JTextField tempPocz;
    private javax.swing.JTextField temperaturaPasteryzacji;
    private javax.swing.JTextField utylizacja;
    private javax.swing.JTextField utylizacja1;
    private javax.swing.JTextField wydajnosc;
    private javax.swing.JTextField wydajnosc1;
    private javax.swing.JTextField breweryEfficiencyResultField;
    private javax.swing.JTextField mashEfficiencyResultField;
    private javax.swing.JTextField zasyp;
}