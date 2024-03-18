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

    // Método para insertar un nuevo dato al final de la lista
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

    // Método para eliminar y devolver el primer dato de la lista
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

    // Método para verificar si la lista está vacía
    public boolean estaVacia() {
        return cabeza == null;
    }
}
