
import java.awt.*;
import javax.swing.*;
public class PantallaGestionRecursos extends JFrame {

    private List<Recurso> listaRecursos;
    private JPanel panelListaRecursos;
    private JPanel panelControlesGestion;
    private JPanel panelIndicadores;

    public PantallaGestionRecursos() {
        setTitle("Gestión de recursos");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear el panel principal
        JPanel panelPrincipal = new JPanel(new BorderLayout());

        // Crear la lista de recursos
        listaRecursos = new ArrayList<>();
        // ... (código para agregar recursos a la lista) ...

        panelListaRecursos = new JPanel(new GridLayout(0, 1));
        for (Recurso recurso : listaRecursos) {
            panelListaRecursos.add(new PanelRecurso(recurso));
        }

        // Crear los controles de gestión
        panelControlesGestion = new JPanel();
        // ... (código para agregar los controles de gestión) ...

        // Crear los indicadores
        panelIndicadores = new JPanel();
        // ... (código para agregar los indicadores) ...

        // Añadir los paneles al panel principal
        panelPrincipal.add(panelListaRecursos, BorderLayout.WEST);
        panelPrincipal.add(panelControlesGestion, BorderLayout.CENTER);
        panelPrincipal.add(panelIndicadores, BorderLayout.EAST);

        // Mostrar la pantalla
        getContentPane().add(panelPrincipal);
        setVisible(true);
    }

    private class PanelRecurso extends JPanel {

        private Recurso recurso;

        public PanelRecurso(Recurso recurso) {
            this.recurso = recurso;

            setBorder(BorderFactory.createLineBorder(Color.BLACK));

            // ... (código para mostrar la información del recurso) ...
        }
    }

}

