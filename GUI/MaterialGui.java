/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import Modelos.MaterialesAuto;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Daniel
 */
public class MaterialGui extends javax.swing.JPanel {
    
    /**
     * Creates new form MaterialGui
     */
    public MaterialGui() {
        initComponents();
    }

    public MaterialGui(MaterialesAuto material) {
        initComponents();
        this.idMaterialTxt.setText(material.getId()+"");
        this.nombreMaterialTxt.setText(material.getNombre());
    }

    public JLabel getIdMaterialLbl() {
        return idMaterialLbl;
    }

    public void setIdMaterialLbl(JLabel idMaterialLbl) {
        this.idMaterialLbl = idMaterialLbl;
    }

    public JTextField getIdMaterialTxt() {
        return idMaterialTxt;
    }

    public void setIdMaterialTxt(JTextField idMaterialTxt) {
        this.idMaterialTxt = idMaterialTxt;
    }

    public JLabel getNombreMaterialLbl() {
        return nombreMaterialLbl;
    }

    public void setNombreMaterialLbl(JLabel nombreMaterialLbl) {
        this.nombreMaterialLbl = nombreMaterialLbl;
    }

    public JTextField getNombreMaterialTxt() {
        return nombreMaterialTxt;
    }

    public void setNombreMaterialTxt(JTextField nombreMaterialTxt) {
        this.nombreMaterialTxt = nombreMaterialTxt;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idMaterialLbl = new javax.swing.JLabel();
        idMaterialTxt = new javax.swing.JTextField();
        nombreMaterialLbl = new javax.swing.JLabel();
        nombreMaterialTxt = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setLayout(new java.awt.GridLayout(2, 2));

        idMaterialLbl.setText("Id Material:");
        add(idMaterialLbl);

        idMaterialTxt.setEditable(false);
        idMaterialTxt.setFocusable(false);
        add(idMaterialTxt);

        nombreMaterialLbl.setText("Nombre:");
        add(nombreMaterialLbl);

        nombreMaterialTxt.setEditable(false);
        nombreMaterialTxt.setFocusable(false);
        add(nombreMaterialTxt);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel idMaterialLbl;
    private javax.swing.JTextField idMaterialTxt;
    private javax.swing.JLabel nombreMaterialLbl;
    private javax.swing.JTextField nombreMaterialTxt;
    // End of variables declaration//GEN-END:variables
}