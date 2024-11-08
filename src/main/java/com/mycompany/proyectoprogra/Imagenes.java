/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectoprogra;

import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class Imagenes extends javax.swing.JFrame {

    
         public String RutaAcceso;
    /**
     * Creates new form Imagenes
     */
    public Imagenes() {
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

        Fondos = new javax.swing.JPanel();
        AbrirCarpeta = new javax.swing.JButton();
        PanelTablas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaImagen = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        MostrarImagen = new javax.swing.JButton();
        RegresarVentana = new javax.swing.JButton();
        MostrarImagenLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Fondos.setBackground(new java.awt.Color(153, 153, 153));

        AbrirCarpeta.setBackground(new java.awt.Color(9, 3, 3));
        AbrirCarpeta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AbrirCarpeta.setForeground(new java.awt.Color(255, 255, 255));
        AbrirCarpeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/Carpetas.png"))); // NOI18N
        AbrirCarpeta.setText("Seleccionar Carpeta");
        AbrirCarpeta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        AbrirCarpeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirCarpetaActionPerformed(evt);
            }
        });

        PanelTablas.setBackground(new java.awt.Color(51, 51, 51));

        TablaImagen.setBackground(new java.awt.Color(204, 204, 204));
        TablaImagen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Ext", "Fecha de creacion", "Fecha de modificacion", "Tamaño", "Aparato donde tomo la foto", "Ruta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaImagen);

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
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        MostrarImagen.setBackground(new java.awt.Color(0, 0, 0));
        MostrarImagen.setForeground(new java.awt.Color(255, 255, 255));
        MostrarImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/IconImage.png"))); // NOI18N
        MostrarImagen.setText("Clic para ver Imagen");
        MostrarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarImagenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(MostrarImagen)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(MostrarImagen)
                .addContainerGap())
        );

        RegresarVentana.setBackground(new java.awt.Color(0, 204, 255));
        RegresarVentana.setText("Regresar");
        RegresarVentana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarVentanaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FondosLayout = new javax.swing.GroupLayout(Fondos);
        Fondos.setLayout(FondosLayout);
        FondosLayout.setHorizontalGroup(
            FondosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondosLayout.createSequentialGroup()
                .addGroup(FondosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AbrirCarpeta, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FondosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(PanelTablas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(MostrarImagenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(FondosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192)
                .addComponent(RegresarVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(315, 315, 315))
        );
        FondosLayout.setVerticalGroup(
            FondosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondosLayout.createSequentialGroup()
                .addGroup(FondosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondosLayout.createSequentialGroup()
                        .addComponent(AbrirCarpeta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FondosLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(PanelTablas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(RegresarVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FondosLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(MostrarImagenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(119, 119, 119))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Fondos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(530, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AbrirCarpetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirCarpetaActionPerformed
        JFileChooser carpetaSelec = new JFileChooser();
        carpetaSelec.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); // Solo seleccionar directorios

        // Mostrar el diálogo de selección de carpeta
        int result = carpetaSelec.showOpenDialog(null);

        // Si el usuario selecciona una carpeta
        if (result == JFileChooser.APPROVE_OPTION) {
            File rutaSeleccionada = carpetaSelec.getSelectedFile();

            RutaAcceso = rutaSeleccionada.getAbsolutePath();

        }
        else {
            JOptionPane.showMessageDialog(this, "No se ha seleccionado una carpeta");
        }
        DefaultTableModel modeloTabla = (DefaultTableModel) TablaImagen.getModel();
        modeloTabla.setRowCount(0);
        
        buscarArchivoImagen(new File(RutaAcceso), modeloTabla);
    }//GEN-LAST:event_AbrirCarpetaActionPerformed
        
   private void buscarArchivoImagen(File directorio, DefaultTableModel modeloTabla) {
    if (directorio != null && directorio.isDirectory()) {
        File[] archivos = directorio.listFiles();
        if (archivos != null) {
            for (File archivo : archivos) {
                if (archivo.isDirectory()) {
                    buscarArchivoImagen(archivo, modeloTabla); 
                } else if (archivo.isFile() && (archivo.getName().toLowerCase().endsWith(".jpg") ||
                        archivo.getName().toLowerCase().endsWith(".jpeg") ||
                        archivo.getName().toLowerCase().endsWith(".png") ||
                        archivo.getName().toLowerCase().endsWith(".gif") ||
                        archivo.getName().toLowerCase().endsWith(".bmp"))) {

                    String nombre = archivo.getName();
                    String extension = archivo.getName().substring(archivo.getName().lastIndexOf('.')).toLowerCase();
                    String ruta = archivo.getAbsolutePath();
                    double tamano = archivo.length() / (1024.0 * 1024.0);

                    // Obtener fechas de creación y modificación
                    String fechaCreacion = "Desconocido";
                    String fechaModificacion = "Desconocido";
                    try {
                        BasicFileAttributes atributos = Files.readAttributes(archivo.toPath(), BasicFileAttributes.class);
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        fechaCreacion = sdf.format(atributos.creationTime().toMillis());
                        fechaModificacion = sdf.format(atributos.lastModifiedTime().toMillis());
                    } catch (Exception e) {
                        System.out.println("Error al obtener fechas del archivo: " + archivo.getName());
                    }

                    // Agregar los datos al modelo de tabla
                    modeloTabla.addRow(new Object[]{
                        nombre,
                        extension,
                        fechaCreacion,
                        fechaModificacion,
                        String.format("%.2f MB", tamano),
                        "Desconocido", // Aquí se indica el aparato como "Desconocido"
                        ruta
                    });
                }
            }
        }
    } else {
        System.out.println("El directorio no es válido o no existe.");
    }
}
    
   private void mostrarImagenSeleccionada(DefaultTableModel modeloTabla, int filaSeleccionada, JLabel MostrarImagenLabel) {
        if (filaSeleccionada >= 0) { // Verificar que haya una fila seleccionada
            String rutaImagen = (String) modeloTabla.getValueAt(filaSeleccionada, 6); // Columna de ruta
            ImageIcon icono = new ImageIcon(rutaImagen);
            MostrarImagenLabel.setIcon(new ImageIcon(icono.getImage().getScaledInstance(
                    MostrarImagenLabel.getWidth(), MostrarImagenLabel.getHeight(), java.awt.Image.SCALE_SMOOTH)));
        } else {
            System.out.println("No hay ninguna imagen seleccionada.");
        }
    }

    private void RegresarVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarVentanaActionPerformed
        VentanaPrincipal nuevo = new VentanaPrincipal();
        
        nuevo.setVisible(true); 

    // Cerrar la ventana actual (Videos)
    this.dispose(); 
    }//GEN-LAST:event_RegresarVentanaActionPerformed

    private void MostrarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarImagenActionPerformed
        MostrarImagen.addActionListener(e -> {
    int filaSeleccionada = TablaImagen.getSelectedRow();
    mostrarImagenSeleccionada((DefaultTableModel) TablaImagen.getModel(), filaSeleccionada, MostrarImagenLabel);
});
    }//GEN-LAST:event_MostrarImagenActionPerformed

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
            java.util.logging.Logger.getLogger(Imagenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Imagenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Imagenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Imagenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Imagenes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AbrirCarpeta;
    private javax.swing.JPanel Fondos;
    private javax.swing.JButton MostrarImagen;
    private javax.swing.JLabel MostrarImagenLabel;
    private javax.swing.JPanel PanelTablas;
    private javax.swing.JButton RegresarVentana;
    private javax.swing.JTable TablaImagen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
