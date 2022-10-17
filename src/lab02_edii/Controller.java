package lab02_edii;

public class Controller {
    
    public void Addv(int x, int y, String cadena, Grafo g) {
        Vertices aux = new Vertices(x, y, cadena);
        g.addV(aux);
    }
    
}
