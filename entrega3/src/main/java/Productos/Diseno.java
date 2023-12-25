package Productos;

import static Productos.Diseno.main;
import main.Main;
import Productos.ProductoImplementacion.Producto;
import static com.sun.jna.Native.main;
import static com.sun.tools.javac.Main.main;
import javax.swing.JOptionPane;
import static main.Main.main;


public class Diseno extends javax.swing.JFrame {
    private final Main mainApp;

    public Diseno(Main mainApp) {
        this.mainApp = mainApp;
        initComponents();
    }

    public Diseno() {
        initComponents();
        this.mainApp = null;
    }

    public void limpiar() {
        idProducto.setText("");
        idCategoria.setText("");
        nombreProducto.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBuscar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        categoria = new javax.swing.JScrollPane();
        idCategoria = new javax.swing.JTextArea();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        idProducto = new javax.swing.JTextArea();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        nombreProducto = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBuscar.setText("Buscar ");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar ");

        btnBorrar.setText("Borrar ");

        btnModificar.setText("Modificar ");

        jTextField1.setText("Nombre Producto");

        idCategoria.setColumns(20);
        idCategoria.setRows(5);
        categoria.setViewportView(idCategoria);

        jTextField2.setText("ID producto");

        idProducto.setColumns(20);
        idProducto.setRows(5);
        jScrollPane2.setViewportView(idProducto);

        jTextField3.setText("Categoria");

        nombreProducto.setColumns(20);
        nombreProducto.setRows(5);
        jScrollPane3.setViewportView(nombreProducto);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(225, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(134, 134, 134)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(90, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(168, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addGap(272, 272, 272)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(272, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(360, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        buscarProducto();
    }                                         

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        agregarProducto();
    }                                          

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        borrarProducto();
    }                                         

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        actualizarProducto();
    }          
     private void buscarProducto() {
int idProductoBuscar = Integer.parseInt(idProducto.getText());
        ProductoImplementacion productoImplementacion = new ProductoImplementacion(mainApp.establecerConexion());
        Producto productoEncontrado = productoImplementacion.buscarProductoPorId(idProductoBuscar);

        if (productoEncontrado != null) {
            nombreProducto.setText(productoEncontrado.getNombre());
            idCategoria.setText(String.valueOf(productoEncontrado.getIdCategoria()));
        } else {
            limpiar();
            JOptionPane.showMessageDialog(this, "Producto no encontrado");
        }
    }
    /*
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

    }//GEN-LAST:event_btnBuscarActionPerformed
*/
     
       private void agregarProducto() {
        String nombre = nombreProducto.getText();
        int idCategoria = Integer.parseInt(idCategoria.getText());
        ProductoImplementacion productoImplementacion = new ProductoImplementacion(mainApp.obtenerConexion());
        Producto nuevoProducto = new Producto(nombre, idCategoria);
        boolean exito = productoImplementacion.agregarProducto(nuevoProducto);

        if (exito) {
            JOptionPane.showMessageDialog(this, "Producto agregado con éxito");
            limpiar();
        } else {
            JOptionPane.showMessageDialog(this, "Error al agregar el producto");
        }
    }
      private void borrarProducto() {
        int idProductoBorrar = Integer.parseInt(idProducto.getText());
        ProductoImplementacion productoImplementacion = new ProductoImplementacion(mainApp.obtenerConexion());
        boolean exito = productoImplementacion.borrarProducto(idProductoBorrar);

        if (exito) {
            JOptionPane.showMessageDialog(this, "Producto borrado con éxito");
            limpiar();
        } else {
            JOptionPane.showMessageDialog(this, "Error al borrar el producto");
        }
    }
          private void actualizarProducto() {
         int idProductoActualizar = Integer.parseInt(idProducto.getText());
        String nuevoNombre = nombreProducto.getText();
        int nuevaIdCategoria = Integer.parseInt(idCategoria.getText());

        ProductoImplementacion productoImplementacion = new ProductoImplementacion(mainApp.obtenerConexion());
        Producto productoActualizado = new Producto(nuevoNombre, nuevaIdCategoria);
        boolean exito = productoImplementacion.actualizarProducto(idProductoActualizar, productoActualizado);

        if (exito) {
            JOptionPane.showMessageDialog(this, "Producto actualizado con éxito");
            limpiar();
        } else {
            JOptionPane.showMessageDialog(this, "Error al actualizar el producto");
        }
    }
   public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            Main mainApp1 = new Main();
            new Diseno(mainApp1).setVisible(true);
        });
    }
   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JScrollPane categoria;
    private javax.swing.JTextArea idCategoria;
    private javax.swing.JTextArea idProducto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextArea nombreProducto;
    // End of variables declaration//GEN-END:variables
}



  

