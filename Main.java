package hw1;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
//		Task1
//		Create next array of Integers with values: 2,3,1,7,11. Sort them by DESC(reverseOrder).
        int[] arrayTask1 = {2, 3, 1, 7, 11};
        for (int i = 0; i < arrayTask1.length; i++) {
            for (int j = 0; j < arrayTask1.length; j++) {
                if (arrayTask1[i] > arrayTask1[j]) {
                    int temp = arrayTask1[i];
                    arrayTask1[i] = arrayTask1[j];
                    arrayTask1[j] = temp;
                }
            }
        }
        System.out.println(" Task 1 , sorted arry : ");
        for (int elem : arrayTask1) {
            System.out.println(elem);
        }
//		Task2
//		You get an array of numbers(should contain both positive and negative numbers),
//		and return the sum of all the positive ones. (If there are nothing to sum, sum should be 0)
        int[] arrayTask2 = {0, 3, -2, 10, 3, -10};
        int sum = 0;
        for (int i = 0; i < arrayTask2.length; i++)
            if (arrayTask2[i] >= 0) {
                sum += arrayTask2[i];
            }
    }
		System.out.println("Task 2. Sum = "+sum);
    //		Task3
//		You get an array of numbers, 
//		return the average of a list of numbers in
//		this array. (Example -  array{1,2,4,1} -> avg = 2)
    int[] arrayTask3 = {2, 8, 11, 10, 6, 3,};
    double avg = 0;
		for(
    int i = 0;
    i<arrayTask3.length;i++)

    {
        avg += arrayTask3[i];
    }
		System.out.println("Task 3. Avg = "+avg /arrayTask3.length);
    //		Task4
//		*You have array {3,2,3,1,4,2,8,3}. Replace all duplicated values 
//		by 0. Result should be  next: {3,2,0,1,4,0,8,0}
    int[] arrayTask4 = {3, 2, 3, 1, 4, 2, 8, 3};
    int[] duplicate = new int[arrayTask4.length];
		for(
    int i = 0;
    i<arrayTask4.length;i++)

    {
        for (int j = 0; j < arrayTask4.length; j++) {
            if (i != j && arrayTask4[i] == arrayTask4[j]) {
                arrayTask4[j] = 0;
            }
        }
    }
		System.out.println("Task4 ");
		for(
    int i = 0;
    i<arrayTask4.length;i++)

    {
        System.out.println(arrayTask4[i]);
    }
}
}
