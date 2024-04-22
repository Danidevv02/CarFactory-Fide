/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author Daniel
 */
public class MaterialesAuto {
    private int id;
    private String nombre;

    public MaterialesAuto() {
    }

    public MaterialesAuto(String nombre) {
        this.nombre = nombre;
    }
    
    public MaterialesAuto(int id, String nombre) {
        this.nombre = nombre;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "MaterialesAuto{" + "id=" + id + ", nombre=" + nombre + '}';
    }

    
    
    
}
