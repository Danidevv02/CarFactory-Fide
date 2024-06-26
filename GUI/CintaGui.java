/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import Estructuras.Cola;

/**
 *
 * @author Daniel
 */
public class CintaGui extends javax.swing.JPanel {

    private Cola cinta;
    
    /**
     * Creates new form cintaGui
     */
    public CintaGui() {
        initComponents();
        this.cinta = new Cola();
        this.setVisible(true);
    }
    
    public CintaGui(Cola cinta) {
        initComponents();
        this.cinta = cinta;
        this.setVisible(true);
    }

    public Cola getCola() {
        return cinta;
    }

    public void setCola(Cola cinta) {
        this.cinta = cinta;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        setLayout(new java.awt.GridLayout(1, 0, 10, 0));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
