package VectorMulti;

import Vector3D.Vector3D;

public class Main {
    public static void main(String[] args){
        VectorMulti v1Multi = new VectorMulti(2,2,2,3,3,3);
        VectorMulti v2Multi = new VectorMulti(1,1,1,2,2,2);
        System.out.println("Equals:-- " + v1Multi.equals(v2Multi));
        System.out.println("Add:-- " + v1Multi.add(v2Multi));
        System.out.println("Subtract:-- " + v1Multi.subtract(v2Multi));
        System.out.println("ScalarMultiply:-- "+ v1Multi.scalarMultiply(v2Multi));
        System.out.print("Random:--");
        int count = 2;
        Vector3D[] vectors = Vector3D.randomVectors(count);
        for(Vector3D vector: vectors){
            vector.printInfo();
        }
    }
}
