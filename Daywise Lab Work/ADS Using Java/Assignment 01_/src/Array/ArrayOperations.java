package Array;

import java.util.Scanner;

public class ArrayOperations {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) 
        {
            array[i] = sc.nextInt();
        }

        while (!exit) 
        	
        {
        	System.out.println("Option ");
        	System.out.println("1.Display Array\n2.Display Reverse\n3.Replace index\n4.Find sum\n5.Find Max\n6.Find Averge\n7.Display EvenAndOdd");
        	try
        	{

                

                 switch (sc.nextInt())
                 {
                     case 1:
                    	 System.out.println("------------------");
                         displayArray(array);
                         System.out.println("------------------");
                         break;
                     case 2:
                    	 System.out.println("------------------");
                         reverseArray(array);
                         System.out.println("------------------");
                         break;
                     case 3:
                         System.out.print("Enter the index to replace: ");
                         int index = sc.nextInt();
                         System.out.print("Enter the new value: ");
                         int value = sc.nextInt();
                         replaceElement(array, index, value);
                         System.out.println("------------------");
                         displayArray(array);
                         System.out.println("------------------");
                         break;
                     case 4:
                         int sum = findSum(array);
                         System.out.println("----------------------------");
                         System.out.println("Sum of all elements: " + sum);
                         System.out.println("----------------------------");
                         break;
                     case 5:
                         int max = findMax(array);
                         System.out.println("------------------------");
                         System.out.println("Maximum element: " + max);
                         System.out.println("------------------------");
                         break;
                     case 6:
                         double average = findAverage(array);
                         System.out.println("-------------------------------");
                         System.out.println("Average of elements: " + average);
                         System.out.println("--------------------------------");
                         break;
                     case 7:
                         displayEvenOdd(array);
                         break;
                     case 8:
                        exit=true;
                        System.out.println("------------------");
                        System.out.println("Thanks,Exiting!!!");
                        System.out.println("------------------");
                         break;
                     default:
                         System.out.println("Invalid choice!");
                 }
        	}
        	catch(Exception e) 
        	{
        		e.printStackTrace();
        		sc.nextLine();
        		 System.out.println("--------------------------");
        		System.out.println("Please try again!!");
        	}
           
        }
        sc.close();
    }

    public static void displayArray(int[] arr)
    {
        System.out.println("Array elements are:");
        for (int i : arr) 
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void reverseArray(int[] arr)
    {
        System.out.println("Reversed array:");
        for (int i = arr.length - 1; i >= 0; i--) 
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void replaceElement(int[] arr, int index, int value)throws RuntimeException 
    {
    	if(index<0||index>=arr.length)
    		throw new RuntimeException("No such element at this index!!");
        arr[index] = value;
        System.out.println("Element replaced successfully.");
    }

    public static int findSum(int[] arr)
    {
        int sum = 0;
        for (int i : arr) 
        {
            sum += i;
        }
        return sum;
    }

    public static int findMax(int[] arr) 
    {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) 
        {
            if (arr[i] > max) 
            {
                max = arr[i];
            }
        }
        return max;
    }

    public static double findAverage(int[] arr) 
    {
        int sum = findSum(arr);
        return (double) sum / arr.length;
    }

    public static void displayEvenOdd(int[] arr)
    {
        System.out.println("Even numbers:");
        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Odd numbers:");
        for (int i : arr) 
        {
            if (i % 2 != 0)
            {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}