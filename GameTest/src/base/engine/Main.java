package base.engine;

import base.engine.ViewBase;
import base.objects.Scene;


public class Main {

    public static void main(String[] args) {
        ViewBase frame = new ViewBase(new Scene());

        frame.setVisible(true);
        System.out.println("Hello world!");
    }
}