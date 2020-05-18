/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosa;

import ds.desktop.notify.DesktopNotify;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static proyectosa.Conexion.historial_sesion;
import static proyectosa.Conexion.id_sesion;

/**
 *
 * @author Luis Diaz
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    
    static Connection conexion=null;
    static Statement sentencia;
    static ResultSet resultado;
    static ResultSetMetaData resultadometa;
    
    public login() {
        initComponents();
        setResizable(false);
        setTitle("Inicio de sesión");
        
        usuario.removeAllItems();
        contraseña.setText("");
        error.setVisible(false);
        
        String ruta="jdbc:mysql://localhost:3306/asistente_ventas";
        String user="root";
        String pass="344391";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(ruta,user,pass); 
            sentencia = conexion.createStatement();
            System.out.println("Conectado");
        } catch (Exception e) {
            System.out.println("No conectado \n"+e);
        }
        
        String q = "SELECT usuario FROM users";
        
        try {
            
            resultado = sentencia.executeQuery(q);
            resultadometa = resultado.getMetaData();
            int r=0;
            String str = "";
                while(resultado.next()){
                        str = resultado.getString(1);
                        usuario.addItem(resultado.getString(1));
                    r++;
                }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usuario = new javax.swing.JComboBox<>();
        contraseña = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        error = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(450, 420));
        getContentPane().setLayout(null);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 32, 211));
        jLabel6.setText("Bienvenido");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(170, 80, 112, 20);

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectosa/login.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 0, 70, 80);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectosa/CD.PNG"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 460, 110);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectosa/man-user.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 120, 30, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectosa/house-key.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 190, 40, 40);

        usuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(usuario);
        usuario.setBounds(110, 130, 250, 30);

        contraseña.setText("jPasswordField1");
        getContentPane().add(contraseña);
        contraseña.setBounds(110, 200, 250, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectosa/enter.png"))); // NOI18N
        jButton1.setText("Entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(170, 260, 120, 40);

        error.setBackground(new java.awt.Color(0, 0, 0));
        error.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        error.setForeground(new java.awt.Color(255, 0, 51));
        error.setText("Contraseña incorrecta");
        getContentPane().add(error);
        error.setBounds(150, 340, 160, 20);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(40, 320, 380, 10);

        jLabel5.setBackground(new java.awt.Color(80, 145, 205));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectosa/login_back.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 460, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
        getImage(ClassLoader.getSystemResource("proyectosa/badge.png"));


        return retValue;
    }
    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    @SuppressWarnings("empty-statement")
    public static String user;
//    Icon icono = new ImageIcon(getClass().getResource("login(1).png"));
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        boolean is=false;
        char passArray[] = contraseña.getPassword();
        // Revisar que sean letras y numeros
        for (int i = 0; i < passArray.length; i++) {
            char c = passArray[i];
            // Si no es letra o numero entonces no es valido
            if (!Character.isLetterOrDigit(c)){
                is= false;
            };
        }
        // Convertir el password a String
        String contra = new String(passArray);
        
//        JOptionPane.showMessageDialog(null, "la contraseña es: " +contra);
        if((contra.length()== 0)) { 
            JOptionPane.showMessageDialog(null,"La contraseña no puede estar vacía"); 
        }else{
            String usuarios = usuario.getSelectedItem().toString();
            user=usuarios;
            String cont = contra;
            String us =usuario.getSelectedItem().toString();
            ProyectoSA.usuario_sesion=id_sesion(us);
            
            Connection cn=null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/asistente_ventas","root","344391");
                System.out.println("Conectado");
                String query2= ("SELECT usuario FROM users WHERE usuario='"+usuarios+"' AND contrasena='"+cont+"'");
                Statement log = cn.createStatement();
                ResultSet rs = log.executeQuery(query2);
                if(rs.next()){
//                    Controlador_BD_El_Pepon.usu=usuarios;
//                    String n=Controlador_BD_El_Pepon.usu;
//                    System.out.println("usuario: "+n);
//                    JOptionPane.showMessageDialog(null, "Sesión iniciada","Sucefull"+ icono);
                    DesktopNotify.showDesktopMessage("Sesión iniciada", "Sesión iniciada con éxito", DesktopNotify.SUCCESS, 7000L);
                    historial_sesion(us);
//                    ProyectoSA.usuario_sesion;
                    this.setVisible(false);
                    principal c = new principal();
                    c.setLocationRelativeTo(null);
                    c.setResizable(false);
                    c.setVisible(true);
                }else{
    //                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
//                    jLabel5.setText("Usuario o contraseña incorrectos");
                    error.setVisible(true);
                }
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }   catch (ParseException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
            try {
                cn.close();
            } catch (SQLException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JLabel error;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> usuario;
    // End of variables declaration//GEN-END:variables
}
