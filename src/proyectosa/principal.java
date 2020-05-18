/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package proyectosa;

import ds.desktop.notify.DesktopNotify;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import java.util.Enumeration;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import javax.swing.table.TableRowSorter;
import static proyectosa.Conexion.ano;
import static proyectosa.Conexion.conectar;
import static proyectosa.Conexion.dia;
import static proyectosa.Conexion.dia_db_abril;
import static proyectosa.Conexion.dia_db_agosto;
import static proyectosa.Conexion.dia_db_diciembre;
import static proyectosa.Conexion.dia_db_enero;
import static proyectosa.Conexion.dia_db_febrero;
import static proyectosa.Conexion.dia_db_julio;
import static proyectosa.Conexion.dia_db_junio;
import static proyectosa.Conexion.dia_db_marzo;
import static proyectosa.Conexion.dia_db_mayo;
import static proyectosa.Conexion.dia_db_noviembre;
import static proyectosa.Conexion.dia_db_octubre;
import static proyectosa.Conexion.dia_db_septiembre;
import static proyectosa.Conexion.dia_db_abril1;
import static proyectosa.Conexion.dia_db_agosto1;
import static proyectosa.Conexion.dia_db_diciembre1;
import static proyectosa.Conexion.dia_db_enero1;
import static proyectosa.Conexion.dia_db_febrero1;
import static proyectosa.Conexion.dia_db_julio1;
import static proyectosa.Conexion.dia_db_junio1;
import static proyectosa.Conexion.dia_db_marzo1;
import static proyectosa.Conexion.dia_db_mayo1;
import static proyectosa.Conexion.dia_db_noviembre1;
import static proyectosa.Conexion.dia_db_octubre1;
import static proyectosa.Conexion.dia_db_septiembre1;
import static proyectosa.Conexion.eliminar_pendiente;
import static proyectosa.Conexion.historial_pendiente_eliminado;
import static proyectosa.Conexion.llenar_pendientes;
import static proyectosa.Conexion.mes;
import static proyectosa.Conexion.mes_db;
import static proyectosa.Conexion.mes_db_default;

/**
 *
 * @author Luis Diaz
 */
public class principal extends javax.swing.JFrame {
static Connection conexion=null;
    static Statement sentencia;
    static ResultSet resultado;
    static ResultSetMetaData resultadometa;
    public principal() throws ParseException, SQLException {
        initComponents();
        setTitle("Sell Assist");
//        addWindowListener( new java.awt.event.WindowAdapter() { public void windowClosing(java.awt.event.WindowEvent e ) { setVisible(false); } } );
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        conectar();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Descripción");
        modelo.addColumn("Fecha");
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        datos=llenar_pendientes();
        for(int i=0;i<datos.size();i++){
            modelo.addRow(datos.get(i));
        }
        pendientes.setModel(modelo);
        dias_table.setVisible(false);
        caledario_pendientes();
        caledario_pendientes_2019();
        dia_actual();
        
    }
    
    public void caledario_pendientes() throws SQLException{
        ArrayList<Object[]> datos = new ArrayList<>();
        datos=dia_db_enero();
        if(datos == null || datos.isEmpty()){
          // el arraylist no tiene valor
        }else{
            colorcalendario formato = new colorcalendario();
            enero.setDefaultRenderer(Integer.class, formato);
        }
        datos.clear();
        eliminar();
        datos=dia_db_febrero();
        if(datos == null || datos.isEmpty()){
          // el arraylist no tiene valor
        }else{
            colorcalendariofebrero formato1 = new colorcalendariofebrero();
            febrero.setDefaultRenderer(Integer.class, formato1);
        }
        datos.clear();
        eliminar();
        
        datos=dia_db_marzo();
        if(datos == null || datos.isEmpty()){
          // el arraylist no tiene valor
        }else{
            colorcalendariomarzo formato2 = new colorcalendariomarzo();
            marzo.setDefaultRenderer(Integer.class, formato2);
        }
        datos.clear();
        eliminar();
        
        datos=dia_db_abril();
        if(datos == null || datos.isEmpty()){
          // el arraylist no tiene valor
        }else{
            colorcalendarioabril formato3 = new colorcalendarioabril();
            abril.setDefaultRenderer(Integer.class, formato3);
        }
        datos.clear();
        eliminar();
        
        datos=dia_db_mayo();
        if(datos == null || datos.isEmpty()){
          // el arraylist no tiene valor
        }else{
            colorcalendariomayo formato4 = new colorcalendariomayo();
            mayo.setDefaultRenderer(Integer.class, formato4);
        }
        datos.clear();
        eliminar();
        
        datos=dia_db_junio();
        if(datos == null || datos.isEmpty()){
          // el arraylist no tiene valor
        }else{
            colorcalendariojunio formato5 = new colorcalendariojunio();
            junio.setDefaultRenderer(Integer.class, formato5);
        }
        datos.clear();
        eliminar();
        
        datos=dia_db_julio();
        if(datos == null || datos.isEmpty()){
          // el arraylist no tiene valor
        }else{
            colorcalendariojulio formato5 = new colorcalendariojulio();
            julio.setDefaultRenderer(Integer.class, formato5);
        }
        datos.clear();
        eliminar();
        
        datos=dia_db_agosto();
        if(datos == null || datos.isEmpty()){
          // el arraylist no tiene valor
        }else{
            colorcalendarioagosto formato7 = new colorcalendarioagosto();
            agosto.setDefaultRenderer(Integer.class, formato7);
        }
        datos.clear();
        eliminar();
        
        
        datos=dia_db_septiembre();
        if(datos == null || datos.isEmpty()){
          // el arraylist no tiene valor
        }else{
            colorcalendarioseptiembre formato8 = new colorcalendarioseptiembre();
            septiembre.setDefaultRenderer(Integer.class, formato8);
        }
        datos.clear();
        eliminar();
        
        datos=dia_db_octubre();
        if(datos == null || datos.isEmpty()){
          // el arraylist no tiene valor
        }else{
            colorcalendariooctubre formato9 = new colorcalendariooctubre();
            octubre.setDefaultRenderer(Integer.class, formato9);
        }
        datos.clear();
        eliminar();
        
        datos=dia_db_noviembre();
        if(datos == null || datos.isEmpty()){
          // el arraylist no tiene valor
        }else{
            colorcalendarionoviembre formato10 = new colorcalendarionoviembre();
            noviembre.setDefaultRenderer(Integer.class, formato10);
        }
        datos.clear();
        eliminar();
        
        datos=dia_db_diciembre();
        if(datos == null || datos.isEmpty()){
          // el arraylist no tiene valor
        }else{
            colorcalendariodiciembre formato11 = new colorcalendariodiciembre();
            diciembre.setDefaultRenderer(Integer.class, formato11);
        }
        datos.clear();
        eliminar();
    }
    
    
    public void caledario_pendientes_2019() throws SQLException{
        ArrayList<Object[]> datos = new ArrayList<>();
        datos=dia_db_enero1();
        if(datos == null || datos.isEmpty()){
          // el arraylist no tiene valor
        }else{
            colorcalendarioenero formato = new colorcalendarioenero();
            enero1.setDefaultRenderer(Integer.class, formato);
        }
        datos.clear();
        eliminar();
        datos=dia_db_febrero1();
        if(datos == null || datos.isEmpty()){
          // el arraylist no tiene valor
        }else{
            colorcalendariofebrero1 formato1 = new colorcalendariofebrero1();
            febrero1.setDefaultRenderer(Integer.class, formato1);
        }
        datos.clear();
        eliminar();
        
        datos=dia_db_marzo1();
        if(datos == null || datos.isEmpty()){
          // el arraylist no tiene valor
        }else{
            colorcalendariomarzo1 formato2 = new colorcalendariomarzo1();
            marzo1.setDefaultRenderer(Integer.class, formato2);
        }
        datos.clear();
        eliminar();
        
        datos=dia_db_abril1();
        if(datos == null || datos.isEmpty()){
          // el arraylist no tiene valor
        }else{
            colorcalendarioabril1 formato3 = new colorcalendarioabril1();
            abril1.setDefaultRenderer(Integer.class, formato3);
        }
        datos.clear();
        eliminar();
        
        datos=dia_db_mayo1();
        if(datos == null || datos.isEmpty()){
          // el arraylist no tiene valor
          System.out.println("Mayo no tiene valor");
        }else{
            colorcalendariomayo1 formato4 = new colorcalendariomayo1();
            mayo1.setDefaultRenderer(Integer.class, formato4);
            System.out.println("Mayo SI tiene valor"+ datos.get(0));
        }
        datos.clear();
        eliminar();
        
        datos=dia_db_junio1();
        if(datos == null || datos.isEmpty()){
          // el arraylist no tiene valor
        }else{
            colorcalendariojunio1 formato5 = new colorcalendariojunio1();
            junio1.setDefaultRenderer(Integer.class, formato5);
        }
        datos.clear();
        eliminar();
        
        datos=dia_db_julio1();
        if(datos == null || datos.isEmpty()){
          // el arraylist no tiene valor
        }else{
            colorcalendariojulio1 formato5 = new colorcalendariojulio1();
            julio1.setDefaultRenderer(Integer.class, formato5);
        }
        datos.clear();
        eliminar();
        
        datos=dia_db_agosto1();
        if(datos == null || datos.isEmpty()){
          // el arraylist no tiene valor
        }else{
            colorcalendarioagosto1 formato7 = new colorcalendarioagosto1();
            agosto1.setDefaultRenderer(Integer.class, formato7);
        }
        datos.clear();
        eliminar();
        
        
        datos=dia_db_septiembre1();
        if(datos == null || datos.isEmpty()){
          // el arraylist no tiene valor
        }else{
            colorcalendarioseptiembre1 formato8 = new colorcalendarioseptiembre1();
            septiembre1.setDefaultRenderer(Integer.class, formato8);
        }
        datos.clear();
        eliminar();
        
        datos=dia_db_octubre1();
        if(datos == null || datos.isEmpty()){
          // el arraylist no tiene valor
        }else{
            colorcalendariooctubre1 formato9 = new colorcalendariooctubre1();
            octubre1.setDefaultRenderer(Integer.class, formato9);
        }
        datos.clear();
        eliminar();
        
        datos=dia_db_noviembre1();
        if(datos == null || datos.isEmpty()){
          // el arraylist no tiene valor
        }else{
            colorcalendarionoviembre1 formato10 = new colorcalendarionoviembre1();
            noviembre1.setDefaultRenderer(Integer.class, formato10);
        }
        datos.clear();
        eliminar();
        
        datos=dia_db_diciembre1();
        if(datos == null || datos.isEmpty()){
          // el arraylist no tiene valor
        }else{
            colorcalendariodiciembre1 formato11 = new colorcalendariodiciembre1();
            diciembre1.setDefaultRenderer(Integer.class, formato11);
        }
        datos.clear();
        eliminar();
    }
    
    
    
    public void eliminar(){
        DefaultTableModel tb = (DefaultTableModel) dias_table.getModel();
        int a = dias_table.getRowCount()-1;
        for (int i = a; i >= 0; i--) {           
            tb.removeRow(tb.getRowCount()-1);
        } 
        //cargaTicket();
    }
    void dia_actual(){
        dia_actual formato = new dia_actual();
        int m=mes();
        System.out.println("El mes es: "+m);
        switch(m){
            case 1:
                enero.setDefaultRenderer(Integer.class, formato);
                break;
            case 2:
                febrero.setDefaultRenderer(Integer.class, formato);
                break;
            case 3:
                marzo.setDefaultRenderer(Integer.class, formato);
                break;
            case 4:
                abril.setDefaultRenderer(Integer.class, formato);
                break;
            case 5:
                mayo.setDefaultRenderer(Integer.class, formato);
                break;
            case 6:
                junio.setDefaultRenderer(Integer.class, formato);
                break;
            case 7:
                julio.setDefaultRenderer(Integer.class, formato);
                break;
            case 8:
                agosto.setDefaultRenderer(Integer.class, formato);
                break;
            case 9:
                septiembre.setDefaultRenderer(Integer.class, formato);
                break;
            case 10:
                octubre.setDefaultRenderer(Integer.class, formato);
                break;
            case 11:
                noviembre.setDefaultRenderer(Integer.class, formato);
                break;
            case 12:
                diciembre.setDefaultRenderer(Integer.class, formato);
                break;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu5 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane25 = new javax.swing.JScrollPane();
        pendientes = new javax.swing.JTable();
        dias_table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        hecho = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        enero = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        febrero = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        marzo = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        junio = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        julio = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        mayo = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        septiembre = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        octubre = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        noviembre = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        abril = new javax.swing.JTable();
        jScrollPane11 = new javax.swing.JScrollPane();
        agosto = new javax.swing.JTable();
        jScrollPane12 = new javax.swing.JScrollPane();
        diciembre = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        enero1 = new javax.swing.JTable();
        jScrollPane15 = new javax.swing.JScrollPane();
        febrero1 = new javax.swing.JTable();
        jScrollPane16 = new javax.swing.JScrollPane();
        marzo1 = new javax.swing.JTable();
        jScrollPane17 = new javax.swing.JScrollPane();
        abril1 = new javax.swing.JTable();
        jScrollPane18 = new javax.swing.JScrollPane();
        mayo1 = new javax.swing.JTable();
        jScrollPane19 = new javax.swing.JScrollPane();
        junio1 = new javax.swing.JTable();
        jScrollPane20 = new javax.swing.JScrollPane();
        julio1 = new javax.swing.JTable();
        jScrollPane21 = new javax.swing.JScrollPane();
        agosto1 = new javax.swing.JTable();
        jScrollPane22 = new javax.swing.JScrollPane();
        septiembre1 = new javax.swing.JTable();
        jScrollPane23 = new javax.swing.JScrollPane();
        octubre1 = new javax.swing.JTable();
        jScrollPane24 = new javax.swing.JScrollPane();
        noviembre1 = new javax.swing.JTable();
        jScrollPane26 = new javax.swing.JScrollPane();
        diciembre1 = new javax.swing.JTable();
        jLabel28 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();

        jMenu5.setText("jMenu5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(1344, 769));
        getContentPane().setLayout(null);

        pendientes.setForeground(new java.awt.Color(0, 0, 0));
        pendientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane25.setViewportView(pendientes);

        dias_table.setModel(new javax.swing.table.DefaultTableModel(
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane25, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dias_table, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(dias_table, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(9, 109, 480, 540);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectosa/to-do.png"))); // NOI18N
        jButton1.setText("Nuevo pendiente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 670, 170, 40);

        hecho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectosa/checked (1).png"))); // NOI18N
        hecho.setText("Marcar como hecho");
        hecho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hechoActionPerformed(evt);
            }
        });
        getContentPane().add(hecho);
        hecho.setBounds(190, 670, 180, 40);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 52, 246));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 660, 1320, 10);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Descripción", "Fecha" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(10, 70, 160, 26);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(180, 70, 310, 24);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 123, 236));
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(10, 40, 480, 10);

        jTabbedPane1.setBackground(new java.awt.Color(200, 207, 227));
        jTabbedPane1.setForeground(new java.awt.Color(102, 102, 102));

        enero.setForeground(new java.awt.Color(0, 0, 0));
        enero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {1, 2, 3, 4, 5, 6, 7},
                {8, 9, 10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19, 20, 21},
                {22, 23, 24, 25, 26, 27, 28},
                {29, 30, 31}
            },
            new String [] {
                "Lun", "Mar", "Mié", "Jue", "Vie", "Sáb", "Dom"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enero);

        febrero.setForeground(new java.awt.Color(0, 0, 0));
        febrero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, 1, 2, 3, 4},
                {5, 6, 7, 8, 9, 10, 11},
                {12, 13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24, 25},
                {26, 27, 28, null, null, null, null}
            },
            new String [] {
                "Lun", "Mar", "Mié", "Jue", "Vie", "Sáb", "Dom"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(febrero);
        if (febrero.getColumnModel().getColumnCount() > 0) {
            febrero.getColumnModel().getColumn(0).setResizable(false);
            febrero.getColumnModel().getColumn(1).setResizable(false);
            febrero.getColumnModel().getColumn(2).setResizable(false);
            febrero.getColumnModel().getColumn(3).setResizable(false);
            febrero.getColumnModel().getColumn(4).setResizable(false);
            febrero.getColumnModel().getColumn(5).setResizable(false);
            febrero.getColumnModel().getColumn(6).setResizable(false);
        }

        marzo.setForeground(new java.awt.Color(0, 0, 0));
        marzo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, 1, 2, 3, 4},
                {5, 6, 7, 8, 9, 10, 11},
                {12, 13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24, 25},
                {26, 27, 28, 29, 30, 31, null}
            },
            new String [] {
                "Lun", "Mar", "Mié", "Jue", "Vie", "Sáb", "Dom"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(marzo);
        if (marzo.getColumnModel().getColumnCount() > 0) {
            marzo.getColumnModel().getColumn(0).setResizable(false);
            marzo.getColumnModel().getColumn(1).setResizable(false);
            marzo.getColumnModel().getColumn(2).setResizable(false);
            marzo.getColumnModel().getColumn(3).setResizable(false);
            marzo.getColumnModel().getColumn(4).setResizable(false);
            marzo.getColumnModel().getColumn(5).setResizable(false);
            marzo.getColumnModel().getColumn(6).setResizable(false);
        }

        junio.setForeground(new java.awt.Color(0, 0, 0));
        junio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, 1, 2, 3},
                {4, 5, 6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15, 16, 17},
                {18, 19, 20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29, 30, null}
            },
            new String [] {
                "Lun", "Mar", "Mié", "Jue", "Vie", "Sáb", "Dom"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(junio);
        if (junio.getColumnModel().getColumnCount() > 0) {
            junio.getColumnModel().getColumn(0).setResizable(false);
            junio.getColumnModel().getColumn(1).setResizable(false);
            junio.getColumnModel().getColumn(2).setResizable(false);
            junio.getColumnModel().getColumn(3).setResizable(false);
            junio.getColumnModel().getColumn(4).setResizable(false);
            junio.getColumnModel().getColumn(5).setResizable(false);
            junio.getColumnModel().getColumn(6).setResizable(false);
        }

        julio.setForeground(new java.awt.Color(0, 0, 0));
        julio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, 1},
                {2, 3, 4, 5, 6, 7, 8},
                {9, 10, 11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20, 21, 22},
                {23, 24, 25, 26, 27, 28, 29},
                {30, 31, null, null, null, null, null}
            },
            new String [] {
                "Lun", "Mar", "Mié", "Jue", "Vie", "Sáb", "Dom"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(julio);
        if (julio.getColumnModel().getColumnCount() > 0) {
            julio.getColumnModel().getColumn(0).setResizable(false);
            julio.getColumnModel().getColumn(1).setResizable(false);
            julio.getColumnModel().getColumn(2).setResizable(false);
            julio.getColumnModel().getColumn(3).setResizable(false);
            julio.getColumnModel().getColumn(4).setResizable(false);
            julio.getColumnModel().getColumn(5).setResizable(false);
            julio.getColumnModel().getColumn(6).setResizable(false);
        }

        mayo.setForeground(new java.awt.Color(0, 0, 0));
        mayo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, 1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12, 13},
                {14, 15, 16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25, 26, 27},
                {28, 29, 30, 31, null, null, null}
            },
            new String [] {
                "Lun", "Mar", "Mié", "Jue", "Vie", "Sáb", "Dom"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(mayo);
        if (mayo.getColumnModel().getColumnCount() > 0) {
            mayo.getColumnModel().getColumn(0).setResizable(false);
            mayo.getColumnModel().getColumn(1).setResizable(false);
            mayo.getColumnModel().getColumn(2).setResizable(false);
            mayo.getColumnModel().getColumn(5).setResizable(false);
            mayo.getColumnModel().getColumn(6).setResizable(false);
        }

        septiembre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, 1, 2},
                {3, 4, 5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14, 15, 16},
                {17, 18, 19, 20, 21, 22, 23},
                {24, 25, 26, 27, 28, 29, 30}
            },
            new String [] {
                "Lun", "Mar", "Mié", "Jue", "Vie", "Sáb", "Dom"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(septiembre);

        octubre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {1, 2, 3, 4, 5, 6, 7},
                {8, 9, 10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19, 20, 21},
                {22, 23, 24, 25, 26, 27, 28},
                {29, 30, 31, null, null, null, null}
            },
            new String [] {
                "Lun", "Mar", "Mié", "Jue", "Vie", "Sáb", "Dom"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(octubre);
        if (octubre.getColumnModel().getColumnCount() > 0) {
            octubre.getColumnModel().getColumn(0).setResizable(false);
            octubre.getColumnModel().getColumn(1).setResizable(false);
            octubre.getColumnModel().getColumn(2).setResizable(false);
            octubre.getColumnModel().getColumn(3).setResizable(false);
            octubre.getColumnModel().getColumn(4).setResizable(false);
            octubre.getColumnModel().getColumn(6).setResizable(false);
        }

        noviembre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, 1, 2, 3, 4},
                {5, 6, 7, 8, 9, 10, 11},
                {12, 13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24, 25},
                {26, 27, 28, 29, 30, null, null}
            },
            new String [] {
                "Lun", "Mar", "Mié", "Jue", "Vie", "Sáb", "Dom"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(noviembre);
        if (noviembre.getColumnModel().getColumnCount() > 0) {
            noviembre.getColumnModel().getColumn(0).setResizable(false);
            noviembre.getColumnModel().getColumn(1).setResizable(false);
            noviembre.getColumnModel().getColumn(2).setResizable(false);
            noviembre.getColumnModel().getColumn(3).setResizable(false);
            noviembre.getColumnModel().getColumn(4).setResizable(false);
            noviembre.getColumnModel().getColumn(6).setResizable(false);
        }

        abril.setForeground(new java.awt.Color(0, 0, 0));
        abril.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, 1},
                {2, 3, 4, 5, 6, 7, 8},
                {9, 10, 11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20, 21, 22},
                {23, 24, 25, 26, 27, 28, 29},
                {30, null, null, null, null, null, null}
            },
            new String [] {
                "Lun", "Mar", "Mié", "Jue", "Vie", "Sáb", "Dom"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane10.setViewportView(abril);
        if (abril.getColumnModel().getColumnCount() > 0) {
            abril.getColumnModel().getColumn(0).setResizable(false);
            abril.getColumnModel().getColumn(1).setResizable(false);
            abril.getColumnModel().getColumn(2).setResizable(false);
            abril.getColumnModel().getColumn(3).setResizable(false);
            abril.getColumnModel().getColumn(4).setResizable(false);
            abril.getColumnModel().getColumn(6).setResizable(false);
        }

        agosto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, 1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18, 19},
                {20, 21, 22, 23, 24, 25, 26},
                {27, 28, 29, 30, 31, null, null}
            },
            new String [] {
                "Lun", "Mar", "Mie", "Jue", "Vie", "Sáb", "Dom"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane11.setViewportView(agosto);
        if (agosto.getColumnModel().getColumnCount() > 0) {
            agosto.getColumnModel().getColumn(0).setResizable(false);
            agosto.getColumnModel().getColumn(1).setResizable(false);
            agosto.getColumnModel().getColumn(2).setResizable(false);
            agosto.getColumnModel().getColumn(3).setResizable(false);
            agosto.getColumnModel().getColumn(4).setResizable(false);
            agosto.getColumnModel().getColumn(5).setResizable(false);
            agosto.getColumnModel().getColumn(6).setResizable(false);
        }

        diciembre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, 1, 2},
                {3, 4, 5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14, 15, 16},
                {17, 18, 19, 20, 21, 22, 23},
                {24, 25, 26, 27, 28, 29, 30},
                {31, null, null, null, null, null, null}
            },
            new String [] {
                "Lun", "Mar", "Mié", "Juev", "Vie", "Sáb", "Dom"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane12.setViewportView(diciembre);
        if (diciembre.getColumnModel().getColumnCount() > 0) {
            diciembre.getColumnModel().getColumn(0).setResizable(false);
            diciembre.getColumnModel().getColumn(1).setResizable(false);
            diciembre.getColumnModel().getColumn(2).setResizable(false);
            diciembre.getColumnModel().getColumn(3).setResizable(false);
            diciembre.getColumnModel().getColumn(4).setResizable(false);
            diciembre.getColumnModel().getColumn(5).setResizable(false);
            diciembre.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel2.setText("Enero");

        jLabel3.setText("Febrero");

        jLabel4.setText("Marzo");

        jLabel5.setText("Mayo");

        jLabel6.setText("Septiembre");

        jLabel7.setText("Abril");

        jLabel8.setText("Junio");

        jLabel9.setText("Julio");

        jLabel10.setText("Agosto");

        jLabel11.setText("Octubre");

        jLabel12.setText("Noviembre");

        jLabel13.setText("Diciembre");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(jLabel2))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(122, 122, 122))))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(105, 105, 105)
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12)
                                    .addGap(110, 110, 110)))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(102, 102, 102)
                                    .addComponent(jLabel13))))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(120, 120, 120)
                                    .addComponent(jLabel7))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(117, 117, 117)
                                    .addComponent(jLabel9))
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGap(110, 110, 110)
                                            .addComponent(jLabel10))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGap(117, 117, 117)
                                            .addComponent(jLabel5))
                                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGap(123, 123, 123)
                                            .addComponent(jLabel8))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGap(107, 107, 107)
                                            .addComponent(jLabel6))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGap(146, 146, 146)))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel6))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(159, 159, 159))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33))))
        );

        jTabbedPane1.addTab("2018", jPanel3);

        jLabel17.setText("Enero");

        jLabel18.setText("Febrero");

        jLabel19.setText("Marzo");

        jLabel20.setText("Abril");

        jLabel21.setText("Mayo");

        jLabel22.setText("Junio");

        jLabel23.setText("Julio");

        jLabel24.setText("Agosto");

        jLabel25.setText("Septiembre");

        jLabel26.setText("Octubre");

        jLabel27.setText("Noviembre");

        enero1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, 1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12, 13},
                {14, 15, 16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25, 26, 27},
                {28, 29, 30, 31, null, null, null}
            },
            new String [] {
                "Lun", "Mar", "Mie", "Jue", "Vie", "Sab", "Dom"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane14.setViewportView(enero1);
        if (enero1.getColumnModel().getColumnCount() > 0) {
            enero1.getColumnModel().getColumn(0).setResizable(false);
            enero1.getColumnModel().getColumn(1).setResizable(false);
            enero1.getColumnModel().getColumn(2).setResizable(false);
            enero1.getColumnModel().getColumn(3).setResizable(false);
            enero1.getColumnModel().getColumn(4).setResizable(false);
            enero1.getColumnModel().getColumn(6).setResizable(false);
        }

        febrero1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, 1, 2, 3},
                {4, 5, 6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15, 16, 17},
                {18, 19, 20, 21, 22, 23, 24},
                {25, 26, 27, 28, null, null, null}
            },
            new String [] {
                "Lun", "Mar", "Mié", "Jue", "Vie", "Sáb", "Dom"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane15.setViewportView(febrero1);
        if (febrero1.getColumnModel().getColumnCount() > 0) {
            febrero1.getColumnModel().getColumn(0).setResizable(false);
            febrero1.getColumnModel().getColumn(1).setResizable(false);
            febrero1.getColumnModel().getColumn(2).setResizable(false);
            febrero1.getColumnModel().getColumn(4).setResizable(false);
            febrero1.getColumnModel().getColumn(6).setResizable(false);
        }

        marzo1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, 1, 2, 3},
                {4, 5, 6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15, 16, 17},
                {18, 19, 20, 21, 22, 23, 24},
                {25, 26, 27,28, 29, 30, 31}
            },
            new String [] {
                "Lun", "Mar", "Mié", "Jue", "Vie", "Sáb", "Dom"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane16.setViewportView(marzo1);
        if (marzo1.getColumnModel().getColumnCount() > 0) {
            marzo1.getColumnModel().getColumn(0).setResizable(false);
            marzo1.getColumnModel().getColumn(1).setResizable(false);
            marzo1.getColumnModel().getColumn(2).setResizable(false);
            marzo1.getColumnModel().getColumn(3).setResizable(false);
            marzo1.getColumnModel().getColumn(4).setResizable(false);
            marzo1.getColumnModel().getColumn(6).setResizable(false);
        }

        abril1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {1, 2, 3, 4, 5, 6, 7},
                {8, 9, 10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19, 20, 21},
                {22, 23, 24, 25, 26, 27, 28},
                {29, 30, null, null, null, null, null}
            },
            new String [] {
                "Lun", "Mar", "Mié", "Jue", "Vie", "Sáb", "Dom"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane17.setViewportView(abril1);
        if (abril1.getColumnModel().getColumnCount() > 0) {
            abril1.getColumnModel().getColumn(0).setResizable(false);
            abril1.getColumnModel().getColumn(1).setResizable(false);
            abril1.getColumnModel().getColumn(2).setResizable(false);
            abril1.getColumnModel().getColumn(3).setResizable(false);
            abril1.getColumnModel().getColumn(4).setResizable(false);
            abril1.getColumnModel().getColumn(5).setResizable(false);
            abril1.getColumnModel().getColumn(6).setResizable(false);
        }

        mayo1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, 1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18, 19},
                {20, 21, 22, 23, 24, 25, 26},
                {27, 28, 29, 30, 31, null, null}
            },
            new String [] {
                "Lun", "Mar", "Mié", "Jue", "Vie", "Sáb", "Dom"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane18.setViewportView(mayo1);
        if (mayo1.getColumnModel().getColumnCount() > 0) {
            mayo1.getColumnModel().getColumn(0).setResizable(false);
            mayo1.getColumnModel().getColumn(1).setResizable(false);
            mayo1.getColumnModel().getColumn(2).setResizable(false);
            mayo1.getColumnModel().getColumn(3).setResizable(false);
            mayo1.getColumnModel().getColumn(4).setResizable(false);
            mayo1.getColumnModel().getColumn(6).setResizable(false);
        }

        junio1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, 1, 2},
                {3, 4, 5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14, 15, 16},
                {17, 18, 19, 20, 21, 22, 23},
                {24, 25, 26, 27, 28, 29, 30}
            },
            new String [] {
                "Lun", "Mar", "Mié", "Jue", "Vie", "Sáb", "Dom"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane19.setViewportView(junio1);
        if (junio1.getColumnModel().getColumnCount() > 0) {
            junio1.getColumnModel().getColumn(0).setResizable(false);
            junio1.getColumnModel().getColumn(1).setResizable(false);
            junio1.getColumnModel().getColumn(2).setResizable(false);
            junio1.getColumnModel().getColumn(3).setResizable(false);
            junio1.getColumnModel().getColumn(4).setResizable(false);
            junio1.getColumnModel().getColumn(5).setResizable(false);
            junio1.getColumnModel().getColumn(6).setResizable(false);
        }

        julio1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {1, 2, 3, 4, 5, 6, 7},
                {8, 9, 10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19, 20, 21},
                {22, 23, 24, 25, 26, 27, 28},
                {29, 30, 31, null, null, null, null}
            },
            new String [] {
                "Lun", "Mar", "Mié", "Jue", "Vie", "Sáb", "Dom"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane20.setViewportView(julio1);
        if (julio1.getColumnModel().getColumnCount() > 0) {
            julio1.getColumnModel().getColumn(0).setResizable(false);
            julio1.getColumnModel().getColumn(1).setResizable(false);
            julio1.getColumnModel().getColumn(2).setResizable(false);
            julio1.getColumnModel().getColumn(3).setResizable(false);
            julio1.getColumnModel().getColumn(4).setResizable(false);
            julio1.getColumnModel().getColumn(6).setResizable(false);
        }

        agosto1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, 1, 2, 3, 4},
                {5, 6, 7, 8, 9, 10, 11},
                {12, 13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24, 25},
                {26, 27, 28, 29, 30, 31, null}
            },
            new String [] {
                "Lun", "Mar", "Mié", "Jue", "Vie", "Sáb", "Dom"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane21.setViewportView(agosto1);
        if (agosto1.getColumnModel().getColumnCount() > 0) {
            agosto1.getColumnModel().getColumn(0).setResizable(false);
            agosto1.getColumnModel().getColumn(1).setResizable(false);
            agosto1.getColumnModel().getColumn(2).setResizable(false);
            agosto1.getColumnModel().getColumn(3).setResizable(false);
            agosto1.getColumnModel().getColumn(4).setResizable(false);
            agosto1.getColumnModel().getColumn(5).setResizable(false);
            agosto1.getColumnModel().getColumn(6).setResizable(false);
        }

        septiembre1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, 1},
                {2, 3, 4, 5, 6, 7, 8},
                {9, 10, 11,12, 13, 14, 15},
                {16, 17, 18, 19, 20, 21, 22},
                {23, 24, 25, 26, 27,28, 29},
                {30, null, null, null, null, null, null}
            },
            new String [] {
                "Lun", "Mar", "Mié", "Jue", "Vie", "Sáb", "Dom"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane22.setViewportView(septiembre1);
        if (septiembre1.getColumnModel().getColumnCount() > 0) {
            septiembre1.getColumnModel().getColumn(0).setResizable(false);
            septiembre1.getColumnModel().getColumn(1).setResizable(false);
            septiembre1.getColumnModel().getColumn(2).setResizable(false);
            septiembre1.getColumnModel().getColumn(3).setResizable(false);
            septiembre1.getColumnModel().getColumn(4).setResizable(false);
            septiembre1.getColumnModel().getColumn(5).setResizable(false);
            septiembre1.getColumnModel().getColumn(6).setResizable(false);
        }

        octubre1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, 1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12, 13},
                {14, 15, 16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25, 26, 27},
                {28, 29, 30, 31, null, null, null}
            },
            new String [] {
                "Lun", "Mar", "Mié", "Jue", "Vie", "Sáb", "Dom"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane23.setViewportView(octubre1);
        if (octubre1.getColumnModel().getColumnCount() > 0) {
            octubre1.getColumnModel().getColumn(0).setResizable(false);
            octubre1.getColumnModel().getColumn(1).setResizable(false);
            octubre1.getColumnModel().getColumn(2).setResizable(false);
            octubre1.getColumnModel().getColumn(3).setResizable(false);
            octubre1.getColumnModel().getColumn(4).setResizable(false);
            octubre1.getColumnModel().getColumn(6).setResizable(false);
        }

        noviembre1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, 1, 2, 3},
                {4, 5, 6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15, 16, 17},
                {18, 19, 20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29, 30, null}
            },
            new String [] {
                "Lun", "Mar", "Mié", "Jue", "Vie", "Sáb", "Dom"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane24.setViewportView(noviembre1);
        if (noviembre1.getColumnModel().getColumnCount() > 0) {
            noviembre1.getColumnModel().getColumn(0).setResizable(false);
            noviembre1.getColumnModel().getColumn(1).setResizable(false);
            noviembre1.getColumnModel().getColumn(2).setResizable(false);
            noviembre1.getColumnModel().getColumn(3).setResizable(false);
            noviembre1.getColumnModel().getColumn(4).setResizable(false);
            noviembre1.getColumnModel().getColumn(6).setResizable(false);
        }

        diciembre1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, 1},
                {2, 3, 4, 5, 6, 7, 8},
                {9, 10, 11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20, 21, 22},
                {23, 24, 25, 26, 27, 28, 29},
                {30, 31, null, null, null, null, null}
            },
            new String [] {
                "Lun", "Mar", "Mié", "Jue", "Vie", "Sáb", "Dom"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane26.setViewportView(diciembre1);
        if (diciembre1.getColumnModel().getColumnCount() > 0) {
            diciembre1.getColumnModel().getColumn(0).setResizable(false);
            diciembre1.getColumnModel().getColumn(1).setResizable(false);
            diciembre1.getColumnModel().getColumn(2).setResizable(false);
            diciembre1.getColumnModel().getColumn(3).setResizable(false);
            diciembre1.getColumnModel().getColumn(4).setResizable(false);
            diciembre1.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel28.setText("Diciembre");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel26)
                        .addGap(224, 224, 224)
                        .addComponent(jLabel27)
                        .addGap(214, 214, 214)
                        .addComponent(jLabel28)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel23)
                        .addGap(241, 241, 241)
                        .addComponent(jLabel24)
                        .addGap(227, 227, 227)
                        .addComponent(jLabel25))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel17)
                .addGap(235, 235, 235)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(243, 243, 243))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel20)
                .addGap(249, 249, 249)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(244, 244, 244))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(jLabel19))
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel21))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel22)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addGap(6, 6, 6)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jLabel26)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(jScrollPane26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 31, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("2019", jPanel4);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(500, 20, 830, 629);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectosa/sim.PNG"))); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(500, 670, 250, 40);

        jLabel15.setText("Buscar:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(10, 50, 44, 16);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setText("Pendientes");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 10, 84, 23);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectosa/refresh.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(1290, 670, 40, 40);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectosa/362061.jpg"))); // NOI18N
        jLabel14.setText("jLabel14");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(0, 0, 1350, 740);
        getContentPane().add(jSeparator6);
        jSeparator6.setBounds(0, 0, 0, 2);

        jMenuBar1.setBackground(new java.awt.Color(35, 119, 245));
        jMenuBar1.setForeground(new java.awt.Color(0, 0, 0));

        jMenu1.setText("Archivo");
        jMenu1.add(jSeparator7);

        jMenuItem1.setText("Restaurar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Usuarios");

        jMenuItem5.setText("Eliminar usuario");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);
        jMenu2.add(jSeparator4);

        jMenuItem6.setText("Crear usuario");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Acciones");

        jMenuItem4.setText("Correo electrónico");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);
        jMenu4.add(jSeparator5);

        jMenuItem7.setText("Registrar Clientes");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuItem8.setText("Consultar Clientes");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Recursos");

        jMenuItem9.setText("Paquetes");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuBar1.add(jMenu3);

        jMenu6.setText("Reportes");

        jMenuItem10.setText("Generación de reportes");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem10);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
        getImage(ClassLoader.getSystemResource("proyectosa/badge.png"));


        return retValue;
    }
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        e_mail e = new e_mail();
        e.setResizable(false);
        e.setVisible(true);
        e.setLocationRelativeTo(null);
        e.setTitle("E-mail");
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        registro_clientes t = new registro_clientes();
        t.setResizable(false);
        t.setVisible(true);
        t.setLocationRelativeTo(null);
        t.setTitle("Nuevo cliente");
        
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        consulta_clientes t = new consulta_clientes();
        t.setResizable(false);
        t.setVisible(true);
        t.setLocationRelativeTo(null);
        t.setTitle("Consulta de clientes");
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        conectar();
        pendiente p = new pendiente();
        p.setResizable(false);
        p.setVisible(true);
        p.setLocationRelativeTo(null);
        p.setTitle("Nuevo pendiente");
    try {
        caledario_pendientes();
    } catch (SQLException ex) {
        Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        recursos r = new recursos();
        r.setResizable(false);
        r.setVisible(true);
        r.setLocationRelativeTo(null);
        r.setTitle("Paquetes");
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        eliminar_usuarios p = new eliminar_usuarios();
        p.setResizable(false);
        p.setVisible(true);
        p.setLocationRelativeTo(null);
        p.setTitle("Eliminar Usuarios");
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        añadir_usuarios p = new añadir_usuarios();
        p.setResizable(false);
        p.setVisible(true);
        p.setLocationRelativeTo(null);
        p.setTitle("Añadir Usuarios");
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        reportes p = new reportes();
        p.setResizable(false);
        p.setVisible(true);
        p.setLocationRelativeTo(null);
        p.setTitle("Reportes");
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void hechoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hechoActionPerformed
        // TODO add your handling code here:
        int i =pendientes.getSelectedRow(); 
//        String p=pendientes.getSelectedColumn();
        if(i==-1){ 
            DesktopNotify.showDesktopMessage("Error", "Selecciona un pendiente", DesktopNotify.ERROR, 7000L); 
        }else{
            String palabra=(String)pendientes.getValueAt(i,0);
            eliminar_pendiente(palabra);
//            historial_pendiente_eliminado(palabra);
        }
        DefaultTableModel modelo_pendientes = new DefaultTableModel();
        modelo_pendientes.addColumn("Nombre");
        modelo_pendientes.addColumn("Descripción");
        modelo_pendientes.addColumn("Fecha");
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        datos=Conexion.llenar_pendientes();
        for(int x=0;x<datos.size();x++){
            modelo_pendientes.addRow(datos.get(x));
        }
        pendientes.setModel(modelo_pendientes);
    try {
        caledario_pendientes();
    } catch (SQLException ex) {
        Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        
    }//GEN-LAST:event_hechoActionPerformed

    private TableRowSorter trsFiltro;
    public void filtro() {
        int columnaABuscar = 0;
        if (jComboBox1.getSelectedItem() == "Nombre") {
            columnaABuscar = 0;
        }
        if (jComboBox1.getSelectedItem() == "Descripción") {
            columnaABuscar = 1;
        }
        if (jComboBox1.getSelectedItem() == "Fecha") {
            columnaABuscar = 2;
        }
        trsFiltro.setRowFilter(RowFilter.regexFilter(jTextField1.getText(), columnaABuscar));
    }
    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
       jTextField1.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = (jTextField1.getText());
                jTextField1.setText(cadena);
                repaint();
                filtro();
            }
        });
        trsFiltro = new TableRowSorter(pendientes.getModel());
        pendientes.setRowSorter(trsFiltro);
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        int ax = JOptionPane.showConfirmDialog(null, "¿Seguro que decea salir?");
        if(ax == JOptionPane.YES_OPTION){
            System.exit(0);
        }else if(ax == JOptionPane.NO_OPTION){}

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        restaurar p = new restaurar();
        p.setResizable(false);
        p.setVisible(true);
        p.setLocationRelativeTo(null);
        p.setTitle("Restaurar");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//    try {
//        // TODO add your handling code here:
//        caledario_pendientes();
//        caledario_pendientes_2019();
//    } catch (SQLException ex) {
//        Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
//    }
    conectar();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new principal().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable abril;
    private javax.swing.JTable abril1;
    private javax.swing.JTable agosto;
    private javax.swing.JTable agosto1;
    public static javax.swing.JTable dias_table;
    private javax.swing.JTable diciembre;
    private javax.swing.JTable diciembre1;
    private javax.swing.JTable enero;
    private javax.swing.JTable enero1;
    private javax.swing.JTable febrero;
    private javax.swing.JTable febrero1;
    private javax.swing.JButton hecho;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable julio;
    private javax.swing.JTable julio1;
    private javax.swing.JTable junio;
    private javax.swing.JTable junio1;
    private javax.swing.JTable marzo;
    private javax.swing.JTable marzo1;
    private javax.swing.JTable mayo;
    private javax.swing.JTable mayo1;
    private javax.swing.JTable noviembre;
    private javax.swing.JTable noviembre1;
    private javax.swing.JTable octubre;
    private javax.swing.JTable octubre1;
    public static javax.swing.JTable pendientes;
    private javax.swing.JTable septiembre;
    private javax.swing.JTable septiembre1;
    // End of variables declaration//GEN-END:variables

}
