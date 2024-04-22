
package Estructuras;

public class Pila {

    private Nodo cima;

    public Pila() {
    }

    public Pila(Nodo cima) {
        this.cima = cima;
    }

    public Nodo getCima() {
        return cima;
    }

    public void setCima(Nodo cima) {
        this.cima = cima;
    }

    public boolean isVacia() {
        return (this.cima == null);
    }

    public void apilar(Object element) {
        Nodo nodoP = new Nodo(element);
        if (isVacia()) {
            cima = nodoP;
        } else {
            nodoP.setNext(cima);
            cima = nodoP;
        }
    }

    public Object desapilar() {
        Object element = null;
        if (!isVacia()) {
            element = cima.getDato();
            cima = cima.getNext();
        }
        return element;
    }

    @Override
    public String toString() {
        String s = "Pila: ";
        if (!isVacia()) {
            Nodo aux = cima;
            while (aux != null) {
                s = s + aux.getDato() + "\n";
                aux = aux.getNext();
            }
        }
        return s;
    }

}
