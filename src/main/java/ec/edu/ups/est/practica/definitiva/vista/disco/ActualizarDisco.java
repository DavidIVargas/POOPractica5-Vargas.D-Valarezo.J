package ec.edu.ups.est.practica.definitiva.vista.disco;

import ec.edu.ups.est.practica.definitiva.controlador.ControladorCantante;
import ec.edu.ups.est.practica.definitiva.modelo.Cantante;
import ec.edu.ups.est.practica.definitiva.modelo.Disco;
import javax.swing.JOptionPane;

public class ActualizarDisco extends javax.swing.JInternalFrame {
    private ControladorCantante controladorCantante;
    private Cantante cantanteTempo;
    private Disco disco ;
    /**
     * Creates new form ActualizarDisco
     */
    public ActualizarDisco(ControladorCantante controladorCantante) {
        initComponents();
        this.controladorCantante = controladorCantante;
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
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        txtIdCantante4 = new javax.swing.JTextField();
        bntBuscar4 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        txtNombre4 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        txtApellido4 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtEdad4 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txtNombreArtistico4 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        txtCodigo4 = new javax.swing.JTextField();
        txtNombreDisco4 = new javax.swing.JTextField();
        txtAnioLanzamiento4 = new javax.swing.JTextField();
        bntActualizar = new javax.swing.JButton();
        bntCancelar4 = new javax.swing.JButton();
        bntBuscarDisco = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Actualizar Disco", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 0, 18))); // NOI18N

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));

        jLabel37.setText("Buscar cantante para encontar disco : ");

        bntBuscar4.setText("Buscar");
        bntBuscar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBuscar4ActionPerformed(evt);
            }
        });

        jLabel38.setText("NOMBRE DEL DISCO");

        txtNombre4.setEditable(false);
        txtNombre4.setEnabled(false);
        txtNombre4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre4ActionPerformed(evt);
            }
        });

        jLabel39.setText("Nombre : ");

        jLabel40.setText("Apellido :");

        txtApellido4.setEditable(false);
        txtApellido4.setEnabled(false);

        jLabel41.setText("Edad :");

        txtEdad4.setEditable(false);
        txtEdad4.setEnabled(false);

        jLabel42.setText("Nombre artistico :");

        txtNombreArtistico4.setEditable(false);
        txtNombreArtistico4.setEnabled(false);

        jLabel43.setText("Codigo :");

        jLabel44.setText("Nombre :");

        jLabel45.setText("Año de lanzamiento :");

        txtCodigo4.setEnabled(false);
        txtCodigo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigo4ActionPerformed(evt);
            }
        });

        txtNombreDisco4.setEnabled(false);

        txtAnioLanzamiento4.setEnabled(false);
        txtAnioLanzamiento4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnioLanzamiento4ActionPerformed(evt);
            }
        });

        bntActualizar.setText("Actualizar");
        bntActualizar.setEnabled(false);
        bntActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntActualizarActionPerformed(evt);
            }
        });

        bntCancelar4.setText("Cancelar");
        bntCancelar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCancelar4ActionPerformed(evt);
            }
        });

        bntBuscarDisco.setText("Buscar");
        bntBuscarDisco.setEnabled(false);
        bntBuscarDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBuscarDiscoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addGap(452, 452, 452)
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtAnioLanzamiento4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel43)
                                    .addComponent(jLabel44))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCodigo4)
                                    .addComponent(txtNombreDisco4, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addComponent(bntBuscarDisco))
                            .addComponent(bntActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(bntCancelar4))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel38)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addGap(18, 18, 18)
                                .addComponent(txtIdCantante4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bntBuscar4)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel41))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre4)
                            .addComponent(txtEdad4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40)
                            .addComponent(jLabel42))))
                .addGap(24, 24, 24)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreArtistico4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel37)
                        .addComponent(txtIdCantante4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bntBuscar4))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39)
                            .addComponent(jLabel40)
                            .addComponent(txtApellido4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41)
                            .addComponent(txtEdad4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42)
                            .addComponent(txtNombreArtistico4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35)
                .addComponent(jLabel38)
                .addGap(37, 37, 37)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(txtCodigo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntBuscarDisco)
                    .addComponent(jLabel45)
                    .addComponent(txtAnioLanzamiento4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(txtNombreDisco4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntCancelar4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 956, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 65, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntBuscar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBuscar4ActionPerformed
        // TODO add your handling code here:
        if (txtIdCantante4.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No esta lleno el campo ");
        }else{
            cantanteTempo = controladorCantante.buscarCantante(Integer.parseInt(txtIdCantante4.getText()));
            if (cantanteTempo!=null) {
                txtIdCantante4.setEnabled(false);
                this.mostrarDatos(cantanteTempo);
                bntBuscar4.setEnabled(false);
                bntBuscarDisco.setEnabled(true);
                //txtNombreDisco4.setEnabled(true);
                //txtCodigo4.setEnabled(true);
                //txtAnioLanzamiento4.setEnabled(true);
                txtCodigo4.setEnabled(true);

            }else{
                JOptionPane.showMessageDialog(this, "No existe "+ txtIdCantante4.getText()+" en cantantes. ");
            }
        }
    }//GEN-LAST:event_bntBuscar4ActionPerformed

    private void txtNombre4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre4ActionPerformed

    private void txtCodigo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigo4ActionPerformed

    private void txtAnioLanzamiento4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnioLanzamiento4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnioLanzamiento4ActionPerformed

    private void bntActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntActualizarActionPerformed
        
        if (txtAnioLanzamiento4.getText().isEmpty()||txtNombreDisco4.getText().isEmpty()||txtCodigo4.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se a llenado todos los campos correctamente");
        }else{
            Disco disquito = new Disco(Integer.parseInt(txtCodigo4.getText()), txtNombreDisco4.getText(), Integer.parseInt(txtAnioLanzamiento4.getText()));
            cantanteTempo.actualizarDisco(disquito);
            JOptionPane.showMessageDialog(this, "Se actualizado correctamente");
            txtNombreDisco4.setText("");
            txtAnioLanzamiento4.setText("");
            txtCodigo4.setText("");
            txtNombreDisco4.setEnabled(false);
            txtAnioLanzamiento4.setEnabled(false);
            txtCodigo4.setEnabled(true);
            bntActualizar.setEnabled(false);
            System.out.println(cantanteTempo);
        }
    }//GEN-LAST:event_bntActualizarActionPerformed
    
    public void limpiarCampos(){
        txtIdCantante4.setText("");
        
        txtApellido4.setText("");
        txtCodigo4.setText("");
        txtEdad4.setText("");
        txtNombreArtistico4.setText("");
        txtNombreDisco4.setText("");
        txtAnioLanzamiento4.setText("");
        txtNombre4.setText("");
    }
    public void mostrarDatos(Cantante cantante){
        txtIdCantante4.setEnabled(false);
        bntBuscar4.setEnabled(false);
        txtNombre4.setText(cantante.getNombre());
        txtEdad4.setText( String.valueOf(cantante.getEdad()));
        txtNombreArtistico4.setText(cantante.getNombreArtistico());
        txtApellido4.setText(cantante.getApellido());
        
    }
    
    private void bntCancelar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCancelar4ActionPerformed
        // TODO add your handling code here:
        this.limpiarCampos();
        this.setVisible(false);
        txtNombreDisco4.setEnabled(false);
        txtAnioLanzamiento4.setEnabled(false);
        bntActualizar.setEnabled(false);
        bntBuscar4.setEnabled(true);
        txtIdCantante4.setEnabled(true);
        bntBuscarDisco.setEnabled(false);
        txtCodigo4.setEnabled(false);
    }//GEN-LAST:event_bntCancelar4ActionPerformed

    private void bntBuscarDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBuscarDiscoActionPerformed
       // TODO add your handling code here:
        if (txtCodigo4.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No esta lleno el campo ");
        }else {
            disco = cantanteTempo.buscarDisco(Integer.parseInt(txtCodigo4.getText()));
            if (disco!=null) {
                txtCodigo4.setEnabled(false);
                txtAnioLanzamiento4.setText(String.valueOf(disco.getAnioDeLanzamiento()));
                bntActualizar.setEnabled(true);
                txtAnioLanzamiento4.setEnabled(true);
                txtNombreDisco4.setEnabled(true);
                txtNombreDisco4.setText(disco.getNombre());
            }else{
                JOptionPane.showMessageDialog(this, "Nose el disco ");
            }
        }
    }//GEN-LAST:event_bntBuscarDiscoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntActualizar;
    private javax.swing.JButton bntBuscar4;
    private javax.swing.JButton bntBuscarDisco;
    private javax.swing.JButton bntCancelar4;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField txtAnioLanzamiento4;
    private javax.swing.JTextField txtApellido4;
    private javax.swing.JTextField txtCodigo4;
    private javax.swing.JTextField txtEdad4;
    private javax.swing.JTextField txtIdCantante4;
    private javax.swing.JTextField txtNombre4;
    private javax.swing.JTextField txtNombreArtistico4;
    private javax.swing.JTextField txtNombreDisco4;
    // End of variables declaration//GEN-END:variables
}
