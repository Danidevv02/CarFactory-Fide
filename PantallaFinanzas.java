import java.awt.*;
import javax.swing.*;

public class PantallaFinanzas extends JFrame {

    private List<Transaccion> transacciones;
    private JPanel panelGraficosFinancieros;
    private JPanel panelTablasFinancieras;
    private JPanel panelIndicadoresFinancieros;

    public PantallaFinanzas() {
        setTitle("Finanzas");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear el panel principal
        JPanel panelPrincipal = new JPanel(new BorderLayout());

        // Crear la lista de transacciones
        transacciones = new ArrayList<>();
        // ... (código para agregar transacciones a la lista) ...

        // Crear los gráficos financieros
        panelGraficosFinancieros = new JPanel();
        // ... (código para agregar los gráficos financieros) ...

        // Crear las tablas financieras
        panelTablasFinancieras = new JPanel();
        // ... (código para agregar las tablas financieras) ...

        // Crear los indicadores financieros
        panelIndicadoresFinancieros = new JPanel();
        // ... (código para agregar los indicadores financieros) ...

        // Añadir los paneles al panel principal
        panelPrincipal.add(panelGraficosFinancieros, BorderLayout.NORTH);
        panelPrincipal.add(panelTablasFinancieras, BorderLayout.CENTER);
        panelPrincipal.add(panelIndicadoresFinancieros, BorderLayout.SOUTH);

        // Mostrar la pantalla
        getContentPane().add(panelPrincipal);
        setVisible(true);
    }

    // ... (código para actualizar la información financiera) ...

}

class Transaccion {
    private Fecha fecha;
    private TipoTransaccion tipo;
    private String descripcion;
    private int monto;

    // ... (código para los métodos de acceso y modificación) ...
}

enum TipoTransaccion {
    INGRESO,
    GASTO
}
