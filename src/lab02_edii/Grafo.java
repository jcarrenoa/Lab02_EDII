package lab02_edii;

public class Grafo {
    
    private final Vertices vertices[] = new Vertices[50];
    private int tope = 0;
    
    public void addV(Vertices vertice) {
        vertices[tope] = vertice;
        tope++;
    }

    public int getTope() {
        return tope;
    }

    public Vertices[] getVertices() {
        return vertices;
    }
    
    public void addA(int costo, Vertices inicio, Vertices fin, int pos, int xi, int yi, int xf, int yf) {
        Aristas a = new Aristas(costo, inicio, fin, xi, yi, xf, yf);
        vertices[pos].addA(a);
    }
    
}
