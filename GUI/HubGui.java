/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import Modelos.Hub;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Daniel
 */
public class HubGui extends javax.swing.JPanel {

    private Hub stats;
    
    /**
     * Creates new form Hub
     */
    public HubGui() {
        initComponents();
        this.stats = new Hub(0, 0, 0);
        this.setVisible(true);
    }
    
    
    public HubGui(Hub hub){
        initComponents();
        this.stats = hub;
        this.setVisible(true);
    }
    
    public Hub getStats() {
        return stats;
    }

    public void setStats(Hub stats) {
        this.stats = stats;
    }

    public JLabel getDineroObtenidoLbl() {
        return dineroObtenidoLbl;
    }

    public void setDineroObtenidoLbl(JLabel dineroObtenidoLbl) {
        this.dineroObtenidoLbl = dineroObtenidoLbl;
    }

    public JTextField getDineroObtenidoTxt() {
        return dineroObtenidoTxt;
    }

    public void setDineroObtenidoTxt(JTextField dineroObtenidoTxt) {
        this.dineroObtenidoTxt = dineroObtenidoTxt;
    }

    public JLabel getPedidosEntrantesLbl() {
        return pedidosEntrantesLbl;
    }

    public void setPedidosEntrantesLbl(JLabel pedidosEntrantesLbl) {
        this.pedidosEntrantesLbl = pedidosEntrantesLbl;
    }

    public JTextField getPedidosEntrantesTxt() {
        return pedidosEntrantesTxt;
    }

    public void setPedidosEntrantesTxt(JTextField pedidosEntrantesTxt) {
        this.pedidosEntrantesTxt = pedidosEntrantesTxt;
    }

    public JLabel getTiempoRestanteLbl() {
        return tiempoRestanteLbl;
    }

    public void setTiempoRestanteLbl(JLabel tiempoRestanteLbl) {
        this.tiempoRestanteLbl = tiempoRestanteLbl;
    }

    public JTextField getTiempoRestanteTxt1() {
        return tiempoRestanteTxt1;
    }

    public void setTiempoRestanteTxt1(JTextField tiempoRestanteTxt1) {
        this.tiempoRestanteTxt1 = tiempoRestanteTxt1;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pedidosEntrantesLbl = new javax.swing.JLabel();
        pedidosEntrantesTxt = new javax.swing.JTextField();
        tiempoRestanteLbl = new javax.swing.JLabel();
        tiempoRestanteTxt1 = new javax.swing.JTextField();
        dineroObtenidoLbl = new javax.swing.JLabel();
        dineroObtenidoTxt = new javax.swing.JTextField();

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        setLayout(new java.awt.GridLayout(3, 2));

        pedidosEntrantesLbl.setText("Pedidos Entrantes: ");
        add(pedidosEntrantesLbl);

        pedidosEntrantesTxt.setEditable(false);
        pedidosEntrantesTxt.setFocusable(false);
        add(pedidosEntrantesTxt);

        tiempoRestanteLbl.setText("Tiempo Restante:");
        add(tiempoRestanteLbl);

        tiempoRestanteTxt1.setEditable(false);
        tiempoRestanteTxt1.setFocusable(false);
        add(tiempoRestanteTxt1);

        dineroObtenidoLbl.setText("Dinero Obtenido");
        add(dineroObtenidoLbl);

        dineroObtenidoTxt.setEditable(false);
        dineroObtenidoTxt.setFocusable(false);
        add(dineroObtenidoTxt);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dineroObtenidoLbl;
    private javax.swing.JTextField dineroObtenidoTxt;
    private javax.swing.JLabel pedidosEntrantesLbl;
    private javax.swing.JTextField pedidosEntrantesTxt;
    private javax.swing.JLabel tiempoRestanteLbl;
    private javax.swing.JTextField tiempoRestanteTxt1;
    // End of variables declaration//GEN-END:variables
}