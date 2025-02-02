import java.util.Arrays;

public class Basics {
    // adding all values in array and dividing by array size to get mean
    public static double mean(double[] array, int size) {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum = +array[i];
        }

        return sum / array.length;
    }

    // finding the min and max of the array and subtracting for range
    public static double range(double[] array, int size){
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;

        for(int i = 0; i < size; i++){
            if(max < array[i]){
                max = array[i];
            }
            if(min > array[i]){
                min = array[i];
            }
        }

        return max - min;
    }

    // will work on creating the code needed to order an array
    public static double median(double[] orderedArray, int size){
        int middle = Math.round((float) size/2);
        System.out.println(middle);

        if(size % 2 == 1){
            // since the array starts at index 0
            return orderedArray[middle - 1];
        }
        else {
            return (orderedArray[middle - 1] + orderedArray[-(middle - 1)])/2;
        }
    }

    public static double variance(double[] array, int size){
        double sum = 0.0;
        double sampleMean = mean(array, size);

        int i = 0;
        while (i < array.length) {
            sum =+ Math.pow((array[i] - sampleMean), 2);
            i++;
        }

        return ((double) 1 / size) * sum;
    }

    public static double standardDev(double[] array, int size, double med){
        return Math.sqrt(variance(array, size));
    }

    public static double[] MAD(double[] array, int size, double med){
        // when array ordering works, will have the below code running
        // double median = median(array, size);

        double[] madArray = new double[size];

        for(int i = 0; i < array.length; i++){
            madArray[i] = array[i] - med;
        }

        return madArray;
    }

    public static void main(String[] args) {
        
    }
}
