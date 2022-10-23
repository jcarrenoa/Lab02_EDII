package lab02_edii;

import java.awt.Graphics;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Dibujado {

    Graphics draw;
    Timer timer = new Timer();

    public Dibujado(Graphics draw) {
        this.draw = draw;
    }

    public void dibujarV(String cadena, int x, int y) {
        int cade = 8 * cadena.length();
        draw.drawString(cadena, x - cade / 2, y + 20 / 4);
        System.out.println("yi" + (y - 20 / 2));
        System.out.println("yf" + 20);
        draw.drawRect((x - cade / 2) - 2 - cadena.length(), y - 20 / 2, 2 * cadena.length() + cade, 20);
    }

    public void dibujarA(int xi, int yi, int xf, int yf, Vertices vertices[], int tope) {
        Thread th = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2);
                    draw.drawLine(xi, yi, xf, yf);

                } catch (InterruptedException ex) {
                }
            }
        };
        th.start();
    }

    public class RepeatedTask extends TimerTask {

        int tope;
        Vertices vertices[];

        public RepeatedTask(int tope, Vertices vertices[]) {
            this.tope = tope;
            this.vertices = vertices;
        }

        @Override
        public void run() {
            for (int i = 0; i < tope; i++) {
                dibujarV(vertices[i].getNombre(), vertices[i].getX(), vertices[i].getY());
            }
        }
    }

    public void dibujarAllV(Vertices vertices[], int tope) {
        new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5);
                    for (int i = 0; i < tope; i++) {
                        dibujarV(vertices[i].getNombre(), vertices[i].getX(), vertices[i].getY());
                    }
                } catch (InterruptedException ex) {
                }
            }
        }.start();
    }

    public void dibujarAllA(Vertices vertices[], int tope) {
        Thread th = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5);
                    for (int i = 0; i < tope; i++) {
                        System.out.println("X: " + vertices[i].getXi());
                        for (Aristas arista : vertices[i].getAristas()) {
                            draw.drawLine(arista.getXi(), arista.getYi(), arista.getXf(), arista.getYf());
                        }
                    }
                    timer.schedule(new RepeatedTask(tope, vertices), 1);
                } catch (InterruptedException ex) {
                }
            }
        };
        th.start();
    }

}
