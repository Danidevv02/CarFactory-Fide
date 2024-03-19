import java.awt.*;
import javax.swing.*;

public class PantallaInvestigacionDesarrollo extends JFrame {

    private List<Tecnologia> listaTecnologias;
    private JPanel panelListaTecnologias;
    private JPanel panelControlesInvestigacion;
    private JPanel panelIndicadores;

    public PantallaInvestigacionDesarrollo() {
        setTitle("Investigación y desarrollo");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear el panel principal
        JPanel panelPrincipal = new JPanel(new BorderLayout());

        // Crear la lista de tecnologías
        listaTecnologias = new ArrayList<>();
        // ... (código para agregar tecnologías a la lista) ...

        panelListaTecnologias = new JPanel(new GridLayout(0, 1));
        for (Tecnologia tecnologia : listaTecnologias) {
            panelListaTecnologias.add(new PanelTecnologia(tecnologia));
        }

        // Crear los controles de investigación
        panelControlesInvestigacion = new JPanel();
        // ... (código para agregar los controles de investigación) ...

        // Crear los indicadores
        panelIndicadores = new JPanel();
        // ... (código para agregar los indicadores) ...

        // Añadir los paneles al panel principal
        panelPrincipal.add(panelListaTecnologias, BorderLayout.WEST);
        panelPrincipal.add(panelControlesInvestigacion, BorderLayout.CENTER);
        panelPrincipal.add(panelIndicadores, BorderLayout.EAST);

        // Mostrar la pantalla
        getContentPane().add(panelPrincipal);
        setVisible(true);
    }

    private class PanelTecnologia extends JPanel {

        private Tecnologia tecnologia;

        public PanelTecnologia(Tecnologia tecnologia) {
            this.tecnologia = tecnologia;

            setBorder(BorderFactory.createLineBorder(Color.BLACK));

            // ... (código para mostrar la información de la tecnología) ...
        }
    }
}
