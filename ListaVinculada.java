package clasematerial;

/**
 *
 * @author Gravyn
 */
public class ListaVinculada {
    private Nodo cabeza;
    private Nodo cola;

    public ListaVinculada() {
        this.cabeza = null;
        this.cola = null;
    }

    public void insertar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            cola.siguiente = nuevoNodo;
            cola = nuevoNodo;
        }
    }

    public int eliminar() {
        if (cabeza == null) {
            throw new RuntimeException("La lista está vacía");
        }
        int datoEliminado = cabeza.dato;
        cabeza = cabeza.siguiente;
        if (cabeza == null) {
            cola = null;
        }
        return datoEliminado;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }
}
