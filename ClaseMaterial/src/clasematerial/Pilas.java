
package clasematerial;

public class Pilas {
    private Material Ultimo;

    public Pilas() {
        this.Ultimo = null;
    }

    public boolean Esta_Vacia() {
        return Ultimo == null;
    }

    public void Agrega(Material material) {
        material.setSiguiente(Ultimo);
        Ultimo = material;
    }

    public Material Elimina() {
        if (Esta_Vacia()) {
            return null;
        } else {
            Material Material_Eliminado = Ultimo;
            Ultimo = Ultimo.getSiguiente();
            return Material_Eliminado;
        }
    }
}
