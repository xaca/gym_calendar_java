package vista;

import controlador.ControladorUsuario;
import java.awt.Color;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import modelo.Usuario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xaca
 */
public class ActualizarUsuario extends javax.swing.JFrame {

    private ControladorUsuario cr;
    /**
     * Creates new form Registro
     */
    public ActualizarUsuario() {
        initComponents();
        cr = new ControladorUsuario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_nombre_usuario = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txt_correo_busqueda = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N

        jButton2.setText("< Volver");

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Actualizar Usuario"));
        jPanel7.setLayout(new java.awt.GridLayout(3, 2));

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jLabel1.setText("Usuario");
        jPanel1.add(jLabel1);

        txt_nombre_usuario.setMinimumSize(new java.awt.Dimension(7, 30));
        txt_nombre_usuario.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel1.add(txt_nombre_usuario);

        jPanel7.add(jPanel1);

        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jLabel2.setText("Correo");
        jPanel2.add(jLabel2);

        txt_correo.setEditable(false);
        txt_correo.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel2.add(txt_correo);

        jPanel7.add(jPanel2);

        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jLabel3.setText("Nombre");
        jPanel3.add(jLabel3);

        txt_nombre.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel3.add(txt_nombre);

        jPanel7.add(jPanel3);

        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jLabel4.setText("Apellido");
        jPanel4.add(jLabel4);

        txt_apellido.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel4.add(txt_apellido);

        jPanel7.add(jPanel4);

        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jLabel5.setText("Direcion");
        jPanel5.add(jLabel5);

        txt_direccion.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel5.add(txt_direccion);

        jPanel7.add(jPanel5);

        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jLabel6.setText("Telefono");
        jLabel6.setToolTipText("");
        jPanel6.add(jLabel6);

        txt_telefono.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel6.add(txt_telefono);

        jPanel7.add(jPanel6);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Usuario"));

        jLabel8.setText("Correo");
        jPanel8.add(jLabel8);

        txt_correo_busqueda.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel8.add(txt_correo_busqueda);

        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(139, 139, 139))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(100, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(111, 111, 111))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(20, 20, 20)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(816, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Usuario temp;
        
        if(cr.getUsuario()!=null)
        {
            temp  = cr.getUsuario();
            temp.setUsuario(txt_nombre_usuario.getText());
            temp.setNombre(txt_nombre.getText());
            temp.setApellido(txt_apellido.getText());
            temp.setCorreo(txt_correo.getText());
            temp.setDireccion(txt_direccion.getText());
            temp.setTelefono(txt_telefono.getText());
            
            if(cr.actualizar(temp))
            {
                JOptionPane.showMessageDialog(rootPane, "Datos actualizados con exito", "Actualizacion usuario", JOptionPane.INFORMATION_MESSAGE);
                limpiarCampos();
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Verifica los datos", "Error al actualizar", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Verifica los datos", "Error al actualizar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        Usuario temp = new Usuario();
        temp.setCorreo(txt_correo_busqueda.getText());
        cr.setUsuario(temp);
        
        if(cr.mostrarUsuario())
        {
            temp = cr.getUsuario();
            System.out.println(temp.getNombre());
            txt_nombre_usuario.setText(temp.getUsuario());
            txt_nombre.setText(temp.getNombre());
            txt_apellido.setText(temp.getApellido());
            txt_correo.setText(temp.getCorreo());
            txt_direccion.setText(temp.getDireccion());
            txt_telefono.setText(temp.getTelefono());
        }
        else{
            limpiarCampos();
            JOptionPane.showMessageDialog(rootPane, "Usuario no encontrado, verifique los datos", "Error de busqueda", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_correo_busqueda;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_nombre_usuario;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        txt_nombre_usuario.setText("");
        txt_correo.setText("");
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_direccion.setText("");
        txt_telefono.setText("");
        txt_correo_busqueda.setText("");
    }
}
