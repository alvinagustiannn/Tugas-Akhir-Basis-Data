/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Transaksi;
import database.Koneksi;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import model.Petugas;
import model.Anggota;
import org.omg.PortableServer.IdAssignmentPolicy;



public class perpusview extends javax.swing.JFrame {
    Transaksi transaksi;
    
    
    public perpusview() throws SQLException {
        initComponents();
        this.transaksi = new Transaksi();
        this.showComboBoxAnggota();
        this.showTabelPetugas();
    }
    
    private void showComboBoxAnggota() throws SQLException {
        DefaultComboBoxModel dtmAnggota = new DefaultComboBoxModel();
        for(Anggota k : this.transaksi.getDataAnggota()){
            dtmAnggota.addElement(k.getNama_Anggota());
        }
        
        this.cbanggota.setModel(dtmAnggota);
    }
    
    private void showTabelPetugas() throws SQLException{
            DefaultTableModel dtmPetugas = new DefaultTableModel(new String[]{"Nama Anggota", "Kd_Anggota", "Nama Anggota", "O6966_Petugas"},0);
            dtmPetugas.setRowCount(0);
            
            for(Petugas o : this.transaksi.getDataPetugas()){
                dtmPetugas.addRow(new String[]{o.getAnggota().getNama_Anggota(), o.getKd_Anggota().toString(), o.O6966_Namapetugas(), o.getO6966_Petugas().toString()});
            }
            this.tblobat.setModel(dtmPetugas);
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblobat = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTambah = new javax.swing.JButton();
        tfnama_obt = new javax.swing.JTextField();
        tfhrg_obt = new javax.swing.JTextField();
        cbkasir = new javax.swing.JComboBox<String>();
        jLabel2 = new javax.swing.JLabel();
        btHapus = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        btExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfIdObat = new javax.swing.JTextField();
        hidden_id = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 153));
        getContentPane().setLayout(null);

        tblobat.setBackground(new java.awt.Color(51, 51, 51));
        tblobat.setForeground(new java.awt.Color(255, 255, 0));
        tblobat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblobat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblobatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblobat);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(240, 10, 500, 370);

        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("Nama ptgs");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 110, 51, 14);

        jLabel5.setForeground(new java.awt.Color(255, 255, 51));
        jLabel5.setText("Telp Ptgs");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 150, 44, 14);

        jTambah.setBackground(new java.awt.Color(51, 51, 51));
        jTambah.setForeground(new java.awt.Color(255, 255, 51));
        jTambah.setText("TAMBAH");
        jTambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTambahMouseClicked(evt);
            }
        });
        getContentPane().add(jTambah);
        jTambah.setBounds(109, 270, 110, 23);

        tfnama_obt.setBackground(new java.awt.Color(51, 51, 51));
        tfnama_obt.setForeground(new java.awt.Color(255, 255, 51));
        tfnama_obt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnama_obtActionPerformed(evt);
            }
        });
        getContentPane().add(tfnama_obt);
        tfnama_obt.setBounds(100, 110, 120, 20);

        tfhrg_obt.setBackground(new java.awt.Color(51, 51, 51));
        tfhrg_obt.setForeground(new java.awt.Color(255, 255, 51));
        tfhrg_obt.setToolTipText("");
        getContentPane().add(tfhrg_obt);
        tfhrg_obt.setBounds(100, 150, 120, 20);

        cbkasir.setBackground(new java.awt.Color(51, 51, 51));
        cbkasir.setForeground(new java.awt.Color(255, 255, 51));
        cbkasir.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbkasir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbkasirActionPerformed(evt);
            }
        });
        getContentPane().add(cbkasir);
        cbkasir.setBounds(110, 20, 120, 20);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Anggota");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 20, 70, 23);

        btHapus.setBackground(new java.awt.Color(51, 51, 51));
        btHapus.setForeground(new java.awt.Color(255, 255, 51));
        btHapus.setText("HAPUS");
        btHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btHapus);
        btHapus.setBounds(109, 230, 110, 23);

        btEdit.setBackground(new java.awt.Color(51, 51, 51));
        btEdit.setForeground(new java.awt.Color(255, 255, 0));
        btEdit.setText("EDIT");
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });
        getContentPane().add(btEdit);
        btEdit.setBounds(109, 190, 110, 23);

        btExit.setBackground(new java.awt.Color(51, 51, 51));
        btExit.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        btExit.setForeground(new java.awt.Color(255, 255, 0));
        btExit.setText("EXIT");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });
        getContentPane().add(btExit);
        btExit.setBounds(650, 390, 90, 30);

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Kd_Petugas");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 70, 60, 14);

        tfIdObat.setBackground(new java.awt.Color(51, 51, 51));
        tfIdObat.setForeground(new java.awt.Color(255, 255, 51));
        getContentPane().add(tfIdObat);
        tfIdObat.setBounds(100, 70, 120, 20);
        getContentPane().add(hidden_id);
        hidden_id.setBounds(95, 330, 0, 0);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(64, 378, 0, 0);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 750, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTambahMouseClicked
        // TODO add your handling code here:
        Petugas o = new Petugas();
        try {
                o.setKd_Anggota(Integer.parseInt(this.tfKdPetugas.getText()));
                o.setAnggota(this.transaksi.getDataAnggota().get(this.cbanggota.getSelectedIndex()));
                o.setO6966_Namapetugas(this.tfnama_petugas.getText());
                o.setTelp_Petugas(Integer.parseInt(this.tfTelp_ptgs.getText()));
                this.transaksi.insertPetugas(o);
                this.showTabelPetugas();
            } catch (SQLException err) {
                System.out.println(err);
            }
    }//GEN-LAST:event_jTambahMouseClicked

    private void btHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusActionPerformed
        // TODO add your handling code here:
        Petugas obat = new Petugas();
            try {
                obat.setId_Obat(Integer.parseInt(tfIdObat.getText()));
                this.transaksi.deleteObat(obat);
                this.showTabelObat();
            } catch (SQLException err) {
                System.out.println(err);
            }
    }//GEN-LAST:event_btHapusActionPerformed

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btExitActionPerformed

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        // TODO add your handling code here:
        Petugas obat = new Petugas();
            try {
                obat.setId_Obat(Integer.parseInt(tfIdObat.getText()));
                obat.setKasir(this.transaksi.getDataKasir().get(this.cbkasir.getSelectedIndex()));
                obat.setNama_Obat(this.tfnama_obt.getText());
                obat.setHarga_Obat(Integer.parseInt(this.tfhrg_obt.getText()));
                this.transaksi.editObat(obat);
                this.showTabelObat();
            } catch (SQLException err) {
                System.out.println(err);
            }
    }//GEN-LAST:event_btEditActionPerformed

    private void tblobatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblobatMouseClicked
        // TODO add your handling code here:
        int selectedRow = tblobat.getSelectedRow();
        cbkasir.setSelectedItem(tblobat.getValueAt(selectedRow, 0));
        tfIdObat.setText((String) tblobat.getValueAt(selectedRow, 1));
        tfnama_obt.setText((String) tblobat.getValueAt(selectedRow, 2));
        tfhrg_obt.setText((String) tblobat.getValueAt(selectedRow, 3));
    }//GEN-LAST:event_tblobatMouseClicked

    private void cbkasirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbkasirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbkasirActionPerformed

    private void tfnama_obtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnama_obtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfnama_obtActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btHapus;
    private javax.swing.JComboBox<String> cbkasir;
    private javax.swing.JLabel hidden_id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jTambah;
    private javax.swing.JTable tblobat;
    private javax.swing.JTextField tfIdObat;
    private javax.swing.JTextField tfhrg_obt;
    private javax.swing.JTextField tfnama_obt;
    // End of variables declaration//GEN-END:variables

    private class cbanggota {

        public cbanggota() {
        }
    }
}
