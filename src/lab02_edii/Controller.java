package lab02_edii;

import javax.swing.JOptionPane;

public class Controller {

    public void Addv(int x, int y, String cadena, Grafo g) {
        Vertices aux = new Vertices(x, y, cadena);
        g.addV(aux);
    }
    
    public String[] lugares_n(int n, Vertices vec[]) {
        String vec_lug[] = new String [n + 1];
        vec_lug[0] = "";
        for (int i = 0; i < n; i++) {
            vec_lug[i + 1] = vec[i].getNombre();
        }
        return vec_lug;
    }
    
    public void mostrarf(int n, Vertices v[]) {
        Object[] res = floyd(n, v);  //ejecucion de la funcion
        int[][] res1 = (int[][]) res[0]; //Matriz de costos
        Vertices[][] res2 = (Vertices[][]) res[1]; //matriz de vertices
        //las demas lineas son solo para mostrar de manera visual ambas matrices
        for (int o = 0; o < n; o++) {
            System.out.print("[");
            for (int p = 0; p < n; p++) {
                System.out.print(res1[o][p] + ", ");
            }
            System.out.println("]");
        }
        System.out.println("");
        System.out.println("-------------------------");
        System.out.println("");
        for (int o = 0; o < n; o++) {
            System.out.print("[");
            for (int p = 0; p < n; p++) {
                System.out.print(res2[o][p].getNombre() + ", ");
            }
            System.out.println("]");
        }
    }
    
    public Object[] floyd(int n, Vertices[] vertices) { 
        // La funcion es de tipy Object[] porque va a devolver un vector con las dos matrices dento (esa fue la unica forma que pense jasjajs)
        Object[] matrices = new Object[2];
        //n es el número de vertices dentro del grafo
        //vertices es un vector que tiene en orden los vertices del grafo, ese es el orden en el que se van a poner en la matriz
        int[][] matCostos = new int[n][n];  //La matriz de los costos
        Vertices[][] matVertices = new Vertices[n][n]; //La matriz de los vertices

        //llenado de la matriz de vertices
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matVertices[j][i] = new Vertices(0, 0, "---"); //para prbar que hay queda nul
                } else {
                    matVertices[j][i] = vertices[i];
                }
            }
            // Llena la matriz de arriba a abajo en orden es decir, que A = vectores[0], B = vectores[1] etc.
        }
        //llenado de la matriz de costos
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    matCostos[i][j] = 0; //Para la diagonal principal todos los valores son cero
                } else {
                    matCostos[i][j] = -1; //Si no es parte de la diagonal principal inicialmente se supone que no hay conexion entre los vertices
                    //Luego se verifica si hay o no
                    for (Aristas arista : vertices[i].getAristas()) { //un for Each loop del arrayList para revisar si hay conexion entre los demas vertices
                        if (arista.getFin() == vertices[j]) { //Si la arista seleccionada en el for Each tiene como fun el vertice que estamos revisando, coronamos
                            matCostos[i][j] = arista.getCosto();
                            System.out.println(arista.getCosto());
                            break;
                            //Suponemos que el grafo en simple, por lo que solo habra una arista entre cada par de vertices
                            //por lo que si la encuentra se cambia y se sale del for, sino, ya el for no hace nada y ya queda como -1
                        }
                    }
                }
            }
        }
        //Una vez se realizan las inicializaciones, se procede con el algoritmo real
        //El proceso de tapar columnas y filas y hacer las sumas se va a ejecutar por cada fila
        //es decir por la cantidad de vertices que haya en el grafo

        for (int i = 0; i < n; i++) {
            for (int a = 0; a < n; a++) {
                for (int b = 0; b < n; b++) {
                    if ((a == i) || (b == i)) {
                        //Si la celda que estamos revisando es una de las que esta tapada la ignoramos
                    } else { //Si no, estonces vamos a tomar los ejes verticales y horizontales tapados
                        int sumi = matCostos[i][b]; //Eje horizontal
                        int sumj = matCostos[a][i]; //Eje vertical

                        if ((sumi == -1) || (sumj == -1)) {
                            //Si alguno de los sumandos es -1 (infinito) el resultado dara infinito entonces se ingora
                        } else {
                            if (matCostos[a][b] == -1) { //Si la interseccion tiene valor infinito entonces cualquier suma que no de infnito sera menor que esta
                                matCostos[a][b] = (sumi + sumj); // se reemplaza directamente
                                matVertices[a][b] = vertices[i];
                            } else { // si no tiene valor infito entonces se revisa
                                if ((sumi + sumj) < matCostos[a][b]) { //se suman los ejes y se revisa que sea menor que la intersección
                                    matCostos[a][b] = (sumi + sumj); //si es menor se reemplaza en la matriz de costos
                                    matVertices[a][b] = vertices[i]; //tambien se cambia el vertice de la intersección por el que estamos revisando (el que tapamos)
                                }
                            }
                        }

                    }
                }
            }
        }

        matrices[0] = matCostos;
        matrices[1] = matVertices;
        return matrices;
    }

    public void mensaje_e(int fallos) {
        switch (fallos) {
            case 4:
                JOptionPane.showMessageDialog(null, "Estas bien? Ya llevas 3 veces que pones mal la arista, hazlo bien esta vez", "?", 0);
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Bro???", "Bro???", 0);
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "No te cansaste ya de poner la posicion mal?", "????????", 0);
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Ok, esta es la ultima que te acepto, hazlo de nuevo y te cierro el programa\npara que pierdas todo lo que llevas:)", ":)))", 0);
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "Te lo adverti, bye:))))", "...", 0);
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Las posiciones designadas no conectan a dos lugares", "ARISTA INVALIDA", 0);
        }
    }

}
