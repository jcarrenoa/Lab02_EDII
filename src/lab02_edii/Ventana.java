package lab02_edii;

import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Ventana extends javax.swing.JFrame {

    public class Imagenes extends javax.swing.JPanel {

        public Imagenes() {
            this.setSize(1500, 1500);
        }

        @Override
        public void paint(Graphics grafico) {
            Dimension height = getSize();
            ImageIcon Img = new ImageIcon(getClass().getResource("/Imagenes/MiddleMapa-38.png"));
            grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);
            setOpaque(false);
            super.paintComponent(grafico);
        }
    }
    //Variables que permiten rodar la ventana.
    int xm, ym;
    //Variables que permiten rodar la barra desplegable en el jScrollPanel
    int xd, yd;
    //Variables para saber las coordenadas finales e iniciales de una arista momentanemanete
    int xi, yi, xf, yf;
    //Variable que detecta el numero de fallos en poner la arista del usuario
    int fallos = 0;
    //Variable que indica si se debe mostrar o no la barra desplegable dependiendo si esta recogida o no;
    boolean mostrar = false;
    //Variable que indica si se esta moviendo la ventana
    boolean moved = false;
    //Vertices iniciales y finales
    Vertices fin, inicio;
    //Lugar en el vector que ocupa posf, posi;
    int posf, posi;
    //Variable que permite saber si se esta poniendo una arista o no
    boolean ponerA = false;

    boolean checkb_e = false;

    boolean asignar_nombre = false;

    //Variable que permite confirmar si se esta clickeando para ingresar una arista
    boolean click_a = false;

    boolean pintar_c = false;

    boolean val = true;

    Dibujado draw;

    Controller funciones = new Controller();

    Grafo lugares = new Grafo();

    Timer timer = new Timer();

    boolean entrar_b = false;

    public Ventana() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        Imagenes imagenes = new Imagenes();
        mapa_p.add(imagenes);
        mapa_p.repaint();
        ScrollBarModificado spv = new ScrollBarModificado();
        spv.setOrientation(JScrollBar.VERTICAL);
        spv.setForeground(new Color(158, 118, 118));
        scroll_p.setVerticalScrollBar(spv);
        ScrollBarModificado sph = new ScrollBarModificado();
        sph.setOrientation(JScrollBar.HORIZONTAL);
        sph.setForeground(new Color(158, 118, 118));
        scroll_p.setHorizontalScrollBar(sph);
        barrades_p.repaint();
        desplegable_p.repaint();
        this.draw = new Dibujado(mapa_p.getGraphics());
        barrades_p.setSize(153, 709);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barra_p = new javax.swing.JPanel();
        exit_p = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        scroll_p = new javax.swing.JScrollPane();
        mapa_p = new javax.swing.JPanel();
        desplegable_p = new javax.swing.JPanel();
        desplegable = new javax.swing.JLabel();
        barrades_p = new javax.swing.JPanel();
        addv = new javax.swing.JCheckBox();
        adda = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        eliminarv = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        ini_c = new javax.swing.JComboBox<>();
        fin_c = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        camino_b = new javax.swing.JButton();
        limpiar_b = new javax.swing.JButton();

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

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Connected");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout barra_pLayout = new javax.swing.GroupLayout(barra_p);
        barra_p.setLayout(barra_pLayout);
        barra_pLayout.setHorizontalGroup(
            barra_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barra_pLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 937, Short.MAX_VALUE)
                .addComponent(exit_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barra_pLayout.setVerticalGroup(
            barra_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barra_pLayout.createSequentialGroup()
                .addGroup(barra_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(exit_p, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(barra_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 30));

        mapa_p.setBackground(new java.awt.Color(255, 251, 244));
        mapa_p.setMinimumSize(new java.awt.Dimension(1500, 1500));
        mapa_p.setPreferredSize(new java.awt.Dimension(1500, 1500));
        mapa_p.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                mapa_pAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        mapa_p.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                mapa_pMouseMoved(evt);
            }
        });
        mapa_p.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mapa_pMouseClicked(evt);
            }
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
        barrades_p.setPreferredSize(new java.awt.Dimension(153, 721));
        barrades_p.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                barrades_pMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                barrades_pMouseExited(evt);
            }
        });

        addv.setBackground(new java.awt.Color(158, 118, 118));
        addv.setForeground(new java.awt.Color(255, 255, 255));
        addv.setText("Agregar vertices");
        addv.setBorder(null);
        addv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addvMouseClicked(evt);
            }
        });
        addv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addvActionPerformed(evt);
            }
        });

        adda.setBackground(new java.awt.Color(158, 118, 118));
        adda.setForeground(new java.awt.Color(255, 255, 255));
        adda.setText("Agregar Arista");
        adda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addaMouseClicked(evt);
            }
        });

        jButton1.setText("Mostrar tablas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        eliminarv.setBackground(new java.awt.Color(158, 118, 118));
        eliminarv.setForeground(new java.awt.Color(255, 255, 255));
        eliminarv.setText("Eliminar vertice");
        eliminarv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarvMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Caminos Min:");

        ini_c.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        fin_c.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Inicio");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fin");

        camino_b.setText("Ejecutar");
        camino_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camino_bActionPerformed(evt);
            }
        });

        limpiar_b.setText("Limpiar");
        limpiar_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiar_bActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barrades_pLayout = new javax.swing.GroupLayout(barrades_p);
        barrades_p.setLayout(barrades_pLayout);
        barrades_pLayout.setHorizontalGroup(
            barrades_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(barrades_pLayout.createSequentialGroup()
                .addGroup(barrades_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(barrades_pLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(barrades_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(adda)
                            .addComponent(eliminarv)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(fin_c, 0, 132, Short.MAX_VALUE)
                            .addComponent(ini_c, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(barrades_pLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(addv))
                    .addGroup(barrades_pLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(barrades_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(limpiar_b, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(camino_b, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        barrades_pLayout.setVerticalGroup(
            barrades_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barrades_pLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ini_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fin_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(camino_b)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(limpiar_b)
                .addGap(304, 304, 304)
                .addComponent(eliminarv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout mapa_pLayout = new javax.swing.GroupLayout(mapa_p);
        mapa_p.setLayout(mapa_pLayout);
        mapa_pLayout.setHorizontalGroup(
            mapa_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mapa_pLayout.createSequentialGroup()
                .addComponent(barrades_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(desplegable_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        mapa_pLayout.setVerticalGroup(
            mapa_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mapa_pLayout.createSequentialGroup()
                .addGroup(mapa_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(desplegable_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barrades_p, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(792, 792, 792))
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
        if (pintar_c) {
            mapa_p.repaint();
            timer.schedule(new RepeatedTask1(), 5);
            pintar_c = false;
        } else {
            draw.dibujarAllV(lugares.getVertices(), lugares.getTope(), mapa_p.getGraphics());
            draw.dibujarAllA(lugares.getVertices(), lugares.getTope(), mapa_p.getGraphics());
        }
        if (mostrar) {
            barrades_p.setSize(0, 709);
        }
        if (!moved) {
            desplegable_p.repaint();
            barrades_p.repaint();
            desplegable_p.setLocation(desplegable_p.getX() + -1 * xd, desplegable_p.getY() + -1 * yd);
            barrades_p.setLocation(barrades_p.getX() + -1 * xd, barrades_p.getY() + -1 * yd);
        }
    }//GEN-LAST:event_mapa_pAncestorMoved

    //Funcion para mostrar o esconder la barra desplegable
    private void desplegableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desplegableMouseClicked
        desplegable_p.setBackground(new Color(147, 110, 110));
        System.out.println(mostrar);
        if (mostrar == false) {
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

    }//GEN-LAST:event_mapa_pMousePressed

    private void mapa_pMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mapa_pMouseMoved
//        if (click_a) {
//            mapa_p.repaint();
//            timer.schedule(new RepeatedTask(evt.getX(), evt.getY()), 20);
//        }
    }//GEN-LAST:event_mapa_pMouseMoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        funciones.mostrarf(lugares.getTope(), lugares.getVertices());
        Tablas tb = new Tablas(funciones.lugares_n(lugares.getTope(), lugares.getVertices()), funciones.floyd(lugares.getTope(), lugares.getVertices()), lugares.getTope());
        tb.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void eliminarvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarvMouseClicked
        adda.setSelected(false);
        addv.setSelected(false);
    }//GEN-LAST:event_eliminarvMouseClicked

    private void addaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addaMouseClicked
        eliminarv.setSelected(false);
        addv.setSelected(false);
    }//GEN-LAST:event_addaMouseClicked

    private void addvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addvMouseClicked
        eliminarv.setSelected(false);
        adda.setSelected(false);
    }//GEN-LAST:event_addvMouseClicked

    private void barrades_pMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barrades_pMouseEntered
        entrar_b = true;
    }//GEN-LAST:event_barrades_pMouseEntered

    private void barrades_pMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barrades_pMouseExited
        entrar_b = false;
    }//GEN-LAST:event_barrades_pMouseExited

    private void mapa_pMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mapa_pMouseClicked
        if (!entrar_b) {
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
                        boolean canDraw = true;
                        try {
                            int i = 1;
                            while (ventana.nombre.equals("")) {
                                Thread.sleep(i);
                            }
                            Vertices[] vert = lugares.getVertices();

                            Vertices prueba = new Vertices(x, y, ventana.nombre.toUpperCase());
                            try {
                                for (Vertices vert1 : vert) {
                                    if (((((prueba.getXi() >= vert1.getXi()) && (prueba.getXi() <= vert1.getXf())) //rango de prueba.xi
                                            || // o
                                            ((prueba.getXf() >= vert1.getXi()) && (prueba.getXf() <= vert1.getXf()))) //Rango de prueba.xf
                                            && // y
                                            (((prueba.getYi() >= vert1.getYi()) && (prueba.getYi() <= vert1.getYf())) //rango de prueba.yi
                                            || // o
                                            ((prueba.getYf() >= vert1.getYi()) && (prueba.getYf() <= vert1.getYf())))) //Rango de prueba.yf

                                            || ((((vert1.getXi() >= prueba.getXi()) && (vert1.getXi() <= prueba.getXf())) //rango de vert1.xi
                                            || // o
                                            ((vert1.getXf() >= prueba.getXi()) && (vert1.getXf() <= prueba.getXf()))) //Rango de vert1.xf
                                            && // y
                                            (((vert1.getYi() >= prueba.getYi()) && (vert1.getYi() <= prueba.getYf())) //rango de vert1.yi
                                            || // o
                                            ((vert1.getYf() >= prueba.getYi()) && (vert1.getYf() <= prueba.getYf())))) //Rango de vert1.yf
                                            ) {
                                        JOptionPane.showMessageDialog(null, "La posicion del mouse esta muy cerca a\nun vertice, por favor escoja otra posicion", "Error: posible solapamiento de vertices", 1);
                                        canDraw = false;

                                    }

                                }
                            } catch (Exception e) {
                                if (lugares.getTope() == 0) {
                                    canDraw = true;
                                }
                            }
                            int z = 0;
                            while (z < lugares.getTope() && canDraw) {
                                if (prueba.getNombre().equals(vert[z].getNombre())) {
                                    JOptionPane.showMessageDialog(null, "No se puede agregar un lugar con el mismo nombre. Intenta nuevamente", "LUGARES CON EL MISMO NOMBRE", 1);
                                    canDraw = false;
                                }
                                z++;
                            }
                            if (canDraw) {
                                funciones.Addv(x, y, ventana.nombre.toUpperCase(), lugares);
                                ini_c.addItem(ventana.nombre.toUpperCase());
                                fin_c.addItem(ventana.nombre.toUpperCase());
                                draw.dibujarV(ventana.nombre.toUpperCase(), x, y, mapa_p.getGraphics());
                            }
                            barrades_p.repaint();
                            asignar_nombre = false;
                        } catch (InterruptedException e) {
                            System.out.println(e);
                        }
                    }
                };
                th.start();
            } else if (adda.isSelected()) {
                Vertices vertices[] = lugares.getVertices();
                if (!click_a && !ponerA) {
                    int i = 0;
                    boolean aux = true;
                    while (i < lugares.getTope() && aux) {
                        if (vertices[i].getYi() < evt.getY() && vertices[i].getYf() > evt.getY()) {
                            if (vertices[i].getXi() < evt.getX() && vertices[i].getXf() > evt.getX()) {
                                xi = evt.getX();
                                yi = evt.getY();
                                inicio = vertices[i];
                                posi = i;
                                click_a = !click_a;
                                draw.dibujarVSelect(inicio.getNombre(), inicio.getX(), inicio.getY(), mapa_p.getGraphics());
                                aux = false;
                            }
                        }
                        i++;
                    }
                    if (aux) {
                        fallos++;
                        funciones.mensaje_e(fallos);
                    }
                } else if (!ponerA) {
                    int i = 0;
                    boolean aux = true;
                    while (i < lugares.getTope() && aux) {
                        if (vertices[i].getYi() < evt.getY() && vertices[i].getYf() > evt.getY()) {
                            if (vertices[i].getXi() < evt.getX() && vertices[i].getXf() > evt.getX()) {
                                xf = evt.getX();
                                yf = evt.getY();
                                fin = vertices[i];
                                posf = i;
                                aux = false;
                            }
                        }
                        i++;
                    }
                    if (!aux) {
                        for (Aristas a : inicio.getAristas()) {
                            if (a.getFin() == fin) {
                                fin = inicio;
                                break;
                            }
                        }
                    }
                    if (aux) {
                        fallos++;
                        xi = 0;
                        yi = 0;
                        inicio = null;
                        posi = 0;
                        timer.schedule(new RepeatedTask1(), 1);
                        asignar_nombre = false;
                        funciones.mensaje_e(fallos);
                    } else if (fin == inicio) {
                        mapa_p.repaint();
                        timer.schedule(new RepeatedTask1(), 10);
                        xi = 0;
                        yi = 0;
                        inicio = null;
                        posi = 0;
                    } else {
                        Costo ventana = new Costo();
                        ventana.setVisible(true);
                        ponerA = !ponerA;
                        new Thread() {
                            @Override
                            public void run() {
                                while (ventana.costo == 0) {
                                    System.out.println("");
                                }
                                if (vertices[posf].getXi() > vertices[posi].getXf()) {
                                    if (vertices[posf].getYi() < vertices[posi].getYf()) {
                                        lugares.addA(ventana.costo, inicio, fin, posi, vertices[posi].getXf(), vertices[posi].getYi(), vertices[posf].getXi(), vertices[posf].getYf());
                                        lugares.addA(ventana.costo, fin, inicio, posf, vertices[posi].getXf(), vertices[posi].getYi(), vertices[posf].getXi(), vertices[posf].getYf());
                                    } else {
                                        lugares.addA(ventana.costo, inicio, fin, posi, vertices[posi].getXf(), vertices[posi].getYf(), vertices[posf].getXi(), vertices[posf].getYi());
                                        lugares.addA(ventana.costo, fin, inicio, posf, vertices[posi].getXf(), vertices[posi].getYf(), vertices[posf].getXi(), vertices[posf].getYi());
                                    }
                                } else {
                                    if (vertices[posf].getYi() < vertices[posi].getYf()) {
                                        lugares.addA(ventana.costo, inicio, fin, posi, vertices[posi].getXi(), vertices[posi].getYi(), vertices[posf].getXf(), vertices[posf].getYf());
                                        lugares.addA(ventana.costo, fin, inicio, posf, vertices[posi].getXi(), vertices[posi].getYi(), vertices[posf].getXf(), vertices[posf].getYf());
                                    } else {
                                        lugares.addA(ventana.costo, inicio, fin, posi, vertices[posi].getXi(), vertices[posi].getYf(), vertices[posf].getXf(), vertices[posf].getYi());
                                        lugares.addA(ventana.costo, fin, inicio, posf, vertices[posi].getXi(), vertices[posi].getYf(), vertices[posf].getXf(), vertices[posf].getYi());
                                    }
                                }
                                mapa_p.repaint();
                                timer.schedule(new RepeatedTask1(), 40);
                                ponerA = !ponerA;
                            }
                        }.start();
                        fallos = 0;
                    }
                    click_a = !click_a;
                }
            } else if (eliminarv.isSelected()) {
                Vertices vertices[] = lugares.getVertices();
                boolean aux = false;
                int i = 0;
                while (i < lugares.getTope() && !aux) {
                    if (vertices[i].getYi() < evt.getY() && vertices[i].getYf() > evt.getY()) {
                        if (vertices[i].getXi() < evt.getX() && vertices[i].getXf() > evt.getX()) {
                            aux = true;
                        }
                    }
                    i++;
                }
                if (aux) {
                    timer.schedule(new RepeatedTask2(vertices[i - 1]), 1);
                    lugares.eliminarV(i - 1);
                    ini_c.removeItemAt(i);
                    fin_c.removeItemAt(i);
                    timer.schedule(new CleanTimer(), 975);
                    timer.schedule(new RepeatedTask1(), 1000);
                }
            }
        }
    }//GEN-LAST:event_mapa_pMouseClicked

    private void camino_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camino_bActionPerformed
        if (!ini_c.getSelectedItem().equals(" ") && !fin_c.getSelectedItem().equals(" ")) {
            Object mats[] = funciones.floyd(lugares.getTope(), lugares.getVertices());
            ArrayList<Vertices> camino = funciones.caminoMin((int[][]) mats[0], (Vertices[][]) mats[1], lugares.getTope(), lugares.getVertices(), funciones.encontrarV((String) ini_c.getSelectedItem(), lugares.getVertices()), funciones.encontrarV((String) fin_c.getSelectedItem(), lugares.getVertices()));
            draw.dibujarAllV(lugares.getVertices(), lugares.getTope(), mapa_p.getGraphics());
            draw.dibujarAllA(lugares.getVertices(), lugares.getTope(), mapa_p.getGraphics());
            draw.dibujarCamino(camino, mapa_p.getGraphics());
            pintar_c = true;
        }
    }//GEN-LAST:event_camino_bActionPerformed

    private void limpiar_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiar_bActionPerformed
        mapa_p.repaint();
        timer.schedule(new RepeatedTask1(), 40);
    }//GEN-LAST:event_limpiar_bActionPerformed

    public class RepeatedTask extends TimerTask {

        int xf, yf;

        public RepeatedTask(int x, int y) {
            xf = x;
            yf = y;
        }

        @Override
        public void run() {
            draw.dibujarAllV(lugares.getVertices(), lugares.getTope(), mapa_p.getGraphics());
            draw.dibujarAllA(lugares.getVertices(), lugares.getTope(), mapa_p.getGraphics());
            draw.dibujarA(xi, yi, xf, yf, mapa_p.getGraphics());
        }
    }

    public class RepeatedTask1 extends TimerTask {

        @Override
        public void run() {
            draw.dibujarAllV(lugares.getVertices(), lugares.getTope(), mapa_p.getGraphics());
            draw.dibujarAllA(lugares.getVertices(), lugares.getTope(), mapa_p.getGraphics());
        }
    }

    public class RepeatedTask2 extends TimerTask {

        Vertices v;

        public RepeatedTask2(Vertices v) {
            this.v = v;
        }

        @Override
        public void run() {
            draw.dibujarAllV(lugares.getVertices(), lugares.getTope(), mapa_p.getGraphics());
            draw.dibujarAllA(lugares.getVertices(), lugares.getTope(), mapa_p.getGraphics());
            draw.dibujarEliminacion(v, mapa_p.getGraphics());
        }
    }

    public class CleanTimer extends TimerTask {

        @Override
        public void run() {
            mapa_p.repaint();
        }
    }

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
    private javax.swing.JCheckBox adda;
    private javax.swing.JCheckBox addv;
    private javax.swing.JPanel barra_p;
    private javax.swing.JPanel barrades_p;
    private javax.swing.JButton camino_b;
    private javax.swing.JLabel desplegable;
    private javax.swing.JPanel desplegable_p;
    private javax.swing.JCheckBox eliminarv;
    private javax.swing.JLabel exit;
    private javax.swing.JPanel exit_p;
    private javax.swing.JComboBox<String> fin_c;
    private javax.swing.JComboBox<String> ini_c;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton limpiar_b;
    private javax.swing.JPanel mapa_p;
    private javax.swing.JScrollPane scroll_p;
    // End of variables declaration//GEN-END:variables
}
