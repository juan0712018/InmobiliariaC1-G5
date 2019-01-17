/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inmobiliaria.Modelo;

import java.sql.Date;
import java.time.LocalDate;

/**
 *
 * @author juan0
 */
public class Alquiler {
    private int id_alquiler;
    private Double precio;
    private LocalDate fecha_de_inicio;
    private LocalDate fin_de_contrato;
    private Persona persona;
    private Inmueble inmueble;

    public Alquiler(int id_alquiler, Double precio, LocalDate fecha_de_inicio, LocalDate fin_de_contrato, Persona persona, Inmueble inmueble) {
        this.id_alquiler = id_alquiler;
        this.precio = precio;
        this.fecha_de_inicio = fecha_de_inicio;
        this.fin_de_contrato = fin_de_contrato;
        this.persona = persona;
        this.inmueble = inmueble;
    }
    
    public Alquiler(Double precio, LocalDate fecha_de_inicio, LocalDate fin_de_contrato, Persona persona, Inmueble inmueble) {
        this.precio = precio;
        this.fecha_de_inicio = fecha_de_inicio;
        this.fin_de_contrato = fin_de_contrato;
        this.persona = persona;
        this.inmueble = inmueble;
    }
    
    public Alquiler(Double precio, LocalDate fecha_de_inicio, LocalDate fin_de_contrato) {
      
    }
    

  public   Alquiler() {
        
    }

    
        

    public Alquiler(Double precio, Date fecha, Date fecha2) {
        this.precio = precio;
        this.fecha_de_inicio = fecha_de_inicio;
        this.fin_de_contrato = fin_de_contrato;
    }

    

    public void setId_alquiler(int id_alquiler) {
        this.id_alquiler = id_alquiler;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setFecha_de_inicio(LocalDate fecha_de_inicio) {
        this.fecha_de_inicio = fecha_de_inicio;
    }

    public void setFin_de_contrato(LocalDate fin_de_contrato) {
        this.fin_de_contrato = fin_de_contrato;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }

    public int getId_alquiler() {
        return id_alquiler;
    }

    public Double getPrecio() {
        return precio;
    }

    public LocalDate getFecha_de_inicio() {
        return fecha_de_inicio;
    }

    public LocalDate getFin_de_contrato() {
        return fin_de_contrato;
    }

    public Persona getPersona() {
        return persona;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }
         
     @Override
    public String toString() {
        return  fecha_de_inicio+" "+precio+" "+fin_de_contrato+" "+id_alquiler+" "+persona+" "+inmueble;//To change body of generated methods, choose Tools | Templates.
    }
}
