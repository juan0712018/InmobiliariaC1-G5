/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inmobiliaria.Modelo;

/**
 *
 * @author juan0
 */
public class Persona {
    private int id_persona;
    private String nombre;
    private int dni;
    private int celular;

    public Persona(int id_persona, String nombre, int dni, int celular) {
        this.id_persona = id_persona;
        this.nombre = nombre;
        this.dni = dni;
        this.celular = celular;
    }
    
    public Persona( String nombre, int dni, int celular) {
        this.nombre = nombre;
        this.dni = dni;
        this.celular = celular;
    }

    Persona() {
      
    }

    public void setId_persona(int id_pesona) {
        this.id_persona = id_pesona;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getId_persona() {
        return id_persona;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public int getCelular() {
        return celular;
    }
    
    public String toString(){
        return id_persona+" "+nombre+" "+dni+" "+celular;
    }
    
}
