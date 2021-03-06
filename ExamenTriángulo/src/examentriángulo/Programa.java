/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examentriángulo;

import javax.swing.JOptionPane;

/**
 *
 * @author ESFOT
 */
public class Programa extends javax.swing.JFrame {

    /**
     * Creates new form Programa
     */
    public Programa() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle ("Calcular: Area y Perímetro de Triangulos");
        
        deshabilitarInformacion ();
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
        cmbTipoTriangulos = new javax.swing.JComboBox<>();
        lblLadoA = new javax.swing.JLabel();
        lblLadoB = new javax.swing.JLabel();
        lblLadoC = new javax.swing.JLabel();
        txtLadoA = new javax.swing.JTextField();
        txtLadoB = new javax.swing.JTextField();
        txtLadoC = new javax.swing.JTextField();
        lblAltura = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPerimetro = new javax.swing.JTextField();
        txtArea = new javax.swing.JTextField();
        btnElegirOtraFigura = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtFigura = new javax.swing.JTextField();
        btnSeleccionarFigura = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Seleccione un tipo de triangulo:");

        cmbTipoTriangulos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rectángulo", "Isósceles", "Escaleno", "Equilátero" }));

        lblLadoA.setText("Lado A:");

        lblLadoB.setText("Lado B:");

        lblLadoC.setText("Lado C:");

        lblAltura.setText("Altura:");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel2.setText("Perímetro :");

        jLabel3.setText("Area:");

        btnElegirOtraFigura.setText("Elegir otra figura");
        btnElegirOtraFigura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElegirOtraFiguraActionPerformed(evt);
            }
        });

        jLabel4.setText("Figura seleccionada:");

        btnSeleccionarFigura.setText("seleccionar");
        btnSeleccionarFigura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarFiguraActionPerformed(evt);
            }
        });

        jLabel5.setText("lado repetido");

        jLabel6.setText("lado repetido");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(btnCalcular))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(47, 47, 47)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnElegirOtraFigura))
                                .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblLadoC)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtLadoC, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblLadoB)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtLadoB, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel6))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbTipoTriangulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnSeleccionarFigura))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblLadoA)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtFigura, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(93, 112, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtLadoA, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(16, 16, 16)
                                                .addComponent(jLabel5)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblAltura)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbTipoTriangulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeleccionarFigura))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFigura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLadoA)
                    .addComponent(txtLadoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAltura)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLadoB)
                    .addComponent(txtLadoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLadoC)
                    .addComponent(txtLadoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCalcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnElegirOtraFigura)
                        .addGap(4, 4, 4)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        double perimetro;
        double area;
        if (cmbTipoTriangulos.getSelectedIndex() == 0){
            String ladoA = txtLadoA.getText();
            String ladoB = txtLadoB.getText();
            if (!ladoA.equals("")&&!ladoB.equals("")){
                double a = Double.parseDouble(ladoA);
                double b = Double.parseDouble(ladoB);
                Rectángulo r1 = new Rectángulo (txtFigura.getText(),a,b);
                perimetro = r1.obtenerPerimetro();
                String periRectangulo = String.valueOf(perimetro);
                txtPerimetro.setText(periRectangulo);
                area = r1.obtenerArea();
                String areaRectangulo = String.valueOf(area);
                txtArea.setText(areaRectangulo);
            }else{
                JOptionPane.showMessageDialog(rootPane,"Debe ingresar todos los campos");
            }

        }else if (cmbTipoTriangulos.getSelectedIndex() == 1){
            /*String lado1Trian = txtLado1.getText();
            String lado2Trian = txtLado2.getText();
            String lado3Trian = txtLado3.getText();
            String baseTrian = txtBase.getText();
            String alturaTrian = txtAltura.getText();
            if (!lado1Trian.equals("")&& !lado2Trian.equals("")&& !lado3Trian.equals("") && !baseTrian.equals("") && !alturaTrian.equals("")){
            double lado1 = Double.parseDouble(lado1Trian);
            double lado2 = Double.parseDouble(lado2Trian);
            double lado3 = Double.parseDouble(lado3Trian);
            double base = Double.parseDouble(baseTrian);
            double altura = Double.parseDouble(alturaTrian);
            Triangulo t1 = new Triangulo (txtFigura.getText(),lado1,lado2,lado3,base,altura);
            perimetro = t1.obtenerPerimetro();
            String periTriangulo = String.valueOf(perimetro);
            txtPerimetro.setText(periTriangulo);
            area = t1.obtenerArea();
            String areaTriangulo = String.valueOf(area);
            txtArea.setText(areaTriangulo);
            }else{
            JOptionPane.showMessageDialog(rootPane,"Debe ingresar todos los campos");
            }*/
        }else if (cmbTipoTriangulos.getSelectedIndex() == 2){
            /*String lado1Rec = txtLado1.getText();
            String lado2Rec = txtLado2.getText();
            if (!lado1Rec.equals("")&& !lado2Rec.equals("")){
            double lado1 = Double.parseDouble(lado1Rec);
            double lado2 = Double.parseDouble(lado2Rec);
            Rectangulo r1 = new Rectangulo (txtFigura.getText(), lado1, lado2);
            perimetro = r1.obtenerPerimetro();
            String periRectangulo = String.valueOf(perimetro);
            txtPerimetro.setText(periRectangulo);
            area = r1.obtenerArea();
            String areaRectangulo = String.valueOf(area);
            txtArea.setText(areaRectangulo);
            
            }else{
            JOptionPane.showMessageDialog(rootPane,"Debe ingresar todos los campos");
            }*/
        }else if (cmbTipoTriangulos.getSelectedIndex() == 3){
            String ladoA = txtLadoA.getText();
            if (!ladoA.equals("")){
                double a = Double.parseDouble(ladoA);
                Equilátero e1 = new Equilátero (txtFigura.getText(), a);
                perimetro = e1.obtenerPerimetro();
                String periEquilatero = String.valueOf(perimetro);
                txtPerimetro.setText(periEquilatero);
                area = e1.obtenerArea();
                String areaEquilatero = String.valueOf(area);
                txtArea.setText(areaEquilatero );

            }else{
                JOptionPane.showMessageDialog(rootPane,"Debe ingresar todos los campos");
            }
        }

    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnElegirOtraFiguraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElegirOtraFiguraActionPerformed
        // TODO add your handling code here:
        btnSeleccionarFigura.setEnabled(true);
        btnCalcular.setEnabled(false);
        cmbTipoTriangulos.setEnabled(true);
        txtLadoA.setEnabled(false);
        txtLadoA.setText("");
        txtLadoB.setEnabled(false);
        txtLadoB.setText("");
        txtLadoC.setEnabled(false);
        txtLadoC.setText("");
        txtAltura.setEnabled(false);
        txtAltura.setText("");
        txtFigura.setEnabled(false);
        txtFigura.setText("");
        txtPerimetro.setEnabled(false);
        txtPerimetro.setText("");
        txtArea.setEnabled(false);
        txtArea.setText("");
        btnElegirOtraFigura.setEnabled(false);
    }//GEN-LAST:event_btnElegirOtraFiguraActionPerformed

    private void btnSeleccionarFiguraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarFiguraActionPerformed
        // TODO add your handling code here:
        btnSeleccionarFigura.setEnabled(false);
        cmbTipoTriangulos.setEnabled(false);
        btnCalcular.setEnabled(true);
        btnElegirOtraFigura.setEnabled(true);
        txtFigura.setEnabled(true);
        txtLadoA.setEnabled(true);
        txtLadoB.setEnabled(true);
        txtLadoC.setEnabled(true);
        //txtAltura.setEnabled(true);
        txtPerimetro.setEnabled(true);
        txtArea.setEnabled(true);
        if (cmbTipoTriangulos.getSelectedIndex() == 0){
            //Cuadrado c1 = new Cuadrado (cmbListaFiguras.getSelectedItem().toString());
            txtLadoC.setEnabled(false);
            txtAltura.setEnabled(false);
            txtFigura.setText(cmbTipoTriangulos.getSelectedItem().toString());
            txtFigura.setEnabled(false);
        }else if (cmbTipoTriangulos.getSelectedIndex() == 1){
            txtLadoC.setEnabled(false);
            txtAltura.setEnabled(false);
            txtFigura.setText(cmbTipoTriangulos.getSelectedItem().toString());
            txtFigura.setEnabled(false);
        }else if (cmbTipoTriangulos.getSelectedIndex() == 2){
            txtAltura.setEnabled(false);
            txtFigura.setText(cmbTipoTriangulos.getSelectedItem().toString());
            txtFigura.setEnabled(false);
        }else if (cmbTipoTriangulos.getSelectedIndex() == 3){
            txtLadoB.setEnabled(false);
            txtLadoC.setEnabled(false);
            txtAltura.setEnabled(false);
            txtFigura.setText(cmbTipoTriangulos.getSelectedItem().toString());
            txtFigura.setEnabled(false);
        }

        //System.out.println(cmbListaFiguras.getSelectedIndex());    //getSelectedItem()
    }//GEN-LAST:event_btnSeleccionarFiguraActionPerformed

    
    private void deshabilitarInformacion (){
        btnCalcular.setEnabled(false);
        btnElegirOtraFigura.setEnabled(false);
        txtFigura.setEnabled(false);
        txtLadoA.setEnabled(false);
        txtLadoB.setEnabled(false);
        txtLadoC.setEnabled(false);
        txtAltura.setEnabled(false);
        txtPerimetro.setEnabled(false);
        txtArea.setEnabled(false);   
}
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
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Programa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnElegirOtraFigura;
    private javax.swing.JButton btnSeleccionarFigura;
    private javax.swing.JComboBox<String> cmbTipoTriangulos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblLadoA;
    private javax.swing.JLabel lblLadoB;
    private javax.swing.JLabel lblLadoC;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtFigura;
    private javax.swing.JTextField txtLadoA;
    private javax.swing.JTextField txtLadoB;
    private javax.swing.JTextField txtLadoC;
    private javax.swing.JTextField txtPerimetro;
    // End of variables declaration//GEN-END:variables
}
