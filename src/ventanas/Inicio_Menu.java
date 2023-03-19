/*
 * Fecha de creacion: 18/03/2023 17:58:59
 * Version: v.0.1
 * Proyecto: Conversor de moneadas usando API - Alura_Orancle
 */
package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 * @author Esteban Jose Julian
 */
public class Inicio_Menu extends javax.swing.JFrame {

    public Inicio_Menu() {
        initComponents();
        
        //Codigo para la ventana:
        setSize(700, 450);  //Tamaño de la ventana
        setResizable(false);    //No maximizar la ventana
        setTitle("Conversor de monedas");
        setLocationRelativeTo(null);    //Iniciar la ventana en el centro.
        
        //Fondo de la ventana:
        ImageIcon wallapaper = new ImageIcon("src/images/wallpaper.jpg");
        Icon icono = new ImageIcon(wallapaper.getImage().getScaledInstance(label_wallpaper.getWidth(), label_wallpaper.getHeight(), Image.SCALE_DEFAULT));
        label_wallpaper.setIcon(icono);
        this.repaint();
        
        //Logo de la ventana
        ImageIcon wallpaperLogo = new ImageIcon("src/images/mx.png");
        Icon iconoLogo = new ImageIcon(wallpaperLogo.getImage().getScaledInstance(label_logo.getWidth(), label_logo.getHeight(), Image.SCALE_DEFAULT));
        label_logo.setIcon(iconoLogo);
        this.repaint();
        
        //Valores de las variables por decto:
        label_igual.setText("");
        label_resultado.setText("");
        
    }
    
    
    //Icono del programa(ventana)
    @Override
    public Image getIconImage(){
        Image iconoVentana = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon.png"));
        return  iconoVentana;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_logo = new javax.swing.JLabel();
        label_Cantidad = new javax.swing.JLabel();
        txt_Cantidad = new javax.swing.JTextField();
        label_signoPeso = new javax.swing.JLabel();
        label_igual = new javax.swing.JLabel();
        boton_Dollar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        label_copy = new javax.swing.JLabel();
        label_resultado = new javax.swing.JLabel();
        label_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_logo.setBackground(new java.awt.Color(255, 102, 102));
        getContentPane().add(label_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 130, 130));

        label_Cantidad.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        label_Cantidad.setForeground(new java.awt.Color(0, 0, 0));
        label_Cantidad.setText("Inserta la cantidad a Convertir");
        getContentPane().add(label_Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        txt_Cantidad.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        txt_Cantidad.setForeground(new java.awt.Color(255, 0, 51));
        txt_Cantidad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 170, 60));

        label_signoPeso.setFont(new java.awt.Font("Cooper Black", 1, 28)); // NOI18N
        label_signoPeso.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_signoPeso.setText("$");
        getContentPane().add(label_signoPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 30, 60));

        label_igual.setFont(new java.awt.Font("Cooper Black", 1, 48)); // NOI18N
        label_igual.setForeground(new java.awt.Color(0, 102, 153));
        label_igual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_igual.setText("=");
        getContentPane().add(label_igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 80, 60));

        boton_Dollar.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        boton_Dollar.setForeground(new java.awt.Color(204, 0, 102));
        boton_Dollar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dollar.png"))); // NOI18N
        boton_Dollar.setText("Dollar");
        boton_Dollar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton_Dollar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        boton_Dollar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_DollarActionPerformed(evt);
            }
        });
        getContentPane().add(boton_Dollar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 100, 90));

        jButton2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 0, 102));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/euro.png"))); // NOI18N
        jButton2.setText("Euro");
        jButton2.setBorder(null);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 100, 90));

        jButton3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 0, 102));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/yuan.png"))); // NOI18N
        jButton3.setText("Yuan");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 100, 90));

        label_copy.setText("Diseñado por: Jose Julian Esteban");
        getContentPane().add(label_copy, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 620, -1));

        label_resultado.setBackground(new java.awt.Color(204, 204, 204));
        label_resultado.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        label_resultado.setForeground(new java.awt.Color(0, 51, 153));
        label_resultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_resultado.setText("2000");
        label_resultado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(label_resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 140, 60));
        getContentPane().add(label_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_DollarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_DollarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_DollarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_Dollar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel label_Cantidad;
    private javax.swing.JLabel label_copy;
    private javax.swing.JLabel label_igual;
    private javax.swing.JLabel label_logo;
    private javax.swing.JLabel label_resultado;
    private javax.swing.JLabel label_signoPeso;
    private javax.swing.JLabel label_wallpaper;
    private javax.swing.JTextField txt_Cantidad;
    // End of variables declaration//GEN-END:variables
}
