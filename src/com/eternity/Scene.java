package com.eternity;

import java.util.ArrayList;

public class Scene {
    private ArrayList<SceneObject> objects = new ArrayList<>();

    public void addObjectToScene(SceneObject obj) {
        objects.add(obj);
    }


}
