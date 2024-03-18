/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasematerial;

/**
 *
 * @author Gravyn
 */
public class ColaPersonalizada {
    private ListaVinculada lista;

    public ColaPersonalizada() {
        this.lista = new ListaVinculada();
    }

    // Método para encolar un nuevo dato
    public void encolar(int dato) {
        lista.insertar(dato);
    }

    // Método para desencolar y devolver el primer dato
    public int desencolar() {
        return lista.eliminar();
    }

    // Método para verificar si la cola está vacía
    public boolean estaVacia() {
        return lista.estaVacia();
    }
}
