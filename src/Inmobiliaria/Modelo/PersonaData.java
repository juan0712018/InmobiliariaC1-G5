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
public class PersonaData {
    private Connection conexion;
    
    public PersonaData(Conexion conexion){
        this.conexion = conexion.getCon();
    }
    
  public void guardarPersona(Persona persona){
        
        try {
            String sql = "INSERT INTO persona (nombre, dni, celular) VALUES (?, ?, ?);";
            PreparedStatement ps = conexion.prepareStatement(sql);
            
            ps.setString(1, persona.getNombre());
            ps.setInt(2, persona.getDni());
            ps.setInt(3, persona.getCelular());
            int filas = ps.executeUpdate();
            if(filas > 0){
                JOptionPane.showMessageDialog(null, "Fila Agregadas "+filas);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PersonaData.class.getName()).log(Level.SEVERE, null, ex);
        }
} 
  
   public void borrarPersona(int id){
        
        try {
            String sql = "DELETE FROM persona WHERE id_persona = ?;";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);
            int filas = ps.executeUpdate();
            if (filas > 0){
                JOptionPane.showMessageDialog(null, "Fila Afectadas "+filas);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PersonaData.class.getName()).log(Level.SEVERE, null, ex);
        }
   }        
    
   public void actualizarPersona(Persona persona){
        
        try {
            String sql = "UPDATE persona SET nombre = ?, dni = ?, celular = ? ;";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, persona.getNombre());
            ps.setInt(2, persona.getDni());
            ps.setInt(3, persona.getCelular());
            
            int filas =ps.executeUpdate();
            if(filas > 0){
                JOptionPane.showMessageDialog(null, "Fila Actualizadas "+filas);
            }
            
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PersonaData.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   
   
       public Persona buscarPersona(String nombre){
        Persona persona= null;
           try {
            
            
            String sql = "SELECT * FROM persona WHERE nombre LIKE ?;";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet resultset = ps.executeQuery();
            while(resultset.next()){
                persona = new Persona();
                persona.setId_persona(resultset.getInt("id_persona"));
                persona.setNombre(resultset.getString("nombre"));
                persona.setDni(resultset.getInt("dni"));
                persona.setCelular(resultset.getInt("celular"));
                
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PersonaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return persona;
       }


            
             public List<Persona> obtenerPersona(){
         List<Persona> personas = new ArrayList<Persona>();
                 
                 try {
            String sql = "SELECT * FROM persona;";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            Persona persona;
            while(resultSet.next()){
                persona = new Persona();
                persona.setId_persona(resultSet.getInt("id_persona"));
                persona.setNombre(resultSet.getString("nombre"));
                persona.setDni(resultSet.getInt("dni"));
                persona.setCelular(resultSet.getInt("celular"));

                personas.add(persona);
            }      
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PersonaData.class.getName()).log(Level.SEVERE, null, ex);
        }
                 return personas;
        } 
               
               public Persona obtenerPersona(int id){
         Persona persona;
        persona = null;
                 try {
            String sql = "SELECT * FROM persona WHERE id_persona = ?;";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet resultSet = ps.executeQuery();
            
            while(resultSet.next()){
                persona = new Persona();
                persona.setId_persona(resultSet.getInt("id_persona"));
                persona.setNombre(resultSet.getString("nombre"));
                persona.setDni(resultSet.getInt("dni"));
                persona.setCelular(resultSet.getInt("celular"));

               
            }      
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PersonaData.class.getName()).log(Level.SEVERE, null, ex);
        }
                 return persona;
        }        


}

