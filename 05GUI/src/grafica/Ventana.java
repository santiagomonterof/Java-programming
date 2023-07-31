/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import logica.Persona;

public class Ventana extends javax.swing.JFrame {

    private ArrayList<Persona> lista = new ArrayList<>();
    private int limite;

    public Ventana() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lbTelefono = new javax.swing.JLabel();
        lbCorreo = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lbContador = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbNombre.setText("Nombre");

        lbTelefono.setText("Telefono");

        lbCorreo.setText("Correo");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnVer.setText("Ver Lista");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        lbContador.setText("Nuevo");

        jButton1.setText("<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText(">");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnVer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCorreo)
                            .addComponent(lbTelefono)
                            .addComponent(lbNombre))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 229, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbContador)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbContador)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCorreo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnVer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLimpiar)
                        .addComponent(btnEliminar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnActualizar))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        btnGuardar.setToolTipText("Guardar");
        Persona contacto = new Persona();
        contacto.setCorreo(txtCorreo.getText());
        contacto.setNombre(txtNombre.getText());

        Pattern datos = Pattern
                .compile("^[A-Za-z0-9]+[@]{1}+[A-Za-z0-9]{1,}+[.]{1}+[A-Za-z]{2,}$"); //Valida lo que es el inicio del nombre sea letras o numeros, luego el arroba
        //el punto, luego de acuerdo a gmail o otro y lo que viene a ser .com o otra opcion.

        Pattern datos1 = Pattern
                .compile("^([A-Z]{1}[a-z]+[ ]?){1,2}$"); //Valida la primera letra mayuscula y su espacio, si es tambien una o mas veces,
        //tambien letras mayusculas y minusculas y que sea de 2

        Pattern datos2 = Pattern
                .compile("^[0-9]{8}$");//Valida simplemente que sean 8 numeros minimos

        Matcher verificador = datos.matcher(txtCorreo.getText());
        Matcher verificador1 = datos1.matcher(txtNombre.getText());
        Matcher verificador2 = datos2.matcher(txtTelefono.getText());

        if (verificador.find() == true && verificador1.find() == true && verificador2.find() == true) {
            boolean flag = false;
            try {
                int telefono = Integer.parseInt(txtTelefono.getText());
                contacto.setTelefono(telefono);
                for (int i = 0; i < lista.size(); i++) {
                    if (lista.get(i).getNombre().equals(txtNombre.getText())) {
                        flag = true;
                        break;
                    }
                }
                if (flag != true) {
                    lista.add(contacto);
                    limite = lista.size();
                    JOptionPane.showMessageDialog(rootPane, "Contacto Guardado");
                    lbContador.setText(limite + "/" + lista.size());
                    limpiarCampos();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Contacto ya existente");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "El campo de telefono solo acepta numeros, hasta 12 digitos");
            }
        } else {
            String invalido = "\nDatos Invalidos\nSeguir ejemplo.-\n-=[+]=-\nNombre: Santiago Montero\nTeléfono: 76088301\nCorreo: Santiago050411@gmail.com";
            JOptionPane.showMessageDialog(null, invalido);
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        String texto = "";
        for (Persona persona : lista) {
            texto += persona.getInfo() + "\n----------------\n";
        }
        JOptionPane.showMessageDialog(null, texto);
    }//GEN-LAST:event_btnVerActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "¿Esta seguro que desea borrar?",
                "Limpiar Formulario", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            lbContador.setText("Nuevo");
            limpiarCampos();
        }
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limite--;                                                         //Izquierda
        if (limite >= 0 && limite <= lista.size()) {
            mostrarDatos();
            lbContador.setText(limite + 1 + "/" + lista.size());
        }
        if (limite < 0) {
            JOptionPane.showMessageDialog(null, "Llegaste al limitee");
            limite = 0;
        }
        //System.out.println(limite);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        limite++;                                                         //Derecha
        if (limite >= 0 && limite < lista.size()) {
            mostrarDatos();
            lbContador.setText((limite + 1) + "/" + lista.size());
        }
        if (limite >= lista.size()) {
            limpiarCampos();
            lbContador.setText("Nuevo");
            limite = lista.size();
        }
        //System.out.println(limite);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {                                                                //Elimina un usuario
            lista.remove(lista.get(limite));
            limite = 0;
            lbContador.setText(1 + "/" + lista.size());
            txtNombre.setText(lista.get(0).getNombre());
            txtTelefono.setText(String.valueOf(lista.get(0).getTelefono()));
            txtCorreo.setText(lista.get(0).getCorreo());
            System.out.println("Eliminado exitosamente");
        } catch (Exception e) {
            limpiarCampos();
            if (limite == 0) {
                lbContador.setText("Nuevo");
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        Pattern datos = Pattern
                .compile("^[A-Za-z0-9]+[@]{1}+[A-Za-z0-9]{1,}+[.]{1}+[A-Za-z]{2,}$");

        Pattern datos1 = Pattern
                .compile("^([A-Z]{1}[a-z]+[ ]?){1,2}$");

        Pattern datos2 = Pattern
                .compile("^[0-9]{8}$");

        Matcher verificador = datos.matcher(txtCorreo.getText());
        Matcher verificador1 = datos1.matcher(txtNombre.getText());
        Matcher verificador2 = datos2.matcher(txtTelefono.getText());
        if (verificador.find() == true && verificador1.find() == true && verificador2.find() == true) {
            try {
                lista.get(limite).setNombre(txtNombre.getText());
                lista.get(limite).setTelefono(Integer.parseInt(txtTelefono.getText()));
                lista.get(limite).setCorreo(txtCorreo.getText());
                System.out.println("Editado exitosamente");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Acción no posible");
            }
        } else {
            String invalido = "\nDatos Invalidos\nSeguir ejemplo.-\n-=[+]=-\nNombre: Santiago Montero\nTeléfono: 76088301\nCorreo: Santiago050411@gmail.com";
            JOptionPane.showMessageDialog(null, invalido);
        }

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        txtNombre.setEnabled(true);                                        //Activa la opción para editar  
        txtTelefono.setEnabled(true);
        txtCorreo.setEnabled(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void mostrarDatos() { //Muestra los datos
        txtNombre.setText(lista.get(limite).getNombre());
        txtTelefono.setText(String.valueOf(lista.get(limite).getTelefono()));
        txtCorreo.setText(lista.get(limite).getCorreo());
        txtNombre.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtCorreo.setEnabled(false);
    }

    private void limpiarCampos() { //Activa y limpia los campos
        txtNombre.setEnabled(true);
        txtTelefono.setEnabled(true);
        txtCorreo.setEnabled(true);
        txtCorreo.setText("");
        txtTelefono.setText("");
        txtNombre.setText("");
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVer;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lbContador;
    private javax.swing.JLabel lbCorreo;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbTelefono;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

}
