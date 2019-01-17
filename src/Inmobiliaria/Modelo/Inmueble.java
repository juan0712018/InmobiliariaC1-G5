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
public class Inmueble {
    private int id_inmueble;
    private Double precio;
    private String direccion;
    private int cantidad_de_ambientes;
    private Boolean disponible;
    private Persona persona;

    public Inmueble(int id_inmueble, Double precio, String direccion, int cantidad_de_ambientes, Boolean disponible, Persona persona) {
        this.id_inmueble = id_inmueble;
        this.precio = precio;
        this.direccion = direccion;
        this.cantidad_de_ambientes = cantidad_de_ambientes;
        this.disponible = disponible;
        this.persona = persona;
    }
   
    public Inmueble( Double precio, String direccion, int cantidad_de_ambientes, Boolean disponible, Persona persona) {
        this.precio = precio;
        this.direccion = direccion;
        this.cantidad_de_ambientes = cantidad_de_ambientes;
        this.disponible = disponible;
        this.persona = persona;
    }

    Inmueble() {
        
    }

    public Inmueble(String direc, int ambiente, Double precio, Boolean dispo) {
        this.precio = precio;
        this.direccion = direccion;
        this.cantidad_de_ambientes = cantidad_de_ambientes;
        this.disponible = disponible;
    }

    public void setId_inmueble(int id_inmueble) {
        this.id_inmueble = id_inmueble;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCantidad_de_ambientes(int cantidad_de_ambientes) {
        this.cantidad_de_ambientes = cantidad_de_ambientes;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getId_inmueble() {
        return id_inmueble;
    }

    public Double getPrecio() {
        return precio;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getCantidad_de_ambientes() {
        return cantidad_de_ambientes;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public Persona getPersona() {
        return persona;
    }
    
    @Override
    public String toString() {
        return id_inmueble+" "+direccion+" "+precio; //To change body of generated methods, choose Tools | Templates.
    }
   
}
