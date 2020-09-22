package com.eternity;

public class Sphere extends SceneObject{
    private double r;

    public Sphere(Transform transform, int r) {
        super(transform);
        this.r = r;
    }
}
