import java.awt.*;
import javax.swing.*;

public class InterfazGrafica extends JFrame {
    private JLabel lblEstadoProduccion;
    private JLabel lblPedido1;
    private JLabel lblPedido2;
    private JLabel lblPedido3;
    private JButton btnIniciarProduccion;
    private JTextArea txtAreaDetalles;

    public InterfazGrafica() {
        setTitle("Fábrica de Automóviles");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        lblEstadoProduccion = new JLabel("Estado de producción: En espera");
        lblPedido1 = new JLabel("Pedido 1");
        lblPedido2 = new JLabel("Pedido 2");
        lblPedido3 = new JLabel("Pedido 3");
        btnIniciarProduccion = new JButton("Iniciar producción");
        txtAreaDetalles = new JTextArea();

        JPanel panelPedidos = new JPanel();
        panelPedidos.setLayout(new GridLayout(3, 1));
        panelPedidos.add(lblPedido1);
        panelPedidos.add(lblPedido2);
        panelPedidos.add(lblPedido3);

        JPanel panelBotones = new JPanel();
        panelBotones.add(btnIniciarProduccion);

        JPanel panelDetalles = new JPanel();
        panelDetalles.setLayout(new BorderLayout());
        panelDetalles.add(new JScrollPane(txtAreaDetalles), BorderLayout.CENTER);

        add(lblEstadoProduccion, BorderLayout.NORTH);
        add(panelPedidos, BorderLayout.WEST);
        add(panelBotones, BorderLayout.SOUTH);
        add(panelDetalles, BorderLayout.CENTER);

        txtAreaDetalles.setEditable(false);
    }
}
