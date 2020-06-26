/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsc.desafio.view;

import com.tsc.desafio.panel.Butt;
import com.tsc.desafio.panel.Residuos;
import java.util.ArrayList;

/**
 *
 * @author vegad
 */
public class ResiduosPonderados extends javax.swing.JPanel {

    /**
     * Creates new form Main
     */
    public ResiduosPonderados() {
        initComponents();
        execute();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelBody = new javax.swing.JPanel();
        PanelButtons = new javax.swing.JPanel();
        buttons = new javax.swing.JPanel();

        setBackground(new java.awt.Color(29, 32, 41));
        setPreferredSize(new java.awt.Dimension(1060, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelBody.setBackground(new java.awt.Color(29, 32, 41));
        PanelBody.setLayout(new javax.swing.BoxLayout(PanelBody, javax.swing.BoxLayout.LINE_AXIS));
        add(PanelBody, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 1072, 630));

        PanelButtons.setBackground(new java.awt.Color(29, 32, 41));

        buttons.setBackground(new java.awt.Color(29, 32, 41));
        buttons.setLayout(new javax.swing.BoxLayout(buttons, javax.swing.BoxLayout.X_AXIS));

        javax.swing.GroupLayout PanelButtonsLayout = new javax.swing.GroupLayout(PanelButtons);
        PanelButtons.setLayout(PanelButtonsLayout);
        PanelButtonsLayout.setHorizontalGroup(
            PanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelButtonsLayout.createSequentialGroup()
                .addContainerGap(630, Short.MAX_VALUE)
                .addComponent(buttons, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        PanelButtonsLayout.setVerticalGroup(
            PanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelButtonsLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(buttons, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        add(PanelButtons, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 623, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBody;
    private javax.swing.JPanel PanelButtons;
    private javax.swing.JPanel buttons;
    // End of variables declaration//GEN-END:variables

    private void execute() {
        PanelBody.add(new Residuos());
        PanelBody.repaint();
        PanelBody.revalidate();
    }

    private void Sig(Butt... button) {
        for (int i = 0; i < button.length; i++) {
            buttons.add(button[i]);
            ArrayList<Butt> butts = button[i].getSubMenu();
            for (Butt m : butts) {
                Sig(m);
            }
        }
        buttons.revalidate();
    }
}
