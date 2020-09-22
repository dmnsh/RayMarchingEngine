package com.eternity;

public class Transform {
    private Position position;
    private Scale scale;
    private Rotation rotation;

    public Transform(double x, double y, double z,
                     double scaleX, double scaleY, double scaleZ,
                     double rotationX, double rotationY, double rotationZ) {
        this.position = new Position(x,y,z);
        this.scale = new Scale(scaleX, scaleY, scaleZ);
        this.rotation = new Rotation(rotationX, rotationY, rotationZ);
    }
}
