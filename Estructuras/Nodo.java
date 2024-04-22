package Estructuras;


public class Nodo {

    private Object dato;
    private Nodo next;

    public Nodo() {
    }

    public Nodo(Object dato) {
        this.dato = dato;
    }

    public Nodo(Object dato, Nodo next) {
        this.dato = dato;
        this.next = next;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Nodo{" + "Dato=" + dato + ", next=" + next + '}';
    }
}
