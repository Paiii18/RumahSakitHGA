/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rs;

import koneksi.koneksi;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Asus
 */
public class menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public menu() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        mbmenu = new javax.swing.JMenuBar();
        mpasien = new javax.swing.JMenu();
        mipasien = new javax.swing.JMenuItem();
        mdokter = new javax.swing.JMenu();
        mfromdokter = new javax.swing.JMenuItem();
        mrekammedis = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        mobat = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        mkamar = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        mpembayaran = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");

        mpasien.setText("Pasien");

        mipasien.setText("From Pasien");
        mipasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mipasienActionPerformed(evt);
            }
        });
        mpasien.add(mipasien);

        mbmenu.add(mpasien);

        mdokter.setText("Dokter");

        mfromdokter.setText("From Dokter");
        mfromdokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mfromdokterActionPerformed(evt);
            }
        });
        mdokter.add(mfromdokter);

        mbmenu.add(mdokter);

        mrekammedis.setText("Rekam Medis");

        jMenuItem1.setText("From Rekam Medis");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mrekammedis.add(jMenuItem1);

        mbmenu.add(mrekammedis);

        mobat.setText("Obat");

        jMenuItem2.setText("From Obat");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mobat.add(jMenuItem2);

        mbmenu.add(mobat);

        mkamar.setText(" Kamar");

        jMenuItem3.setText("From Kamar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        mkamar.add(jMenuItem3);

        mbmenu.add(mkamar);

        mpembayaran.setText("Pembayaran");

        jMenuItem4.setText("From Pembayaran");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        mpembayaran.add(jMenuItem4);

        mbmenu.add(mpembayaran);

        setJMenuBar(mbmenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(330, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel1)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mipasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mipasienActionPerformed
        // TODO add your handling code here:
             new fromPasien().setVisible(true);
    }//GEN-LAST:event_mipasienActionPerformed

    private void mfromdokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mfromdokterActionPerformed
        // TODO add your handling code here:
        new fromDokter().setVisible(true);
    }//GEN-LAST:event_mfromdokterActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
         new fromRekamMedis().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        new fromObat().setVisible(true); 
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
         new fromKamar().setVisible(true); 
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
         new fromPembayaran().setVisible(true); 
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuBar mbmenu;
    private javax.swing.JMenu mdokter;
    private javax.swing.JMenuItem mfromdokter;
    private javax.swing.JMenuItem mipasien;
    private javax.swing.JMenu mkamar;
    private javax.swing.JMenu mobat;
    private javax.swing.JMenu mpasien;
    private javax.swing.JMenu mpembayaran;
    private javax.swing.JMenu mrekammedis;
    // End of variables declaration//GEN-END:variables
}
