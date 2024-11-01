/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectoprogra;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author user
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
        
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
        Titulo1 = new javax.swing.JLabel();
        BotonMusic = new javax.swing.JButton();
        BotonVideo = new javax.swing.JButton();
        BotonImagen = new javax.swing.JButton();
        AbrirCarpeta = new javax.swing.JButton();
        Texto1 = new javax.swing.JTextField();
        list1 = new java.awt.List();
        PanelTablas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaMusic = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        BotonAtrasMusic = new javax.swing.JButton();
        BotReproducirMusic = new javax.swing.JButton();
        BotonSigMusic = new javax.swing.JButton();
        MostrarImagen = new javax.swing.JButton();
        VerVideo = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Titulo1.setForeground(new java.awt.Color(255, 255, 255));
        Titulo1.setText("Gestor de Archivos Cristyan");
        jPanel1.add(Titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 570, 60));

        BotonMusic.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonMusic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/musica2.png"))); // NOI18N
        BotonMusic.setText("Musica");
        jPanel1.add(BotonMusic, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 160, 70));

        BotonVideo.setBackground(new java.awt.Color(0, 0, 0));
        BotonVideo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonVideo.setForeground(new java.awt.Color(255, 255, 255));
        BotonVideo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/videos.png"))); // NOI18N
        BotonVideo.setText("Videos");
        jPanel1.add(BotonVideo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 160, -1));

        BotonImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/ImagenIncono.png"))); // NOI18N
        BotonImagen.setText("Imágenes");
        jPanel1.add(BotonImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 160, 70));

        AbrirCarpeta.setBackground(new java.awt.Color(9, 3, 3));
        AbrirCarpeta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AbrirCarpeta.setForeground(new java.awt.Color(255, 255, 255));
        AbrirCarpeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/Carpetas.png"))); // NOI18N
        AbrirCarpeta.setText("Seleccionar Carpeta");
        AbrirCarpeta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(AbrirCarpeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 80));
        jPanel1.add(Texto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 440, 30));
        jPanel1.add(list1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 160, 210));

        PanelTablas.setBackground(new java.awt.Color(51, 51, 51));

        TablaMusic.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Ext", "Artista", "Álbum", "Género", "Duración", "Año", "Ruta", "Tamaño"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaMusic);

        javax.swing.GroupLayout PanelTablasLayout = new javax.swing.GroupLayout(PanelTablas);
        PanelTablas.setLayout(PanelTablasLayout);
        PanelTablasLayout.setHorizontalGroup(
            PanelTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTablasLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        PanelTablasLayout.setVerticalGroup(
            PanelTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTablasLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel1.add(PanelTablas, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 800, 310));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        BotonAtrasMusic.setBackground(new java.awt.Color(0, 0, 0));
        BotonAtrasMusic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/atras.png"))); // NOI18N

        BotReproducirMusic.setBackground(new java.awt.Color(0, 0, 0));
        BotReproducirMusic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/Reproducir.png"))); // NOI18N

        BotonSigMusic.setBackground(new java.awt.Color(0, 0, 0));
        BotonSigMusic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/siguiente.png"))); // NOI18N

        MostrarImagen.setBackground(new java.awt.Color(0, 0, 0));
        MostrarImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/IconImage.png"))); // NOI18N

        VerVideo.setBackground(new java.awt.Color(0, 0, 0));
        VerVideo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/VerVideo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(BotonAtrasMusic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotReproducirMusic)
                .addGap(18, 18, 18)
                .addComponent(BotonSigMusic)
                .addGap(18, 18, 18)
                .addComponent(VerVideo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MostrarImagen)
                .addContainerGap(543, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonAtrasMusic)
                    .addComponent(BotReproducirMusic)
                    .addComponent(BotonSigMusic)
                    .addComponent(VerVideo)
                    .addComponent(MostrarImagen, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 600, 800, 50));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/spiderman.jpg"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 690));

        jTextField1.setText("jTextField1");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AbrirCarpeta;
    private javax.swing.JButton BotReproducirMusic;
    private javax.swing.JButton BotonAtrasMusic;
    private javax.swing.JButton BotonImagen;
    private javax.swing.JButton BotonMusic;
    private javax.swing.JButton BotonSigMusic;
    private javax.swing.JButton BotonVideo;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton MostrarImagen;
    private javax.swing.JPanel PanelTablas;
    private javax.swing.JTable TablaMusic;
    private javax.swing.JTextField Texto1;
    private javax.swing.JLabel Titulo1;
    private javax.swing.JButton VerVideo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private java.awt.List list1;
    // End of variables declaration//GEN-END:variables
}
