package Vector3D;

import Vector2D.Vector2D;

public class Main {
    public static void main(String[] args){
        Vector3D vec1 = new Vector3D(8,9,10);
        Vector3D vec2 = new Vector3D(8,9,10);
        System.out.println(vec1.compareTo(vec2));
        System.out.println("Equals:-- " + vec1.equals(vec2));
        System.out.println("Add:-- " + vec1.add(vec2));
        System.out.println("Subtract:-- " + vec1.subtract(vec2));
        System.out.println("ScalarMultiply:-- "+ vec1.scalarMultiply(vec2));
        System.out.print("Random:--");
        int count = 5;
        Vector3D[] vectors = Vector3D.randomVectors(count);
        for(Vector3D vector: vectors){
            vector.printInfo();
        }
    }
}
