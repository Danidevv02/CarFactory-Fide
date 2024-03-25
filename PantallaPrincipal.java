import javax.swing.*;

public class PantallaPrincipal extends JFrame {

    public PantallaPrincipal() {
        setTitle("CarFactory-Ride");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar barraMenu = new JMenuBar();
        setJMenuBar(barraMenu);

        JMenu menuProduccion = new JMenu("Producción");
        barraMenu.add(menuProduccion);

        JMenuItem itemGestionProduccion = new JMenuItem("Gestionar producción");
        menuProduccion.add(itemGestionProduccion);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new PantallaPrincipal();
            new PantallaGestionEmpleados();
            new PantallaGestionProduccion();
            new PantallaGestionRecursos();
        });
    }
}

class PantallaGestionEmpleados extends JFrame {

    public PantallaGestionEmpleados() {
        setTitle("Gestión de empleados");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}

class PantallaGestionProduccion extends JFrame {

    public PantallaGestionProduccion() {
        setTitle("Gestión de producción");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}

class PantallaGestionRecursos extends JFrame {

    public PantallaGestionRecursos() {
        setTitle("Gestión de recursos");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
