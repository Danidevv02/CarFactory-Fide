import java.awt.*;
import javax.swing.*;

public class PantallaGestionEmpleados extends JFrame {

    private JPanel panelListaEmpleados;
    private JPanel panelControlesGestion;
    private JPanel panelIndicadores;

    public PantallaGestionEmpleados() {
        setTitle("Gestión de empleados");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear el panel principal
        JPanel panelPrincipal = new JPanel(new BorderLayout());

        // Crear la lista de empleados (supongamos que ya está llena)
        panelListaEmpleados = new JPanel(new GridLayout(0, 1));
        // Aquí puedes agregar paneles de empleado de ejemplo
        for (int i = 0; i < 5; i++) {
            Empleado empleado = new Empleado("Empleado " + (i + 1), "Cargo " + (i + 1));
            panelListaEmpleados.add(new PanelEmpleado(empleado));
        }

        // Crear los controles de gestión (agregaremos botones de ejemplo)
        panelControlesGestion = new JPanel(new FlowLayout());
        JButton botonAgregarEmpleado = new JButton("Agregar Empleado");
        JButton botonEliminarEmpleado = new JButton("Eliminar Empleado");
        panelControlesGestion.add(botonAgregarEmpleado);
        panelControlesGestion.add(botonEliminarEmpleado);

        // Crear los indicadores (agregaremos etiquetas de ejemplo)
        panelIndicadores = new JPanel(new GridLayout(0, 1));
        JLabel labelTotalEmpleados = new JLabel("Total de empleados: 5");
        JLabel labelIndicador = new JLabel("Indicador de gestión");
        panelIndicadores.add(labelTotalEmpleados);
        panelIndicadores.add(labelIndicador);

        // Añadir los paneles al panel principal
        panelPrincipal.add(panelListaEmpleados, BorderLayout.WEST);
        panelPrincipal.add(panelControlesGestion, BorderLayout.CENTER);
        panelPrincipal.add(panelIndicadores, BorderLayout.EAST);

        // Mostrar la pantalla
        getContentPane().add(panelPrincipal);
        setVisible(true);
    }

    private class PanelEmpleado extends JPanel {

        private Empleado empleado;

        public PanelEmpleado(Empleado empleado) {
            this.empleado = empleado;

            setBorder(BorderFactory.createLineBorder(Color.BLACK));

            JLabel labelNombre = new JLabel("Nombre: " + empleado.getNombre());
            JLabel labelCargo = new JLabel("Cargo: " + empleado.getCargo());

            add(labelNombre);
            add(labelCargo);
        }
    }

    // Clase Empleado de ejemplo
    private class Empleado {
        private String nombre;
        private String cargo;

        public Empleado(String nombre, String cargo) {
            this.nombre = nombre;
            this.cargo = cargo;
        }

        public String getNombre() {
            return nombre;
        }

        public String getCargo() {
            return cargo;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new PantallaGestionEmpleados();
        });
    }
}
