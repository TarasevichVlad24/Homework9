package VectorMulti;

import java.util.Arrays;

public class VectorMulti {
    private double[] arrCoords;
    private double length;
    private final String INFO = "Vector in multi";

    public VectorMulti(double...arrCoords){
        this.arrCoords = arrCoords;
        findLength();
    }
    private void findLength(){
        double formula = 0;
        for(double coord: arrCoords){
            formula += coord*coord;
        }
        length = Math.sqrt(formula);
    }

    public double[] getArrCoords() {
        return arrCoords;
    }

    public double getLength() {
        return length;
    }

    public double scalarMultiply (VectorMulti vector){
        double sum = 0;
        for(int i=0;i<arrCoords.length;i++){
           sum+= arrCoords[i] * vector.getArrCoords()[i];
        }
        return sum;

    }
    public VectorMulti add (VectorMulti vector){
        for(int i=0;i<arrCoords.length;i++){
            arrCoords[i] += vector.getArrCoords()[i];
        }
        findLength();
        return this;
    }
    public VectorMulti subtract (VectorMulti vector){
        for(int i=0;i<arrCoords.length;i++){
            arrCoords[i] -= vector.getArrCoords()[i];
        }
        findLength();
        return this;
    }
    public static VectorMulti[] getRandomVectors(int count){
        VectorMulti[] result = new VectorMulti[count];
        int randomCoordCount;
        double[] randomCoords;
        for(int i =0; i<count;i++){
            randomCoordCount = (int)(Math.random()*10);
            randomCoords = new double[randomCoordCount];
            for(int j=0;j<randomCoordCount;j++){
                randomCoords[j] = (int)(Math.random()*10);
            }
            result[i] = new VectorMulti(randomCoords);

        }
        return result;
    }

    public boolean equals (VectorMulti vector){
        double[]vectorCoords = vector.getArrCoords();
        if(arrCoords.length!= vectorCoords.length){
            return false;
        }
        for(int i=0;i<arrCoords.length;i++){
            if(arrCoords[i]!=vectorCoords[i]){
                return false;
            }
        }
        return true;
    }
    public void printInfo(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        String[] coordsStringArray = new String[arrCoords.length];
        for(int i=0;i<arrCoords.length;i++){
            coordsStringArray[i] = String.valueOf(arrCoords[i]);
        }
        return "VectorMulti{" +
                "arrCoords=" + Arrays.toString(arrCoords) +
                ", length=" + length +
                ", INFO='" + INFO + '\'' +
                '}';
    }
}
