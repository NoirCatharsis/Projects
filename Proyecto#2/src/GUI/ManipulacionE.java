
package GUI;

import java.awt.Color;

public class ManipulacionE extends javax.swing.JFrame {

    
    public ManipulacionE() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        AgregarEstudiantes = new javax.swing.JButton();
        ModifiicarEstudiantes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/566095.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(531, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 190, 620));

        jPanel3.setBackground(new java.awt.Color(255, 241, 232));

        AgregarEstudiantes.setBackground(new java.awt.Color(0, 0, 0));
        AgregarEstudiantes.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        AgregarEstudiantes.setForeground(new java.awt.Color(255, 255, 255));
        AgregarEstudiantes.setText("Agregar / Modificar Estudiantes");
        AgregarEstudiantes.setToolTipText("");
        AgregarEstudiantes.setBorderPainted(false);
        AgregarEstudiantes.setFocusPainted(false);
        AgregarEstudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AgregarEstudiantesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AgregarEstudiantesMouseExited(evt);
            }
        });
        AgregarEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarEstudiantesActionPerformed(evt);
            }
        });

        ModifiicarEstudiantes.setBackground(new java.awt.Color(0, 0, 0));
        ModifiicarEstudiantes.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        ModifiicarEstudiantes.setForeground(new java.awt.Color(255, 255, 255));
        ModifiicarEstudiantes.setText("Borrar Estudiantes");
        ModifiicarEstudiantes.setToolTipText("");
        ModifiicarEstudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ModifiicarEstudiantesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ModifiicarEstudiantesMouseExited(evt);
            }
        });
        ModifiicarEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifiicarEstudiantesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ModifiicarEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AgregarEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(AgregarEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addComponent(ModifiicarEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarEstudiantesActionPerformed
    
         new Registro().setVisible(true);
        this.setVisible(false); // para moverse emtre GUIs
        
    }//GEN-LAST:event_AgregarEstudiantesActionPerformed

    private void AgregarEstudiantesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarEstudiantesMouseExited

        AgregarEstudiantes.setBackground(new Color (0,0,0));
    }//GEN-LAST:event_AgregarEstudiantesMouseExited

    private void AgregarEstudiantesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarEstudiantesMouseEntered

        AgregarEstudiantes.setBackground(new Color (153,255,153));
    }//GEN-LAST:event_AgregarEstudiantesMouseEntered

    private void ModifiicarEstudiantesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModifiicarEstudiantesMouseEntered

        ModifiicarEstudiantes.setBackground(new Color (153,255,153));
    }//GEN-LAST:event_ModifiicarEstudiantesMouseEntered

    private void ModifiicarEstudiantesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModifiicarEstudiantesMouseExited

      ModifiicarEstudiantes.setBackground(new Color (0,0,0));

    }//GEN-LAST:event_ModifiicarEstudiantesMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
       new PantallaP().setVisible(true);
        this.setVisible(false); // para moverse emtre GUIs
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ModifiicarEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifiicarEstudiantesActionPerformed
        
         new EliminarE().setVisible(true);
        this.setVisible(false); // para moverse emtre GUIs
        
    }//GEN-LAST:event_ModifiicarEstudiantesActionPerformed

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
            java.util.logging.Logger.getLogger(ManipulacionE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManipulacionE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManipulacionE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManipulacionE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManipulacionE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarEstudiantes;
    private javax.swing.JButton ModifiicarEstudiantes;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
