/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsc.desafio.view;

import com.tsc.desafio.panel.AproxModel;
import com.tsc.desafio.panel.DefDominio;
import com.tsc.desafio.panel.Ensamblaje;
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
        //setIcon();
        execute();
    }

    private void execute() {
        //Iconos
        ImageIcon iconCube = new ImageIcon(getClass().getResource("../resources/iconmenu/cube.png"));
        ImageIcon iconCondition = new ImageIcon(getClass().getResource("../resources/iconmenu/conditions.png"));
        ImageIcon iconConnect = new ImageIcon(getClass().getResource("../resources/iconmenu/connect.png"));
        ImageIcon iconAssambly = new ImageIcon(getClass().getResource("../resources/iconmenu/assambly.png"));
        ImageIcon iconMef = new ImageIcon(getClass().getResource("../resources/iconmenu/mef.png"));
        ImageIcon iconMalla = new ImageIcon(getClass().getResource("../resources/iconmenu/malla.png"));
        ImageIcon iconmc = new ImageIcon(getClass().getResource("../resources/iconmenu/mc.png"));
        //Crear submenu
        MenuItem paso1 = new MenuItem("Localizacion", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ContentPanel.removeAll();
                ContentPanel.add(new Paso1());
                ContentPanel.repaint();
                ContentPanel.revalidate();
            }
        });
        MenuItem paso2 = new MenuItem("Interpolacion", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ContentPanel.removeAll();
                ContentPanel.add(new Interpolacion());
                ContentPanel.repaint();
                ContentPanel.revalidate();
            }
        });
        MenuItem paso3 = new MenuItem("Aproximacion del modelo", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ContentPanel.removeAll();
                ContentPanel.add(new AproxModel());
                ContentPanel.repaint();
                ContentPanel.revalidate();
            }
        });
        MenuItem paso4 = new MenuItem("Residuos ponderados", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ContentPanel.removeAll();
                ContentPanel.add(new ResiduosPonderados());
                ContentPanel.repaint();
                ContentPanel.revalidate();
            }
        });
        MenuItem paso5 = new MenuItem("Metodo de Galerkin", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ContentPanel.removeAll();
                ContentPanel.add(new MetGalerkin());
                ContentPanel.repaint();
                ContentPanel.revalidate();
            }
        });
        MenuItem paso6 = new MenuItem("Integracion por partes", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ContentPanel.removeAll();
                ContentPanel.add(new IntegracioPP());
                ContentPanel.repaint();
                ContentPanel.revalidate();
            }
        });
        //Menus - Agregando submenus        
        MenuItem menuDominio = new MenuItem(iconCube, "Dominio utilizado", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ContentPanel.removeAll();
                ContentPanel.add(new DefDominio());
                ContentPanel.repaint();
                ContentPanel.revalidate();
            }
        });
        MenuItem menuMalla = new MenuItem(iconMalla, "Malla generada", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ContentPanel.removeAll();
                ContentPanel.add(new Malla());
                ContentPanel.repaint();
                ContentPanel.revalidate();
            }
        });
        MenuItem menuTConect = new MenuItem(iconConnect, "Tabla de conectividades", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ContentPanel.removeAll();
                ContentPanel.add(new Table());
                ContentPanel.repaint();
                ContentPanel.revalidate();
            }
        });
        MenuItem menuMEF = new MenuItem(iconMef, "Metodo de elementos finitos", null, paso1, paso2, paso3, paso4, paso5, paso6);
        
        //CONDICIONES
        MenuItem componentesQ = new MenuItem("Matriz Q", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ContentPanel.removeAll();
                ContentPanel.add(new DefinicionQ());
                ContentPanel.repaint();
                ContentPanel.revalidate();
            }
        });
        
        MenuItem componentesK = new MenuItem("Matriz K", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ContentPanel.removeAll();
                ContentPanel.add(new DefinicionK());
                ContentPanel.repaint();
                ContentPanel.revalidate();
            }
        });
        
        MenuItem componentesL = new MenuItem("Matriz L", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ContentPanel.removeAll();
                ContentPanel.add(new DefinicionL());
                ContentPanel.repaint();
                ContentPanel.revalidate();
            }
        });
        
        MenuItem componentesR = new MenuItem("Matriz R", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ContentPanel.removeAll();
                ContentPanel.add(new DefinicionR());
                ContentPanel.repaint();
                ContentPanel.revalidate();
            }
        });
        
        MenuItem componentesf = new MenuItem("Matriz f", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ContentPanel.removeAll();
                ContentPanel.add(new Definicionf());
                ContentPanel.repaint();
                ContentPanel.revalidate();
            }
        });
        
        MenuItem componentesg = new MenuItem("Matriz g", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ContentPanel.removeAll();
                ContentPanel.add(new Definiciong());
                ContentPanel.repaint();
                ContentPanel.revalidate();
            }
        });
        
        MenuItem menuDefinicion = new MenuItem(iconmc, "Definicion de componentes", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ContentPanel.removeAll();
                ContentPanel.add(new Definicion());
                ContentPanel.repaint();
                ContentPanel.revalidate();
            }
        },componentesQ,componentesK, componentesL, componentesR,componentesf, componentesg);
        MenuItem menuEnsamblaje = new MenuItem(iconAssambly, "Ensamblaje", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ContentPanel.removeAll();
                ContentPanel.add(new Assambly());
                ContentPanel.repaint();
                ContentPanel.revalidate();
            }
        });
        MenuItem menuContorno = new MenuItem(iconCondition, "Condiciones de contorno", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ContentPanel.removeAll();
                ContentPanel.add(new CondicionesdeContorno());
                ContentPanel.repaint();
                ContentPanel.revalidate();
            }
        });

        Menu(menuDominio, menuMalla, menuTConect, menuMEF, menuDefinicion,menuEnsamblaje, menuContorno);
    }

    private void Menu(MenuItem... menu) {
        for (int i = 0; i < menu.length; i++) {
            menus.add(menu[i]);
            ArrayList<MenuItem> subMenu = menu[i].getSubMenu();
            for (MenuItem m : subMenu) {
                Menu(m);
            }
        }
        menus.revalidate();
    }

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
        java.awt.EventQueue.invokeLater(() -> {
            new Frame().setVisible(true);
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
/*
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../resources/icon/icon.png")));
    }
*/
}
