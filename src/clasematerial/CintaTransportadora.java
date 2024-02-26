package clasematerial;

public class CintaTransportadora {

    Material cabeza;

    public CintaTransportadora() {
        this.cabeza = null;
    }

    public void agregarMaterial(Material material) {
        if (cabeza == null) {
            cabeza = Material;
        } else {
            Material actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = material;
        }
    }

    public void eliminarMaterial(String nombreMaterial) {
        if (cabeza != null) {
            if (cabeza.nombre.equals(nombreMaterial)) {
                cabeza = cabeza.siguiente;
            } else {
                Material actual = cabeza;
                while (actual.siguiente != null && !actual.siguiente.nombre.equals(nombreMaterial)) {
                    actual = actual.siguiente;
                }
                if (actual.siguiente != null) {
                    actual.siguiente = actual.siguiente.siguiente;
                }
            }
        }
    }

    public void mostrarContenido() {
        Material actual = cabeza;
        while (actual != null) {
            System.out.println(actual.nombre);
            actual = actual.siguiente;
        }
    }

}
