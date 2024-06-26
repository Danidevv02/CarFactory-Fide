/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Daniel
 */
public class FuncionesFabricaGui extends javax.swing.JPanel {

    private CintaGui colaGui;

    /**
     * Creates new form funcionesFabrica
     */
    public FuncionesFabricaGui() {
        initComponents();
        this.colaGui = new CintaGui();
        this.setVisible(true);
    }

    public FuncionesFabricaGui(CintaGui colaGui) {
        initComponents();
        this.colaGui = colaGui;
        this.setVisible(true);
    }

    public CintaGui getColaGui() {
        return colaGui;
    }

    public void setColaGui(CintaGui colaGui) {
        this.colaGui = colaGui;
    }

    public JButton getBtnEmpezar() {
        return btnEmpezar;
    }

    public void setBtnEmpezar(JButton btnEmpezar) {
        this.btnEmpezar = btnEmpezar;
    }

    public JButton getBtnProducir() {
        return btnProducir;
    }

    public void setBtnProducir(JButton btnProducir) {
        this.btnProducir = btnProducir;
    }

    public JButton getBtnDescartar() {
        return btnDescartar;
    }

    public void setBtnDescartar(JButton btnDescartar) {
        this.btnDescartar = btnDescartar;
    }

    public JButton getBtnProducirLUno() {
        return btnProducir;
    }

    public void setBtnProducirLUno(JButton btnProducirLUno) {
        this.btnProducir = btnProducirLUno;
    }

    public JButton getBtnAgregarMaterial() {
        return btnAgregarMaterial;
    }

    public void setBtnAgregarMaterial(JButton btnAgregarMaterial) {
        this.btnAgregarMaterial = btnAgregarMaterial;
    }

    public JPanel getPanelColaPedidos() {
        return panelColaPedidos;
    }

    public void setPanelColaPedidos(JPanel panelColaPedidos) {
        this.panelColaPedidos = panelColaPedidos;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEmpezar = new javax.swing.JButton();
        btnDescartar = new javax.swing.JButton();
        btnAgregarMaterial = new javax.swing.JButton();
        btnProducir = new javax.swing.JButton();
        panelColaPedidos = new javax.swing.JPanel();

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        btnEmpezar.setText("Iniciar");
        add(btnEmpezar);

        btnDescartar.setText("Descartar Material");
        btnDescartar.setEnabled(false);
        add(btnDescartar);

        btnAgregarMaterial.setText("Agregar Material");
        btnAgregarMaterial.setEnabled(false);
        add(btnAgregarMaterial);

        btnProducir.setText("Producir Auto L1");
        btnProducir.setEnabled(false);
        add(btnProducir);

        panelColaPedidos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        javax.swing.GroupLayout panelColaPedidosLayout = new javax.swing.GroupLayout(panelColaPedidos);
        panelColaPedidos.setLayout(panelColaPedidosLayout);
        panelColaPedidosLayout.setHorizontalGroup(
            panelColaPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 567, Short.MAX_VALUE)
        );
        panelColaPedidosLayout.setVerticalGroup(
            panelColaPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        add(panelColaPedidos);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarMaterial;
    private javax.swing.JButton btnDescartar;
    private javax.swing.JButton btnEmpezar;
    private javax.swing.JButton btnProducir;
    private javax.swing.JPanel panelColaPedidos;
    // End of variables declaration//GEN-END:variables
}
