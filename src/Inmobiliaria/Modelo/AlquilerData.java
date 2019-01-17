/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inmobiliaria.Modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author juan0
 */

    public class AlquilerData {
     private Connection conexion;
     private Conexion conectar;

    public AlquilerData(Conexion conectar) {
        conexion = conectar.getCon();
        this.conectar= conectar;
    }
    public void guardarAlquiler(Alquiler alquiler){
        try {
            String sql = "INSERT INTO alquiler (precio, fecha_de_inicio, fin_de_contrato, id_persona,id_inmueble) VALUES (?, ?, ?,?,?);";
            PreparedStatement ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setDouble(1, alquiler.getPrecio());
            ps.setDate(2, Date.valueOf(alquiler.getFecha_de_inicio()));
            ps.setDate(3, Date.valueOf(alquiler.getFin_de_contrato()));
            ps.setInt(4, alquiler.getPersona().getId_persona() );
            ps.setInt(5, alquiler.getInmueble().getId_inmueble());
           
            
            int filas = ps.executeUpdate();
            if(filas >0){
            JOptionPane.showMessageDialog(null, "Filas Agregadas "+filas);
        }
           
            
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PersonaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void borrarAlquiler(int id) {
      try {
        String sql = "DELETE FROM alquiler WHERE id_alquiler = ?;";
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setInt(1, id);
        int filas = ps.executeUpdate();
        if(filas >0){
            JOptionPane.showMessageDialog(null, "Filas Afectadas "+filas);
        }
            ps.close();
         } catch (SQLException ex) {
             Logger.getLogger(AlquilerData.class.getName()).log(Level.SEVERE, null, ex);
         }}
     public void actualizarAlquiler(Alquiler alquiler){
        try {
            String sql = "UPDATE alquiler SET precio = ?, fecha_de_inicio = ?, fin_de_contrato = ?;";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setDouble(1, alquiler.getPrecio());
            ps.setDate(2, Date.valueOf(alquiler.getFecha_de_inicio()));
            ps.setDate(3, Date.valueOf(alquiler.getFin_de_contrato()));
            
            
           int filas =  ps.executeUpdate();
            if(filas >0){
            JOptionPane.showMessageDialog(null, "Filas Actualizada "+filas);
        }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PersonaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       
    
       public List<Alquiler> obtenerAlquileres(){
        List<Alquiler> alquileres = new ArrayList<>();
            InmuebleData InD= new InmuebleData(conectar);
PersonaData pd = new PersonaData(conectar);
        try {
            String sql = "SELECT * FROM alquiler;";
            PreparedStatement statement = conexion.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Alquiler alquiler;
            while(resultSet.next()){
                alquiler = new Alquiler();
                alquiler.setId_alquiler(resultSet.getInt("id_alquiler"));
                alquiler.setPrecio(resultSet.getDouble("precio"));
                alquiler.setFecha_de_inicio(resultSet.getDate("fecha_de_inicio").toLocalDate());
                alquiler.setFin_de_contrato(resultSet.getDate("fin_de_contrato").toLocalDate());
                int idBuscar=resultSet.getInt("id_persona");
                 Persona p = pd.obtenerPersona(idBuscar);
                alquiler.setPersona(p);
                int idBuscarIn=resultSet.getInt("id_inmueble");
                Inmueble in= InD.obtenerInmueble(idBuscarIn);
                alquiler.setInmueble(in);
                
                alquileres.add(alquiler);
                
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Erroe al obtener la lista " + ex.getMessage());
}
         
        return alquileres;
     
     
       }
       public Alquiler obtenerAlquiler(int id)throws SQLException{
        
            InmuebleData InD= new InmuebleData(conectar);
PersonaData pd = new PersonaData(conectar);
       
            String sql = "SELECT * FROM alquiler WHERE id_alquiler=?;";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet resultSet = ps.executeQuery();
            Alquiler alquiler=null;
            while(resultSet.next()){
                alquiler = new Alquiler();
                alquiler.setId_alquiler(resultSet.getInt("id_alquiler"));
                alquiler.setPrecio(resultSet.getDouble("precio"));
                alquiler.setFecha_de_inicio(resultSet.getDate("fecha_de_inicio").toLocalDate());
                alquiler.setFin_de_contrato(resultSet.getDate("fin_de_contrato").toLocalDate());
                int idBuscar=resultSet.getInt("id_persona");
                 Persona p = pd.obtenerPersona(idBuscar);
                alquiler.setPersona(p);
                int idBuscarIn=resultSet.getInt("id_inmueble");
                Inmueble in= InD.obtenerInmueble(idBuscarIn);
                alquiler.setInmueble(in);
                
               
                
            }      
            ps.close();
 
         
        return alquiler;
     
     }
        public Alquiler obtenerAlquilerXFechaInicio(LocalDate fecha)throws SQLException{
        
            InmuebleData InD= new InmuebleData(conectar);
PersonaData pd = new PersonaData(conectar);
       
            String sql = "SELECT * FROM alquiler WHERE fecha_de_inicio=?;";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(fecha));
            ResultSet resultSet = ps.executeQuery();
            Alquiler alquiler=null;
            while(resultSet.next()){
                alquiler = new Alquiler();
                alquiler.setId_alquiler(resultSet.getInt("id_alquiler"));
                alquiler.setPrecio(resultSet.getDouble("precio"));
                alquiler.setFecha_de_inicio(resultSet.getDate("fecha_de_inicio").toLocalDate());
                alquiler.setFin_de_contrato(resultSet.getDate("fin_de_contrato").toLocalDate());
                int idBuscar=resultSet.getInt("id_persona");
                 Persona p = pd.obtenerPersona(idBuscar);
                alquiler.setPersona(p);
                int idBuscarIn=resultSet.getInt("id_inmueble");
                Inmueble in= InD.obtenerInmueble(idBuscarIn);
                alquiler.setInmueble(in);
                
               
                
            }      
            ps.close();
 
         
        return alquiler;
     
     }
}


