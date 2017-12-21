/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarelab4;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Thao
 */
public final class SoftwareLab4 {

    /**
 * @param  array  an arraylist
 * @param  list value of true or false
 * @@throws IllegalArgumentException if value not in given range. 
 */
    
    public static <T extends Number> double calulateAverage(ArrayList<T> array, boolean list) {
        double totalSum = calculateSum(array, list);
        int count = 0;
        for (int i = 0; i < array.size(); i++) { // getting array size
            if (list || array.get(i).doubleValue() >= 0) { // checking if incneg and array to see if either are greater than 0
                count++;
            }
        }
        if (count == 0) {
            throw new IllegalArgumentException("no values are > 0");
        }
        return totalSum / count;
    }

    public static <T extends Number> double calculateSum(ArrayList<T> array, boolean list) {
        if (array.size() < 0) {
            throw new IllegalArgumentException("array cannot be empty");
        }

        double sum = 0;
        for (T val : array) { // checking array size
            double value = val.doubleValue();
            if (list || value >= 0) {
                sum += value; // if incneg or value is greater than 0 add the value to sum
            }
        }
        return sum;
    }
/**
 * @param  array  an arraylist
 * @param median value of double
 */
    
    public static <T extends Number> double calculateMedian(ArrayList<T> array) {
        double median;
        if (array.size()%2==0) { // of the array size divided by 2 is equal to 0 then
            int newArraySize = array.size()/2-1; 
            median = (fnv(array, newArraySize) + fnv(array, newArraySize + 1)) / 2;
        }
        else
            median = fnv(array, array.size() / 2);
        return median;
    }
    
    private static <T extends Number> double fnv(ArrayList<T> array, int x) 
    {//setting two new array list
        ArrayList<T> array1 = new ArrayList<>();
        ArrayList<T> array2 = new ArrayList<>();
        
        int half = array.size()/2;
        
        double valueOfHalf = array.get(half).doubleValue();
        for (T v : array) { // checking array
            if (v.doubleValue() < valueOfHalf) // if the value of v is less than the value of valueOfHalf send value of v to lt array
                array1.add(v);
            else if (v.doubleValue() > valueOfHalf)// if the value of v is greater than the value of valueOfHalf send value of v to gt array
                array2.add(v);
        }
        
        if(x < array1.size()) 
            return fnv(array1, x);
        
        else if(x >= (array.size() - array2.size())) 
            return fnv(array2, x - (array.size() - array2.size()));

        return valueOfHalf;
    }
/**
 * @param  array  an arraylist
 * @@throws IllegalArgumentException if value not in given range. 
 */
    
    public static <T extends Number> double standardDeviation(ArrayList<T> array) {
        if (array.size() <= 1) {
            throw new IllegalArgumentException("Size of array must be greater than 1");
        }

        int arraySize = array.size();
        double value = 0;
        double average = calulateAverage(array, true);
        
        for (int i = 0; i < arraySize; i++) {
            double currentValue = array.get(i).doubleValue();
            value += Math.pow(currentValue - average, 2);
        }
        double standardDeviation = Math.sqrt(value / (arraySize - 1));
        return standardDeviation;
    }

    // Simple set of tests that confirm that functions operate correctly
    public static void main(String[] args) {

        ArrayList<Integer> testData1 = new ArrayList<>(Arrays.asList(9, 2, 7, 4, 5, 6, 3, 8, 1, 10));
        ArrayList<Double> testData2 = new ArrayList<>(Arrays.asList(2.2, 100.0, 17.5, 30.2, 31.1));

        System.out.printf("The sum of the Integer array = %.0f\n", calculateSum(testData1, true));
        System.out.printf("The sum of the Double array = %.0f\n", calculateSum(testData2, true));

        System.out.printf("The average of the Integer test set = %.2f\n", calulateAverage(testData1, true));
        System.out.printf("The average of the Double test set = %.2f\n", calulateAverage(testData2, true));

        System.out.printf("The median value of the Integer data set = %.2f\n", calculateMedian(testData1));
        
        System.out.printf("The median value of the Double data set = %.2f\n", calculateMedian(testData2));
        
        System.out.printf("The sample standard deviation of the Integer test set = %.2f\n", standardDeviation(testData1));
        System.out.printf("The sample standard deviation of the Double test set = %.2f\n", standardDeviation(testData2));
    }
}
