package lab02_edii;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
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

    public void dibujarV(String cadena, int x, int y, Graphics draw) {
        int cade = 8 * cadena.length();
        draw.drawString(cadena, x - cade / 2, y + 20 / 4);
        draw.drawRect((x - cade / 2) - 2 - cadena.length(), y - 20 / 2, 2 * cadena.length() + cade, 20);
    }

    public void dibujarV(String cadena, int x, int y) {
        int cade = 8 * cadena.length();
        draw.drawString(cadena, x - cade / 2, y + 20 / 4);
        draw.drawRect((x - cade / 2) - 2 - cadena.length(), y - 20 / 2, 2 * cadena.length() + cade, 20);
    }

    public void dibujarA(int xi, int yi, int xf, int yf, Graphics draw) {
        Graphics2D draw2d = (Graphics2D)draw;
        draw2d.setStroke(new BasicStroke(3));
        draw2d.drawLine(xi, yi, xf, yf);
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

    public void dibujarAllV(Vertices vertices[], int tope, Graphics draw) {
        for (int i = 0; i < tope; i++) {
            dibujarV(vertices[i].getNombre(), vertices[i].getX(), vertices[i].getY(), draw);
        }
    }

    public void dibujarAllA(Vertices vertices[], int tope, Graphics draw) {
        for (int i = 0; i < tope; i++) {
            for (Aristas arista : vertices[i].getAristas()) {
                draw.drawString(String.valueOf(arista.getCosto()), 20 + (arista.getXi() + arista.getXf())/2, (arista.getYi() + arista.getYf())/2);
                draw.drawLine(arista.getXi(), arista.getYi(), arista.getXf(), arista.getYf());
            }
        }
    }
    
    public void dibujarEliminacion (Vertices v, Graphics draw) {
        draw.setColor(Color.RED);
        dibujarV(v.getNombre(), v.getX(), v.getY(), draw);
        for (Aristas a : v.getAristas()) {
            draw.drawLine(a.getXi(), a.getYi(), a.getXf(), a.getYf());
        }
    }
    
    public void dibujarVSelect (String nombre, int x, int y, Graphics draw) {
        draw.setColor(Color.RED);
        dibujarV(nombre, x, y, draw);
    }
            
    public void dibujarCamino (ArrayList<Vertices> v, Graphics draw) {
        Vertices ant = null;
        for (Vertices va : v) {
            if (ant != null) {
                for (Aristas a : va.getAristas()) {
                    if (ant == a.getFin()) {
                        draw.setColor(Color.GREEN);
                        dibujarA(a.getXi(), a.getYi(), a.getXf(), a.getYf(), draw);
                        break;
                    }
                }
            }
            ant = va;
            draw.setColor(Color.GREEN);
            Graphics2D draw2d = (Graphics2D) draw;
            draw2d.setStroke(new BasicStroke(1));
            dibujarV(va.getNombre(), va.getX(), va.getY(), draw);
        }
    }
}
