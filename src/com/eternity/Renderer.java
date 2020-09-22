package com.eternity;

import javax.swing.*;
import java.awt.*;

public class Renderer extends JPanel {

    Scene scene = new Scene();
    SceneObject camera = new Camera(new Transform(5,0,0,1,1,1,0,0,0));
    SceneObject obj = new Sphere(new Transform(0,0,0,1,1,1,0,0,0), 6);

    public Renderer() {
        scene.addObjectToScene(camera);
        scene.addObjectToScene(obj);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawRect(0,0,700,700);
        g.fillRect(1,1,699,699);
    }
}
