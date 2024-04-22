
package Estructuras;


public class ListaEnlazada {

    private Nodo cabeza;

    public ListaEnlazada(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public ListaEnlazada() {
    }

    public Object extrae(Object element) {
        Nodo aux = cabeza;
        Object elementoExtraido = null;
        if (isVacia()) {
            return null;
        } else if (aux.getDato().equals(element)) {
            elementoExtraido = aux.getDato();
            cabeza = aux.getNext();
        } else {
            while (aux.getNext() != null) {
                if (aux.getNext().getDato().equals(element)) {
                    elementoExtraido = aux.getNext().getDato();
                    aux.setNext(aux.getNext().getNext());
                } else {
                    aux = aux.getNext();
                }

            }
        }
        return elementoExtraido;
    }

    public void reemplaza(Object element, Object remplazo) {
        Nodo aux = cabeza;
        if (isVacia()) {
        } else if (aux.getDato().equals(element)) {
            aux.setDato(remplazo);
        } else {
            while (aux.getNext() != null) {
                if (aux.getNext().getDato().equals(element)) {
                    aux.getNext().setDato(remplazo);
                } else {
                    aux = aux.getNext();
                }
            }
        }
    }

    public void insertarElemento(Object element) {
        Nodo insertar = new Nodo(element);
        Nodo aux = cabeza;
        if (isVacia()) {
            cabeza = insertar;
        } else {
            while (aux.getNext() != null) {
                aux = aux.getNext();
            }
            aux.setNext(insertar);
        }
    }

    public boolean existe(Object element) {
        if (isVacia()) {
            return false;
        } else {
            Nodo aux = cabeza;
            do {
                if (aux.getDato().equals(element)) {
                    return true;
                } else {
                    aux = aux.getNext();
                }
            } while (aux.getNext() != null);
            return false;
        }
    }

    public boolean isVacia() {
        return (cabeza == null);
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    @Override
    public String toString() {
        Nodo aux = cabeza;
        String resultado = "Lista: \n";
        while (aux != null) {
            resultado += aux.getDato() + "\n";
            aux = aux.getNext();
        }
        return resultado;
    }

}
