
package Estructuras;

public class Cola {

    private Nodo delante;
    private Nodo atras;

    public Cola() {
    }

    public Cola(Nodo delante, Nodo atras) {
        this.delante = delante;
        this.atras = atras;
    }

    public Nodo getDelante() {
        return delante;
    }

    public void setDelante(Nodo delante) {
        this.delante = delante;
    }

    public Nodo getAtras() {
        return atras;
    }

    public void setAtras(Nodo atras) {
        this.atras = atras;
    }

    public boolean isVacia() {
        return (delante == null);
    }

    public void agregarElemento(Object element) {
        Nodo nodoC = new Nodo(element);
        if (isVacia()) {
            delante = nodoC;
            atras = nodoC;
        } else {
            atras.setNext(nodoC);
            atras = nodoC;
        }
    }

    public Object quitarElemento() {
        Nodo aux = delante;
        Object element = null;
        if (!isVacia()) {
            element = delante.getDato();
            delante = delante.getNext();
            aux.setNext(null);
        }
        return element;
    }

    @Override
    public String toString() {

        String s = "Cola: \n";
        Nodo aux = delante;
        while (aux != null) {
            s += aux.getDato() + " \n";
            aux = aux.getNext();
        }
        return s;
    }
}
