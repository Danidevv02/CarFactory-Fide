import java.util.List;


public class jugador {
    private String nombre;
    private List<ficha> fichas;
    private List<ficha> fichasEnJuego;
    private int puntaje;
    private List<fichaEspecial> fichasEspeciales;
    private int ordenesPerdidas;

    public jugador(String nombre) {
        this.nombre = nombre;
        this.fichas = new ArrayList<>();
        this.fichasEnJuego = new ArrayList<>();
        this.puntaje = 0;
        this.fichasEspeciales = new ArrayList<>();
        this.dinero = 0;
        this.ordenesPerdidas = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<ficha> getFichas() {
        return fichas;
    }

    public void setFichas(List<ficha> fichas) {
        this.fichas = fichas;
    }

    public List<ficha> getFichasEnJuego() {
        return fichasEnJuego;
    }

    public void setFichasEnJuego(List<ficha> fichasEnJuego) {
        this.fichasEnJuego = fichasEnJuego;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public List<fichaEspecial> getFichasEspeciales() {
        return fichasEspeciales;
    }

    public void setFichasEspeciales(List<FichaEspecial> fichasEspeciales) {
        this.fichasEspeciales = fichasEspeciales;
    }

    public void jugarFicha(Ficha ficha, Posicion posicion) {
        // Implementa la lógica para colocar la ficha en el tablero.
    }

    public void retirarFicha(Posicion posicion) {
        // Implementa la lógica para retirar la ficha del tablero.
    }

    public void pasarTurno() {
        // Implementar la lógica para pasar el turno al siguiente jugador.
    }
    
    public void calcularPuntaje() {
        // Implementar la lógica para calcular el puntaje del jugador.
    }
    
    public List<ficha> obtenerFichasPosibles(Posicion posicion) {
        // Implementar la lógica para obtener las fichas que el jugador puede colocar en una posición específica.
    }
    
    public List<fichaEspecial> obtenerFichasEspecialesPosibles() {
        // Implementar la lógica para obtener las fichas especiales que el jugador puede usar.
    }
    
    public boolean tieneFichasParaJugar() {
        // Implementar la lógica para indicar si el jugador tiene fichas que puede colocar en el tablero.
    }
    
    public boolean tieneFichasEspeciales() {
        // Implementar la lógica para indicar si el jugador tiene fichas especiales que puede usar.
    }
        public int getNivel() {
        return nivel;
    }

    public void incrementarDinero(int cantidad) {
        this.dinero += cantidad;
    }

    public void incrementarOrdenesPerdidas() {
        this.ordenesPerdidas++;
    }

    public boolean alcanzarObjetivo(int objetivoDinero, int objetivoOrdenesPerdidas) {
        return (dinero >= objetivoDinero && ordenesPerdidas <= objetivoOrdenesPerdidas);
    }

    private boolean verificarObjetivos() {
        switch (fabricaActual) {
            case 1:
                return (dinero >= 90000 && ordenesPerdidas <= 3);
            case 2:
                return (dinero >= 125000 && ordenesPerdidas <= 2);
            case 3:
                return (dinero >= 275000 && ordenesPerdidas <= 1);
            default:
                return false;
        }
    }

    public void avanzarFabrica() {
        if (verificarObjetivos()) {
            fabricaActual++;
            System.out.println("¡Has avanzado a la fábrica " + fabricaActual + "!");

        } else {
            System.out.println("No cumples con los requisitos para avanzar de fábrica.");
        }
    }
        
}
