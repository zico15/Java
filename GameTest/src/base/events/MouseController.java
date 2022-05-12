package base.events;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseController  implements MouseListener, MouseMotionListener {

    public MouseController(Canvas c){
        // add mouse listener
        c.addMouseListener(this);
        c.addMouseMotionListener(this);
    }

    // mouse listener and mouse motion listener methods
    public void mouseClicked(MouseEvent e)
    {

    }

    public void mouseMoved(MouseEvent e)
    {
    }

    public void mouseDragged(MouseEvent e)
    {

    }

    public void mouseExited(MouseEvent e)
    {
    }

    public void mouseEntered(MouseEvent e)
    {
    }

    public void mouseReleased(MouseEvent e)
    {
    }

    public void mousePressed(MouseEvent e)
    {
    }
}
