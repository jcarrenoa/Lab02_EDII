package lab02_edii;

import java.awt.Graphics;

public class Dibujado {

    public void dibujarV(Graphics draw, String cadena, int x, int y) {
        int sum = 0;
        byte[] cad = cadena.getBytes();
        for (int i = 0; i < cad.length; i++) {
            if (cad[i] > 64 && cad[i] < 91) {
                sum++;
            }
        }
        int cade = 8 * cadena.length();
        draw.drawString(cadena, x - cade / 2, y + 20 / 4);
        draw.drawRect((x - cade / 2) - 2 - sum, y - 20 / 2, 3 * sum + cade - cadena.length(), 20);
    }
    
}
