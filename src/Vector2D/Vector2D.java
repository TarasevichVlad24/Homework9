package Vector2D;

public class Vector2D {
    private double a;
    private double b;
    private double length;
    private final String INFO = "vector in 2D";


    public Vector2D(double a, double b) {
        this.a = a;
        this.b = b;
        findLength();
    }

    private void findLength() {
        length = Math.sqrt(a * a + b * b);
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getLength() {
        return length;
    }

    public double scalarMultiply(Vector2D vector) {
        return a * vector.getA() + b * vector.getB();
    }

    public Vector2D add(Vector2D vector) {
        a += vector.getA();
        b += vector.getB();
        findLength();
        return this;
    }

    public Vector2D subtract(Vector2D vector) {
        a -= vector.getA();
        b -= vector.getB();
        findLength();
        return this;

    }

    public static Vector2D[] randomVectors(int count) {
        Vector2D[] result = new Vector2D[count];
        int randomA;
        int randomB;
        for (int i = 0; i < count; i++) {
            randomA = (int) (Math.random() * 10);
            randomB = (int) (Math.random() * 10);
            result[i] = new Vector2D(randomA, randomB);
        }
        return result;
    }

    public double compareTo(Vector2D vector) {
        if (length > vector.length) {
            System.out.println("Больше");
        } else if (length < vector.length) {
            System.out.println("Меньше");
        } else {
            System.out.println("Равны");
        }
        return length - vector.length;
    }


    public boolean equals(Vector2D vector) {
        return a == vector.getA() && b == vector.getB();
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Vector2D{" +
                "a=" + a +
                ", b=" + b +
                ", length=" + length +
                ", INFO='" + INFO + '\'' +
                '}';
    }
}
