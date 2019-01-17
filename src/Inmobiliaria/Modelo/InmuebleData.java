/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inmobiliaria.Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author juan0
 */
public class InmuebleData {
    private Connection conexion;
    private Conexion con;
    public InmuebleData(Conexion conexion){
        this.conexion = conexion.getCon();
        this.con = conexion;
    }
 
public void guardarInmueble(Inmueble inmueble){
        
        
        try {
            String sql = "INSERT INTO inmueble (direccion, cantidad_de_ambientes, precio, disponible, id_persona_dueña) VALUES (?, ?, ?, ?, ?);";
            
            PreparedStatement ps = conexion.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, inmueble.getDireccion());
            ps.setInt(2, inmueble.getCantidad_de_ambientes());
            ps.setDouble(3, inmueble.getPrecio());
            ps.setBoolean(4, inmueble.getDisponible());
            ps.setInt(5, inmueble.getPersona().getId_persona());
            int filas = ps.executeUpdate();
            if(filas > 0){
                JOptionPane.showMessageDialog(null, "Filas Agregadas "+filas);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InmuebleData.class.getName()).log(Level.SEVERE, null, ex);
        }
                
            
        }

  public Inmueble buscarInmueble(Double costo, int cantidadDeambiente){
       Inmueble inmueble = null;
      
        try {
            String sql = "SELECT * FROM inmueble WHERE precio = ? AND cantidad_de_ambientes = ? ";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setDouble(1, costo);
            ps.setInt(2,  cantidadDeambiente);
            PersonaData pd=new PersonaData(con);
            ResultSet resultset = ps.executeQuery();
            while(resultset.next()){
             inmueble = new Inmueble();
             inmueble.setId_inmueble(resultset.getInt("id_inmueble"));
             inmueble.setCantidad_de_ambientes(resultset.getInt("cantidad_de_ambientes"));
             inmueble.setDireccion(resultset.getString("direccion"));
             inmueble.setPrecio(resultset.getDouble("precio"));
             inmueble.setDisponible(resultset.getBoolean("disponible"));
             
             int idBuscar=resultset.getInt("id_persona_dueña");
                 Persona p = pd.obtenerPersona(idBuscar);
                inmueble.setPersona(p);
             
            
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(InmuebleData.class.getName()).log(Level.SEVERE, null, ex);
        }
       return inmueble;
    }
    
public void borrarInmueble(int id){
       try {
            String sql = "DELETE FROM inmueble WHERE id_inmueble = ?;";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);
            int filas = ps.executeUpdate();
            if(filas > 0){
                JOptionPane.showMessageDialog(null, "Filas Afectadas "+filas);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(InmuebleData.class.getName()).log(Level.SEVERE, null, ex);
        }
}   

  public void actualizarInmueble(Inmueble inmueble){
        try {
            String sql = "UPDATE inmueble SET direccion = ?, cantidad_de_ambientes = ?, precio = ?, disponible = ?  WHERE id_inmueble = ?;";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, inmueble.getDireccion());
            ps.setInt(2, inmueble.getCantidad_de_ambientes());
            ps.setDouble(3, inmueble.getPrecio());
            ps.setBoolean(4, inmueble.getDisponible());
            
            ps.setInt(5, inmueble.getId_inmueble());
            int filas = ps.executeUpdate();
           if(filas > 0){
                JOptionPane.showMessageDialog(null, "Filas Actualizadas "+filas);
            }
             
        } catch (SQLException ex) {
            Logger.getLogger(InmuebleData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

 public List<Inmueble> obtenerInmuebles(){
        List<Inmueble> inmuebles= new ArrayList<>();
       
      try {
            
            String sql = "SELECT * FROM inmueble;";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet resultset = ps.executeQuery();
            
            PersonaData pd= new PersonaData(con);
            Inmueble inmueble;
            while(resultset.next()){
              inmueble = new Inmueble();
              inmueble.setId_inmueble(resultset.getInt("id_inmueble"));
              inmueble.setDireccion(resultset.getString("direccion"));
              inmueble.setCantidad_de_ambientes(resultset.getInt("cantidad_de_ambientes"));
              inmueble.setPrecio(resultset.getDouble("precio"));
              inmueble.setDisponible(resultset.getBoolean("disponible"));
              int idBuscar=resultset.getInt("id_persona_dueña");
                 Persona p = pd.obtenerPersona(idBuscar);
                inmueble.setPersona(p);
              inmuebles.add(inmueble);
            }
           ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(InmuebleData.class.getName()).log(Level.SEVERE, null, ex);
        }
   return inmuebles;
  }

public Inmueble obtenerInmueble(int id) {
    Inmueble inmueble=null;    
    try {
            
            String sql = "SELECT * FROM inmueble WHERE id_inmueble =?;";
            
            PreparedStatement statement = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
            ResultSet resultset= statement.executeQuery();
           
            PersonaData pd= new PersonaData(con);
            while (resultset.next()){
                inmueble = new Inmueble ();
                
                inmueble.setId_inmueble(resultset.getInt("id_inmueble"));
                inmueble.setDireccion(resultset.getString("direccion"));
                inmueble.setCantidad_de_ambientes(resultset.getInt("cantidad_de_ambientes"));
                inmueble.setPrecio(resultset.getDouble("precio"));
                inmueble.setDisponible(resultset.getBoolean("disponible"));
                
                int idBuscar=resultset.getInt("id_persona_dueña");
                Persona p = pd.obtenerPersona(idBuscar);
                inmueble.setPersona(p);
                
            }
            statement.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(InmuebleData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return inmueble;
        }

public List<Inmueble> obtenerInmueblesDisponibles(){
        List<Inmueble> inmuebles= new ArrayList<>();
       
      try {
            
            String sql = "SELECT * FROM inmueble WHERE disponible;";
            PreparedStatement ps = conexion.prepareStatement(sql);
            
            ResultSet resultset = ps.executeQuery();
            
            PersonaData pd= new PersonaData(con);
            Inmueble inmueble;
            while(resultset.next()){
              inmueble = new Inmueble();
              inmueble.setId_inmueble(resultset.getInt("id_inmueble"));
              inmueble.setDireccion(resultset.getString("direccion"));
              inmueble.setCantidad_de_ambientes(resultset.getInt("cantidad_de_ambientes"));
              inmueble.setPrecio(resultset.getDouble("precio"));
              inmueble.setDisponible(resultset.getBoolean("disponible"));
              int idBuscar=resultset.getInt("id_persona_dueña");
                 Persona p = pd.obtenerPersona(idBuscar);
                inmueble.setPersona(p);
              inmuebles.add(inmueble);
            }
           ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(InmuebleData.class.getName()).log(Level.SEVERE, null, ex);
        }
   return inmuebles;
  }
   
   public List<Inmueble> obtenerInmueblesDisponibles(int ambiente){
        List<Inmueble> inmuebles= new ArrayList<>();
       
      try {
            
            String sql = "SELECT * FROM inmueble WHERE disponible AND cantidad_de_ambientes = ambiente ;";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, ambiente);
            ResultSet resultset = ps.executeQuery();
            
            PersonaData pd= new PersonaData(con);
            Inmueble inmueble;
            while(resultset.next()){
              inmueble = new Inmueble();
              inmueble.setId_inmueble(resultset.getInt("id_inmueble"));
              inmueble.setDireccion(resultset.getString("direccion"));
              inmueble.setCantidad_de_ambientes(resultset.getInt("cantidad_de_ambientes"));
              inmueble.setPrecio(resultset.getDouble("precio"));
              inmueble.setDisponible(resultset.getBoolean("disponible"));
              int idBuscar=resultset.getInt("id_persona_dueña");
                 Persona p = pd.obtenerPersona(idBuscar);
                inmueble.setPersona(p);
              inmuebles.add(inmueble);
            }
           ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(InmuebleData.class.getName()).log(Level.SEVERE, null, ex);
        }
   return inmuebles;
  }

}
