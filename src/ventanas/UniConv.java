/*
 * Fecha de creacion: 19/03/2023 23:13:40
 * Version: v.0.1
 * Proyecto: 
 */
package ventanas;

import clases.ConversorUniversal;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Window;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author Willy Stbn
 */
public class UniConv extends javax.swing.JFrame {

    public UniConv() {
        initComponents();
        
        //Codigo para la ventana:
        setSize(700, 450);  //Tamaño de la ventana
        setResizable(false);    //No maximizar la ventana
        setTitle("Conversor de monedas Nacional MX");
        setLocationRelativeTo(null);    //Iniciar la ventana en el centro.
        
        //Fondo de la ventana:
        ImageIcon wallapaper = new ImageIcon("src/images/wallpaper.jpg");
        Icon icono = new ImageIcon(wallapaper.getImage().getScaledInstance(label_wallpaper.getWidth(), label_wallpaper.getHeight(), Image.SCALE_DEFAULT));
        label_wallpaper.setIcon(icono);
        this.repaint();
        
        //No ejecutar la ventan despues de cerrar
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        label_Resultado.setText("");
        
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

        boton_Nacional = new javax.swing.JButton();
        boton_ConUniver = new javax.swing.JButton();
        boton_ConUniver1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        label_Local1 = new javax.swing.JLabel();
        txt_Cantidad = new javax.swing.JTextField();
        combo_Convert = new javax.swing.JComboBox<>();
        combo_Local = new javax.swing.JComboBox<>();
        boton_Convertir = new javax.swing.JButton();
        label_Resultado = new javax.swing.JLabel();
        label_Local2 = new javax.swing.JLabel();
        label_footer = new javax.swing.JLabel();
        label_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boton_Nacional.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        boton_Nacional.setForeground(new java.awt.Color(102, 51, 0));
        boton_Nacional.setText("Convertidor Nacional $");
        boton_Nacional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_NacionalActionPerformed(evt);
            }
        });
        getContentPane().add(boton_Nacional, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, -1));

        boton_ConUniver.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        boton_ConUniver.setForeground(new java.awt.Color(102, 51, 0));
        boton_ConUniver.setText("Convertidor Universal $");
        boton_ConUniver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_ConUniverActionPerformed(evt);
            }
        });
        getContentPane().add(boton_ConUniver, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 0, 200, -1));

        boton_ConUniver1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        boton_ConUniver1.setForeground(new java.awt.Color(102, 51, 0));
        boton_ConUniver1.setText("Convertidor Temperatura");
        getContentPane().add(boton_ConUniver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 0, 200, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 28, 700, -1));

        label_Local1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        label_Local1.setText("Selecciona el tipo de moneda");
        getContentPane().add(label_Local1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 210, 40));

        txt_Cantidad.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 18)); // NOI18N
        txt_Cantidad.setForeground(new java.awt.Color(153, 51, 0));
        txt_Cantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Cantidad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 180, 50));

        combo_Convert.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        combo_Convert.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD - Dolar", "EUR - Euro", "PHP - Peso filipino", "BTC - Bitcoin", "por - Rublo bielorruso", "BYR - Rublo bielorruso (anterior a 2016)", "USD - Dólar de Belice", "CLP - peso chileno", "HKD - Dolar de Hong Kong", "IQD - Dinar iraquí", "KPW - Won norcoreano", "KRW - Won surcoreano", "KWD - dinar kuwaití", "LBP - Libra libanesa", "NAD - dólar namibio", "NGN - naira nigeriana", "ZAR - Rand sudafricano", "MXN - Peso Mexicano" }));
        getContentPane().add(combo_Convert, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 180, 40));

        combo_Local.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        combo_Local.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MXN - Peso Mexicano", "USD - Dolar", "EUR - Euro", "PHP - Peso filipino", "BTC - Bitcoin", "por - Rublo bielorruso", "BYR - Rublo bielorruso (anterior a 2016)", "USD - Dólar de Belice", "CLP - peso chileno", "HKD - Dolar de Hong Kong", "IQD - Dinar iraquí", "KPW - Won norcoreano", "KRW - Won surcoreano", "KWD - dinar kuwaití", "LBP - Libra libanesa", "NAD - dólar namibio", "NGN - naira nigeriana", "ZAR - Rand sudafricano" }));
        getContentPane().add(combo_Local, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 180, 40));

        boton_Convertir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/convert.png"))); // NOI18N
        boton_Convertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_ConvertirActionPerformed(evt);
            }
        });
        getContentPane().add(boton_Convertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 120, 70));

        label_Resultado.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 18)); // NOI18N
        label_Resultado.setForeground(new java.awt.Color(0, 153, 0));
        label_Resultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Resultado.setText("0000");
        label_Resultado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(label_Resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 180, 50));

        label_Local2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        label_Local2.setText("Ingresa la cantidad a Convertir");
        getContentPane().add(label_Local2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 210, 40));

        label_footer.setFont(new java.awt.Font("Gabriola", 0, 14)); // NOI18N
        label_footer.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_footer.setText("Diseñador por: Esteban Jose Julian");
        getContentPane().add(label_footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, 200, -1));
        getContentPane().add(label_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_ConUniverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ConUniverActionPerformed
        dispose();
        new UniConv().setVisible(true);
    }//GEN-LAST:event_boton_ConUniverActionPerformed

    private void boton_NacionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_NacionalActionPerformed
        dispose();
        new Inicio_Menu().setVisible(true);
    }//GEN-LAST:event_boton_NacionalActionPerformed

    private void boton_ConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ConvertirActionPerformed
        
        String cantidad = txt_Cantidad.getText().trim();
        String monedaLocal = (String)combo_Local.getSelectedItem();
        String monedaConvertir = (String)combo_Convert.getSelectedItem();
        
        String codigo1 = monedaLocal.substring(0,3);
        String codigo2 = monedaConvertir.substring(0, 3);
        
        try {
            double convert = Double.parseDouble(cantidad);
            if(convert > 0){
                ConversorUniversal convertidorU = new ConversorUniversal();
                double resultado = convertidorU.convert(convert, codigo1, codigo2);
                String resul = Double.toString(resultado);
                label_Resultado.setText(resul);
            }else{
                JOptionPane.showMessageDialog(null, "Ingresa una cantidad mayor a 0");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa una cantida valida");
        }
        
        
        
    }//GEN-LAST:event_boton_ConvertirActionPerformed

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
            java.util.logging.Logger.getLogger(UniConv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UniConv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UniConv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UniConv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UniConv().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_ConUniver;
    private javax.swing.JButton boton_ConUniver1;
    private javax.swing.JButton boton_Convertir;
    private javax.swing.JButton boton_Nacional;
    private javax.swing.JComboBox<String> combo_Convert;
    private javax.swing.JComboBox<String> combo_Local;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label_Local1;
    private javax.swing.JLabel label_Local2;
    private javax.swing.JLabel label_Resultado;
    private javax.swing.JLabel label_footer;
    private javax.swing.JLabel label_wallpaper;
    private javax.swing.JTextField txt_Cantidad;
    // End of variables declaration//GEN-END:variables
}
