
package vista;

import controlador.Controlador_FRM_VentanaBiblioteca;


public class PanelInformacion extends javax.swing.JPanel {

    Controlador_FRM_VentanaBiblioteca controlador;
    
    public PanelInformacion() {
        initComponents();
        inicializarGUI();
      
        
    }
    
    
    public void agregarEventos(Controlador_FRM_VentanaBiblioteca controlador)
    {
        this.controlador=controlador;
    }
   
   public String[] getInformacion()
   {
       String arreglo[] = new String[4];
       arreglo[0]=txtNumeroPrestamo.getText();
       arreglo[1]=txtNombreUsuario.getText();
       arreglo[2]=txtCedulaUsuario.getText();
       arreglo[3]=txtISBN.getText();
       return arreglo;
   }
   
   public String devolverNumeroDePrestamo()
   {
       return txtNumeroPrestamo.getText();
   }
   
   public void mostrarInformacion(String arreglo[])
   {
       this.txtNombreUsuario.setText(arreglo[1]);
       this.txtCedulaUsuario.setText(arreglo[2]);
       this.txtISBN.setText(arreglo[3]);
   }
    
   
   public void inicializarGUI()
   {
       this.txtNumeroPrestamo.setEnabled(true);
       this.txtNumeroPrestamo.setText("");
       
       this.txtNombreUsuario.setEnabled(false);
       this.txtNombreUsuario.setText("");
       
       this.txtCedulaUsuario.setEnabled(false);
       this.txtCedulaUsuario.setText("");
       
       this.txtISBN.setEnabled(false);
       this.txtISBN.setText("");
   }
   
   public void habilitarEdicion()
   {
       this.txtNumeroPrestamo.setEnabled(false);
     
       
       this.txtNombreUsuario.setEnabled(true);
       
       
       this.txtCedulaUsuario.setEnabled(true);
    
       
       this.txtISBN.setEnabled(true);
      
   }
   
  

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNumeroPrestamo = new javax.swing.JTextField();
        txtNombreUsuario = new javax.swing.JTextField();
        txtCedulaUsuario = new javax.swing.JTextField();
        txtISBN = new javax.swing.JTextField();

        jLabel1.setText("Número de préstamo:");

        jLabel2.setText("Nombre del usuario:");

        jLabel3.setText("Cédula del usuario:");

        jLabel4.setText("ISBN del libro:");

        txtNumeroPrestamo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumeroPrestamoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNumeroPrestamo)
                    .addComponent(txtNombreUsuario)
                    .addComponent(txtCedulaUsuario)
                    .addComponent(txtISBN, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtNumeroPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCedulaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroPrestamoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroPrestamoKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()==10)
        {
            controlador.buscar();
        }
    }//GEN-LAST:event_txtNumeroPrestamoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtCedulaUsuario;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtNumeroPrestamo;
    // End of variables declaration//GEN-END:variables
}
