/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Estructuras.Cola;
import Estructuras.ListaEnlazada;
import Estructuras.Pila;

/**
 *
 * @author Daniel
 */
public class Fabrica {
    private int id;
    private String nombre;
    private ListaEnlazada construccion;
    private Cola cintaTransportadora;
    private int capacidadCinta;
    private Pila basureroMateriales;
    private Hub stats;
    private int dineroObjetivo;
    private int ordenesPerdidas;

    public Fabrica() {
    }
    
    public Fabrica(int id) {
        this.id = id;
    }
    public Fabrica(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    
    public Fabrica(int id, String nombre, int dineroObjetivo) {
        this.id = id;
        this.nombre = nombre;
        this.dineroObjetivo = dineroObjetivo;
    }
    
    public Fabrica(int id, String nombre, int dineroObjetivo, int ordenesPerdidas) {
        this.id = id;
        this.nombre = nombre;
        this.dineroObjetivo = dineroObjetivo;
        this.ordenesPerdidas = ordenesPerdidas;
    }

    public Fabrica(int id, String nombre, ListaEnlazada construccion, Cola cintaTransportadora, int capacidadCinta, Pila basureroMateriales, Hub stats, int dineroObjetivo, int ordenesPerdidas) {
        this.id = id;
        this.nombre = nombre;
        this.construccion = construccion;
        this.cintaTransportadora = cintaTransportadora;
        this.capacidadCinta = capacidadCinta;
        this.basureroMateriales = basureroMateriales;
        this.stats = stats;
        this.dineroObjetivo = dineroObjetivo;
        this.ordenesPerdidas = ordenesPerdidas;
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
    
    public ListaEnlazada getConstruccion() {
        return construccion;
    }

    public void setConstruccion(ListaEnlazada construccion) {
        this.construccion = construccion;
    }

    public Cola getCintaTransportadora() {
        return cintaTransportadora;
    }

    public int getCapacidadCinta() {
        return capacidadCinta;
    }

    public void setCapacidadCinta(int capacidadCinta) {
        this.capacidadCinta = capacidadCinta;
    }  

    public void setCintaTransportadora(Cola cintaTransportadora) {
        this.cintaTransportadora = cintaTransportadora;
    }

    public Pila getBasureroMateriales() {
        return basureroMateriales;
    }

    public void setBasureroMateriales(Pila basureroMateriales) {
        this.basureroMateriales = basureroMateriales;
    }

    public Hub getStats() {
        return stats;
    }

    public void setStats(Hub stats) {
        this.stats = stats;
    }

    public int getDineroObjetivo() {
        return dineroObjetivo;
    }

    public void setDineroObjetivo(int dineroObjetivo) {
        this.dineroObjetivo = dineroObjetivo;
    }

    public int getOrdenesPerdidas() {
        return ordenesPerdidas;
    }

    public void setOrdenesPerdidas(int ordenesPerdidas) {
        this.ordenesPerdidas = ordenesPerdidas;
    }

    @Override
    public String toString() {
        return "Fabrica{" + "id=" + id + ", construccion=" + construccion + ", cintaTransportadora=" + cintaTransportadora + ", basureroMateriales=" + basureroMateriales + ", stats=" + stats + ", dineroObjetivo=" + dineroObjetivo + ", ordenesPerdidas=" + ordenesPerdidas + '}';
    }

}
