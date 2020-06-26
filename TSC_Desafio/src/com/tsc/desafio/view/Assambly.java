/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsc.desafio.view;

import com.tsc.desafio.panel.ApplyConditions;
import com.tsc.desafio.panel.Butt;
import com.tsc.desafio.panel.Contorno;
import com.tsc.desafio.panel.DefDominio;
import com.tsc.desafio.panel.ElementsI;
import com.tsc.desafio.panel.ElementsP;
import com.tsc.desafio.panel.Ensamblaje;
import com.tsc.desafio.panel.Galerkin;
import com.tsc.desafio.panel.Galerkin1;
import com.tsc.desafio.panel.Galerkin2;
import com.tsc.desafio.panel.Malla;
import com.tsc.desafio.panel.Paso1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author vegad
 */
public class Assambly extends javax.swing.JPanel {

    /**
     * Creates new form Main
     */
    public Assambly() {
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
                .addContainerGap(767, Short.MAX_VALUE)
                .addComponent(buttons, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        PanelButtonsLayout.setVerticalGroup(
            PanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelButtonsLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(buttons, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        add(PanelButtons, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 633, -1, 90));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBody;
    private javax.swing.JPanel PanelButtons;
    private javax.swing.JPanel buttons;
    // End of variables declaration//GEN-END:variables

    private void execute() {
        PanelBody.add(new Ensamblaje());
        PanelBody.repaint();
        PanelBody.revalidate();
        Butt buttonSig = new Butt("1", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                PanelBody.removeAll();
                PanelBody.add(new Ensamblaje());
                PanelBody.repaint();
                PanelBody.revalidate();
            }
        });
        
        Butt button2 = new Butt("2", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                PanelBody.removeAll();
                PanelBody.add(new ElementsI());
                PanelBody.repaint();
                PanelBody.revalidate();
            }
        });
        Butt button3 = new Butt("3", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                PanelBody.removeAll();
                PanelBody.add(new ElementsP());
                PanelBody.repaint();
                PanelBody.revalidate();
            }
        });
        Butt button4 = new Butt("4", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                PanelBody.removeAll();
                PanelBody.add(new ApplyConditions());
                PanelBody.repaint();
                PanelBody.revalidate();
            }
        });
        
        Sig(buttonSig, button2, button3,button4);
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
