/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Estructuras.ListaEnlazada;

/**
 *
 * @author PC
 */
public class Auto {
    private int id;
    private String nombre;
    private ListaEnlazada materiales;
    private int coste;
    public Auto() {
    }

    public Auto(int id, String nombre, ListaEnlazada materiales, int coste) {
        this.id = id;
        this.nombre = nombre;
        this.materiales = materiales;
        this.coste = coste;
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

    public ListaEnlazada getMateriales() {
        return materiales;
    }

    public void setMateriales(ListaEnlazada materiales) {
        this.materiales = materiales;
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }

    @Override
    public String toString() {
        return "Auto{" + "id=" + id + ", nombre=" + nombre + ", materiales=" + materiales + ", coste=" + coste + '}';
    }
    
    
    
}
