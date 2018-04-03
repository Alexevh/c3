package iu;


import java.util.ArrayList;
import javax.swing.JOptionPane;
import logica.Aviso;
import logica.Logica;
import logica.Publicidad;
import logica.Tipo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alex
 */
public class AltaPublicidad extends javax.swing.JDialog {
    
    Publicidad nueva = new Publicidad();

    /**
     * Creates new form AltaPublicidad
     */
    public AltaPublicidad(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cargarTipos();
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
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtTexto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDuracion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstAvisos = new javax.swing.JList();
        btnGuardar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstPublicidades = new javax.swing.JList();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 30, 80, 17);
        getContentPane().add(txtNombre);
        txtNombre.setBounds(140, 30, 200, 27);

        jLabel2.setText("Tipo");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 80, 30, 17);

        getContentPane().add(cmbTipo);
        cmbTipo.setBounds(140, 80, 200, 27);

        jLabel3.setText("Texto");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 140, 80, 17);
        getContentPane().add(txtTexto);
        txtTexto.setBounds(140, 140, 180, 27);

        jLabel4.setText("Duracion");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 200, 90, 17);

        txtDuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDuracionActionPerformed(evt);
            }
        });
        getContentPane().add(txtDuracion);
        txtDuracion.setBounds(130, 200, 160, 27);

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 250, 68, 29);

        jScrollPane1.setViewportView(lstAvisos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 320, 160, 190);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(80, 520, 68, 29);

        jScrollPane2.setViewportView(lstPublicidades);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(480, 140, 200, 350);

        jLabel5.setText("Publicidades");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(490, 110, 160, 17);

        jLabel6.setText("Avisos");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 290, 90, 17);

        setBounds(0, 0, 729, 630);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDuracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDuracionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        
        agregarAviso();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       guardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<Tipo> cmbTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList lstAvisos;
    private javax.swing.JList lstPublicidades;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTexto;
    // End of variables declaration//GEN-END:variables


private void cargarTipos()
{
    ArrayList<Tipo> lista = Logica.getInstancia().getTipos();
    for(Tipo t: lista)
    {
        System.out.print(t.getNombre());
        cmbTipo.addItem(t);
    }
}

    private void agregarAviso() {
        
        if(nueva.agregarAviso(txtTexto.getText(), Integer.parseInt(txtDuracion.getText())))
        {
            muestroAvisos();
        } else {
            error();
        }
        
    }

    private void muestroAvisos() {
       
        lstAvisos.setListData(nueva.getAvisos().toArray());
    }

    private void error() {
        JOptionPane.showConfirmDialog(this, "Error");
    }

    private void guardar() {
        nueva.setNombre(txtNombre.getText());
        nueva.setTipo((Tipo)cmbTipo.getSelectedItem());
        if (Logica.getInstancia().agregarPublicidad(nueva))
        {
            muestroPublicidades();
            nueva = new Publicidad();
            muestroAvisos();
        }
    }

    private void muestroPublicidades() {
        
        lstPublicidades.setListData(Logica.getInstancia().getPublicidades().toArray());
    }

}