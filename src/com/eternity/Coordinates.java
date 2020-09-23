package com.eternity;

public class Coordinates {
    private double x, y, z;

    public void setCoordinates(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public boolean isCoordinatesSet () {
        if (!Double.isNaN(x) && !Double.isNaN(y) && !Double.isNaN(z)) {
            return true;
        }

        return false;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }
}
