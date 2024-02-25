
package clasematerial;

public class Auto {
    private String Nombre;
    private Pilas Materiales; 

    public Auto(String nombre) {
        this.Nombre = nombre;
        this.Materiales = new Pilas();
    }

    public void Agregar_Material(Material material) {
        Materiales.Agrega(material);
    }

    public Pilas getMateriales() {
        return Materiales;
    }
}
