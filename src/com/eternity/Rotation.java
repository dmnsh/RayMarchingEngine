package com.eternity;

public class Rotation {
    private double rotationX, rotationY, rotationZ;

    public Rotation(double rotationX, double rotationY, double rotationZ) {
        this.rotationX = rotationX;
        this.rotationY = rotationY;
        this.rotationZ = rotationZ;
    }

    public double getRotationX() {
        return rotationX;
    }

    public void setRotationX(double rotationX) {
        this.rotationX = rotationX;
    }

    public double getRotationY() {
        return rotationY;
    }

    public void setRotationY(double rotationY) {
        this.rotationY = rotationY;
    }

    public double getRotationZ() {
        return rotationZ;
    }

    public void setRotationZ(double rotationZ) {
        this.rotationZ = rotationZ;
    }

    @Override
    public String toString() {
        return "Rotation{" + "rotationX=" + rotationX + ", rotationY=" + rotationY + ", rotationZ=" + rotationZ + '}';
    }
}
