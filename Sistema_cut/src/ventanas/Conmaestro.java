/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ventanas;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ventanas.Maestros.*;

/**
 *
 * @author edward
 */
public class Conmaestro extends javax.swing.JFrame {

      private String Tipo = "";
    private Clip clip;
    private String path="/Audio/";
    
    public Conmaestro() {
       
        initComponents();
       // actualizarmaes();
        
        setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        mater = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        code = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Maestros");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Buscar por materia:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        mater.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                materKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                materKeyTyped(evt);
            }
        });
        getContentPane().add(mater, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 190, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanas/Iconos/LUP.png"))); // NOI18N
        jButton5.setText("Buscar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 96, -1));

        jLabel4.setText("Buscar por codigo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeActionPerformed(evt);
            }
        });
        code.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codeKeyTyped(evt);
            }
        });
        getContentPane().add(code, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 189, -1));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanas/Iconos/LUP.png"))); // NOI18N
        jButton7.setText("Buscar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 95, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanas/Iconos/maestro.png"))); // NOI18N
        jLabel5.setText("Maestros");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomActionPerformed(evt);
            }
        });
        nom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nomKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nomKeyTyped(evt);
            }
        });
        getContentPane().add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 190, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanas/Iconos/LUP.png"))); // NOI18N
        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 96, -1));

        jLabel2.setText("Buscar por nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 680, 350));

        jButton1.setText("Actualizar ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 150, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanas/Iconos/atras.png"))); // NOI18N
        jButton2.setText("Atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, -1, -1));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanas/Iconos/exit.png"))); // NOI18N
        jButton6.setText("Salir");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 430, 110, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void sonido(String value)
    {        
       try
       {
   clip=AudioSystem.getClip();
   clip.open(AudioSystem.getAudioInputStream( getClass().getResourceAsStream( path +  value +".wav" ) ) );
          clip.start();
       }catch(Exception ex){
    System.err.println( ex.getMessage() );
        }
    }
    
    
     public void nombremaestro(){
    String Nombre ;
        
        Nombre=(nom.getText());
       
       
        Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
        ResultSetMetaData metadata= null;

        try{
            //establece el modelo de la tabla.
            DefaultTableModel modelo = new DefaultTableModel();
            this.jTable1.setModel(modelo);
            //conectarse con la base de datos.
            String url = "jdbc:mysql://localhost:3306/sistema";
            String usuario = "root";
            String contraseña = "123";
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
            } catch (InstantiationException ex) {
                Logger.getLogger(Conmaestro.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(Conmaestro.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Conmaestro.class.getName()).log(Level.SEVERE, null, ex);
            }
            //establece los valores de conexion.
            con = DriverManager.getConnection(url,usuario,contraseña);
            if ( con != null )
            System.out.println("Se ha establecido una conexión a la base de datos \n " + url );
            //ejecuta la consulta.
            stmt = con.createStatement();
            // rs = stmt.executeQuery("SELECT  distinct (peliculas.titulo_pelicula ) from peliculas inner join  proyecciones inner join sala where peliculas.num_pelicula = proyecciones.num_pelicula and proyecciones.num_sala =sala.num_sala=1");
          
            
            //busca por nombre
            
           rs = stmt.executeQuery("select distinct(maestros.codigo_maestro),nombre_maestro,materia,horario_inicio,horario_fin from maestros inner join materias where materias.codigo_maestro=maestros.codigo_maestro and maestros.nombre_maestro like '%"+Nombre+"%' ");
            //obtiene informacion de la columnas.
            metadata = rs.getMetaData();
            //cantidad de columnas que tiene la tabla.

            int cantidadColumnas = metadata.getColumnCount();
            //establece el num de columnas
            for (int i = 1; i <= cantidadColumnas; i++) {
                modelo.addColumn(metadata.getColumnLabel(i));
            }while (rs.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i]=rs.getObject(i+1);
                }

                modelo.addRow(fila);
            }rs.close();
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        nom.setText("");
    }
    public void codigomaestro(){
     
        String Codigo ;
        
        Codigo=code.getText();
        
        
        Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
        ResultSetMetaData metadata= null;

        try{
            //establece el modelo de la tabla.
            DefaultTableModel modelo = new DefaultTableModel();
            this.jTable1.setModel(modelo);
            //conectarse con la base de datos.
            String url = "jdbc:mysql://localhost:3306/sistema";
            String usuario = "root";
            String contraseña = "123";
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
            } catch (InstantiationException ex) {
                Logger.getLogger(Conmaestro.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(Conmaestro.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Conmaestro.class.getName()).log(Level.SEVERE, null, ex);
            }
            //establece los valores de conexion.
            con = DriverManager.getConnection(url,usuario,contraseña);
            if ( con != null )
            System.out.println("Se ha establecido una conexión a la base de datos \n " + url );
            //ejecuta la consulta.
            stmt = con.createStatement();
            rs = stmt.executeQuery("select distinct (maestros.codigo_maestro),nombre_maestro,materia,horario_inicio,horario_fin from maestros inner join materias where materias.codigo_maestro=maestros.codigo_maestro and maestros.codigo_maestro like '%"+Codigo+"%'");
            //+ "// WHERE(`nombre`='usuario')");
        //obtiene informacion de la columnas.
        metadata = rs.getMetaData();
        //cantidad de columnas que tiene la tabla.

        int cantidadColumnas = metadata.getColumnCount();
        //establece el num de columnas
        for (int i = 1; i <= cantidadColumnas; i++) {
            modelo.addColumn(metadata.getColumnLabel(i));
        }while (rs.next()) {
            Object[] fila = new Object[cantidadColumnas];
            for (int i = 0; i < cantidadColumnas; i++) {
                fila[i]=rs.getObject(i+1);
            }

            modelo.addRow(fila);
        }rs.close();
        con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } 
        
        code.setText("");
        
    }
     public void actualizarmaes(){
     //ACTUALIZA TA LABLA
        //---------------------------------------------------------------------------
        Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
        ResultSetMetaData metadata= null;

        try{
            //establece el modelo de la tabla.
            DefaultTableModel modelo = new DefaultTableModel();
            this.jTable1.setModel(modelo);
            //conectarse con la base de datos.
            String url = "jdbc:mysql://localhost:3306/sistema";
            String usuario = "root";
            String contraseña = "123";
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
            } catch (InstantiationException ex) {
                Logger.getLogger(Conmaestro.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(Conmaestro.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Conmaestro.class.getName()).log(Level.SEVERE, null, ex);
            }
            //establece los valores de conexion.
            con = DriverManager.getConnection(url,usuario,contraseña);
            if ( con != null )
            System.out.println("Se ha establecido una conexión a la base de datos \n " + url );
            //ejecuta la consulta.
            stmt = con.createStatement();
            rs = stmt.executeQuery("select distinct (maestros.codigo_maestro),nombre_maestro,materia,horario_inicio,horario_fin from maestros inner join materias where materias.codigo_maestro=maestros.codigo_maestro");
            //+ "// WHERE(`nombre`='usuario')");
        //obtiene informacion de la columnas.
        metadata = rs.getMetaData();
        //cantidad de columnas que tiene la tabla.

        int cantidadColumnas = metadata.getColumnCount();
        //establece el num de columnas
        for (int i = 1; i <= cantidadColumnas; i++) {
            modelo.addColumn(metadata.getColumnLabel(i));
        }while (rs.next()) {
            Object[] fila = new Object[cantidadColumnas];
            for (int i = 0; i < cantidadColumnas; i++) {
                fila[i]=rs.getObject(i+1);
            }

            modelo.addRow(fila);
        }rs.close();
        con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } 
    }
      
    public void materiamaestro(){
     
        String Materia ;
        
        Materia=(mater.getText());
        
        
        Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
        ResultSetMetaData metadata= null;

        try{
            //establece el modelo de la tabla.
            DefaultTableModel modelo = new DefaultTableModel();
            this.jTable1.setModel(modelo);
            //conectarse con la base de datos.
            String url = "jdbc:mysql://localhost:3306/sistema";
            String usuario = "root";
            String contraseña = "123";
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
            } catch (InstantiationException ex) {
                Logger.getLogger(Conmaestro.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(Conmaestro.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Conmaestro.class.getName()).log(Level.SEVERE, null, ex);
            }
            //establece los valores de conexion.
            con = DriverManager.getConnection(url,usuario,contraseña);
            if ( con != null )
            System.out.println("Se ha establecido una conexión a la base de datos \n " + url );
            //ejecuta la consulta.
            stmt = con.createStatement();
            rs = stmt.executeQuery("select distinct (maestros.codigo_maestro),nombre_maestro,materia,horario_inicio,horario_fin from maestros inner join materias where materias.codigo_maestro=maestros.codigo_maestro and materias.materia like '%"+Materia+"%'");
            //+ "// WHERE(`nombre`='usuario')");
        //obtiene informacion de la columnas.
        metadata = rs.getMetaData();
        //cantidad de columnas que tiene la tabla.

        int cantidadColumnas = metadata.getColumnCount();
        //establece el num de columnas
        for (int i = 1; i <= cantidadColumnas; i++) {
            modelo.addColumn(metadata.getColumnLabel(i));
        }while (rs.next()) {
            Object[] fila = new Object[cantidadColumnas];
            for (int i = 0; i < cantidadColumnas; i++) {
                fila[i]=rs.getObject(i+1);
            }

            modelo.addRow(fila);
        }rs.close();
        con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } 
        
        mater.setText("");
        
    }
    
    private void nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomActionPerformed

    private void nomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){

            if(nom.getText().equals("")){JOptionPane.showMessageDialog(null,"Campo vacio");
            }else{nombremaestro(); }

        }
    }//GEN-LAST:event_nomKeyPressed

    private void nomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomKeyTyped

        String s1=String.valueOf(evt.getKeyChar());

        if(!(s1.matches("[a-z A-Z]"))){
            evt.consume();
            getToolkit().beep();
        }

    }//GEN-LAST:event_nomKeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        if(nom.getText().equals("")){JOptionPane.showMessageDialog(null,"Campo vacio");
        }else{sonido("mous");  nombremaestro(); }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void materKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_materKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){

            if(mater.getText().equals("")){JOptionPane.showMessageDialog(null,"Campo vacio");
            }else{ materiamaestro(); }

        }
    }//GEN-LAST:event_materKeyPressed

    private void materKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_materKeyTyped
        String s1=String.valueOf(evt.getKeyChar());

        if(!(s1.matches("[a-z A-Z 0-9]"))){
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_materKeyTyped

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        if(mater.getText().equals("")){JOptionPane.showMessageDialog(null,"Campo vacio");
        }else{ sonido("mous");  materiamaestro(); }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codeActionPerformed

    private void codeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codeKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){

            if(code.getText().equals("")){JOptionPane.showMessageDialog(null,"Campo vacio");
            }else{sonido("mous");   codigomaestro();}

        }
    }//GEN-LAST:event_codeKeyPressed

    private void codeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codeKeyTyped
        String s1=String.valueOf(evt.getKeyChar());

        if(!(s1.matches("[0-9]"))){
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_codeKeyTyped

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        if(code.getText().equals("")){JOptionPane.showMessageDialog(null,"Campo vacio");
        }else{sonido("mous");   codigomaestro(); }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       actualizarmaes();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        sonido("mous");
        dispose();
        consulta consult=new consulta();
        consult.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        sonido("error");
        int x = JOptionPane.showConfirmDialog(null,"¿Deseas salir del programa?","Confirmar",JOptionPane.YES_NO_OPTION);
        if( x == JOptionPane.YES_OPTION){
            sonido("bleep");
            dispose();

        }
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Conmaestro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conmaestro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conmaestro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conmaestro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conmaestro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField code;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField mater;
    private javax.swing.JTextField nom;
    // End of variables declaration//GEN-END:variables
}
