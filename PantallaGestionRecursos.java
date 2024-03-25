import java.awt.*;
import javax.swing.*;

public class PantallaGestionRecursos extends JFrame {

    private JPanel panelListaRecursos;
    private JPanel panelControlesGestion;
    private JPanel panelIndicadores;

    public PantallaGestionRecursos() {
        setTitle("Gestión de recursos");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelPrincipal = new JPanel(new BorderLayout());

        panelListaRecursos = new JPanel();
        panelControlesGestion = new JPanel();
        panelIndicadores = new JPanel();

        panelPrincipal.add(panelListaRecursos, BorderLayout.WEST);
        panelPrincipal.add(panelControlesGestion, BorderLayout.CENTER);
        panelPrincipal.add(panelIndicadores, BorderLayout.EAST);

        getContentPane().add(panelPrincipal);
        setVisible(true);
    }

    private class PanelRecurso extends JPanel {

        private Recurso recurso;

        public PanelRecurso(Recurso recurso) {
            this.recurso = recurso;

            setBorder(BorderFactory.createLineBorder(Color.BLACK));

            JLabel labelNombre = new JLabel("Nombre: " + recurso.getNombre());
            JLabel labelCantidad = new JLabel("Cantidad: " + recurso.getCantidad());

            add(labelNombre);
            add(labelCantidad);
        }
    }

    private class Recurso {
        private String nombre;
        private int cantidad;

        public Recurso(String nombre, int cantidad) {
            this.nombre = nombre;
            this.cantidad = cantidad;
        }

        public String getNombre() {
            return nombre;
        }

        public int getCantidad() {
            return cantidad;
        }
    }

