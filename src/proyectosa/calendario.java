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
import java.sql.Statement;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import static proyectosa.Conexion.ano;
import static proyectosa.Conexion.conectar;
import static proyectosa.Conexion.dia;
import static proyectosa.Conexion.mes;
import static proyectosa.Conexion.resultado;

/**
 *
 * @author Luis Diaz
 */
public class calendario extends DefaultTableCellRenderer{
    static Connection conexion=null;
    static Statement sentencia;
    static ResultSet resultado;
    static ResultSetMetaData resultadometa;
    
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean Selected, boolean hasFocus, int row, int col) {
        JLabel cell = (JLabel) super.getTableCellRendererComponent(table, value, Selected, hasFocus, row, col);
        if(value instanceof Long){
            long valor = (long)value;
            if(col==0){
                if(valor==1){
                    cell.setBackground(Color.BLACK);
                    cell.setForeground(Color.WHITE);
                }
            }
        }
        JFormattedTextField campoTexto = new JFormattedTextField();
        int año, mes, dia;
        año=ano();
        mes=mes();
        dia=dia();
        
        if(value instanceof Integer){
            
            
            conectar();
            String q = "SELECT fecha_pendiente_mes FROM vista_pendientes;";
            try {
                resultado=sentencia.executeQuery(q);
                resultadometa= resultado.getMetaData();

            } catch (Exception e) {

            }
            try {
                while(resultado.next()){
                    Object[] filas = new Object[resultadometa.getColumnCount()];
                    for(int i = 0;i<resultadometa.getColumnCount();i++){
                        filas[i]= resultado.getObject(i+1);
                    }
                    int s=filas.length;
                    String[ ] meses = new String[s];
                    for(int u=0;u<meses.length;u++){
                        meses[u]=(String) filas[u];
                    }
                    for(int r=0;r<meses.length;r++){
                        if(meses[r]=="Enero"){
                            
                        }
                    }
                }
            } catch (Exception e) {
            }
            
            int i = (Integer) value;
            dia=dia();
            if(i==dia){
                cell.setBackground(new Color(0, 135, 255));
                cell.setForeground(Color.BLACK);
            }else{
                cell.setBackground(Color.WHITE);
                cell.setForeground(Color.BLACK);
            }
        }
        return cell;
    }
}
