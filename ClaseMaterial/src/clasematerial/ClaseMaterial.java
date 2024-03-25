
package clasematerial;


public class ClaseMaterial {

    public static void main(String[] args) {

        Material Motor_De_Lujo = new Material("Motor de lujo");
        Material Motor_De_Carga = new Material("Motor de carga");
        Material Carroceria = new Material("Carroceria");
        Material Carroceria_Especial = new Material("Carroceria Especial");
        Material Llantas_Trabajo = new Material("Llantas unicas de Trabajo");
        Material Llantas_Deportivas = new Material("Llantas deportivas");


        Auto Sedan_De_Lujo = new Auto("Sedan de lujo");
        Sedan_De_Lujo.Agregar_Material(Motor_De_Lujo);
        Sedan_De_Lujo.Agregar_Material(Carroceria);

        Auto Suv_De_Lujo = new Auto("SUV de lujo");
        Suv_De_Lujo.Agregar_Material(Motor_De_Lujo);
        Suv_De_Lujo.Agregar_Material(Carroceria);

        Auto Pick_Up = new Auto("Pick-up de alta gama");
        Pick_Up.Agregar_Material(Motor_De_Carga);
        Pick_Up.Agregar_Material(Carroceria);

        Auto Maquinaria_Trabajo = new Auto("Maquinaria para Trabajo Pesado");
        Maquinaria_Trabajo.Agregar_Material(Motor_De_Carga);
        Maquinaria_Trabajo.Agregar_Material(Carroceria_Especial);
        Maquinaria_Trabajo.Agregar_Material(Llantas_Trabajo);

        Auto Super_Deportivo = new Auto("Superauto Deportivo");
        Super_Deportivo.Agregar_Material(Motor_De_Lujo);
        Super_Deportivo.Agregar_Material(Carroceria);
        Super_Deportivo.Agregar_Material(Llantas_Deportivas);

        System.out.println("Materiales del Sedan de lujo:");
        Pilas materialesSedan = Sedan_De_Lujo.getMateriales();
        while (!materialesSedan.Esta_Vacia()) {
            Material material = materialesSedan.Elimina();
            System.out.println(material.getNombre());
        }
    }
}