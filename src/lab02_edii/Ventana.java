package lab02_edii;

import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JScrollBar;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Ventana extends javax.swing.JFrame {

    //Variables que permiten rodar la ventana.
    int xm, ym;
    //Variables que permiten rodar la barra desplegable en el jScrollPanel
    int xd, yd;
    //Variable que indica si se debe mostrar o no la barra desplegable dependiendo si esta recogida o no;
    boolean mostrar = false;
    //Variable que indica si se esta moviendo la ventana
    boolean moved = false;

    boolean asignar_nombre = false;

    Dibujado draw = new Dibujado();

    Controller funciones = new Controller();

    Grafo lugares = new Grafo();

    public Ventana() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        ScrollBarModificado spv = new ScrollBarModificado();
        spv.setOrientation(JScrollBar.VERTICAL);
        spv.setForeground(new Color(158, 118, 118));
        scroll_p.setVerticalScrollBar(spv);
        ScrollBarModificado sph = new ScrollBarModificado();
        sph.setOrientation(JScrollBar.HORIZONTAL);
        sph.setForeground(new Color(158, 118, 118));
        scroll_p.setHorizontalScrollBar(sph);
        barrades_p.setSize(153, 709);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barra_p = new javax.swing.JPanel();
        exit_p = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        scroll_p = new javax.swing.JScrollPane();
        mapa_p = new javax.swing.JPanel();
        desplegable_p = new javax.swing.JPanel();
        desplegable = new javax.swing.JLabel();
        barrades_p = new javax.swing.JPanel();
        addv = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barra_p.setBackground(new java.awt.Color(89, 69, 69));
        barra_p.setForeground(new java.awt.Color(89, 69, 69));
        barra_p.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barra_pMouseDragged(evt);
            }
        });
        barra_p.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                barra_pMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barra_pMousePressed(evt);
            }
        });

        exit_p.setBackground(new java.awt.Color(89, 69, 69));

        exit.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });

        javax.swing.GroupLayout exit_pLayout = new javax.swing.GroupLayout(exit_p);
        exit_p.setLayout(exit_pLayout);
        exit_pLayout.setHorizontalGroup(
            exit_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exit_pLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        exit_pLayout.setVerticalGroup(
            exit_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exit_pLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout barra_pLayout = new javax.swing.GroupLayout(barra_p);
        barra_p.setLayout(barra_pLayout);
        barra_pLayout.setHorizontalGroup(
            barra_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barra_pLayout.createSequentialGroup()
                .addContainerGap(1020, Short.MAX_VALUE)
                .addComponent(exit_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barra_pLayout.setVerticalGroup(
            barra_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barra_pLayout.createSequentialGroup()
                .addComponent(exit_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(barra_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, -1));

        mapa_p.setBackground(new java.awt.Color(255, 251, 244));
        mapa_p.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                mapa_pAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        mapa_p.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mapa_pMousePressed(evt);
            }
        });

        desplegable_p.setBackground(new java.awt.Color(158, 118, 118));

        desplegable.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        desplegable.setForeground(new java.awt.Color(255, 255, 255));
        desplegable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        desplegable.setText("---");
        desplegable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desplegableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                desplegableMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                desplegableMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                desplegableMousePressed(evt);
            }
        });

        javax.swing.GroupLayout desplegable_pLayout = new javax.swing.GroupLayout(desplegable_p);
        desplegable_p.setLayout(desplegable_pLayout);
        desplegable_pLayout.setHorizontalGroup(
            desplegable_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desplegable, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        desplegable_pLayout.setVerticalGroup(
            desplegable_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desplegable, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        barrades_p.setBackground(new java.awt.Color(158, 118, 118));
        barrades_p.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addv.setBackground(new java.awt.Color(158, 118, 118));
        addv.setForeground(new java.awt.Color(255, 255, 255));
        addv.setText("Agregar vertices");
        addv.setBorder(null);
        addv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addvActionPerformed(evt);
            }
        });
        barrades_p.add(addv, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, -1, -1));

        javax.swing.GroupLayout mapa_pLayout = new javax.swing.GroupLayout(mapa_p);
        mapa_p.setLayout(mapa_pLayout);
        mapa_pLayout.setHorizontalGroup(
            mapa_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mapa_pLayout.createSequentialGroup()
                .addComponent(barrades_p, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desplegable_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1067, Short.MAX_VALUE))
        );
        mapa_pLayout.setVerticalGroup(
            mapa_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mapa_pLayout.createSequentialGroup()
                .addGroup(mapa_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barrades_p, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desplegable_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 141, Short.MAX_VALUE))
        );

        scroll_p.setViewportView(mapa_p);

        getContentPane().add(scroll_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1050, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Funcion de salir de la ventana
    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    //Funcion para cambiar el color a rojo cuando el mouse entra en el recuadro salir.
    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        exit_p.setBackground(Color.RED);
    }//GEN-LAST:event_exitMouseEntered

    //Funcion para cambiar el color a rojo oscuro cuando el mouse presiona el recuadro salir.
    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        exit_p.setBackground(new Color(201, 0, 0));
    }//GEN-LAST:event_exitMousePressed

    //Funcion para cambiar el color a marron cuando el mouse sale del recuadro salir.
    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exit_p.setBackground(new Color(89, 69, 69));
    }//GEN-LAST:event_exitMouseExited

    //Funcion para obtener desde donde el mouse arrastrara la ventana
    private void barra_pMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra_pMousePressed
        xm = evt.getX();
        ym = evt.getY();
    }//GEN-LAST:event_barra_pMousePressed

    //Funcion para rodar la ventana segun la posicion del mouse
    private void barra_pMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra_pMouseDragged
        moved = true;
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xm, y - ym);
    }//GEN-LAST:event_barra_pMouseDragged

    //Desplazar la barra desplegable y el boton segun se mueva el JScrollBar
    private void mapa_pAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_mapa_pAncestorMoved
        xd = mapa_p.getX();
        yd = mapa_p.getY();
        if (mostrar) {
            barrades_p.setSize(0, 709);
        }
        if (!moved) {
            desplegable_p.setLocation(desplegable_p.getX() + -1 * xd, desplegable_p.getY() + -1 * yd);
            barrades_p.setLocation(barrades_p.getX() + -1 * xd, barrades_p.getY() + -1 * yd);
        }
    }//GEN-LAST:event_mapa_pAncestorMoved

    //Funcion para mostrar o esconder la barra desplegable
    private void desplegableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desplegableMouseClicked
        desplegable_p.setBackground(new Color(147, 110, 110));
        System.out.println(mostrar);
        if (mostrar == false) {
            System.out.println(mostrar);
            if (barrades_p.getWidth() == 153) {
                Thread th = new Thread() {
                    @Override
                    public void run() {
                        try {
                            double z = 1;
                            for (int i = 153; i >= 0; i--) {
                                Thread.sleep(1 + (int) z);
                                barrades_p.setSize(i, 709);
                                if (z < 10) {
                                    z = z * 1.015;
                                }
                            }
                        } catch (InterruptedException e) {
                            System.out.println(e);
                        }
                    }
                };
                th.start();
                mostrar = !mostrar;
            }
        } else {
            System.out.println(mostrar);
            if (barrades_p.getWidth() == 0) {
                Thread th = new Thread() {
                    @Override
                    public void run() {
                        try {
                            double z = 1;
                            for (int i = 0; i <= 153; i++) {
                                Thread.sleep(1 + (int) z);
                                barrades_p.setSize(i, 709);
                                if (z < 10) {
                                    z = z * 1.015;
                                }
                            }
                        } catch (InterruptedException e) {
                            System.out.println(e);
                        }
                    }
                };
                th.start();
                mostrar = !mostrar;
            }
        }
    }//GEN-LAST:event_desplegableMouseClicked

    private void barra_pMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra_pMouseExited
        moved = false;
    }//GEN-LAST:event_barra_pMouseExited

    private void desplegableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desplegableMouseEntered
        desplegable_p.setBackground(new Color(147, 110, 110));
    }//GEN-LAST:event_desplegableMouseEntered

    private void desplegableMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desplegableMouseExited
        desplegable_p.setBackground(new Color(158, 118, 118));
    }//GEN-LAST:event_desplegableMouseExited

    private void desplegableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desplegableMousePressed
        desplegable_p.setBackground(new Color(132, 99, 99));
    }//GEN-LAST:event_desplegableMousePressed

    private void addvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addvActionPerformed

    private void mapa_pMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mapa_pMousePressed
        if (addv.isSelected() && !asignar_nombre) {
            int x = evt.getX();
            int y = evt.getY();
            Nombre ventana = new Nombre();
            asignar_nombre = true;
            ventana.setVisible(true);
            ventana.setLocation(evt.getXOnScreen() - 349 / 2, evt.getYOnScreen() - 122 / 2);
            Thread th = new Thread() {
                @Override
                public void run() {
                    try {
                        int i = 1;
                        while (ventana.nombre.equals("")) {
                            Thread.sleep(i);
                        }
                        funciones.Addv(x, y, ventana.nombre.toUpperCase(), lugares);
                        draw.dibujarV(mapa_p.getGraphics(), ventana.nombre.toUpperCase(), x, y);
                        barrades_p.repaint();
                        asignar_nombre = false;

                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }
            };
            th.start();
        }
    }//GEN-LAST:event_mapa_pMousePressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new WindowsLookAndFeel());
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                }
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox addv;
    private javax.swing.JPanel barra_p;
    private javax.swing.JPanel barrades_p;
    private javax.swing.JLabel desplegable;
    private javax.swing.JPanel desplegable_p;
    private javax.swing.JLabel exit;
    private javax.swing.JPanel exit_p;
    private javax.swing.JPanel mapa_p;
    private javax.swing.JScrollPane scroll_p;
    // End of variables declaration//GEN-END:variables
}
