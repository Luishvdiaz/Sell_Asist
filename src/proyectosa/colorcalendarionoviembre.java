/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosa;

import java.awt.Color;
import java.awt.Component;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import static proyectosa.Conexion.ano;
import static proyectosa.Conexion.conectar;
import static proyectosa.Conexion.dia;
import static proyectosa.Conexion.dia_db_enero;
import static proyectosa.Conexion.dia_db_marzo;
import static proyectosa.Conexion.mes;
import static proyectosa.Conexion.mes_db;
import static proyectosa.Conexion.resultado;
import static proyectosa.ProyectoSA.nov1;
import static proyectosa.principal.dias_table;


/**
 *
 * @author Luis Diaz
 */
public class colorcalendarionoviembre extends DefaultTableCellRenderer{
    static Connection conexion=null;
    static Statement sentencia;
    static ResultSet resultado;
    static ResultSetMetaData resultadometa;
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean Selected, boolean hasFocus, int row, int col) {
        JLabel cell = (JLabel) super.getTableCellRendererComponent(table, value, Selected, hasFocus, row, col);
        
        JFormattedTextField campoTexto = new JFormattedTextField();
        int año, mes, dia;
        año=ano();
        mes=mes();
        dia=dia();
        
//        if(nov1!=1){
        if(value instanceof Integer){
            int i = (Integer) value;
//            conectar();
            ArrayList<Object[]> datos = new ArrayList<Object[]>();
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("numero");
            try {
                datos=Conexion.dia_db_noviembre();
            } catch (SQLException ex) {
                Logger.getLogger(colorcalendarionoviembre.class.getName()).log(Level.SEVERE, null, ex);
            }
            for(int o=0;o<datos.size();o++){
                modelo.addRow(datos.get(o));
            }
            dias_table.setModel(modelo);
            
//            int l=datos.size();

            String a;
            for(int m1=0;m1<dias_table.getRowCount();m1++){
                
                int val=(int) dias_table.getValueAt(m1, 0);
                System.out.println("El dia de la tabla: "+val);
                    switch(i){
                        case 1:
                            if(i==val){
                                cell.setBackground(new Color(255, 67, 67));
                            }else{
                                cell.setBackground(Color.WHITE);
                            }
                            break;
                        case 2:
                            if(i==val){
                                cell.setBackground(new Color(255, 67, 67));
                            }else{
                                cell.setBackground(Color.WHITE);
                            }
                            break;
                        case 3:
                            if(i==val){
                                cell.setBackground(new Color(255, 67, 67));
                            }else{
                                cell.setBackground(Color.WHITE);
                            }
                            break;
                        case 4:
                            if(i==val){
                                cell.setBackground(new Color(255, 67, 67));
                            }
                            else{
                                cell.setBackground(Color.WHITE);
                            }
                            break;
                        case 5:
                            if(i==val){
                                cell.setBackground(new Color(255, 67, 67));
                            }
                            else{
                                cell.setBackground(Color.WHITE);
                            }
                            break;
                        case 6:
                            if(i==val){
                                cell.setBackground(new Color(255, 67, 67));
                            }
                            else{
                                cell.setBackground(Color.WHITE);
                            }
                            break;
                        case 7:
                            if(i==val){
                                cell.setBackground(new Color(255, 67, 67));
                            }
                            else{
                                cell.setBackground(Color.WHITE);
                            }
                            break;
                        case 8:
                            if(i==val){
                                cell.setBackground(new Color(255, 67, 67));
                            }
                            else{
                                cell.setBackground(Color.WHITE);
                            }
                            break;
                        case 9:
                            if(i==val){
                                cell.setBackground(new Color(255, 67, 67));
                            }
                            else{
                                cell.setBackground(Color.WHITE);
                            }
                            break;
                        case 10:
                            if(i==val){
                                cell.setBackground(new Color(255, 67, 67));
                            }
                            else{
                                cell.setBackground(Color.WHITE);
                            }
                            break;
                        case 11:
                            if(i==val){
                                cell.setBackground(new Color(255, 67, 67));
                            }
                            else{
                                cell.setBackground(Color.WHITE);
                            }
                            break;
                        case 12:
                            if(i==val){
                                cell.setBackground(new Color(255, 67, 67));
                            }
                            else{
                                cell.setBackground(Color.WHITE);
                            }
                            break;
                        case 13:
                            if(i==val){
                                cell.setBackground(new Color(255, 67, 67));
                            }
                            else{
                                cell.setBackground(Color.WHITE);
                            }
                            break;
                        case 14:
                            if(i==val){
                                cell.setBackground(new Color(255, 67, 67));
                            }
                            else{
                                cell.setBackground(Color.WHITE);
                            }
                            break;
                        case 15:
                            if(i==val){
                                cell.setBackground(new Color(255, 67, 67));
                            }
                            else{
                                cell.setBackground(Color.WHITE);
                            }
                            break;
                        case 16:
                            if(i==val){
                                cell.setBackground(new Color(255, 67, 67));
                            }
                            else{
                                cell.setBackground(Color.WHITE);
                            }
                            break;
                        case 17:
                            if(i==val){
                                cell.setBackground(new Color(255, 67, 67));
                            }
                            else{
                                cell.setBackground(Color.WHITE);
                            }
                            break;
                        case 18:
                            if(i==val){
                                cell.setBackground(new Color(255, 67, 67));
                            }
                            else{
                                cell.setBackground(Color.WHITE);
                            }
                            break;
                        case 19:
                            if(i==val){
                                cell.setBackground(new Color(255, 67, 67));
                            }
                            else{
                                cell.setBackground(Color.WHITE);
                            }
                            break;
                        case 20:
                            if(i==val){
                                cell.setBackground(new Color(255, 67, 67));
                            }
                            else{
                                cell.setBackground(Color.WHITE);
                            }
                            break;
                        case 21:
                            if(i==val){
                                cell.setBackground(new Color(255, 67, 67));
                            }
                            else{
                                cell.setBackground(Color.WHITE);
                            }
                            break;
                        case 22:
                            if(i==val){
                                cell.setBackground(new Color(255, 67, 67));
                            }
                            else{
                                cell.setBackground(Color.WHITE);
                            }
                            break;
                        case 23:
                            if(i==val){
                                cell.setBackground(new Color(255, 67, 67));
                            }
                            else{
                                cell.setBackground(Color.WHITE);
                            }
                            break;
                        case 24:
                            if(i==val){
                                cell.setBackground(new Color(255, 67, 67));
                            }
                            else{
                                cell.setBackground(Color.WHITE);
                            }
                            break;
                        case 25:
                            if(i==val){
                                cell.setBackground(new Color(255, 67, 67));
                            }
                            else{
                                cell.setBackground(Color.WHITE);
                            }
                            break;
                        case 26:
                            if(i==val){
                                cell.setBackground(new Color(255, 67, 67));
                            }
                            else{
                                cell.setBackground(Color.WHITE);
                            }
                            break;
                        case 27:
                            if(i==val){
                                cell.setBackground(new Color(255, 67, 67));
                            }
                            else{
                                cell.setBackground(Color.WHITE);
                            }
                            break;
                        case 28:
                            if(i==val){
                                cell.setBackground(new Color(255, 67, 67));
                            }
                            else{
                                cell.setBackground(Color.WHITE);
                            }
                            break;
                        case 29:
                            if(i==val){
                                cell.setBackground(new Color(255, 67, 67));
                            }
                            else{
                                cell.setBackground(Color.WHITE);
                            }
                            break;
                        case 30:
                            if(i==val){
                                cell.setBackground(new Color(255, 67, 67));
                            }
                            else{
                                cell.setBackground(Color.WHITE);
                            }
                            break;
                        case 31:
                            if(i==val){
                                cell.setBackground(new Color(255, 67, 67));
                            }
                            else{
                                cell.setBackground(Color.WHITE);
                            }
                            break;
//                        default:
//                            cell.setBackground(Color.WHITE);
//                            break;
                    }
            }
            
            
        }
//        nov1=1;
//        }
        return cell;
    }
    
}
