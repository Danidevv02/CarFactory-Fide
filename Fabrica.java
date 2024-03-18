import javax.swing.JOptionPane;

class Fabrica {
    private int nivel;
    private int dineroObjetivo;
    private int maximoOrdenesPerdidas;
    private int ordenesPerdidas;
    private Queue<String> ordenesEnCola;
    private Queue<String> cintaTransportadora;
    private Queue<String> lineasProduccion;
    private ListaEnlazada<Integer> ordenes;
    private Jugador jugador;

    public Fabrica(int nivel, int dineroObjetivo, int maximoOrdenesPerdidas) {
        this.nivel = nivel;
        this.dineroObjetivo = dineroObjetivo;
        this.maximoOrdenesPerdidas = maximoOrdenesPerdidas;
        this.ordenesPerdidas = 0;
        this.ordenesEnCola = new Queue<>();
        this.cintaTransportadora = new Queue<>();
        this.lineasProduccion = new Queue<>();
    }
        
    public Fabrica(Jugador jugador) {
        this.ordenes = new ListaEnlazada<>();
        this.jugador = jugador;
    }

    public void generarOrden() {
        String[] tiposAutos = {"Sedan", "SUV", "Hatchback"};
        int randIndex = (int) (Math.random() * tiposAutos.length);
        String tipoAuto = tiposAutos[randIndex];
        ordenesEnCola.enqueue(tipoAuto);
        JOptionPane.showMessageDialog(null, "Se ha generado una nueva orden para un auto " + tipoAuto);
    }

    public boolean comprobarMateriales(String tipoAuto) {
        // Supongamos que siempre hay suficientes materiales para cualquier tipo de auto
        return true;
    }

    public void producirAuto(String tipoAuto) {
        if (comprobarMateriales(tipoAuto)) {
            if (!ordenesEnCola.isEmpty() && ordenesEnCola.dequeue().equals(tipoAuto)) {
                lineasProduccion.enqueue(tipoAuto);
                JOptionPane.showMessageDialog(null, "Se ha producido un auto " + tipoAuto);
            }
        }
    }

    public void perderOrden() {
        if (!ordenesEnCola.isEmpty()) {
            ordenesEnCola.dequeue();
            ordenesPerdidas++;
            JOptionPane.showMessageDialog(null, "Se ha perdido una orden.");
        }
    }

    public void ganarPartida() {
        JOptionPane.showMessageDialog(null, "¡La fábrica ha ganado la partida!");
    }

    public void perderPartida() {
        JOptionPane.showMessageDialog(null, "¡La fábrica ha perdido la partida!");
    }

    private static class Queue<T> {
        private Node<T> front;
        private Node<T> rear;

        private static class Node<T> {
            T data;
            Node<T> next;

            Node(T data) {
                this.data = data;
            }
        }

        public void enqueue(T item) {
            Node<T> newNode = new Node<>(item);
            if (rear == null) {
                front = newNode;
                rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }
        }

        public T dequeue() {
            if (front == null) {
                return null;
            }
            T data = front.data;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            return data;
        }

        public boolean isEmpty() {
            return front == null;
        }
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        Fabrica fabrica = new Fabrica(1, 10000, 5);

        fabrica.generarOrdenAleatoria();
        fabrica.producirAuto("SUV");
        fabrica.perderOrden();
        fabrica.ganarPartida();
        fabrica.perderPartida();
    }

    public void cumplirObjetivos() {
        int objetivoDinero = 0;
        int objetivoOrdenesPerdidas = 0;

    private void determinarObjetivos() {
        switch (fabricaActual) {
            case 1:
                objetivoDinero = 90000;
                objetivoOrdenesPerdidas = 3;
                break;
            case 2:
                objetivoDinero = 125000;
                objetivoOrdenesPerdidas = 2;
                break;
            case 3:
                objetivoDinero = 275000;
                objetivoOrdenesPerdidas = 1;
                break;
            default:
                objetivoDinero = 0;
                objetivoOrdenesPerdidas = 0;
                break;
        }
    }  

        if (jugador.alcanzarObjetivo(objetivoDinero, objetivoOrdenesPerdidas)) {
            System.out.println("¡Has alcanzado los objetivos de la fábrica!");
        } else {
            System.out.println("No has alcanzado los objetivos de la fábrica.");
        }
    } 
      
}
