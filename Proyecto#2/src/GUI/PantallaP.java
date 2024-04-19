
/*

Este programa lo hice con ayuda de varias fuentes: 

Informatica Jch. (2016, March 14). Java POO: Guardar Datos en txt y Mostrarlo en jTable [Video]. YouTube. https://www.youtube.com/watch?v=AH4lRZ5EvNI
Ing. René Domínguez. (2021, October 11). ✅ Ejercicio de REGISTRO de ALUMNOS con JTable JTextField JComboBox JButton JSpinner en Java NetBeans [Video]. YouTube. https://www.youtube.com/watch?v=WRlXaAGZhIQ
Shadown 087. (2015, November 26). MOSTRAR REGISTROS EN JTABLE (BASE DATOS BLOCK DE NOTAS) [Video]. YouTube. https://www.youtube.com/watch?v=mUpQfbFGOxs
Shadown 087. (2015, November 12). BASE DE DATOS EN BLOCK DE NOTAS [Video]. YouTube. https://www.youtube.com/watch?v=pvc_om5migY
Shadown 087. (2015, November 30). FILTRO JTABLE [Video]. YouTube. https://www.youtube.com/watch?v=7CDV9IJMifw
CSE JnU. (2023, May 13). How to create mouse hover effects in swing using NetBeans [Video]. YouTube. https://www.youtube.com/watch?v=YY82odU9w6Y
Programador Novato. (2019, December 19). Curso de Java Netbeans Completo☕ [01.- Crear una interfaz gráfica con netbeans GUI] [Video]. YouTube. https://www.youtube.com/watch?v=18UA7X2ss8g
Anthony Zabs. (2021, May 12). DEJA DE HACER INTERFACES FEAS | JAVA SWING MATERIAL DESIGN [Video]. YouTube. https://www.youtube.com/watch?v=LdBl0th_U_Q
Anthony Zabs. (2021, August 31). JPanel dentro de otro JPanel Java | JFrame [Video]. YouTube. https://www.youtube.com/watch?v=iFlHGwmYdjI

Josue Blanco Arias
4/7/2024


*/


package GUI;


import java.awt.Color;
import javax.swing.*;
public class PantallaP extends javax.swing.JFrame {
    
    
    // variable global estatica
     private static String nombreUsuario = "";
  
      public PantallaP() {
    
        // los componenes graficos de la pantalla 
        initComponents();
        
       // asignar una posicion fija recta para el despliegue de la pantalla 
        this.setLocationRelativeTo(null);
        
        // nombre de la pantalla 
        this.setTitle("Pagina Principal");

        
        try {
            
            // validacion de si esta vacio  
            if (nombreUsuario.isEmpty()) {
                
              // la variable se le asigna el valor retornado por la funcion , donde se pregunta por el nombre
              
                nombreUsuario = pedirNombre();
            }
            
            // Mensaje de bienevenida con el nombre que se pregunto
            Texto1.setText("¡Bienvenid@, " + nombreUsuario + "!");
            
            // try catch por si ocurre una excepcion y el programa no se caiga
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
      
      
      // metodo que retorna un string 

    private String pedirNombre() {
        
        // variable local 
        String nombre = "";
        
        // variable booleana 
        boolean nombreValido = false;

        // si el nombre es TRUE 
        while (!nombreValido) {
            
            // se intenta preguntar el nombre 
            try {
                // variable para guardar el nombre 
                
                nombre = JOptionPane.showInputDialog(this, "Ingrese su nombre:");

                // si el nombre no es null o si no esta vacio , el trim es para los espacios , es TRUE 
                
                if (nombre != null && !nombre.trim().isEmpty()) {
                    
                    nombreValido = true;
                    
                    
                } else {
                    
                    // pero de lo contrario pregunta de nuevo hasta que se cumpla 
                    
                    JOptionPane.showMessageDialog(this, "Debe ingresar un nombre válido.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                
            } catch (Exception e) {
                
                // excepcion por si falla 
                JOptionPane.showMessageDialog(this, "Ha ocurrido un error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        // retorna el nombre sin espacios
        
        return nombre.trim();
    }
     
    
     
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Texto1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 180, 680));

        jPanel3.setBackground(new java.awt.Color(255, 241, 232));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        Texto1.setFont(new java.awt.Font("NSimSun", 1, 24)); // NOI18N
        Texto1.setForeground(new java.awt.Color(255, 255, 255));
        Texto1.setText("¡Bienvenid@!");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Texto1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 560, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Happy-Children-PNG-HD-Isolated.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 610, 205));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Manipulacion de estudiantes");
        jButton2.setBorderPainted(false);
        jButton2.setFocusPainted(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 290, 70));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ver Listas");
        jButton1.setToolTipText("");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 290, 60));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 620, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
       
        jButton2.setBackground(new Color (153,153,255));
        
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        
  
          jButton2.setBackground(new Color (0,0,0));
        
        
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

         jButton2.setBackground(new Color (153,153,255));
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

       new ManipulacionE().setVisible(true);
       this.dispose();
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

       new Listas().setVisible(true);
       this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered

         jButton1.setBackground(new Color (153,153,255));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited

        jButton1.setBackground(new Color (0,0,0));
       
    }//GEN-LAST:event_jButton1MouseExited

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
            java.util.logging.Logger.getLogger(PantallaP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            
            
            public void run() {
                new PantallaP().setVisible(true);
                
                 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Texto1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
