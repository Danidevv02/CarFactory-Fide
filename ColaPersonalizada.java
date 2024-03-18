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

    public void encolar(int dato) {
        lista.insertar(dato);
    }


    public int desencolar() {
        return lista.eliminar();
    }


    public boolean estaVacia() {
        return lista.estaVacia();
    }
}
