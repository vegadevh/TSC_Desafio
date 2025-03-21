/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsc.desafio.panel;

import com.tsc.desafio.view.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author vegad
 */
public class Butt extends javax.swing.JPanel {

    public ArrayList<Butt> getSubMenu(){
        return subMenu;
    }

    /**
     * Creates new form MenuItem
     */
    private final ArrayList<Butt> subMenu = new ArrayList<>();
    private ActionListener actionListener;
    
    public Butt(String menuName, ActionListener actionListener, Butt... subMenu) {
        initComponents();
        LabelName.setText(menuName);
        
        if(actionListener!=null){
            this.actionListener=actionListener;
        }
        
        this.setSize(new Dimension(Integer.MAX_VALUE,45));
        this.setMaximumSize(new Dimension(Integer.MAX_VALUE,45));
        this.setMinimumSize(new Dimension(Integer.MAX_VALUE,45));
        for (int i = 0; i < subMenu.length; i++) {
            this.subMenu.add(subMenu[i]);
            subMenu[i].setVisible(false);
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 192, 69));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setPreferredSize(new java.awt.Dimension(54, 54));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        LabelName.setBackground(new java.awt.Color(21, 21, 24));
        LabelName.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 13)); // NOI18N
        LabelName.setForeground(new java.awt.Color(21, 21, 24));
        LabelName.setText("#");
        LabelName.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(LabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelName)
                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private boolean mostrar = false;
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        if(mostrar){
            ocultar();
            mostrar=false;
        }else{
            mostrar();
            mostrar=true;
        }
        if(actionListener!=null){
            actionListener.actionPerformed(null);
        }
    }//GEN-LAST:event_formMousePressed

    private void mostrar(){
        new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < subMenu.size(); i++) {
                    sleep();
                    subMenu.get(i).setVisible(true);
                    
                }
            }
        }).start();
    }
    
    private void ocultar(){
        new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = subMenu.size()-1; i >= 0; i--) {
                    sleep();
                    subMenu.get(i).setVisible(false);
                    
                }
            }
        }).start();
    }
    
    private void sleep(){
        try{
            Thread.sleep(20);
        }catch(Exception e){
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelName;
    // End of variables declaration//GEN-END:variables
}
