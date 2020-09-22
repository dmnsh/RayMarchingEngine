package com.eternity;

public class Scale {
    private double x, y, z;

    public Scale(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        if (x > 0) this.x = x;
        else System.out.println("Scale.x cannot be less or equal than 0");
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        if (y > 0) this.y = y;
        else System.out.println("Scale.y cannot be less or equal than 0");
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        if (z > 0)this.z = z;
        else System.out.println("Scale.z cannot be less or equal than 0");
    }

    @Override
    public String toString() {
        return "Scale{" + "x=" + x + ", y=" + y + ", z=" + z + '}';
    }
}
