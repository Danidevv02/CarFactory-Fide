/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author PC
 */
public class Hub {
    private int pedidosEntrantes;
    private int tiempoRestante;
    private int dineroObtenido;

    public Hub() {
        this.pedidosEntrantes = 0;
        this.tiempoRestante = 0;
        this.dineroObtenido = 0;
    }
    
    

    public Hub(int pedidosEntrantes, int tiempoRestante, int dineroObtenido) {
        this.pedidosEntrantes = pedidosEntrantes;
        this.tiempoRestante = tiempoRestante;
        this.dineroObtenido = dineroObtenido;
    }

    public int getPedidosEntrantes() {
        return pedidosEntrantes;
    }

    public void setPedidosEntrantes(int pedidosEntrantes) {
        this.pedidosEntrantes = pedidosEntrantes;
    }

    public int getTiempoRestante() {
        return tiempoRestante;
    }

    public void setTiempoRestante(int tiempoRestante) {
        this.tiempoRestante = tiempoRestante;
    }

    public int getDineroObtenido() {
        return dineroObtenido;
    }

    public void setDineroObtenido(int dineroObtenido) {
        this.dineroObtenido = dineroObtenido;
    }

    @Override
    public String toString() {
        return "Hub{" + "pedidosEntrantes=" + pedidosEntrantes + ", tiempoRestante=" + tiempoRestante + ", dineroObtenido=" + dineroObtenido + '}';
    }
    
    
    
}
