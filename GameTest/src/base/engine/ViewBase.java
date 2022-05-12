package base.engine;

import base.objects.Scene;

import javax.swing.*;

// Java Program to create a
// canvas and mouse listener to the
// canvas ( a circle of radius 5 will appear
// at the points where mouse are clicked or
// dragged on the canvas)
import java.awt.*;

public class ViewBase extends JFrame {

    // create a canvas
    Canvas c;
    Scene scene;

    // constructor
    public ViewBase(Scene scene)
    {
         // create a empty canvas
        this.scene = scene;
        c = new Canvas() {
            public void paint(Graphics g)
            {
                scene.paint(g);
            }
        };
        c.setBackground(Color.black);
        add(c);
        setExtendedState(Frame.MAXIMIZED_BOTH);
    }

}
