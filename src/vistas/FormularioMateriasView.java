/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import clases.Materia;
import javax.swing.JOptionPane;
import static vistas.menu.materia;

/**
 *
 * @author Lourdes
 */
public class FormularioMateriasView extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormularioMateriasView
     */
    public FormularioMateriasView() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfNombreMateria = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfAnio = new javax.swing.JTextField();
        jbGuardar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Messina Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FORMULARIO DE MATERIAS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 6, 365, -1));

        jLabel2.setFont(new java.awt.Font("Messina Sans", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CÓDIGO DE MATERIA:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 66, -1, -1));

        tfCodigo.setBackground(new java.awt.Color(255, 255, 255));
        tfCodigo.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(tfCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 64, 69, -1));

        jLabel3.setFont(new java.awt.Font("Messina Sans", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOMBRE DE LA MATERIA:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 106, -1, -1));

        tfNombreMateria.setBackground(new java.awt.Color(255, 255, 255));
        tfNombreMateria.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(tfNombreMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 104, 133, -1));

        jLabel4.setFont(new java.awt.Font("Messina Sans", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("AÑO DE LA MATERIA:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 150, -1, -1));

        tfAnio.setBackground(new java.awt.Color(255, 255, 255));
        tfAnio.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(tfAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 148, 133, -1));

        jbGuardar.setBackground(new java.awt.Color(255, 255, 255));
        jbGuardar.setForeground(new java.awt.Color(0, 0, 0));
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        jbNuevo.setBackground(new java.awt.Color(255, 255, 255));
        jbNuevo.setForeground(new java.awt.Color(0, 0, 0));
        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(jbNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        jbSalir.setBackground(new java.awt.Color(255, 255, 255));
        jbSalir.setForeground(new java.awt.Color(0, 0, 0));
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/13223142_5191466.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -24, 390, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        try{
        int codigo = Integer.parseInt(tfCodigo.getText());
        String nombre = tfNombreMateria.getText();
        int anio = Integer.parseInt(tfAnio.getText());
        
        Materia mat = new Materia(codigo,nombre,anio);
        
        boolean existeMateria = false;
        for (Materia materia : materia) {
        if (materia.getNombre().equals(mat.getNombre())) {
        existeMateria = true;
        break;
        }   
        }
        if (!existeMateria) {
        materia.add(mat);
        JOptionPane.showMessageDialog(this, "Materia guardada éxitosamente.");
        } else {
        JOptionPane.showMessageDialog(this, "Materia existente.");
        }
        } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El código y el año deben ser números enteros.");
        } catch (NullPointerException e) {
        JOptionPane.showMessageDialog(this, "Error al guardar la materia.");
    }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        tfCodigo.setText("");
        tfNombreMateria.setText("");
        tfAnio.setText("");
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTextField tfAnio;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfNombreMateria;
    // End of variables declaration//GEN-END:variables
}
