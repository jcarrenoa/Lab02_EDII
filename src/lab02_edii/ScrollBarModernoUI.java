package lab02_edii;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JScrollBar;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class ScrollBarModernoUI extends BasicScrollBarUI {

    private final int THUMB = 70;
    
    @Override
    protected Dimension getMaximumThumbSize() {
        if (scrollbar.getOrientation() == JScrollBar.VERTICAL) {
            return new Dimension(0, THUMB);
        } else {
            return new Dimension(THUMB, 0);
        }
    }

    @Override
    protected Dimension getMinimumThumbSize() {
        if (scrollbar.getOrientation() == JScrollBar.VERTICAL) {
            return new Dimension(0, THUMB);
        } else {
            return new Dimension(THUMB, 0);
        }
    }

    @Override
    protected JButton createDecreaseButton(int i) {
        return new ScrollBarButton();
    }

    @Override
    protected JButton createIncreaseButton(int i) {
        return new ScrollBarButton();
    }

    
    
    @Override
    protected void paintTrack(Graphics grphcs, JComponent jc, Rectangle rctngl) {
        Graphics2D g2d = (Graphics2D) grphcs;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int orientation = scrollbar.getOrientation();
        int x, y, size, width, height;
        if (orientation == JScrollBar.VERTICAL) {
            size = rctngl.width / 2;
            x = rctngl.x + ((rctngl.width - size)/2);
            y = rctngl.y;
            width = size;
            height = rctngl.height;
        } else {
            size = rctngl.height / 2;
            x = 0;
            y = rctngl.y + ((rctngl.height - size)/2);
            width = rctngl.width;
            height = size;
        }
        g2d.setColor(new Color(240, 240, 240));
        g2d.fillRect(x, y, width, height);
    }

    @Override
    protected void paintThumb(Graphics grphcs, JComponent jc, Rectangle rctngl) {
        Graphics2D g2d = (Graphics2D) grphcs;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int orientation = scrollbar.getOrientation();
        int x = rctngl.x, y = rctngl.y, width = rctngl.width, height = rctngl.height;
        if (orientation == JScrollBar.VERTICAL) {
            y += 8;
            height -= 16;
        } else {
            x += 8;
            width -= 16;
        }
        g2d.setColor(scrollbar.getForeground());
        g2d.fillRoundRect(x, y, width, height, 10, 10);
    }

    private class ScrollBarButton extends JButton {
        
        public ScrollBarButton() {
            setBorder(BorderFactory.createEmptyBorder());
        }

        @Override
        public void paint(Graphics grphcs) {
        }
        
        
        
    }
}
