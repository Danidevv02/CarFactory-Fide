import java.awt.*;
import javax.swing.*;

public class InterfazGrafica extends JFrame {
    // Componentes de la interfaz gráfica
    private JLabel lblEstadoProduccion;
    private JLabel lblPedidosPendientes;
    private JList<String> listaPedidos;
    private JButton btnIniciarProduccion;
    private JTextArea txtAreaDetalles;

    public InterfazGrafica() {
        // Configuración básica de la ventana
        setTitle("Fábrica de Automóviles");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Componentes de la interfaz
        lblEstadoProduccion = new JLabel("Estado de producción: En espera");
        lblPedidosPendientes = new JLabel("Pedidos pendientes:");
        listaPedidos = new JList<>(new String[]{"Pedido 1", "Pedido 2", "Pedido 3"});
        btnIniciarProduccion = new JButton("Iniciar producción");
        txtAreaDetalles = new JTextArea();

        // Panel para los pedidos pendientes
        JPanel panelPedidos = new JPanel();
        panelPedidos.setLayout(new BorderLayout());
        panelPedidos.add(lblPedidosPendientes, BorderLayout.NORTH);
        panelPedidos.add(new JScrollPane(listaPedidos), BorderLayout.CENTER);

        // Panel para los botones de control
        JPanel panelBotones = new JPanel();
        panelBotones.add(btnIniciarProduccion);

        // Panel para la información detallada
        JPanel panelDetalles = new JPanel();
        panelDetalles.setLayout(new BorderLayout());
        panelDetalles.add(new JScrollPane(txtAreaDetalles), BorderLayout.CENTER);

        // Añadir componentes a la ventana
        add(lblEstadoProduccion, BorderLayout.NORTH);
        add(panelPedidos, BorderLayout.WEST);
        add(panelBotones, BorderLayout.SOUTH);
        add(panelDetalles, BorderLayout.CENTER);

        // Configuración adicional de los componentes
        txtAreaDetalles.setEditable(false);
    }

    public static void main(String[] args) {
        // Crear e iniciar la interfaz gráfica
        InterfazGrafica interfaz = new InterfazGrafica();
        interfaz.setVisible(true);
    }
}
