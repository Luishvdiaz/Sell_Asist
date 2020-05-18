/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosa;

import ds.desktop.notify.DesktopNotify;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import static jdk.nashorn.internal.objects.NativeArray.length;
import static jdk.nashorn.internal.objects.NativeArray.length;
import static jdk.nashorn.internal.objects.NativeString.length;

/**
 *
 * @author Luis Diaz
 */

public class Conexion {
    
    static Connection conexion=null;
    static Statement sentencia;
    static ResultSet resultado;
    static ResultSetMetaData resultadometa;
    
        public static Connection conectar(){
        String ruta="jdbc:mysql://localhost:3306/asistente_ventas";
        String user="root";
        String pass="344391";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(ruta,user,pass); 
            sentencia = conexion.createStatement();
       System.out.println("Conectado");
    } catch (Exception e) {
            System.out.println("No conectado");
    }
        return conexion;
    }
        
        
    public static ArrayList<Object[]> dia_db_agosto() throws SQLException{
//        conectar();
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        String q = "SELECT fecha_pendiente_dia FROM vista_pendientes WHERE fecha_pendiente_mes = 'Agosto' AND fecha_pendiente_ano = 2018;";
        String q2 = "SELECT fecha_pendiente_dia FROM vista_pendientes_default WHERE fecha_pendiente_mes = 'Agosto' AND fecha_pendiente_ano = 2018;";
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
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        
        
        try {
            resultado=sentencia.executeQuery(q2);
            resultadometa= resultado.getMetaData();
            
        } catch (Exception e) {
            
        }
        try {
            while(resultado.next()){
                Object[] filas = new Object[resultadometa.getColumnCount()];
                for(int i = 0;i<resultadometa.getColumnCount();i++){
                    filas[i]= resultado.getObject(i+1);
                }
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        
        for(int u=0;u<datos.size();u++){
            Object[] fil = new Object[1];
            fil[0]=0;
            ArrayList<Object[]> d = new ArrayList<Object[]>();
            d.add(fil);
            if(datos.get(u).equals(d)){
                datos.remove(u);
            }
        }
        resultado.close();
        return datos;
    }
    public static ArrayList<Object[]> dia_db_diciembre1() throws SQLException{
//        conectar();
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        String q = "SELECT fecha_pendiente_dia FROM vista_pendientes WHERE fecha_pendiente_mes = 'Diciembre' AND fecha_pendiente_ano = 2019;";
        String q2 = "SELECT fecha_pendiente_dia FROM vista_pendientes_default WHERE fecha_pendiente_mes = 'Diciembre' AND fecha_pendiente_ano = 2019;";
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
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        
        try {
            resultado=sentencia.executeQuery(q2);
            resultadometa= resultado.getMetaData();
            
        } catch (Exception e) {
            
        }
        try {
            while(resultado.next()){
                Object[] filas = new Object[resultadometa.getColumnCount()];
                for(int i = 0;i<resultadometa.getColumnCount();i++){
                    filas[i]= resultado.getObject(i+1);
                }
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        for(int u=0;u<datos.size();u++){
            Object[] fil = new Object[1];
            fil[0]=0;
            ArrayList<Object[]> d = new ArrayList<Object[]>();
            d.add(fil);
            if(datos.get(u).equals(d)){
                datos.remove(u);
            }
        }
        resultado.close();
        return datos;
    }
    public static ArrayList<Object[]> dia_db_noviembre1() throws SQLException{
//        conectar();
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        String q = "SELECT fecha_pendiente_dia FROM vista_pendientes WHERE fecha_pendiente_mes = 'Noviembre' AND fecha_pendiente_ano = 2019;";
        String q2 = "SELECT fecha_pendiente_dia FROM vista_pendientes_default WHERE fecha_pendiente_mes = 'Noviembre' AND fecha_pendiente_ano = 2019;";
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
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        
        try {
            resultado=sentencia.executeQuery(q2);
            resultadometa= resultado.getMetaData();
            
        } catch (Exception e) {
            
        }
        try {
            while(resultado.next()){
                Object[] filas = new Object[resultadometa.getColumnCount()];
                for(int i = 0;i<resultadometa.getColumnCount();i++){
                    filas[i]= resultado.getObject(i+1);
                }
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        for(int u=0;u<datos.size();u++){
            Object[] fil = new Object[1];
            fil[0]=0;
            ArrayList<Object[]> d = new ArrayList<Object[]>();
            d.add(fil);
            if(datos.get(u).equals(d)){
                datos.remove(u);
            }
        }
        resultado.close();
        return datos;
    }
    public static ArrayList<Object[]> dia_db_octubre1() throws SQLException{
//        conectar();
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        String q = "SELECT fecha_pendiente_dia FROM vista_pendientes WHERE fecha_pendiente_mes = 'Octubre' AND fecha_pendiente_ano = 2019;";
        String q2 = "SELECT fecha_pendiente_dia FROM vista_pendientes_default WHERE fecha_pendiente_mes = 'Octubre' AND fecha_pendiente_ano = 2019;";
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
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        
        
        try {
            resultado=sentencia.executeQuery(q2);
            resultadometa= resultado.getMetaData();
            
        } catch (Exception e) {
            
        }
        try {
            while(resultado.next()){
                Object[] filas = new Object[resultadometa.getColumnCount()];
                for(int i = 0;i<resultadometa.getColumnCount();i++){
                    filas[i]= resultado.getObject(i+1);
                }
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        for(int u=0;u<datos.size();u++){
            Object[] fil = new Object[1];
            fil[0]=0;
            ArrayList<Object[]> d = new ArrayList<Object[]>();
            d.add(fil);
            if(datos.get(u).equals(d)){
                datos.remove(u);
            }
        }
        resultado.close();
        return datos;
    }    
    public static ArrayList<Object[]> dia_db_septiembre1() throws SQLException{
//        conectar();
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        String q = "SELECT fecha_pendiente_dia FROM vista_pendientes WHERE fecha_pendiente_mes = 'Septiembre' AND fecha_pendiente_ano = 2019;";
        String q2 = "SELECT fecha_pendiente_dia FROM vista_pendientes_default WHERE fecha_pendiente_mes = 'Septiembre' AND fecha_pendiente_ano = 2019;";
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
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        
        
        try {
            resultado=sentencia.executeQuery(q2);
            resultadometa= resultado.getMetaData();
            
        } catch (Exception e) {
            
        }
        try {
            while(resultado.next()){
                Object[] filas = new Object[resultadometa.getColumnCount()];
                for(int i = 0;i<resultadometa.getColumnCount();i++){
                    filas[i]= resultado.getObject(i+1);
                }
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        for(int u=0;u<datos.size();u++){
            Object[] fil = new Object[1];
            fil[0]=0;
            ArrayList<Object[]> d = new ArrayList<Object[]>();
            d.add(fil);
            if(datos.get(u).equals(d)){
                datos.remove(u);
            }
        }
        resultado.close();
        return datos;
    }    
        
    public static ArrayList<Object[]> dia_db_julio1() throws SQLException{
//        conectar();
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        String q = "SELECT fecha_pendiente_dia FROM vista_pendientes WHERE fecha_pendiente_mes = 'Julio' AND fecha_pendiente_ano = 2019;";
        String q2 = "SELECT fecha_pendiente_dia FROM vista_pendientes_default WHERE fecha_pendiente_mes = 'Julio' AND fecha_pendiente_ano = 2019;";
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
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        
        
        try {
            resultado=sentencia.executeQuery(q2);
            resultadometa= resultado.getMetaData();
            
        } catch (Exception e) {
            
        }
        try {
            while(resultado.next()){
                Object[] filas = new Object[resultadometa.getColumnCount()];
                for(int i = 0;i<resultadometa.getColumnCount();i++){
                    filas[i]= resultado.getObject(i+1);
                }
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        for(int u=0;u<datos.size();u++){
            Object[] fil = new Object[1];
            fil[0]=0;
            ArrayList<Object[]> d = new ArrayList<Object[]>();
            d.add(fil);
            if(datos.get(u).equals(d)){
                datos.remove(u);
            }
        }
        resultado.close();
        return datos;
    }    
        
    public static ArrayList<Object[]> dia_db_junio1() throws SQLException{
//        conectar();
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        String q = "SELECT fecha_pendiente_dia FROM vista_pendientes WHERE fecha_pendiente_mes = 'Junio' AND fecha_pendiente_ano = 2019;";
         String q2 = "SELECT fecha_pendiente_dia FROM vista_pendientes_default WHERE fecha_pendiente_mes = 'Junio' AND fecha_pendiente_ano = 2019;";
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
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        
        try {
            resultado=sentencia.executeQuery(q2);
            resultadometa= resultado.getMetaData();
            
        } catch (Exception e) {
            
        }
        try {
            while(resultado.next()){
                Object[] filas = new Object[resultadometa.getColumnCount()];
                for(int i = 0;i<resultadometa.getColumnCount();i++){
                    filas[i]= resultado.getObject(i+1);
                }
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        for(int u=0;u<datos.size();u++){
            Object[] fil = new Object[1];
            fil[0]=0;
            ArrayList<Object[]> d = new ArrayList<Object[]>();
            d.add(fil);
            if(datos.get(u).equals(d)){
                datos.remove(u);
            }
        }
        resultado.close();
        return datos;
    }    
    public static ArrayList<Object[]> dia_db_mayo1() throws SQLException{
//        conectar();
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        String q = "SELECT fecha_pendiente_dia FROM vista_pendientes WHERE fecha_pendiente_mes = 'mayo' AND fecha_pendiente_ano = 2019;";
        String q2 = "SELECT fecha_pendiente_dia FROM vista_pendientes_default WHERE fecha_pendiente_mes = 'mayo' AND fecha_pendiente_ano = 2019;";
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
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        
        
        try {
            resultado=sentencia.executeQuery(q2);
            resultadometa= resultado.getMetaData();
            
        } catch (Exception e) {
            
        }
        try {
            while(resultado.next()){
                Object[] filas = new Object[resultadometa.getColumnCount()];
                for(int i = 0;i<resultadometa.getColumnCount();i++){
                    filas[i]= resultado.getObject(i+1);
                }
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        for(int u=0;u<datos.size();u++){
            Object[] fil = new Object[1];
            fil[0]=0;
            ArrayList<Object[]> d = new ArrayList<Object[]>();
            d.add(fil);
            if(datos.get(u).equals(d)){
                datos.remove(u);
            }
        }
        resultado.close();
        return datos;
    }    
        
        
    public static ArrayList<Object[]> dia_db_abril1() throws SQLException{
//        conectar();
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        String q = "SELECT fecha_pendiente_dia FROM vista_pendientes WHERE fecha_pendiente_mes = 'Abril' AND fecha_pendiente_ano = 2019;";
        String q2 = "SELECT fecha_pendiente_dia FROM vista_pendientes_default WHERE fecha_pendiente_mes = 'Abril' AND fecha_pendiente_ano = 2019;";
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
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        
        
        try {
            resultado=sentencia.executeQuery(q2);
            resultadometa= resultado.getMetaData();
            
        } catch (Exception e) {
            
        }
        try {
            while(resultado.next()){
                Object[] filas = new Object[resultadometa.getColumnCount()];
                for(int i = 0;i<resultadometa.getColumnCount();i++){
                    filas[i]= resultado.getObject(i+1);
                }
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        for(int u=0;u<datos.size();u++){
            Object[] fil = new Object[1];
            fil[0]=0;
            ArrayList<Object[]> d = new ArrayList<Object[]>();
            d.add(fil);
            if(datos.get(u).equals(d)){
                datos.remove(u);
            }
        }
        resultado.close();
        return datos;
    }   
        
    public static ArrayList<Object[]> dia_db_febrero1() throws SQLException{
//        conectar();
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        String q = "SELECT fecha_pendiente_dia FROM vista_pendientes WHERE fecha_pendiente_mes = 'Febrero' AND fecha_pendiente_ano = 2019;";
        String q2 = "SELECT fecha_pendiente_dia FROM vista_pendientes_default WHERE fecha_pendiente_mes = 'Febrero' AND fecha_pendiente_ano = 2019;";
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
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        
        try {
            resultado=sentencia.executeQuery(q2);
            resultadometa= resultado.getMetaData();
            
        } catch (Exception e) {
            
        }
        try {
            while(resultado.next()){
                Object[] filas = new Object[resultadometa.getColumnCount()];
                for(int i = 0;i<resultadometa.getColumnCount();i++){
                    filas[i]= resultado.getObject(i+1);
                }
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        for(int u=0;u<datos.size();u++){
            Object[] fil = new Object[1];
            fil[0]=0;
            ArrayList<Object[]> d = new ArrayList<Object[]>();
            d.add(fil);
            if(datos.get(u).equals(d)){
                datos.remove(u);
            }
        }
        resultado.close();
        return datos;
    }
        
    public static ArrayList<Object[]> dia_db_enero1() throws SQLException{
//        conectar();
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        String q = "SELECT fecha_pendiente_dia FROM vista_pendientes WHERE fecha_pendiente_mes = 'Enero' AND fecha_pendiente_ano = 2019;";
        String q2 = "SELECT fecha_pendiente_dia FROM vista_pendientes_default WHERE fecha_pendiente_mes = 'Enero' AND fecha_pendiente_ano = 2019;";
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
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        
        
        try {
            resultado=sentencia.executeQuery(q2);
            resultadometa= resultado.getMetaData();
            
        } catch (Exception e) {
            
        }
        try {
            while(resultado.next()){
                Object[] filas = new Object[resultadometa.getColumnCount()];
                for(int i = 0;i<resultadometa.getColumnCount();i++){
                    filas[i]= resultado.getObject(i+1);
                }
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        for(int u=0;u<datos.size();u++){
            Object[] fil = new Object[1];
            fil[0]=0;
            ArrayList<Object[]> d = new ArrayList<Object[]>();
            d.add(fil);
            if(datos.get(u).equals(d)){
                datos.remove(u);
            }
        }
        resultado.close();
        return datos;
    }    
    
    public static ArrayList<Object[]> dia_db_marzo1() throws SQLException{
//        conectar();
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        String q = "SELECT fecha_pendiente_dia FROM vista_pendientes WHERE fecha_pendiente_mes = 'Marzo' AND fecha_pendiente_ano = 2019;";
        String q2 = "SELECT fecha_pendiente_dia FROM vista_pendientes_default WHERE fecha_pendiente_mes = 'Marzo' AND fecha_pendiente_ano = 2019;";
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
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        
        try {
            resultado=sentencia.executeQuery(q2);
            resultadometa= resultado.getMetaData();
            
        } catch (Exception e) {
            
        }
        try {
            while(resultado.next()){
                Object[] filas = new Object[resultadometa.getColumnCount()];
                for(int i = 0;i<resultadometa.getColumnCount();i++){
                    filas[i]= resultado.getObject(i+1);
                }
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        for(int u=0;u<datos.size();u++){
            Object[] fil = new Object[1];
            fil[0]=0;
            ArrayList<Object[]> d = new ArrayList<Object[]>();
            d.add(fil);
            if(datos.get(u).equals(d)){
                datos.remove(u);
            }
        }
        resultado.close();
        return datos;
    }        
        
        
        
        
    public static ArrayList<Object[]> dia_db_agosto1() throws SQLException{
//        conectar();
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        String q = "SELECT fecha_pendiente_dia FROM vista_pendientes WHERE fecha_pendiente_mes = 'Agosto' AND fecha_pendiente_ano = 2019;";
        String q2 = "SELECT fecha_pendiente_dia FROM vista_pendientes_default WHERE fecha_pendiente_mes = 'Agosto' AND fecha_pendiente_ano = 2019;";
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
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        
        
        try {
            resultado=sentencia.executeQuery(q2);
            resultadometa= resultado.getMetaData();
            
        } catch (Exception e) {
            
        }
        try {
            while(resultado.next()){
                Object[] filas = new Object[resultadometa.getColumnCount()];
                for(int i = 0;i<resultadometa.getColumnCount();i++){
                    filas[i]= resultado.getObject(i+1);
                }
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        
        for(int u=0;u<datos.size();u++){
            Object[] fil = new Object[1];
            fil[0]=0;
            ArrayList<Object[]> d = new ArrayList<Object[]>();
            d.add(fil);
            if(datos.get(u).equals(d)){
                datos.remove(u);
            }
        }
        resultado.close();
        return datos;
    }
    public static ArrayList<Object[]> dia_db_diciembre() throws SQLException{
//        conectar();
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        String q = "SELECT fecha_pendiente_dia FROM vista_pendientes WHERE fecha_pendiente_mes = 'Diciembre' AND fecha_pendiente_ano = 2018;";
        String q2 = "SELECT fecha_pendiente_dia FROM vista_pendientes_default WHERE fecha_pendiente_mes = 'Diciembre' AND fecha_pendiente_ano = 2018;";
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
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        
        try {
            resultado=sentencia.executeQuery(q2);
            resultadometa= resultado.getMetaData();
            
        } catch (Exception e) {
            
        }
        try {
            while(resultado.next()){
                Object[] filas = new Object[resultadometa.getColumnCount()];
                for(int i = 0;i<resultadometa.getColumnCount();i++){
                    filas[i]= resultado.getObject(i+1);
                }
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        for(int u=0;u<datos.size();u++){
            Object[] fil = new Object[1];
            fil[0]=0;
            ArrayList<Object[]> d = new ArrayList<Object[]>();
            d.add(fil);
            if(datos.get(u).equals(d)){
                datos.remove(u);
            }
        }
        resultado.close();
        return datos;
    }
    public static ArrayList<Object[]> dia_db_noviembre() throws SQLException{
//        conectar();
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        String q = "SELECT fecha_pendiente_dia FROM vista_pendientes WHERE fecha_pendiente_mes = 'Noviembre' AND fecha_pendiente_ano = 2018;";
        String q2 = "SELECT fecha_pendiente_dia FROM vista_pendientes_default WHERE fecha_pendiente_mes = 'Noviembre' AND fecha_pendiente_ano = 2018;";
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
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        
        try {
            resultado=sentencia.executeQuery(q2);
            resultadometa= resultado.getMetaData();
            
        } catch (Exception e) {
            
        }
        try {
            while(resultado.next()){
                Object[] filas = new Object[resultadometa.getColumnCount()];
                for(int i = 0;i<resultadometa.getColumnCount();i++){
                    filas[i]= resultado.getObject(i+1);
                }
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        for(int u=0;u<datos.size();u++){
            Object[] fil = new Object[1];
            fil[0]=0;
            ArrayList<Object[]> d = new ArrayList<Object[]>();
            d.add(fil);
            if(datos.get(u).equals(d)){
                datos.remove(u);
            }
        }
        resultado.close();
        return datos;
    }
    public static ArrayList<Object[]> dia_db_octubre() throws SQLException{
//        conectar();
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        String q = "SELECT fecha_pendiente_dia FROM vista_pendientes WHERE fecha_pendiente_mes = 'Octubre' AND fecha_pendiente_ano = 2018;";
        String q2 = "SELECT fecha_pendiente_dia FROM vista_pendientes_default WHERE fecha_pendiente_mes = 'Octubre' AND fecha_pendiente_ano = 2018;";
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
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        
        
        try {
            resultado=sentencia.executeQuery(q2);
            resultadometa= resultado.getMetaData();
            
        } catch (Exception e) {
            
        }
        try {
            while(resultado.next()){
                Object[] filas = new Object[resultadometa.getColumnCount()];
                for(int i = 0;i<resultadometa.getColumnCount();i++){
                    filas[i]= resultado.getObject(i+1);
                }
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        for(int u=0;u<datos.size();u++){
            Object[] fil = new Object[1];
            fil[0]=0;
            ArrayList<Object[]> d = new ArrayList<Object[]>();
            d.add(fil);
            if(datos.get(u).equals(d)){
                datos.remove(u);
            }
        }
        resultado.close();
        return datos;
    }    
    public static ArrayList<Object[]> dia_db_septiembre() throws SQLException{
//        conectar();
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        String q = "SELECT fecha_pendiente_dia FROM vista_pendientes WHERE fecha_pendiente_mes = 'Septiembre' AND fecha_pendiente_ano = 2018;";
        String q2 = "SELECT fecha_pendiente_dia FROM vista_pendientes_default WHERE fecha_pendiente_mes = 'Septiembre' AND fecha_pendiente_ano = 2018;";
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
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        
        
        try {
            resultado=sentencia.executeQuery(q2);
            resultadometa= resultado.getMetaData();
            
        } catch (Exception e) {
            
        }
        try {
            while(resultado.next()){
                Object[] filas = new Object[resultadometa.getColumnCount()];
                for(int i = 0;i<resultadometa.getColumnCount();i++){
                    filas[i]= resultado.getObject(i+1);
                }
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        for(int u=0;u<datos.size();u++){
            Object[] fil = new Object[1];
            fil[0]=0;
            ArrayList<Object[]> d = new ArrayList<Object[]>();
            d.add(fil);
            if(datos.get(u).equals(d)){
                datos.remove(u);
            }
        }
        resultado.close();
        return datos;
    }    
        
    public static ArrayList<Object[]> dia_db_julio() throws SQLException{
//        conectar();
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        String q = "SELECT fecha_pendiente_dia FROM vista_pendientes WHERE fecha_pendiente_mes = 'Julio' AND fecha_pendiente_ano = 2018;";
        String q2 = "SELECT fecha_pendiente_dia FROM vista_pendientes_default WHERE fecha_pendiente_mes = 'Julio' AND fecha_pendiente_ano = 2018;";
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
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        
        
        try {
            resultado=sentencia.executeQuery(q2);
            resultadometa= resultado.getMetaData();
            
        } catch (Exception e) {
            
        }
        try {
            while(resultado.next()){
                Object[] filas = new Object[resultadometa.getColumnCount()];
                for(int i = 0;i<resultadometa.getColumnCount();i++){
                    filas[i]= resultado.getObject(i+1);
                }
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        for(int u=0;u<datos.size();u++){
            Object[] fil = new Object[1];
            fil[0]=0;
            ArrayList<Object[]> d = new ArrayList<Object[]>();
            d.add(fil);
            if(datos.get(u).equals(d)){
                datos.remove(u);
            }
        }
        resultado.close();
        return datos;
    }    
        
    public static ArrayList<Object[]> dia_db_junio() throws SQLException{
//        conectar();
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        String q = "SELECT fecha_pendiente_dia FROM vista_pendientes WHERE fecha_pendiente_mes = 'Junio' AND fecha_pendiente_ano = 2018;";
         String q2 = "SELECT fecha_pendiente_dia FROM vista_pendientes_default WHERE fecha_pendiente_mes = 'Junio' AND fecha_pendiente_ano = 2018;";
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
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        
        try {
            resultado=sentencia.executeQuery(q2);
            resultadometa= resultado.getMetaData();
            
        } catch (Exception e) {
            
        }
        try {
            while(resultado.next()){
                Object[] filas = new Object[resultadometa.getColumnCount()];
                for(int i = 0;i<resultadometa.getColumnCount();i++){
                    filas[i]= resultado.getObject(i+1);
                }
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        for(int u=0;u<datos.size();u++){
            Object[] fil = new Object[1];
            fil[0]=0;
            ArrayList<Object[]> d = new ArrayList<Object[]>();
            d.add(fil);
            if(datos.get(u).equals(d)){
                datos.remove(u);
            }
        }
        resultado.close();
        return datos;
    }    
    public static ArrayList<Object[]> dia_db_mayo() throws SQLException{
//        conectar();
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        String q = "SELECT fecha_pendiente_dia FROM vista_pendientes WHERE fecha_pendiente_mes = 'mayo' AND fecha_pendiente_ano = 2018;";
        String q2 = "SELECT fecha_pendiente_dia FROM vista_pendientes_default WHERE fecha_pendiente_mes = 'mayo' AND fecha_pendiente_ano = 2018;";
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
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        
        
        try {
            resultado=sentencia.executeQuery(q2);
            resultadometa= resultado.getMetaData();
            
        } catch (Exception e) {
            
        }
        try {
            while(resultado.next()){
                Object[] filas = new Object[resultadometa.getColumnCount()];
                for(int i = 0;i<resultadometa.getColumnCount();i++){
                    filas[i]= resultado.getObject(i+1);
                }
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        for(int u=0;u<datos.size();u++){
            Object[] fil = new Object[1];
            fil[0]=0;
            ArrayList<Object[]> d = new ArrayList<Object[]>();
            d.add(fil);
            if(datos.get(u).equals(d)){
                datos.remove(u);
            }
        }
//        resultado.close();
        return datos;
    }    
        
        
    public static ArrayList<Object[]> dia_db_abril() throws SQLException{
//        conectar();
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        String q = "SELECT fecha_pendiente_dia FROM vista_pendientes WHERE fecha_pendiente_mes = 'Abril' AND fecha_pendiente_ano = 2018;";
        String q2 = "SELECT fecha_pendiente_dia FROM vista_pendientes_default WHERE fecha_pendiente_mes = 'Abril' AND fecha_pendiente_ano = 2018;";
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
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        
        
        try {
            resultado=sentencia.executeQuery(q2);
            resultadometa= resultado.getMetaData();
            
        } catch (Exception e) {
            
        }
        try {
            while(resultado.next()){
                Object[] filas = new Object[resultadometa.getColumnCount()];
                for(int i = 0;i<resultadometa.getColumnCount();i++){
                    filas[i]= resultado.getObject(i+1);
                }
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        for(int u=0;u<datos.size();u++){
            Object[] fil = new Object[1];
            fil[0]=0;
            ArrayList<Object[]> d = new ArrayList<Object[]>();
            d.add(fil);
            if(datos.get(u).equals(d)){
                datos.remove(u);
            }
        }
        resultado.close();
        return datos;
    }   
        
    public static ArrayList<Object[]> dia_db_febrero() throws SQLException{
//        conectar();
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        String q = "SELECT fecha_pendiente_dia FROM vista_pendientes WHERE fecha_pendiente_mes = 'Febrero' AND fecha_pendiente_ano = 2018;";
        String q2 = "SELECT fecha_pendiente_dia FROM vista_pendientes_default WHERE fecha_pendiente_mes = 'Febrero' AND fecha_pendiente_ano = 2018;";
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
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        
        try {
            resultado=sentencia.executeQuery(q2);
            resultadometa= resultado.getMetaData();
            
        } catch (Exception e) {
            
        }
        try {
            while(resultado.next()){
                Object[] filas = new Object[resultadometa.getColumnCount()];
                for(int i = 0;i<resultadometa.getColumnCount();i++){
                    filas[i]= resultado.getObject(i+1);
                }
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        for(int u=0;u<datos.size();u++){
            Object[] fil = new Object[1];
            fil[0]=0;
            ArrayList<Object[]> d = new ArrayList<Object[]>();
            d.add(fil);
            if(datos.get(u).equals(d)){
                datos.remove(u);
            }
        }
        resultado.close();
        return datos;
    }
        
    public static ArrayList<Object[]> dia_db_enero() throws SQLException{
//        conectar();
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        String q = "SELECT fecha_pendiente_dia FROM vista_pendientes WHERE fecha_pendiente_mes = 'Enero' AND fecha_pendiente_ano = 2018;";
        String q2 = "SELECT fecha_pendiente_dia FROM vista_pendientes_default WHERE fecha_pendiente_mes = 'Enero' AND fecha_pendiente_ano = 2018;";
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
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        
        
        try {
            resultado=sentencia.executeQuery(q2);
            resultadometa= resultado.getMetaData();
            
        } catch (Exception e) {
            
        }
        try {
            while(resultado.next()){
                Object[] filas = new Object[resultadometa.getColumnCount()];
                for(int i = 0;i<resultadometa.getColumnCount();i++){
                    filas[i]= resultado.getObject(i+1);
                }
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        for(int u=0;u<datos.size();u++){
            Object[] fil = new Object[1];
            fil[0]=0;
            ArrayList<Object[]> d = new ArrayList<Object[]>();
            d.add(fil);
            if(datos.get(u).equals(d)){
                datos.remove(u);
            }
        }
        resultado.close();
        return datos;
    }    
    
    public static ArrayList<Object[]> dia_db_marzo() throws SQLException{
//        conectar();
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        String q = "SELECT fecha_pendiente_dia FROM vista_pendientes WHERE fecha_pendiente_mes = 'Marzo' AND fecha_pendiente_ano = 2018;";
        String q2 = "SELECT fecha_pendiente_dia FROM vista_pendientes_default WHERE fecha_pendiente_mes = 'Marzo' AND fecha_pendiente_ano = 2018;";
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
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        
        try {
            resultado=sentencia.executeQuery(q2);
            resultadometa= resultado.getMetaData();
            
        } catch (Exception e) {
            
        }
        try {
            while(resultado.next()){
                Object[] filas = new Object[resultadometa.getColumnCount()];
                for(int i = 0;i<resultadometa.getColumnCount();i++){
                    filas[i]= resultado.getObject(i+1);
                }
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        for(int u=0;u<datos.size();u++){
            Object[] fil = new Object[1];
            fil[0]=0;
            ArrayList<Object[]> d = new ArrayList<Object[]>();
            d.add(fil);
            if(datos.get(u).equals(d)){
                datos.remove(u);
            }
        }
        resultado.close();
        return datos;
    }    
        
        
    
    
    
    public static String[] mes_db() throws SQLException{
//        conectar();
        String mes = null;
        String q = "SELECT fecha_pendiente_mes FROM vista_pendientes;";
        try {
            resultado=sentencia.executeQuery(q);
            resultadometa= resultado.getMetaData();
            
        } catch (Exception e) {
            
        }
        Object[] filas = new Object[resultadometa.getColumnCount()];
        String[ ] meses = new String[filas.length];
        try {
            while(resultado.next()){
                
                for(int i = 0;i<resultadometa.getColumnCount();i++){
                    filas[i]= resultado.getObject(i+1);
                }
                int s=filas.length;
                
                for(int u=0;u<meses.length;u++){
                    meses[u]=(String) filas[u];
                    System.out.println("El mes es: "+meses[u]);
                }
                
            }
        } catch (Exception e) {
        }
        
        return meses;
    } 
        
    
    public static String[] mes_db_default(){
//        conectar();
        String mes = null;
        String[ ] meses = new String[999999];
        String q = "SELECT fecha_pendiente_mes FROM vista_pendientes_default;";
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
                for(int u=0;u<meses.length;u++){
                    meses[u]=(String) filas[u];
                }
                System.out.println("El mes es: "+mes);
            }
        } catch (Exception e) {
        }
        return meses;
    } 
        
    public static int ano(){
        int año;
        Date date = new Date();
        DateFormat fano = new SimpleDateFormat("yyyy");
        año = Integer.parseInt(fano.format(date));
        return año;
    }     
    public static int mes(){
        int mes;
        Date date = new Date();
        DateFormat fmes = new SimpleDateFormat("MM");
        mes = Integer.parseInt(fmes.format(date));
        return mes;
    }   
    public static int dia(){
        int dia;
        Date date = new Date();
        DateFormat fdia = new SimpleDateFormat("dd");
        dia = Integer.parseInt(fdia.format(date));
        return dia;
    }   
        
        
    
    public static void borrar(){
        conectar();
        Date date = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String hora_fecha = hourdateFormat.format(date);
        String q = "TRUNCATE TABLE bitacora";
//        String q2 = "TRUNCATE TABLE clientes";
        String q3 = "TRUNCATE TABLE pendientes";
        String q4 = "TRUNCATE TABLE pendientes_default";
//        String q5 = "TRUNCATE TABLE users";
        String q6 = "TRUNCATE TABLE ventas";
        try {
//            sentencia.execute(q5);
            sentencia.execute(q3);
            sentencia.execute(q6);
//            sentencia.execute(q2);
            sentencia.execute(q);
            sentencia.execute(q4);
            
            
            resultadometa= resultado.getMetaData();
        } catch (Exception e) {
            System.out.println(e);
        }
    }      
        
    public static void historial_correo(String correo){
        conectar();
        Date date = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String hora_fecha = hourdateFormat.format(date);
        String q = "INSERT INTO bitacora(descripcion, fecha) VALUES ('Correo enviado a "+correo+"', '"+hora_fecha+"');";
        try {
            sentencia.execute(q);
            resultadometa= resultado.getMetaData();
        } catch (Exception e) {
            System.out.println(e);
        }
    }         
    
    public static void historial_usuario(String usuario){
        conectar();
        Date date = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String hora_fecha = hourdateFormat.format(date);
        String q = "INSERT INTO bitacora(descripcion, fecha) VALUES ('Creacion de un nuevo usuario: "+usuario+"', '"+hora_fecha+"');";
        try {
            sentencia.execute(q);
            resultadometa= resultado.getMetaData();
        } catch (Exception e) {
            System.out.println(e);
        }
    }  
    
    public static void historial_usuario_eliminado(String usuario){
        conectar();
        Date date = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String hora_fecha = hourdateFormat.format(date);
        String q = "INSERT INTO bitacora(descripcion, fecha) VALUES ('Eliminación del usuario: "+usuario+"', '"+hora_fecha+"');";
        try {
            sentencia.execute(q);
            resultadometa= resultado.getMetaData();
        } catch (Exception e) {
            System.out.println(e);
        }
    }  
    
    public static void historial_sesion(String usuario){
        conectar();
        Date date = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String hora_fecha = hourdateFormat.format(date);
        String q = "INSERT INTO bitacora(descripcion, fecha) VALUES ('Sesión iniciada por: "+usuario+"', '"+hora_fecha+"');";
        try {
            sentencia.execute(q);
            resultadometa= resultado.getMetaData();
        } catch (Exception e) {
            System.out.println(e);
        }
    }  
        
    public static void historial_cliente(String usuario){
        conectar();
        Date date = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String hora_fecha = hourdateFormat.format(date);
        String q = "INSERT INTO bitacora(descripcion, fecha) VALUES ('Cliente añadido: "+usuario+"', '"+hora_fecha+"');";
        try {
            sentencia.execute(q);
            resultadometa= resultado.getMetaData();
        } catch (Exception e) {
            System.out.println(e);
        }
    }  
    
    public static void historial_pendientes(String titulo){
        conectar();
        Date date = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String hora_fecha = hourdateFormat.format(date);
        String q = "INSERT INTO bitacora(descripcion, fecha) VALUES ('Creación del pendiente: "+titulo+"', '"+hora_fecha+"');";
        try {
            sentencia.execute(q);
            resultadometa= resultado.getMetaData();
        } catch (Exception e) {
            System.out.println(e);
        }
    }  
    
    public static void historial_pendiente_eliminado(String usuario){
        conectar();
        Date date = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String hora_fecha = hourdateFormat.format(date);
        String q = "INSERT INTO bitacora(descripcion, fecha) VALUES ('Se marcó como hecho el pendiente: "+usuario+"', '"+hora_fecha+"');";
        try {
            sentencia.execute(q);
            resultadometa= resultado.getMetaData();
        } catch (Exception e) {
            System.out.println(e);
        }
    }  
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    public static void eliminar_pendiente(String nombre){
        conectar();
        String q = "DELETE FROM pendientes WHERE nombre = '"+nombre+"';";
        String q2 = "DELETE FROM pendientes_default WHERE nombre = '"+nombre+"';";
//        System.out.println(q);
        try {
            sentencia.execute(q);
            sentencia.execute(q2);
            resultadometa= resultado.getMetaData();
            DesktopNotify.showDesktopMessage("Hecho", "Pendeinte marcado como hecho", DesktopNotify.SUCCESS, 7000L);
            historial_pendiente_eliminado(nombre);
        } catch (Exception e) {
            System.out.println(e);
        }
        DesktopNotify.showDesktopMessage("Hecho", "Pendeinte marcado como hecho", DesktopNotify.SUCCESS, 7000L);
    }    
        
    
     
    
    
    
    public static int id_sesion(String usuario){
        conectar();
        int datos = 0;
        String q = "SELECT id_user FROM users WHERE usuario = '"+usuario+"'";
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
                datos=(int) filas[0];
                System.out.println("El ID del usuario es: "+datos);
            }
        } catch (Exception e) {
        }
        return datos;
    }    
        
    public static void eliminar_usuario(String us){
        conectar();
        String q = "DELETE FROM users WHERE usuario = '"+us+"';";
//        System.out.println(q);
        try {
            sentencia.execute(q);
            resultadometa= resultado.getMetaData();
            DesktopNotify.showDesktopMessage("Usuario eliminado", "Usuario eliminado con éxito", DesktopNotify.SUCCESS, 7000L);
            historial_usuario_eliminado(us);
        } catch (Exception e) {
            System.out.println(e);
        }
    }        
        
    public static void añadir_usuario(String us, String contra){
        conectar();
        String q = "INSERT INTO users(usuario, contrasena) VALUES ('"+us+"', '"+contra+"');";
//        System.out.println(q);
        try {
            sentencia.execute(q);
            resultadometa= resultado.getMetaData();
            DesktopNotify.showDesktopMessage("Usuario añadido", "Usuario añadido con éxito", DesktopNotify.SUCCESS, 7000L);
            historial_usuario(us);
        } catch (Exception e) {
            System.out.println(e);
        }
    }            
        
    
    public static ArrayList<Object[]> llenar_historial(){
        conectar();
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        String q = "SELECT descripcion, fecha FROM bitacora";
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
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        return datos;
    }    
    
    public static ArrayList<Object[]> llenar_historial_fecha(String fecha, String fecha1){
        conectar();
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        String q = "SELECT descripcion, fecha FROM bitacora WHERE fecha>'"+fecha+"' AND fecha<'"+fecha1+"'   ";
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
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        return datos;
    }    
    public static ArrayList<Object[]> llenar_pendientes_fecha(int ano, int dia, String mes, int ano1, int dia1, String mes1){
        conectar();
        
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        String q = "SELECT nombre, descripcion, CONCAT(fecha_pendiente_dia, '-' , fecha_pendiente_mes, '-',fecha_pendiente_ano) FROM vista_pendientes WHERE fecha_pendiente_dia>"+dia+" AND fecha_pendiente_dia<"+dia1+" AND fecha_pendiente_mes>"+mes+" AND fecha_pendiente_mes<"+mes1+" AND fecha_pendiente_ano>"+ano+" AND fecha_pendiente_ano<"+ano1+" ORDER BY nombre DESC;";
        String q2 = "SELECT nombre, descripcion, CONCAT(fecha_pendiente_dia, '-' , fecha_pendiente_mes, '-',fecha_pendiente_ano) FROM vista_pendientes_default WHERE fecha_pendiente_dia>"+dia+" AND fecha_pendiente_dia<"+dia1+" AND fecha_pendiente_mes>"+mes+" AND fecha_pendiente_mes<"+mes1+" AND fecha_pendiente_ano>"+ano+" AND fecha_pendiente_ano<"+ano1+" ORDER BY nombre DESC;";
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
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        
        try {
            resultado=sentencia.executeQuery(q2);
            resultadometa= resultado.getMetaData();
            
        } catch (Exception e) {
            
        }
        try {
            while(resultado.next()){
                Object[] filas = new Object[resultadometa.getColumnCount()];
                for(int i = 0;i<resultadometa.getColumnCount();i++){
                    filas[i]= resultado.getObject(i+1);
                }
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        return datos;
    }
    
    
    
    
    public static ArrayList<Object[]> llenar_pendientes(){
        conectar();
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        String q = "SELECT nombre, descripcion, CONCAT(fecha_pendiente_dia, '-' , fecha_pendiente_mes, '-',fecha_pendiente_ano) FROM vista_pendientes ORDER BY nombre DESC;";
        String q2 = "SELECT nombre, descripcion, CONCAT(fecha_pendiente_dia, '-' , fecha_pendiente_mes, '-',fecha_pendiente_ano) FROM vista_pendientes_default ORDER BY nombre DESC;";
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
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        
        try {
            resultado=sentencia.executeQuery(q2);
            resultadometa= resultado.getMetaData();
            
        } catch (Exception e) {
            
        }
        try {
            while(resultado.next()){
                Object[] filas = new Object[resultadometa.getColumnCount()];
                for(int i = 0;i<resultadometa.getColumnCount();i++){
                    filas[i]= resultado.getObject(i+1);
                }
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        return datos;
    }    
        
        
        
    public static Object[][] ResultSetToArray(ResultSet rs)
    {
        Object obj[][]=null;
        try{
        rs.last();
        ResultSetMetaData rsmd = rs.getMetaData();
        int numCols = rsmd.getColumnCount();
        int numFils =rs.getRow();
        obj=new Object[numFils][numCols];
        int j = 0;
        rs.beforeFirst();
        while (rs.next()){
            for (int i=0;i<numCols;i++)
        {
            obj[j][i]=rs.getObject(i+1);
        }
            j++;
        }
        }
        catch(Exception e){
        }
        return obj;
    }
    
    public static Object[][] correo_cliente(String nombre){
        String datos = null;
        conectar();
        String q = "SELECT corre_electronico FROM clientes WHERE nombre = '"+nombre+"'";
//        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        Object obj[][]=null;
        try {
            resultado=sentencia.executeQuery(q);
//            resultadometa= resultado.getMetaData();
        } catch (Exception e) {
        }
        
        try {
            while(resultado.next()){
//                System.out.println("Hay resultados");
//                datos=resultado.getString("EM_ID");

                obj=ResultSetToArray(resultado);
            }
        } catch (Exception e) {
        }
        
        return obj;
    }    
        
    public static ArrayList<Object[]> datos_email_clientes(String nombre){
        conectar();
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        String q = "SELECT nombre, telefono, corre_electronico FROM clientes WHERE nombre = '"+nombre+"'";
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
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        return datos;
    }
        
    
    
    
    
    public static ArrayList<Object[]> clientes(){
        conectar();
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        String q = "SELECT * FROM clientes;";
        try {
            resultado=sentencia.executeQuery(q);
            resultadometa= resultado.getMetaData();
            
        } catch (Exception e) {
            System.out.println("Consulta clientes "+e);
        }
        try {
            while(resultado.next()){
                Object[] filas = new Object[resultadometa.getColumnCount()];
                for(int i = 0;i<resultadometa.getColumnCount();i++){
                    filas[i]= resultado.getObject(i+1);
                }
                datos.add(filas);
            }
        } catch (Exception e) {
            System.out.println("Consulta clientes "+e);
        }
        return datos;
    }
    
    
    
    public static ArrayList<Object[]> ventas(){
        conectar();
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        String q = "SELECT * FROM ventas;";
        try {
            resultado=sentencia.executeQuery(q);
            resultadometa= resultado.getMetaData();
            
        } catch (Exception e) {
            System.out.println("Consulta clientes "+e);
        }
        try {
            while(resultado.next()){
                Object[] filas = new Object[resultadometa.getColumnCount()];
                for(int i = 0;i<resultadometa.getColumnCount();i++){
                    filas[i]= resultado.getObject(i+1);
                }
                datos.add(filas);
            }
        } catch (Exception e) {
            System.out.println("Consulta clientes "+e);
        }
        return datos;
    }
    
    public static ArrayList<Object[]> users(){
        conectar();
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        String q = "SELECT * FROM users;";
        try {
            resultado=sentencia.executeQuery(q);
            resultadometa= resultado.getMetaData();
            
        } catch (Exception e) {
            System.out.println("Consulta users "+e);
        }
        try {
            while(resultado.next()){
                Object[] filas = new Object[resultadometa.getColumnCount()];
                for(int i = 0;i<resultadometa.getColumnCount();i++){
                    filas[i]= resultado.getObject(i+1);
                }
                datos.add(filas);
            }
        } catch (Exception e) {
            System.out.println("Consulta users"+e);
        }
        return datos;
    }
    
    
    public static ArrayList<Object[]> consulta_clientes(){
        conectar();
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        String q = "SELECT id_cliente, nombre, telefono, corre_electronico, comentarios, creado_por FROM clientes;";
        try {
            resultado=sentencia.executeQuery(q);
            resultadometa= resultado.getMetaData();
            
        } catch (Exception e) {
            System.out.println("Consulta clientes "+e);
        }
        try {
            while(resultado.next()){
                Object[] filas = new Object[resultadometa.getColumnCount()];
                for(int i = 0;i<resultadometa.getColumnCount();i++){
                    filas[i]= resultado.getObject(i+1);
                }
                datos.add(filas);
            }
        } catch (Exception e) {
            System.out.println("Consulta clientes "+e);
        }
        return datos;
    }
    
        public static int id_cliente(String nombre) throws SQLException{
        int datos = 0;
        conectar();
        String q = "SELECT id_cliente FROM clientes WHERE nombre='"+nombre+"'";
        
        try {
            resultado=sentencia.executeQuery(q);
            resultadometa= resultado.getMetaData();
            
        } catch (Exception e) {
        }
        
        try {
            while(resultado.next()){
                System.out.println("Hay resultados");
                datos=resultado.getInt(1);
            }
            System.out.println("NO hay resultados");
        } catch (Exception e) {
        }
        
        return datos;
    }
        
    public static ArrayList<Object[]> pendientes(){
        conectar();
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        String q = "SELECT nombre, descripcion, fecha_creacion FROM pendientes, pendientes_default";
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
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        return datos;
    }
}
