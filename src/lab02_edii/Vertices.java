package lab02_edii;

import java.util.ArrayList;

public class Vertices {
    
    private final int x, y;
    private final int xi, yi, xf, yf;
    private final String nombre;
    private final ArrayList<Aristas> aristas = new ArrayList<>();
    
    public Vertices (int x, int y, String nombre) {
        int cade = 8 * nombre.length();
        this.x = x;
        this.y = y;
        this.nombre = nombre;
        yi = (y - 20 / 2);
        yf = yi + 20;
        xi = (x - cade / 2) - 2 - nombre.length();
        xf = xi + (2 * nombre.length() + cade);
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

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Aristas> getAristas() {
        return aristas;
    }
    
    public void addA(Aristas a) {
        aristas.add(a);
    }
    
}
