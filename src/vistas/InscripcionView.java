/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import clases.Alumno;
import clases.Materia;
import java.util.Iterator;
import javax.swing.JOptionPane;
import static vistas.menu.materia;
import static vistas.menu.registro;

/**
 *
 * @author Lourdes
 */
public class InscripcionView extends javax.swing.JInternalFrame {

    /**
     * Creates new form InscripcionView
     */
    public InscripcionView() {
        initComponents();
        cargarComboMateria();
        cargarComboAlumno();
       
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
        jLabel3 = new javax.swing.JLabel();
        jcbAlumno = new javax.swing.JComboBox<>();
        jbInscribir = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jcbMateria = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Messina Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FORMULARIO DE INSCRIPCIÓN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 423, -1));

        jLabel2.setFont(new java.awt.Font("Messina Sans", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ELIJA UNA MATERIA:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 61, -1, -1));

        jLabel3.setFont(new java.awt.Font("Messina Sans", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ELIJA UN ALUMNO:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 114, -1, -1));

        jcbAlumno.setBackground(new java.awt.Color(255, 255, 255));
        jcbAlumno.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jcbAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 112, 195, -1));

        jbInscribir.setBackground(new java.awt.Color(255, 255, 255));
        jbInscribir.setForeground(new java.awt.Color(0, 0, 0));
        jbInscribir.setText("Inscribir");
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });
        getContentPane().add(jbInscribir, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 185, -1, -1));

        jbSalir.setBackground(new java.awt.Color(255, 255, 255));
        jbSalir.setForeground(new java.awt.Color(0, 0, 0));
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 185, -1, -1));

        jcbMateria.setBackground(new java.awt.Color(255, 255, 255));
        jcbMateria.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jcbMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 59, 195, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Ver Inscripciones");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 185, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/13223142_5191466.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -24, 430, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
       boolean ins = false;
       Alumno al = (Alumno)jcbAlumno.getSelectedItem();
       Materia mat = (Materia)jcbMateria.getSelectedItem();
       
       Iterator<Alumno> it = registro.iterator();
       
       while(it.hasNext()){
           Alumno alActual = it.next();
           if(alActual.equals(al)){
               al.agregarMateria(mat);
               ins=true;
               break;
           }
       }
       if (ins){
            JOptionPane.showMessageDialog(this,"Alumno Inscripto en " + mat.getNombre() + ".");      
       }else{
           JOptionPane.showMessageDialog(this, "Hubo un error con la inscripción.");
       }
    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        for (Alumno al : registro) {
        JOptionPane.showMessageDialog(this,">>"+al.getNombre()+ al.getApellido() + " se encuentra inscripto en "+al.cantidadMaterias() + " materias.");
    
    }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumno> jcbAlumno;
    private javax.swing.JComboBox<Materia> jcbMateria;
    // End of variables declaration//GEN-END:variables
private void cargarComboMateria(){
    for (Materia materia1 : materia) {
        jcbMateria.addItem(materia1);
    }
}
private void cargarComboAlumno(){
    for (Alumno al : registro) {
        jcbAlumno.addItem(al);
    }
    
}
}
