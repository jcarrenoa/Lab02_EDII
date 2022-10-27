package lab02_edii;

import java.util.ArrayList;

public class Vertices {

    private final int x, y;
    private final int xi, yi, xf, yf;
    private final String nombre;
    private ArrayList<Aristas> aristas = new ArrayList<>();
    
    private final int limXi, limXf, limYi, limYf; //Agregado por David, son los limites del hitbox
    

    public Vertices(int x, int y, String nombre) {
        int cade = 8 * nombre.length();
        this.x = x;
        this.y = y;
        this.nombre = nombre;
        yi = (y - 20 / 2);
        yf = yi + 20;
        xi = (x - cade / 2) - 2 - nombre.length();
        xf = xi + (2 * nombre.length() + cade);
        
        limYi = yi - 15; //15 unidades arriba del marco superior
        limYf = yf + 15; //15 unidades debajo del marco inferior
        limXi = xi - 30; //30 unidades a la izquierda del marco izquierdo
        limXf = xf + 30; //30 unidades a la derecha del marco derecho
        
    }

    public int getLimXi() {//David
        return limXi;
    }

    public int getLimXf() {//David
        return limXf;
    }

    public int getLimYi() {//David
        return limYi;
    }

    public int getLimYf() { //David
        return limYf;
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

    public void eliminarA(Vertices v) {
        for (int i = 0; i < getAristas().size(); i++) {
            Aristas arista = getAristas().get(i);
            if (arista.getFin() == v) {
                aristas.remove(arista);
            }
        }
    }

}
