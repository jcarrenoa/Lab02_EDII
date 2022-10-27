/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02_edii;

public class Aristas {
    
    private final Vertices inicio;
    private final Vertices fin;
    private final int costo, xi, yi, xf, yf;
    
    public Aristas (int costo, Vertices inicio, Vertices fin, int xi, int yi, int xf, int yf) {
        this.costo = costo;
        this.inicio = inicio;
        this.fin = fin;
        this.xi = xi;
        this.yi = yi;
        this.xf = xf;
        this.yf = yf;
    }
    
    public int getCosto() {
        return costo;
    }

    public Vertices getInicio() {
        return inicio;
    }

    public Vertices getFin() {
        return fin;
    }

    public int getXi() {
        return xi;
    }

    public int getYi() {
        return yi;
    }

    public int getXf() {
        return xf;
    }

    public int getYf() {
        return yf;
    }
    
    
}
