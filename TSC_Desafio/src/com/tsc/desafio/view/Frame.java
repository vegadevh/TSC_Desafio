/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsc.desafio.view;

import com.tsc.desafio.panel.AproxModel;
import com.tsc.desafio.panel.DefDominio;
import com.tsc.desafio.panel.Interpolacion;
import com.tsc.desafio.panel.Malla;
import com.tsc.desafio.panel.Paso1;
import com.tsc.desafio.panel.Table;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author vegad
 */
public class Frame extends javax.swing.JFrame {

    /**
     * Creates new form Frame
     */
    public Frame() {
        initComponents();
        execute();
    }

    private void execute() {
        //Iconos
        /*
        ImageIcon iconCube = new ImageIcon(getClass().getResource("../resources/iconmenu/cube.png"));
        ImageIcon iconCondition = new ImageIcon(getClass().getResource("../resources/iconmenu/conditions.png"));
        ImageIcon iconConnect = new ImageIcon(getClass().getResource("../resources/iconmenu/connect.png"));
        ImageIcon iconAssambly = new ImageIcon(getClass().getResource("../resources/iconmenu/assambly.png"));
        ImageIcon iconMef = new ImageIcon(getClass().getResource("../resources/iconmenu/mef.png"));
        ImageIcon iconMalla = new ImageIcon(getClass().getResource("../resources/iconmenu/malla.png"));
        ImageIcon iconmc = new ImageIcon(getClass().getResource("../resources/iconmenu/mc.png"));
        */
        //Crear submenu
        MenuItem3 paso1 = new MenuItem3("Localizacion", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ContentPanel.removeAll();
                ContentPanel.add(new Paso1());
                ContentPanel.repaint();
                ContentPanel.revalidate();
            }
        });
        MenuItem3 paso2 = new MenuItem3("Interpolacion", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ContentPanel.removeAll();
                ContentPanel.add(new Interpolacion());
                ContentPanel.repaint();
                ContentPanel.revalidate();
            }
        });
        MenuItem3 paso3 = new MenuItem3("Aproximacion del modelo", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ContentPanel.removeAll();
                ContentPanel.add(new AproxModel());
                ContentPanel.repaint();
                ContentPanel.revalidate();
            }
        });
        MenuItem3 paso4 = new MenuItem3("Residuos ponderados", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ContentPanel.removeAll();
                ContentPanel.add(new ResiduosPonderados());
                ContentPanel.repaint();
                ContentPanel.revalidate();
            }
        });
        MenuItem3 paso5 = new MenuItem3("Metodo de Galerkin", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ContentPanel.removeAll();
                ContentPanel.add(new MetGalerkin());
                ContentPanel.repaint();
                ContentPanel.revalidate();
            }
        });
        MenuItem3 paso6 = new MenuItem3("Integracion por partes", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ContentPanel.removeAll();
                ContentPanel.add(new IntegracioPP());
                ContentPanel.repaint();
                ContentPanel.revalidate();
            }
        });
        //Menus - Agregando submenus        
        MenuItem menuDominio = new MenuItem(/*iconCube,*/ "Dominio utilizado", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ContentPanel.removeAll();
                ContentPanel.add(new DefDominio());
                ContentPanel.repaint();
                ContentPanel.revalidate();
            }
        });
        MenuItem1 menuMalla = new MenuItem1(/*iconMalla,*/ "Malla generada", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ContentPanel.removeAll();
                ContentPanel.add(new Malla());
                ContentPanel.repaint();
                ContentPanel.revalidate();
            }
        });
        MenuItem2 menuTConect = new MenuItem2(/*iconConnect,*/ "Tabla de conectividades", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ContentPanel.removeAll();
                ContentPanel.add(new Table());
                ContentPanel.repaint();
                ContentPanel.revalidate();
            }
        });
        MenuItem3 menuMEF = new MenuItem3(/*iconMef,*/ "Metodo de elementos finitos",null, paso1, paso2, paso3, paso4, paso5, paso6);
        
        //CONDICIONES
        MenuItem4 componentesQ = new MenuItem4("Matriz Q", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ContentPanel.removeAll();
                ContentPanel.add(new DefinicionQ());
                ContentPanel.repaint();
                ContentPanel.revalidate();
            }
        });
        
        MenuItem4 componentesK = new MenuItem4("Matriz K", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ContentPanel.removeAll();
                ContentPanel.add(new DefinicionK());
                ContentPanel.repaint();
                ContentPanel.revalidate();
            }
        });
        
        MenuItem4 componentesL = new MenuItem4("Matriz L", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ContentPanel.removeAll();
                ContentPanel.add(new DefinicionL());
                ContentPanel.repaint();
                ContentPanel.revalidate();
            }
        });
        
        MenuItem4 componentesR = new MenuItem4("Matriz R", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ContentPanel.removeAll();
                ContentPanel.add(new DefinicionR());
                ContentPanel.repaint();
                ContentPanel.revalidate();
            }
        });
        
        MenuItem4 componentesf = new MenuItem4("Matriz f", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ContentPanel.removeAll();
                ContentPanel.add(new Definicionf());
                ContentPanel.repaint();
                ContentPanel.revalidate();
            }
        });
        
        MenuItem4 componentesg = new MenuItem4("Matriz g", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ContentPanel.removeAll();
                ContentPanel.add(new Definiciong());
                ContentPanel.repaint();
                ContentPanel.revalidate();
            }
        });
        
        MenuItem4 menuDefinicion = new MenuItem4(/*iconmc,*/ "Definicion de componentes", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ContentPanel.removeAll();
                ContentPanel.add(new Definicion());
                ContentPanel.repaint();
                ContentPanel.revalidate();
            }
        },componentesQ,componentesK, componentesL, componentesR,componentesf, componentesg);
        MenuItem5 menuEnsamblaje = new MenuItem5(/*iconAssambly,*/ "Ensamblaje", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ContentPanel.removeAll();
                ContentPanel.add(new Assambly());
                ContentPanel.repaint();
                ContentPanel.revalidate();
            }
        });
        MenuItem6 menuContorno = new MenuItem6(/*iconCondition,*/ "Condiciones de contorno", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ContentPanel.removeAll();
                ContentPanel.add(new CondicionesdeContorno());
                ContentPanel.repaint();
                ContentPanel.revalidate();
            }
        });

        Menu(menuDominio, menuMalla, menuTConect/*, menuDefinicion,menuEnsamblaje, menuContorno*/);
        MenuIn(menuMEF);
        MenuIn1(menuDefinicion);
        Menu2(menuEnsamblaje, menuContorno);
    }

    private void Menu(MenuItem menuDominio, MenuItem1 menuMalla, MenuItem2 menuTConect) {
        menus.add(menuDominio);
        menus.add(menuMalla);
        menus.add(menuTConect);
        ArrayList<MenuItem> subMenu = menuDominio.getSubMenu();
        menus.revalidate();
    }
    
    private void Menu2(MenuItem5 menuDefinicion,MenuItem6 menuContorno) {
        menus.add(menuDefinicion);
        menus.add(menuContorno);
        ArrayList<MenuItem5> subMenu = menuDefinicion.getSubMenu();
        menus.revalidate();
    }
    
    private void MenuIn(MenuItem3... menu) {
        for (int i = 0; i < menu.length; i++) {
            menus.add(menu[i]);
            ArrayList<MenuItem3> subMenu = menu[i].getSubMenu();
            for (MenuItem3 m : subMenu) {
                MenuIn(m);
            }
        }
        menus.revalidate();
    }
    
    private void MenuIn1(MenuItem4... menu) {
        for (int i = 0; i < menu.length; i++) {
            menus.add(menu[i]);
            ArrayList<MenuItem4> subMenu = menu[i].getSubMenu();
            for (MenuItem4 m : subMenu) {
                MenuIn1(m);
            }
        }
        menus.revalidate();
    }
    /*
    private void Menu(MenuItem... menu, menuItem2... menu2) {
        for (int i = 0; i < menu2.length; i++) {
            menus.add(menu[i]);
            ArrayList<MenuItem2> subMenu2 = menu2[i].getSubMenu();
            for (int j = 0; j < menu.length; j++) {
                menus.add(menu[j]);
                ArrayList<MenuItem> subMenu = menu[i].getSubMenu();
                for (MenuItem m : subMenu) {
                    Menu(m);
            }
                
            }
            menus.revalidate();
        }
        menus.revalidate();
    }
*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        MenuPanel = new javax.swing.JPanel();
        ScrollMenu = new javax.swing.JScrollPane();
        menus = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ContentPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(29, 32, 41));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuPanel.setBackground(new java.awt.Color(34, 40, 49));
        MenuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ScrollMenu.setBorder(null);

        menus.setBackground(new java.awt.Color(34, 40, 49));
        menus.setLayout(new javax.swing.BoxLayout(menus, javax.swing.BoxLayout.Y_AXIS));
        ScrollMenu.setViewportView(menus);

        MenuPanel.add(ScrollMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 280, 660));

        jLabel1.setFont(new java.awt.Font("Niagara Engraved", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(181, 181, 181));
        jLabel1.setText("MEF");
        MenuPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jPanel1.add(MenuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 720));

        ContentPanel.setBackground(new java.awt.Color(29, 32, 41));
        ContentPanel.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Niagara Engraved", 0, 400)); // NOI18N
        jLabel3.setText("      MEF");
        ContentPanel.add(jLabel3, java.awt.BorderLayout.CENTER);

        jPanel1.add(ContentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 1060, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1340, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContentPanel;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JScrollPane ScrollMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel menus;
    // End of variables declaration//GEN-END:variables

}
