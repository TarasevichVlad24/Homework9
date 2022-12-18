package Vector3D;

public class Vector3D {
    private double a;
    private double b;
    private double c;
    private double length;
    private final String INFO = "Vector in 3D";

    public Vector3D(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        findLength();
    }

    private void findLength() {
        length = Math.sqrt(a * a + b * b + c * c);
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getLength() {
        return length;
    }


    public double scalarMultiply(Vector3D vector) {
        return a * vector.getA() + b * vector.getB() + c * vector.getC();
    }

    public Vector3D add(Vector3D vector) {
        a += vector.getA();
        b += vector.getB();
        c += vector.getC();
        findLength();
        return this;
    }

    public Vector3D subtract(Vector3D vector) {
        a -= vector.getA();
        b -= vector.getB();
        c -= vector.getC();
        findLength();
        return this;
    }

    public static Vector3D[] randomVectors(int count) {
        Vector3D[] result = new Vector3D[count];
        int randomA;
        int randomB;
        int randomC;
        for (int i = 0; i < count; i++) {
            randomA = (int) (Math.random() * 10);
            randomB = (int) (Math.random() * 10);
            randomC = (int) (Math.random() * 10);
            result[i] = new Vector3D(randomA, randomB, randomC);
        }
        return result;
    }

    public boolean equals(Vector3D vector) {
        return a == vector.getA() && b == vector.getB() && c == vector.getC();
    }

    public double compareTo(Vector3D vector) {
        if (length > vector.getLength()) {
            System.out.println("Больше");
        } else if (length < vector.getLength()) {
            System.out.println("Меньше");
        } else {
            System.out.println("Равны");
        }
        return length - vector.length;
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Vector3D{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", length=" + length +
                ", INFO='" + INFO + '\'' +
                '}';
    }
}


