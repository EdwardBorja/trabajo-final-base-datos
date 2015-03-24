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
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author edward
 */
public class Estudiantes extends javax.swing.JFrame {
 
    private String Tipo = "";
    private Clip clip;
    private String path="/Audio/";
    
    /**
     * Creates new form Estudiantes
     */
    public Estudiantes() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
        
        actualizar();
    }

  
    
    public void actualizar(){
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
                Logger.getLogger(Estudiantes.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(Estudiantes.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Estudiantes.class.getName()).log(Level.SEVERE, null, ex);
            }
            //establece los valores de conexion.
            con = DriverManager.getConnection(url,usuario,contraseña);
            if ( con != null )
            System.out.println("Se ha establecido una conexión a la base de datos \n " + url );
            //ejecuta la consulta.
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM estudiantes");
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
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        cest = new javax.swing.JTextField();
        nom = new javax.swing.JTextField();
        tel = new javax.swing.JTextField();
        carr = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        turn = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        semester = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Estudiantes");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanas/Iconos/panel-del-menu-de-la-ventana-icono-6573-32 - copia.png"))); // NOI18N
        jButton1.setText("Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanas/Iconos/add.png"))); // NOI18N
        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanas/Iconos/edit.png"))); // NOI18N
        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanas/Iconos/del.png"))); // NOI18N
        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        cest.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cestKeyTyped(evt);
            }
        });

        nom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nomKeyTyped(evt);
            }
        });

        tel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telKeyTyped(evt);
            }
        });

        carr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                carrKeyTyped(evt);
            }
        });

        jLabel2.setText("Nombre:");

        jLabel3.setText("Telefono:");

        jLabel4.setText("Carrera:");

        jLabel1.setText("Codigo estudiante:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanas/Iconos/estudiante.png"))); // NOI18N
        jLabel5.setText("estudiantes");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanas/Iconos/borra.png"))); // NOI18N
        jButton5.setText("Borrar campos");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanas/Iconos/exit.png"))); // NOI18N
        jButton6.setText("Salir");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        turn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                turnKeyTyped(evt);
            }
        });

        jLabel6.setText("Turno:");

        semester.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                semesterKeyTyped(evt);
            }
        });

        jLabel7.setText("Semestre:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(64, 352, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(161, 161, 161)
                                        .addComponent(jLabel5)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3)
                                    .addComponent(tel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cest, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6)
                                    .addComponent(turn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(carr, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nom, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                    .addComponent(semester)
                                    .addComponent(jLabel7))))))
                .addGap(61, 61, 61))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(turn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(semester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

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
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        sonido("mous");
        dispose();
        Menu men1=new Menu();
        men1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if(cest.getText().equals("") || nom.getText().equals("")|| tel.getText().equals("")|| carr.getText().equals("")|| turn.getText().equals("")|| semester.getText().equals("")){JOptionPane.showMessageDialog(null,"Selecciona un elemento de la tabla");
          }else{ 
        
        
        String Nombre,Carrera,Codigoest,Telefono,turno,semestre;

        Codigoest=cest.getText();
        Nombre=nom.getText();
        Telefono=tel.getText();
        Carrera=carr.getText();
        turno=turn.getText();
        semestre=semester.getText();
      
        
        
        Connection con = null;
        Statement  stmt = null;
        ResultSet rs;
        
        try {
            String url = "jdbc:mysql://localhost:3306/sistema";
            String usuario = "root";
            String contrasena = "123";
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
            } catch (InstantiationException ex) {
                Logger.getLogger(Estudiantes.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(Estudiantes.class.getName()).log(Level.SEVERE, null, ex);
            }

            con = DriverManager.getConnection(url,usuario,contrasena);
            if ( con != null )
            System.out.println("Se ha establecido una conexión a la base de datos " +
                "\n " + url );

            //Aqui verifica si existe
           stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM estudiantes WHERE `codigo_estudiante`='" + Codigoest + "' ");
           
            if(!rs.next()){
             
            stmt.executeUpdate("INSERT INTO estudiantes VALUES ( '" + Codigoest + "','" + Nombre + "','" + Telefono + "','" + Carrera + "','" + turno + "','" + semestre + "')");

            sonido("bleep");
            JOptionPane.showMessageDialog(null,"Se agregó la informacion exitosamente");

            
            }else{ JOptionPane.showMessageDialog(null,"ya existe");}
           
            System.out.println("Los valores han sido agregados a la base de datos ");
        }
        catch( SQLException e ) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Estudiantes.class.getName()).log(Level.SEVERE, null, ex);
        }

        finally {
            if ( con != null ) {
                try    {
                    con.close();
                    stmt.close();
                } catch( Exception e ) {
                    System.out.println( e.getMessage());
                }
            }
        }
        cest.setText("");
        nom.setText("");
        tel.setText("");
        carr.setText("");
        turn.setText("");
        semester.setText("");
        
        actualizar();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 
        if( nom.getText().equals("")|| tel.getText().equals("")|| carr.getText().equals("")|| turn.getText().equals("")|| semester.getText().equals("")){JOptionPane.showMessageDialog(null,"Selecciona un elemento de la tabla");
          }else{ 
        
        DefaultTableModel modelo= (DefaultTableModel)jTable1.getModel();
        //Selecciona el valor de la columna 1
        String valor1= String.valueOf(modelo.getValueAt(jTable1.getSelectedRow(),0));
     
        
        
         sonido("error");
         
        int x = JOptionPane.showConfirmDialog(null,"¿Estas seguro de editar?","Confirmar",JOptionPane.YES_NO_OPTION);
        if( x == JOptionPane.YES_OPTION){
            sonido("bleep");
            JOptionPane.showMessageDialog(null,"Se editó exitosamente");
            
            
           
           
            String Nombre,Carrera,Telefono,Codigoest;

            Codigoest=cest.getText();
            Nombre=nom.getText();
            Telefono=tel.getText();
            Carrera=carr.getText();

            Connection con = null;
            Statement  stmt = null;

            try {
                String url = "jdbc:mysql://localhost:3306/sistema";
                String usuario = "root";
                String contrasena = "123";
                try {
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                } catch (InstantiationException ex) {
                    Logger.getLogger(Maestros.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(Maestros.class.getName()).log(Level.SEVERE, null, ex);
                }

                con = DriverManager.getConnection(url,usuario,contrasena);
                if ( con != null )
                System.out.println("Se ha establecido una conexión a la base de datos " +
                    "\n " + url );

                stmt = con.createStatement();
                stmt.executeUpdate("UPDATE estudiantes set `codigo_estudiante`='"+Codigoest+"',`nombre`='"+Nombre+"',`telefono`='"+Telefono+"',`carrera`='"+Carrera+"' WHERE( `codigo_estudiante`='"+valor1+ "')");

                System.out.println("Los valores han sido agregados a la base de datos ");
            }
            catch( SQLException e ) {
                e.printStackTrace();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Maestros.class.getName()).log(Level.SEVERE, null, ex);
            }

            finally {
                if ( con != null ) {
                    try    {
                        con.close();
                        stmt.close();
                    } catch( Exception e ) {
                        System.out.println( e.getMessage());
                    }
                }
            }

            actualizar();
        }
        
        cest.setText("");
        nom.setText("");
        tel.setText("");
        carr.setText("");
        turn.setText("");
        semester.setText("");
        
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         if( nom.getText().equals("")|| tel.getText().equals("")|| carr.getText().equals("")){JOptionPane.showMessageDialog(null,"Selecciona un elemento de la tabla");
          }else{ 
        
        
        DefaultTableModel modelo= (DefaultTableModel)jTable1.getModel();
        //Selecciona el valor de la columna 1
        String valor1= String.valueOf(modelo.getValueAt(jTable1.getSelectedRow(),0));

        sonido("error");

        int x = JOptionPane.showConfirmDialog(null,"¿Estas seguro de eliminar?","Confirmar",JOptionPane.YES_NO_OPTION);
        if( x == JOptionPane.YES_OPTION){
             sonido("bleep");

            Connection con = null;
            Statement  stmt = null;

            try {
                String url = "jdbc:mysql://localhost:3306/sistema";
                String usuario = "root";
                String contrasena = "123";
                try {
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                } catch (InstantiationException ex) {
                    Logger.getLogger(Maestros.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(Maestros.class.getName()).log(Level.SEVERE, null, ex);
                }

                con = DriverManager.getConnection(url,usuario,contrasena);
                if ( con != null )
                System.out.println("Se ha establecido una conexión a la base de datos " +
                    "\n " + url );
                stmt = con.createStatement();

                stmt.executeUpdate("DELETE FROM `estudiantes` WHERE (`codigo_estudiante`='" + valor1 + "')");

            }
            catch( SQLException e ) {
                e.printStackTrace();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Maestros.class.getName()).log(Level.SEVERE, null, ex);
            }

            finally {
                if ( con != null ) {
                    try    {
                        con.close();
                        stmt.close();
                    } catch( Exception e ) {
                        System.out.println( e.getMessage());
                    }
                }
            }
            JOptionPane.showMessageDialog(null,"Se eliminó la informacion exitosamente");
            actualizar();
        }
        cest.setText("");
        nom.setText("");
        tel.setText("");
        carr.setText("");
        turn.setText("");
        semester.setText("");
        
         }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
          if (evt.getKeyCode()==KeyEvent.VK_DELETE){
          DefaultTableModel modelo= (DefaultTableModel)jTable1.getModel();
        //Selecciona el valor de la columna 1
        String valor1= String.valueOf(modelo.getValueAt(jTable1.getSelectedRow(),0));

        sonido("error");

        int x = JOptionPane.showConfirmDialog(null,"¿Estas seguro de eliminar?","Confirmar",JOptionPane.YES_NO_OPTION);
        if( x == JOptionPane.YES_OPTION){
             sonido("bleep");

            Connection con = null;
            Statement  stmt = null;

            try {
                String url = "jdbc:mysql://localhost:3306/sistema";
                String usuario = "root";
                String contrasena = "123";
                try {
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                } catch (InstantiationException ex) {
                    Logger.getLogger(Maestros.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(Maestros.class.getName()).log(Level.SEVERE, null, ex);
                }

                con = DriverManager.getConnection(url,usuario,contrasena);
                if ( con != null )
                System.out.println("Se ha establecido una conexión a la base de datos " +
                    "\n " + url );
                stmt = con.createStatement();

                stmt.executeUpdate("DELETE FROM `estudiantes` WHERE (`codigo_estudiante`='" + valor1 + "')");

            }
            catch( SQLException e ) {
                e.printStackTrace();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Maestros.class.getName()).log(Level.SEVERE, null, ex);
            }

            finally {
                if ( con != null ) {
                    try    {
                        con.close();
                        stmt.close();
                    } catch( Exception e ) {
                        System.out.println( e.getMessage());
                    }
                }
            }
            JOptionPane.showMessageDialog(null,"Se eliminó la informacion exitosamente");
            actualizar();
        }
          }
    }//GEN-LAST:event_jTable1KeyPressed

    //aqui obtiene los valores de la tabla
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
      int row = jTable1.getSelectedRow();
      String id=jTable1.getValueAt(row, 0).toString();
      String nombre=jTable1.getValueAt(row, 1).toString();
      String telefono=jTable1.getValueAt(row, 2).toString();
      String carrera=jTable1.getValueAt(row, 3).toString();
      String turno=jTable1.getValueAt(row, 4).toString();
      String semestre=jTable1.getValueAt(row, 5).toString();
     
      cest.setText(id);
      nom.setText(nombre);
      tel.setText(telefono);
      carr.setText(carrera);
      turn.setText(turno);
      semester.setText(semestre);
      
      
    }//GEN-LAST:event_jTable1MouseClicked

    private void nomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomKeyTyped
         String s1=String.valueOf(evt.getKeyChar());
        
        if(!(s1.matches("[a-z A-Z]"))){
        evt.consume();
        getToolkit().beep();
        }    
    }//GEN-LAST:event_nomKeyTyped

    private void carrKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_carrKeyTyped
          String s1=String.valueOf(evt.getKeyChar());
        
        if(!(s1.matches("[a-z A-Z]"))){
        evt.consume();
        getToolkit().beep();
        }    
    }//GEN-LAST:event_carrKeyTyped

    private void cestKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cestKeyTyped
       String s1=String.valueOf(evt.getKeyChar());
        
        if(!(s1.matches("[0-9]"))){
        evt.consume();
        getToolkit().beep();
        }    
    }//GEN-LAST:event_cestKeyTyped

    private void telKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telKeyTyped
        String s1=String.valueOf(evt.getKeyChar());
        
        if(!(s1.matches("[0-9]"))){
        evt.consume();
        getToolkit().beep();
        }    
    }//GEN-LAST:event_telKeyTyped

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        cest.setText("");
        nom.setText("");
        tel.setText("");
        carr.setText("");
         turn.setText("");
        semester.setText("");
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        sonido("error");
        int x = JOptionPane.showConfirmDialog(null,"¿Deseas salir del programa?","Confirmar",JOptionPane.YES_NO_OPTION);
        if( x == JOptionPane.YES_OPTION){
            sonido("bleep");
            dispose();

        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void turnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_turnKeyTyped
        String s1=String.valueOf(evt.getKeyChar());
        
        if(!(s1.matches("[a-z A-Z]"))){
        evt.consume();
        getToolkit().beep();
        }    
    }//GEN-LAST:event_turnKeyTyped

    private void semesterKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_semesterKeyTyped
        String s1=String.valueOf(evt.getKeyChar());
        
        if(!(s1.matches("[0-9]"))){
        evt.consume();
        getToolkit().beep();
        }    
    }//GEN-LAST:event_semesterKeyTyped

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
            java.util.logging.Logger.getLogger(Estudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estudiantes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField carr;
    private javax.swing.JTextField cest;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField semester;
    private javax.swing.JTextField tel;
    private javax.swing.JTextField turn;
    // End of variables declaration//GEN-END:variables
}
