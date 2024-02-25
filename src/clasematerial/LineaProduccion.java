package clasematerial;


import clasematerial.Auto;


public class LineaProduccion {
    
 private EstadoLineaProduccion estado;
    private Auto autoEnProduccion;

    public LineaProduccion() {
        this.estado = EstadoLineaProduccion.DISPONIBLE;
        this.autoEnProduccion = null;
    }

    public void comenzarProduccion(String tipoAuto) {
        if (estado == EstadoLineaProduccion.DISPONIBLE) {
  
            this.autoEnProduccion = new Auto(tipoAuto);  
            this.estado = EstadoLineaProduccion.OCUPADA;
            System.out.println("Producción de " + tipoAuto + " iniciada en la línea de producción.");
        } else {
            System.out.println("La línea de producción está ocupada. No se puede comenzar la producción.");
        }
    }

    public void terminarProduccion() {
        if (estado == EstadoLineaProduccion.OCUPADA) {
            this.autoEnProduccion = null;
            this.estado = EstadoLineaProduccion.DISPONIBLE;
            System.out.println("Producción finalizada. Línea de producción disponible.");
        } else {
            System.out.println("La línea de producción no está ocupada. No se puede finalizar la producción.");
        }
    }

    public boolean estaDisponible() {
        return estado == EstadoLineaProduccion.DISPONIBLE;
    }
}

enum EstadoLineaProduccion {
    DISPONIBLE,
    OCUPADA
}    

