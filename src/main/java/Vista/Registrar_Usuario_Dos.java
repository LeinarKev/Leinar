/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import javax.swing.JTextField;

/**
 *
 * @author José Luis López
 */
public class Registrar_Usuario_Dos extends javax.swing.JFrame {

    /**
     * Creates new form Registrar_Usuario_Dos
     */
    public Registrar_Usuario_Dos() {
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

        Regresar = new javax.swing.JButton();
        Registrar = new javax.swing.JButton();
        Primer_Nombre = new javax.swing.JTextField();
        Segundo_Nombre = new javax.swing.JTextField();
        Primer_Apellido = new javax.swing.JTextField();
        Segundo_Apellido = new javax.swing.JTextField();
        dia = new javax.swing.JTextField();
        año = new javax.swing.JTextField();
        mes = new javax.swing.JTextField();
        Pais = new javax.swing.JComboBox<>();
        Genero = new javax.swing.JComboBox<>();
        Fecha_Dos = new javax.swing.JLabel();
        Pais_2 = new javax.swing.JLabel();
        primer_apell = new javax.swing.JLabel();
        segundo_apell = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        genero_ = new javax.swing.JLabel();
        Obligatorio = new javax.swing.JLabel();
        Obligatorio1 = new javax.swing.JLabel();
        Obligatorio2 = new javax.swing.JLabel();
        Obligatorio3 = new javax.swing.JLabel();
        Informacion_Personal = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        Obligatorio4 = new javax.swing.JLabel();
        Aviso = new javax.swing.JPanel();
        fecha = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Regresar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Regresar.setText("Regresar\n");

        Registrar.setText("Continuar");

        Primer_Nombre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Primer_Nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Segundo_Nombre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Segundo_Nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Primer_Apellido.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Primer_Apellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Segundo_Apellido.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Segundo_Apellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        dia.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        dia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dia.setText("DD");

        año.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        año.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        año.setText("AAAA");

        mes.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        mes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mes.setText("MM");

        Pais.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Pais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Canada", "Estados Unidos", "Italia ", "Japon", "Venezuela " }));
        Pais.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Pais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaisActionPerformed(evt);
            }
        });

        Genero.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Femenino", "Masculino", "Desconocido", "Otros" }));

        Fecha_Dos.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Fecha_Dos.setText("Fecha");

        Pais_2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Pais_2.setText("Pais");

        primer_apell.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        primer_apell.setText("Primer apellido");

        segundo_apell.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        segundo_apell.setText("Segundo nombre");

        Nombre.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Nombre.setText("Primer nombre");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setText("Segundo nombre");

        genero_.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        genero_.setText("Genero");

        Obligatorio.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Obligatorio.setForeground(new java.awt.Color(255, 0, 51));
        Obligatorio.setText("*");

        Obligatorio1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Obligatorio1.setForeground(new java.awt.Color(255, 0, 51));
        Obligatorio1.setText("*");

        Obligatorio2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Obligatorio2.setForeground(new java.awt.Color(255, 0, 51));
        Obligatorio2.setText("*");

        Obligatorio3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Obligatorio3.setForeground(new java.awt.Color(255, 0, 51));
        Obligatorio3.setText("*");

        Informacion_Personal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Informacion_Personal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Informacion_Personal.setText("Informacion personal");

        Titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Titulo.setText("Registrar usuario");

        Obligatorio4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Obligatorio4.setForeground(new java.awt.Color(255, 0, 51));
        Obligatorio4.setText("*");

        javax.swing.GroupLayout AvisoLayout = new javax.swing.GroupLayout(Aviso);
        Aviso.setLayout(AvisoLayout);
        AvisoLayout.setHorizontalGroup(
            AvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );
        AvisoLayout.setVerticalGroup(
            AvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(Genero, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(Nombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Titulo)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Obligatorio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Informacion_Personal))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155)
                        .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(genero_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Obligatorio3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Primer_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Primer_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(primer_apell)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Obligatorio1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(Fecha_Dos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Obligatorio2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Pais, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Segundo_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Segundo_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(segundo_apell)
                                    .addComponent(jLabel3)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(Pais_2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Obligatorio4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(221, 221, 221)
                        .addComponent(Aviso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(514, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(Titulo)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Obligatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Nombre)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Informacion_Personal)
                                .addGap(31, 31, 31)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Primer_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Segundo_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Obligatorio1)
                                .addComponent(segundo_apell))
                            .addComponent(primer_apell, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Primer_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Segundo_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Fecha_Dos)
                                    .addGap(1, 1, 1))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Obligatorio2)
                                    .addComponent(Pais_2)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Obligatorio4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pais, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(Aviso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genero_)
                    .addComponent(Obligatorio3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Genero, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(115, 115, 115)
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PaisActionPerformed

    private void fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaActionPerformed

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
            java.util.logging.Logger.getLogger(Registrar_Usuario_Dos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar_Usuario_Dos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar_Usuario_Dos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar_Usuario_Dos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar_Usuario_Dos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel Aviso;
    private javax.swing.JLabel Fecha_Dos;
    public javax.swing.JComboBox<String> Genero;
    private javax.swing.JLabel Informacion_Personal;
    private javax.swing.JLabel Nombre;
    public javax.swing.JLabel Obligatorio;
    public javax.swing.JLabel Obligatorio1;
    public javax.swing.JLabel Obligatorio2;
    public javax.swing.JLabel Obligatorio3;
    private javax.swing.JLabel Obligatorio4;
    public javax.swing.JComboBox<String> Pais;
    private javax.swing.JLabel Pais_2;
    public javax.swing.JTextField Primer_Apellido;
    public javax.swing.JTextField Primer_Nombre;
    public javax.swing.JButton Registrar;
    public javax.swing.JButton Regresar;
    public javax.swing.JTextField Segundo_Apellido;
    public javax.swing.JTextField Segundo_Nombre;
    private javax.swing.JLabel Titulo;
    public javax.swing.JTextField año;
    public javax.swing.JTextField dia;
    public javax.swing.JTextField fecha;
    private javax.swing.JLabel genero_;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JTextField mes;
    private javax.swing.JLabel primer_apell;
    private javax.swing.JLabel segundo_apell;
    // End of variables declaration//GEN-END:variables

    public JTextField getFecha() {
        return fecha;
    }
}
