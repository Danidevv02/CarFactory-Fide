/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import Estructuras.ListaEnlazada;

/**
 *
 * @author Daniel
 */
public class ConstruccionGui extends javax.swing.JPanel {

    private ListaEnlazada listaConstruccion;
    
    /**
     * Creates new form ConstruccionGui
     */
    public ConstruccionGui() {
        initComponents();
        this.listaConstruccion = new ListaEnlazada();
        this.setVisible(true);
    }
    
    public ConstruccionGui(ListaEnlazada lista) {
        initComponents();
        this.listaConstruccion = lista;
        this.setVisible(true);
    }

    public ListaEnlazada getListaConstruccion() {
        return listaConstruccion;
    }

    public void setListaConstruccion(ListaEnlazada listaConstruccion) {
        this.listaConstruccion = listaConstruccion;
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
        setLayout(new java.awt.GridLayout(1, 3));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
