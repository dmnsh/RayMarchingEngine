package com.eternity;

public class Vector3 {
    private Coordinates Vector3Coordinates,
                        Vector3StartCoordinates,
                        Vector3EndCoordinates,
                        Vector3MidCoordinates;

    public void setVector3Coordinates (double x, double y, double z) {
        Vector3Coordinates.setCoordinates(x,y,z);
    }

    public void setVector3StartCoordinates (double x, double y, double z) {
        Vector3StartCoordinates.setCoordinates(x,y,z);
    }

    public void setVector3EndCoordinates (double x, double y, double z) {
        Vector3EndCoordinates.setCoordinates(x,y,z);
    }

    public void findMidCoordinates () {
        if (Vector3StartCoordinates.isCoordinatesSet() && Vector3EndCoordinates.isCoordinatesSet()) {
            Vector3MidCoordinates.setCoordinates((Vector3EndCoordinates.getX() - Vector3StartCoordinates.getX())/2, (Vector3EndCoordinates.getY() - Vector3StartCoordinates.getY())/2, (Vector3EndCoordinates.getZ() - Vector3StartCoordinates.getZ())/2);
        }
    }
}
