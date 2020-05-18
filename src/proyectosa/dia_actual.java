    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosa;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import static proyectosa.Conexion.ano;
import static proyectosa.Conexion.dia;
import static proyectosa.Conexion.mes;

/**
 *
 * @author Luis Diaz    
 */
public class dia_actual extends DefaultTableCellRenderer{
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean Selected, boolean hasFocus, int row, int col) {
        JLabel cell = (JLabel) super.getTableCellRendererComponent(table, value, Selected, hasFocus, row, col);
        
        int dia;
        dia=dia();
        
        if(value instanceof Integer){
            int i = (Integer) value;
            dia=dia();
//            System.out.println("El dia es: "+dia);
            if(i==dia){
                cell.setBackground(new Color(0, 135, 255));
            }else{
                cell.setBackground(Color.WHITE);
            }
        }
        return cell;
    }
}
