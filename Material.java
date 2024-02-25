
package clasematerial;

public class Material {
    private String Nombre;
    private Material Siguiente;

    public Material(String nombre) {
        this.Nombre = nombre;
        this.Siguiente = null;
    }

    public String getNombre() {
        return Nombre;
    }

    public Material getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Material siguiente) {
        this.Siguiente = siguiente;
    }
}