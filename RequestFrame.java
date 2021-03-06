/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.der.bankerssolution;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author parya
 */
public class RequestFrame extends javax.swing.JFrame {

    /**
     * Creates new form RequestFrame
     */
    public RequestFrame() {
        initComponents();

    }

    private int n, m;
    private int[] resource;
    private int[][] claim;
    private Attributes at;
    private JFrame frameAvail;
    private JFrame frameFur;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblReqV = new javax.swing.JLabel();
        lblProc = new javax.swing.JLabel();
        txtReqV = new javax.swing.JTextField();
        txtPnum = new javax.swing.JTextField();
        btnCheck = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();
        lblAvail = new javax.swing.JLabel();
        lblAvailShow = new javax.swing.JLabel();
        btnAgain = new javax.swing.JButton();
        lblAnswer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 0));
        setPreferredSize(new java.awt.Dimension(400, 340));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 340));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblReqV.setText("Request Vector");

        lblProc.setText("Process");

        btnCheck.setText("CHECK");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        btnShow.setText("SHOW STATE");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        lblAvail.setText("Available Vector");

        btnAgain.setText("AGAIN");
        btnAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgainActionPerformed(evt);
            }
        });

        lblAnswer.setBackground(new java.awt.Color(255, 0, 0));
        lblAnswer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAnswer.setText("Request Granted");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblReqV, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(lblProc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPnum, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                            .addComponent(txtReqV))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAvail, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblAvailShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAgain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPnum, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReqV, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReqV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAnswer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAvail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAvailShow, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //cunstructor (not default) 
    public void setValues(int n, int m, int[] resource, int[][] claim) {
        this.n = n;
        this.m = m;
        this.resource = new int[m];
        this.claim = new int[n][m];
        for (int j = 0; j < m; j++) {
            this.resource[j] = resource[j];
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                this.claim[i][j] = claim[i][j];
            }
        }
        //creates class object
        at = new Attributes(resource, claim, n, m);
        again();
        this.setTitle("REQUEST");
        this.setAlwaysOnTop(true);
        frameFur = new JFrame();
        frameAvail = new JFrame();
        lblAnswer.setForeground(Color.BLUE);
    }

    //resets the frame
    private void again() {
        lblAnswer.setVisible(false);
        txtPnum.setEnabled(true);
        txtReqV.setEnabled(true);
        btnCheck.setEnabled(true);
        txtPnum.setText("");
        txtReqV.setText("");
        lblAnswer.setText("");
        lblAvail.setVisible(false);
        lblAvailShow.setVisible(false);
        btnShow.setVisible(false);
        btnAgain.setVisible(false);
    }

    //changes the frame to show the state
    private void mid() {
        lblAnswer.setEnabled(true);
        lblAnswer.setVisible(true);
        btnCheck.setEnabled(false);
        txtPnum.setEnabled(false);
        txtReqV.setEnabled(false);
        lblAvail.setVisible(true);
        lblAvailShow.setVisible(true);
        btnShow.setVisible(true);
        btnShow.setEnabled(true);
        btnAgain.setVisible(true);
    }

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        //process number entry
        int pNum = Integer.parseInt(txtPnum.getText()) - 1;
        //checks if input is valid
        if (pNum > n) {
            JOptionPane.showMessageDialog(null, "Invalid Input",
                    "Error!", JOptionPane.ERROR_MESSAGE);
            again();
        } else {
            //  Attributes at = new Attributes(); //test
            //request vector entry
            Scanner sc = new Scanner(txtReqV.getText());
            int[] request = new int[m];
            for (int j = 0; j < m; j++) {
                request[j] = sc.nextInt();
            }
            //result
            String[] result = at.checkSafeState(pNum, request);
            if (result[0].equals("true")) { //safe
                lblAnswer.setText("REQUEST GRANTED");
                mid();
                int[] availT = at.getAvail();
                lblAvailShow.setText(Arrays.toString(availT));
            } else if (result[0].equals("false")) { //unsafe
                lblAnswer.setText("REQUEST DENIED");
                JOptionPane.showMessageDialog(null, result[1],
                        result[2], JOptionPane.ERROR_MESSAGE);
                again();
            }
        }
    }//GEN-LAST:event_btnCheckActionPerformed

    //shows C and C-A matrices in tables in new frames
    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        int[][] allocT = at.getAllocM();
        int[][] furT = at.getFurM();
        //tables titles
        String[] columns = new String[m + 1];
        columns[0] = " ";
        for (int i = 1; i <= m; i++) {
            columns[i] = "R" + i;
        }
        //currently available resources matrix frame (table)
        String[][] allocData = toPrint(allocT);
        JTable t1 = new JTable(allocData, columns);
        JScrollPane scrollPane1 = new JScrollPane(t1);
        frameAvail = new JFrame();
        frameAvail.setSize(400, 350);
        frameAvail.setLocation(950, 0);
        frameAvail.setDefaultCloseOperation(0);
        frameAvail.add(scrollPane1);
        frameAvail.setTitle("Allocation Matrix");
        frameAvail.setVisible(true);
        frameAvail.setResizable(false);
        frameAvail.setEnabled(false);
        frameAvail.setAlwaysOnTop(true);
        //further requests matrix frame (table)
        String[][] furtherData = toPrint(furT);
        JTable t2 = new JTable(furtherData, columns);
        JScrollPane scrollPane2 = new JScrollPane(t2);
        frameFur = new JFrame();
        frameFur.setSize(400, 350);
        frameFur.setLocation(950, 420);
        frameFur.setDefaultCloseOperation(0);
        frameFur.add(scrollPane2);
        frameFur.setTitle("Further Requests Matrix");
        frameFur.setVisible(true);
        frameFur.setResizable(false);
        frameFur.setEnabled(false);
        frameFur.setAlwaysOnTop(true);

        btnShow.setEnabled(false);
    }//GEN-LAST:event_btnShowActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void btnAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgainActionPerformed
        again();
        frameAvail.setVisible(false);
        frameFur.setVisible(false);
    }//GEN-LAST:event_btnAgainActionPerformed

    private String[][] toPrint(int[][] a) {
        String[][] temp = new String[n][m + 1];
        for (int i = 0; i < n; i++) {
            temp[i][0] = "P" + (i + 1);
            for (int j = 1; j <= m; j++) {
                temp[i][j] = a[i][j - 1] + "";
            }
        }
        return temp;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RequestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RequestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RequestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RequestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RequestFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgain;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnShow;
    private javax.swing.JLabel lblAnswer;
    private javax.swing.JLabel lblAvail;
    private javax.swing.JLabel lblAvailShow;
    private javax.swing.JLabel lblProc;
    private javax.swing.JLabel lblReqV;
    private javax.swing.JTextField txtPnum;
    private javax.swing.JTextField txtReqV;
    // End of variables declaration//GEN-END:variables
}
