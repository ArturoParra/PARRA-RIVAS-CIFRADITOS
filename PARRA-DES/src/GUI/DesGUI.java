/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import des.DES;
import java.awt.Color;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * Desarrollado por: Parra Rivas Arturo Gabriel
 */
public class DesGUI extends javax.swing.JFrame {

    public DesGUI() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        setLocationRelativeTo(null);
        setTitle("Cifrado DES para archivos");
    }
    
    String parent = "";
    
    void openFile(){
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.TXT", "txt");
        fileChooser.setFileFilter(filtro);
        fileChooser.showOpenDialog(null);
        File f = fileChooser.getSelectedFile();
        if (f != null){
            String filename = f.getAbsolutePath();
            parent = f.getParent();
            txt_origen.setText(filename);
        }
    }
    
    boolean validateFiles(){
        if(parent.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Seleccione un archivo a cifrar");
            return false;
        }
        if (txt_origen.getText().equals( parent + "\\" +txt_destino.getText())){
            JOptionPane.showMessageDialog(rootPane, "El archivo de origen y destino son los mismos.");
            return false;
        }
        if(txt_destino.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Proporcione un nombre de archivo de destino.");
            return false;
        }
        if(txt_clave.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Proporcione una llave.");
            return false;
        }
        if(txt_clave.getText().trim().length() < 8){
            JOptionPane.showMessageDialog(rootPane, "La llave debe copntener 8 caracteres");
            return false;
        }
        return true;
    }
    
    void clean(){
        parent = "";
        txt_origen.setText("");
        txt_destino.setText("");
        txt_clave.setText("");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        seleccionar1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Encriptar = new javax.swing.JButton();
        Desenctripar = new javax.swing.JButton();
        txt_origen = new javax.swing.JTextField();
        txt_destino = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_clave = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        seleccionar1.setText("Seleccionar");
        seleccionar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionar1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Archivo de origen : ");

        jLabel5.setText("Nombre del archivo resultante: ");

        Encriptar.setText("Cifrar");
        Encriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncriptarActionPerformed(evt);
            }
        });

        Desenctripar.setText("Descifrar");
        Desenctripar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesenctriparActionPerformed(evt);
            }
        });

        txt_origen.setFocusable(false);
        txt_origen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_origenMouseClicked(evt);
            }
        });

        jLabel2.setText("Clave : ");

        txt_clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_claveActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("CIFRADO DES");

        jLabel6.setText("Desarrollado por: Parra Rivas Arturo Gabriel");

        jLabel7.setText("Grupo: 5IV8");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel2))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(txt_origen, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(seleccionar1))
                        .addComponent(txt_destino, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Encriptar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Desenctripar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_clave, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(116, 116, 116)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(254, 254, 254))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1))
                .addGap(162, 162, 162))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_origen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seleccionar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Encriptar)
                    .addComponent(Desenctripar))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seleccionar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionar1ActionPerformed
       openFile();
    }//GEN-LAST:event_seleccionar1ActionPerformed

    private void DesenctriparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesenctriparActionPerformed
        DES des = new DES();
        if(validateFiles()){
            des.applyDES("d", txt_clave.getText(), txt_origen.getText(), parent + "\\" +txt_destino.getText());
            JOptionPane.showMessageDialog(this,
                    "Tu archivo fue descifrado correctamente\n Está ubicado en: "+parent + "\\" +txt_destino.getText(),
                    "Descifrado exitoso",
                    JOptionPane.INFORMATION_MESSAGE);
            clean();
        }
    }//GEN-LAST:event_DesenctriparActionPerformed

    private void EncriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncriptarActionPerformed
        DES des = new DES();
        if(validateFiles()){
            des.applyDES("e", txt_clave.getText(), txt_origen.getText(), parent + "\\" +txt_destino.getText());
            JOptionPane.showMessageDialog(this,
                    "Tu archivo fue cifrado correctamente\n Está ubicado en: "+parent + "\\" +txt_destino.getText(),
                    "Cifrado exitoso",
                    JOptionPane.INFORMATION_MESSAGE);
            clean();
        }
    }//GEN-LAST:event_EncriptarActionPerformed

    private void txt_claveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_claveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_claveActionPerformed

    private void txt_origenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_origenMouseClicked
        openFile();
    }//GEN-LAST:event_txt_origenMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DesGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Desenctripar;
    private javax.swing.JButton Encriptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JButton seleccionar1;
    private javax.swing.JTextField txt_clave;
    private javax.swing.JTextField txt_destino;
    private javax.swing.JTextField txt_origen;
    // End of variables declaration//GEN-END:variables
}
