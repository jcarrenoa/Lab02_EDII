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
    
}
