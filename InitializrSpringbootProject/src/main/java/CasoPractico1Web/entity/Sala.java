/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CasoPractico1Web.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author joshu
 */
@Entity
@Table (name="sala")
public class Sala implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long numero;
    private long capacidad;

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public long getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(long capacidad) {
        this.capacidad = capacidad;
    }
    
    
    
}
