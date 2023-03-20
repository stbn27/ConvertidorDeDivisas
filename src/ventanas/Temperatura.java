/*
 * Fecha de creacion: 20/03/2023 10:43:28
 * Version: v.0.1
 * Proyecto: 
 */
package ventanas;

import clases.ConvertirTemperatura;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author Willy Stbn
 */
public class Temperatura extends javax.swing.JFrame {

    /**
        * Creates new form Temperatura
        */
    public Temperatura() {
        initComponents();
        
        //Codigo para la ventana:
        setSize(700, 450);  //Tamaño de la ventana
        setResizable(false);    //No maximizar la ventana
        setTitle("Conversor de Temperatura");
        setLocationRelativeTo(null);    //Iniciar la ventana en el centro.
        
        //No ejecutar la ventan despues de cerrar
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Fondo de la ventana:
        ImageIcon wallapaper = new ImageIcon("src/images/wallpaper.jpg");
        Icon icono = new ImageIcon(wallapaper.getImage().getScaledInstance(label_wallpaper.getWidth(), label_wallpaper.getHeight(), Image.SCALE_DEFAULT));
        label_wallpaper.setIcon(icono);
        this.repaint();
    }

    //Icono del programa(ventana)
    @Override
    public Image getIconImage() {
        Image iconoVentana = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon.png"));
        return iconoVentana;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_Animacion = new javax.swing.JLabel();
        boton_Nacional = new javax.swing.JButton();
        boton_Temperatura = new javax.swing.JButton();
        boton_ConUniver = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txt_CantidadC = new javax.swing.JTextField();
        label_ResultadoTN = new javax.swing.JLabel();
        combo_Local = new javax.swing.JComboBox<>();
        combo_Convert = new javax.swing.JComboBox<>();
        boton_ConvertirT = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        label_wallpaper = new javax.swing.JLabel();
        label_copy = new javax.swing.JLabel();

        label_Animacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/termometro.gif"))); // NOI18N
        label_Animacion.setText("Animacion");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boton_Nacional.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        boton_Nacional.setForeground(new java.awt.Color(102, 51, 0));
        boton_Nacional.setText("Convertidor Nacional $");
        getContentPane().add(boton_Nacional, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, -1));

        boton_Temperatura.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        boton_Temperatura.setForeground(new java.awt.Color(102, 51, 0));
        boton_Temperatura.setText("Convertidor Temperatura");
        boton_Temperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_TemperaturaActionPerformed(evt);
            }
        });
        getContentPane().add(boton_Temperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 200, -1));

        boton_ConUniver.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        boton_ConUniver.setForeground(new java.awt.Color(102, 51, 0));
        boton_ConUniver.setText("Convertidor Universal $");
        boton_ConUniver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_ConUniverActionPerformed(evt);
            }
        });
        getContentPane().add(boton_ConUniver, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 200, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 28, 700, -1));

        txt_CantidadC.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
        txt_CantidadC.setForeground(new java.awt.Color(153, 51, 0));
        txt_CantidadC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_CantidadC.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_CantidadC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(txt_CantidadC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 130, 90));

        label_ResultadoTN.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
        label_ResultadoTN.setForeground(new java.awt.Color(102, 204, 0));
        label_ResultadoTN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_ResultadoTN.setText("000");
        label_ResultadoTN.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(label_ResultadoTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 130, 90));

        combo_Local.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        combo_Local.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "° C", "° F", "° K" }));
        getContentPane().add(combo_Local, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 130, 60));

        combo_Convert.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        combo_Convert.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "° F", "° C", "° K" }));
        getContentPane().add(combo_Convert, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 130, 60));

        boton_ConvertirT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/convert.png"))); // NOI18N
        boton_ConvertirT.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        boton_ConvertirT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_ConvertirTActionPerformed(evt);
            }
        });
        getContentPane().add(boton_ConvertirT, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 90, 70));

        jLabel3.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Elege las escalas de temperatura:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 410, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("a");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 60, 50));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/term.gif"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 240, 420));

        label_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wallpaper.jpg"))); // NOI18N
        getContentPane().add(label_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        label_copy.setForeground(new java.awt.Color(0, 51, 51));
        label_copy.setText("Diseñado por: Jose Julian Esteban");
        getContentPane().add(label_copy, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 620, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_ConUniverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ConUniverActionPerformed
        dispose();
        new Uiversal().setVisible(true);
    }//GEN-LAST:event_boton_ConUniverActionPerformed

    private void boton_TemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_TemperaturaActionPerformed
        // Boton de esta ventana -> Sin accion
    }//GEN-LAST:event_boton_TemperaturaActionPerformed

    private void boton_ConvertirTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ConvertirTActionPerformed
         String valor = txt_CantidadC.getText().trim();
                  
         String unid1 = (String)combo_Local.getSelectedItem();
         String unid2 = (String)combo_Convert.getSelectedItem();
         //Extraemos las unidades:
         String unidad1 = unid1.substring(2, 3);
         String unidad2 = unid2.substring(2, 3);      
         
         try {
             
            Double temp = Double.parseDouble(valor);
            //System.out.println("Nuevo" + temp);
            ConvertirTemperatura conversor = new ConvertirTemperatura();
            
            if(unidad1.equals("C") && unidad2.equals("C")){
                
                label_ResultadoTN.setText(temp.toString());
                
            } else if (unidad1.equals("C") && unidad2.equals("F")){
                
                label_ResultadoTN.setText(String.valueOf(conversor.celsiusAFahrenheit(temp)));
            }else if (unidad1.equals("C") && unidad2.equals("F")){
                
                label_ResultadoTN.setText(String.valueOf(conversor.celsiusAKelvin(temp)));
            }else if(unidad1.equals("F") && unidad2.equals("C")){
                
                label_ResultadoTN.setText(String.valueOf(conversor.fahrenheitACelsius(temp)));
            }else if(unidad1.equals("F") && unidad2.equals("F")){
                
                label_ResultadoTN.setText(temp.toString());
            }else if(unidad1.equals("F") && unidad2.equals("K")){
                
                label_ResultadoTN.setText(String.valueOf(conversor.fahrenheitAKelvin(temp)));
            }else if(unidad1.equals("K") && unidad2.equals("C")){
                
                label_ResultadoTN.setText(String.valueOf(conversor.kelvinACelsius(temp)));
            }else if(unidad1.equals("K") && unidad2.equals("F")){
                
                label_ResultadoTN.setText(String.valueOf(conversor.kelvinAFahrenheit(temp)));
            } else if(unidad1.equals("K") && unidad2.equals("K")){
                
                label_ResultadoTN.setText(temp.toString());
            }else {
                JOptionPane.showMessageDialog(null, "Ocurrio un error");
            }
        } catch (NumberFormatException e) {
             JOptionPane.showMessageDialog(null, "Ingrese un valor correcto");
             txt_CantidadC.setText("");
        }
        
    }//GEN-LAST:event_boton_ConvertirTActionPerformed

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
            java.util.logging.Logger.getLogger(Temperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Temperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Temperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Temperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Temperatura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_ConUniver;
    private javax.swing.JButton boton_ConvertirT;
    private javax.swing.JButton boton_Nacional;
    private javax.swing.JButton boton_Temperatura;
    private javax.swing.JComboBox<String> combo_Convert;
    private javax.swing.JComboBox<String> combo_Local;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label_Animacion;
    private javax.swing.JLabel label_ResultadoTN;
    private javax.swing.JLabel label_copy;
    private javax.swing.JLabel label_wallpaper;
    private javax.swing.JTextField txt_CantidadC;
    // End of variables declaration//GEN-END:variables
}
