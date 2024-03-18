import java.awt.BorderLayout;
import javax.swing.*;

public class PantallaPrincipal extends JFrame {

    public PantallaPrincipal() {
        setTitle("CarFactory-Ride");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear el panel principal
        JPanel panelPrincipal = new JPanel(new BorderLayout());

        // Crear la barra de menú
        JMenuBar barraMenu = new JMenuBar();
        setJMenuBar(barraMenu);

        // Crear el menú de producción
        JMenu menuProduccion = new JMenu("Producción");
        barraMenu.add(menuProduccion);

        // Crear el item de menú para la gestión de producción
        JMenuItem itemGestionProduccion = new JMenuItem("Gestionar producción");
        menuProduccion.add(itemGestionProduccion);

        // Añadir el panel principal al JFrame
        getContentPane().add(panelPrincipal);

        // Mostrar la pantalla
        setVisible(true);
    }

}
