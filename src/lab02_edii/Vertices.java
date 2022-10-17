package lab02_edii;

public class Vertices {
    
    private final int x, y;
    private final String nombre;
    
    public Vertices (int x, int y, String nombre) {
        this.x = x;
        this.y = y;
        this.nombre = nombre;
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
    
}
