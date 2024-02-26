/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasematerial;

/**
 *
 * @author PC
 */
public class Jugador {
    private String nombre;
    private int dinero;
    private int nivel;
    private int ordenesPerdidas;

    // Constructor
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.dinero = 0;
        this.nivel = 1;
        this.ordenesPerdidas = 0;
    }

    // Método para producir un auto del tipo especificado
    public void generarAuto(String tipoAuto) {
        System.out.println(nombre + " ha producido un auto de tipo " + tipoAuto);
        // logica para verificar objetivo fabrica ;)
    }

    public void eliminarMaterial(Material material) {
        System.out.println(nombre + " ha descartado un material de la cinta transportadora");
        // para eliminar un material de la cinta tranportadora 
    }

    
    public void generarDinero(int monto) {
        dinero += monto;
        System.out.println(nombre + " ha ganado $" + monto); // aumenta dinero del jugador
    }

   
    public void perderOrden() {
        ordenesPerdidas++;
        System.out.println(nombre + " ha perdido una orden"); //aumenta numero de cantidad de ordenes perdidas del jugador 
    }

    
    public void ganarPartida() {
        System.out.println(nombre + " ha ganado la partida. ¡Felicidades!"); // GANO GG
    }

    // Método para mostrar un mensaje de derrota
    public void perderPartida() {
        System.out.println(nombre + " ha perdido la partida. ¡Mejor suerte la próxima vez!");  //Nada que hacer
    }

    // Getter para obtener el nivel del jugador
    public int getNivel() {
        return nivel;
    }

    
    public String generarTipoAutoAleatorio() {
        String[] tiposAutos = {"Sedan de lujo", "SUV de lujo", "Pick-up de alta gama", "Maquinaria de alta gama", "Superauto Deportivo"}; // Esto sirve para generar un tipo de carro aleatorio para que sepan
        int index = (int) (Math.random() * tiposAutos.length);
        return tiposAutos[index];
    }
}
