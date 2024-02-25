
package clasematerial;

public class Cola_Material {
    private Material Primero;
    private Material Ultimo;

    public Cola_Material() {
        this.Primero = null;
        this.Ultimo = null;
    }

    public boolean Esta_Vacia() {
        return Primero == null;
    }

    public void Agregar(Material material) {
        if (Esta_Vacia()) {
            Primero = material;
            Ultimo = material;
        } else {
            Ultimo.setSiguiente(material);
            Ultimo = material;
        }
    }

    public Material quitar() {
        if (Esta_Vacia()) {
            return null;
        } else {
            Material materialEliminado = Primero;
            Primero = Primero.getSiguiente();
            return materialEliminado;
        }
    }
}