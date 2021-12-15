/*
 * testSelectionSort.java
 *
* To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
	@Test
	public void test() {
		testPositive();
		testNegative();
		//testMixed();
		//testDuplicates();
	}

    public testSelectionSort() {
    }
    
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        /** add tests to check for this unit test **/
        SelectionSort test = new SelectionSort();
        int[] ss1 = test.basicSelectionSort(arr);
        assertArrayEquals("Test Positive failed", ss1, Sortedarr);
        System.out.println("Positive sorted array = " + Arrays.toString(ss1));
    }
    
    public void testNegative(){
        
        /** Test data contains negative values only **/
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -2;
        
        SelectionSort test2 = new SelectionSort();
        int[] ss2 = test2.basicSelectionSort(arr);
        assertArrayEquals("Test Negative failed", ss2, Sortedarr);
        System.out.println("Negative sorted array = " + Arrays.toString(ss2));

    }
    
    public void testMixed(){
        
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = 9;
        arr[2] = -7;
        arr[3] = 10;
        arr[4] = -2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -8;
        Sortedarr[1] = -7;
        Sortedarr[2] = -2;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        SelectionSort test3 = new SelectionSort();
        int[] ss3 = test3.basicSelectionSort(arr);
        assertArrayEquals("Test Mixed failed", ss3, Sortedarr);
        System.out.println("Negative sorted array = " + Arrays.toString(ss3));
    }
    
    public void testDuplicates(){
        
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = 2;
        arr[2] = -8;
        arr[3] = 2;
        arr[4] = 0;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -8;
        Sortedarr[1] = -8;
        Sortedarr[2] = 0;
        Sortedarr[3] = 2;
        Sortedarr[4] = 2;
        
        SelectionSort test4 = new SelectionSort();
        int[] ss4 = test4.basicSelectionSort(arr);
        assertArrayEquals("Test Negative failed", ss4, Sortedarr);
        System.out.println("Negative sorted array = " + Arrays.toString(ss4));

    }


}