package Vector2D;

public class Main {
    public  static void main(String[]args){
        Vector2D vector1 = new Vector2D(5,4);
        Vector2D vector2 = new Vector2D(3,2);
        System.out.println("Разница длин == " + vector2.compareTo(vector1));
        System.out.println("Equals:-- " + vector1.equals(vector2));
        System.out.println("Add:-- " + vector1.add(vector2));
        System.out.println("Subtract:-- " + vector1.subtract(vector2));
        System.out.println("ScalarMultiply:-- "+ vector1.scalarMultiply(vector2));
        System.out.print("Random:--");
        int count = 3;
        Vector2D[] vectors = Vector2D.randomVectors(count);
        for(Vector2D vector: vectors){
            vector.printInfo();
        }
    }
}
