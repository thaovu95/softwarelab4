/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarelab4;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Thao
 */

public class Lab4TestSuites {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Test
    public void testAverage1() {
        System.out.println("\nAverage #1");
        
        ArrayList<Integer> testData1 = new ArrayList<>(Arrays.asList(19, 12, 17, 14, 15, 16, 13, 18, 11, 28));
        ArrayList<Double> testData2 = new ArrayList<>(Arrays.asList(19.0, 12.0, 17.0, 15.0, 16.0, 13.0, 18.0, 11.0, 28.0));  
        
        SoftwareLab4 instance = new SoftwareLab4();
        
        int expResult = 0;
        
        double result = instance.calulateAverage(testData1,true);
        double result2 = instance.calulateAverage(testData2,true);
        
        assertEquals(expResult,result,16.5);
        System.out.printf("The average of the Integer array = %.0f\n", result);
        
        assertEquals(expResult,result2,17.0);
        System.out.printf("The average of the Double array = %.0f\n", result2);
        
    }
    /**
     * Test of average method, of class SoftwareLab4.
     */
    @Test
    public void testAverage2() {
        System.out.println("\nAverage #2");
        
        ArrayList<Integer> testData1 = new ArrayList<>(Arrays.asList(19, 12, 17, 14, 15));
        ArrayList<Double> testData2 = new ArrayList<>(Arrays.asList(19.4, 12.8, 17.2, 15.3));     
        
        SoftwareLab4 instance = new SoftwareLab4();
        
        int expResult = 0;
        
        double result = instance.calulateAverage(testData1,true);
        double result2 = instance.calulateAverage(testData2,true);
        
        assertEquals(expResult,result,15.4);
        System.out.printf("The average of the Integer array = %.0f\n", result);
        
        assertEquals(expResult,result2,16.2);
        System.out.printf("The average of the Double array = %.0f\n", result2);
        
    }
    
    /**
     * Test of average method, of class SoftwareLab4.
     */
    @Test
    public void testAverage3() {
        System.out.println("\nAverage #3");
        
        ArrayList<Integer> testData1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18));
        ArrayList<Double> testData2 = new ArrayList<>(Arrays.asList(11.0, 12.0, 13.0, 14.0, 15.0, 16.0, 17.0, 24.0, 15.6, 29.6, 5.9));    
        
        SoftwareLab4 instance = new SoftwareLab4();
        
        int expResult = 0;
        
        double result = instance.calulateAverage(testData1,true);
        double result2 = instance.calulateAverage(testData2,true);
        
        assertEquals(expResult,result,10.0);
        System.out.printf("The average of the Integer array = %.0f\n", result);
        
        assertEquals(expResult,result2,16.0);
        System.out.printf("The average of the Double array = %.0f\n", result2);
        
    }
        /**
     * Test of average method, of class SoftwareLab4.
     * test to fail
     */
    
    @Test
    public void testAverage4() {
        System.out.println("\nAverage #4");
        
        ArrayList<Integer> testData1 = new ArrayList<>(Arrays.asList(19.0, 12.0, 17.0, 14.0, 15.0));
        ArrayList<Double> testData2 = new ArrayList<>(Arrays.asList(19.4, 12.8, 17.2, 15.3));     
        
        SoftwareLab4 instance = new SoftwareLab4();
        
        int expResult = 0;
        
        double result = instance.calulateAverage(testData1,true);
        double result2 = instance.calulateAverage(testData2,true);
        
        assertEquals(expResult,result,15.4);
        System.out.printf("The average of the Integer array = %.0f\n", result);
        
        assertEquals(expResult,result2,16.2);
        System.out.printf("The average of the Double array = %.0f\n", result2);
        
    }


    /**
     * Test of sum method, of class SoftwareLab4.
     */
    @Test
    public void testSum1() {
       
        System.out.println("\nSum #1");
        
        ArrayList<Integer> testData1 = new ArrayList<>(Arrays.asList(19, 12, 17, 14, 15, 16, 13, 18, 11, 28));
        ArrayList<Double> testData2 = new ArrayList<>(Arrays.asList(19.0, 12.0, 17.0, 15.0, 16.0, 13.0, 18.0, 11.0, 28.0));      
        
        SoftwareLab4 instance = new SoftwareLab4();
        
        int expResult = 0;
        
        double result = instance.calculateSum(testData1,true);
        
        double result2 = instance.calculateSum(testData2,true);
        
        assertEquals(expResult,result,163.0);
        System.out.printf("The sum of the Integer array = %.0f\n", result);
        
        assertEquals(expResult,result2,149.0);
        System.out.printf("The sum of the Double array = %.0f\n", result2);
    }
    
     /**
     * Test of sum#2 method, of class SoftwareLab4.
     */
    @Test
     public void testSum2() {
       
        System.out.println("\nSum #2");
        
        ArrayList<Integer> testData1 = new ArrayList<>(Arrays.asList(19, 12, 17, 14, 15));
        ArrayList<Double> testData2 = new ArrayList<>(Arrays.asList(19.4, 12.8, 17.2, 15.3));      
        
        SoftwareLab4 instance = new SoftwareLab4();
        
        int expResult = 0;
        
        double result = instance.calculateSum(testData1,true);
        
        double result2 = instance.calculateSum(testData2,true);
        
        assertEquals(expResult,result,77.0);
        System.out.printf("The sum of the Integer array = %.0f\n", result);
        
        assertEquals(expResult,result2,65.0);
        System.out.printf("The sum of the Double array = %.0f\n", result2);
    }
    
      /**
     * Test of sum#3 method, of class SoftwareLab4.
     */
    @Test
      public void testSum3() {
       
        System.out.println("\nSum #3");
        
        ArrayList<Integer> testData1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18));
        ArrayList<Double> testData2 = new ArrayList<>(Arrays.asList(11.0, 12.0, 13.0, 14.0, 15.0, 16.0, 17.0, 24.0, 15.6, 29.6, 5.9));      
        
        SoftwareLab4 instance = new SoftwareLab4();
        
        int expResult = 0;
        
        double result = instance.calculateSum(testData1,true);
        
        double result2 = instance.calculateSum(testData2,true);
        
        assertEquals(result,171.0);
        System.out.printf("The sum of the Integer array = %.0f\n", result);
        
        assertEquals(expResult,result2,174.0);
        System.out.printf("The sum of the Double array = %.0f\n", result2);
    }
      
       /**
     * Test of sum#2 method, of class SoftwareLab4.
     * testing for negative numbers
     */
    @Test
     public void testSum4() {
       
        System.out.println("\nSum #4");
        
        ArrayList<Integer> testData1 = new ArrayList<>(Arrays.asList(-19, -12, -17, -14, -15));
        ArrayList<Double> testData2 = new ArrayList<>(Arrays.asList(19.4, 12.8, 17.2, 15.3));      
        
        SoftwareLab4 instance = new SoftwareLab4();
        
        int expResult = 0;
        
        double result = instance.calculateSum(testData1,true);
        
        double result2 = instance.calculateSum(testData2,true);
        
        assertEquals(expResult,result,77.0);
        System.out.printf("The sum of the Integer array = %.0f\n", result);
        
        assertEquals(expResult,result2,65.0);
        System.out.printf("The sum of the Double array = %.0f\n", result2);
    }

    /**
     * Test of median method, of class SoftwareLab4.
     */
    @Test
    public void testMedian1() {
        System.out.println("\nMedian #1");
        
        ArrayList<Integer> testData1 = new ArrayList<>(Arrays.asList(19, 12, 17, 14, 15, 16, 13, 18, 11, 28));
        ArrayList<Double> testData2 = new ArrayList<>(Arrays.asList(19.0, 12.0, 17.0, 15.0, 16.0, 13.0, 18.0, 11.0, 28.0));      
        
        SoftwareLab4 instance = new SoftwareLab4();
        
        int expResult = 0;
        
        double result = instance.calculateMedian(testData1);
        
        double result2 = instance.calculateMedian(testData2);
        
        assertEquals(expResult,result,16.0);
        System.out.printf("The median of the Integer array = %.0f\n", result);
        
        assertEquals(expResult,result2,16.0);
        System.out.printf("The median of the Integer array = %.0f\n", result2);
        
    }
    
    /**
     * Test of median method, of class SoftwareLab4.
     */
    @Test
    public void testMedian2() {
        System.out.println("\nMedian #2");
        
        ArrayList<Integer> testData1 = new ArrayList<>(Arrays.asList(19, 12, 17, 14, 15));
        ArrayList<Double> testData2 = new ArrayList<>(Arrays.asList(19.4, 12.8, 17.2, 15.3));   
        
        SoftwareLab4 instance = new SoftwareLab4();
        
        int expResult = 0;
        
        double result = instance.calculateMedian(testData1);
        
        double result2 = instance.calculateMedian(testData2);
        
        assertEquals(expResult,result,16.5);
        System.out.printf("The median of the Integer array = %.0f\n", result);
        
        assertEquals(expResult,result2,16.5);
        System.out.printf("The median of the Integer array = %.0f\n", result2);
        
    }
    
    /**
     * Test of median method, of class SoftwareLab4.
     */
    @Test
    public void testMedian3() {
        System.out.println("\nMedian #3");
        
        ArrayList<Integer> testData1 = new ArrayList<>(Arrays.asList(19, 12, 17, 14, 15, 16, 13, 18, 11, 28));
        ArrayList<Double> testData2 = new ArrayList<>(Arrays.asList(20.2, 80.0, 27.5, 40.2, 21.1));      
        
        SoftwareLab4 instance = new SoftwareLab4();
        
        int expResult = 0;
        
        double result = instance.calculateMedian(testData1);
        
        double result2 = instance.calculateMedian(testData2);
        
        assertEquals(expResult,result,16.0);
        System.out.printf("The median of the Integer array = %.0f\n", result);
        
        assertEquals(expResult,result2,28.0);
        System.out.printf("The median of the Integer array = %.0f\n", result2);
        
    }

    
    /**
     * Test of median method, of class SoftwareLab4.
     */
    @Test
    public void testMedian4() {
        System.out.println("\nMedian #4");
        
        ArrayList<Integer> testData1 = new ArrayList<>(Arrays.asList(19*2, 12/2, 17/3, 14-2, 15+5));
        ArrayList<Double> testData2 = new ArrayList<>(Arrays.asList(19.4, 12.8, 17.2, 15.3));   
        
        SoftwareLab4 instance = new SoftwareLab4();
        
        int expResult = 0;
        
        double result = instance.calculateMedian(testData1);
        
        double result2 = instance.calculateMedian(testData2);
        
        assertEquals(expResult,result,16.5);
        System.out.printf("The median of the Integer array = %.0f\n", result);
        
        assertEquals(expResult,result2,16.5);
        System.out.printf("The median of the Integer array = %.0f\n", result2);
        
    }
    
    /**
     * Test of standardDev method, of class SoftwareLab4.
     */
    @Test
    public void testStandardDev1() {
        System.out.println("\nStandard Deviation #1");
        
        ArrayList<Integer> testData1 = new ArrayList<>(Arrays.asList(19, 12, 17, 14, 15, 16, 13, 18, 11, 28));
        ArrayList<Double> testData2 = new ArrayList<>(Arrays.asList(19.0, 12.0, 17.0, 15.0, 16.0, 13.0, 18.0, 11.0, 28.0));         
        
        SoftwareLab4 instance = new SoftwareLab4();
        
        int expResult = 0;
        
        double result = instance.standardDeviation(testData1);
    
        double result2 = instance.standardDeviation(testData2);
        
        assertEquals(expResult, result, 5.0);
        System.out.printf("The sample standard deviation of the Integer test set = %.2f\n",result);
        
        assertEquals(expResult, result2, 5.1);
        System.out.printf("The sample standard deviation of the Integer test set = %.2f\n",result2);
        
    }   
    
       /**
     * Test of standardDev method, of class SoftwareLab4.
     */
    @Test
    public void testStandardDev2() {
        System.out.println("\nStandard Deviation #2");
        
        ArrayList<Integer> testData1 = new ArrayList<>(Arrays.asList(19, 12, 17, 14, 15));
        ArrayList<Double> testData2 = new ArrayList<>(Arrays.asList(19.4, 12.8, 17.2, 15.3));   
        
        SoftwareLab4 instance = new SoftwareLab4();
        
        int expResult = 0;
        
        double result = instance.standardDeviation(testData1);
    
        double result2 = instance.standardDeviation(testData2);
        
        assertEquals(expResult, result, 3.0);
        System.out.printf("The sample standard deviation of the Integer test set = %.2f\n",result);
        
        assertEquals(expResult, result2, 3.0);
        System.out.printf("The sample standard deviation of the Integer test set = %.2f\n",result2);
        
    }   

   /**
     * Test of standardDev method, of class SoftwareLab4.
     */
    @Test
    public void testStandardDev3() {
        System.out.println("\nStandard Deviation #3");
        
        ArrayList<Integer> testData1 = new ArrayList<>(Arrays.asList(19, 12, 17, 14, 15, 16, 13, 18, 11, 28));
        ArrayList<Double> testData2 = new ArrayList<>(Arrays.asList(20.2, 80.0, 27.5, 40.2, 21.1));     
        
        SoftwareLab4 instance = new SoftwareLab4();
        
        int expResult = 0;
        
        double result = instance.standardDeviation(testData1);
    
        double result2 = instance.standardDeviation(testData2);
        
        assertEquals(expResult, result, 5.0);
        System.out.printf("The sample standard deviation of the Integer test set = %.2f\n",result);
        
        assertEquals(expResult, result2, 25.0);
        System.out.printf("The sample standard deviation of the Integer test set = %.2f\n",result2);
        
    }   
}

