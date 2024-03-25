import java.awt.*;
import javax.swing.*;

public class PantallaGestionProduccion extends JFrame {

    private JPanel panelControlesProduccion;
    private JPanel panelIndicadores;

    public PantallaGestionProduccion() {
        setTitle("Gestión de producción");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panelPrincipal = new JPanel(new BorderLayout());


        panelControlesProduccion = new JPanel(new GridLayout(3, 1));
        JButton botonIniciarProduccion = new JButton("Iniciar producción");
        JButton botonDetenerProduccion = new JButton("Detener producción");
        panelControlesProduccion.add(botonIniciarProduccion);
        panelControlesProduccion.add(botonDetenerProduccion);


        panelIndicadores = new JPanel(new GridLayout(3, 1));
        JLabel labelIndicadorProduccion = new JLabel("Producción actual: ");
        JLabel labelProduccionActual = new JLabel("0 autos");
        panelIndicadores.add(labelIndicadorProduccion);
        panelIndicadores.add(labelProduccionActual);


        panelPrincipal.add(panelControlesProduccion, BorderLayout.CENTER);
        panelPrincipal.add(panelIndicadores, BorderLayout.EAST);


        getContentPane().add(panelPrincipal);
        setVisible(true);
    }
