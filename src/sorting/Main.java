package sorting;
import java.util.Collections;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        SortableArray<Integer> numbers = new SortableArray<Integer>();

        Random rand = new Random();
        int num;

        for (int i = 0; i < 10; i++)
        {
            num = rand.nextInt(10000);
            numbers.add(num);
        }

        // SIMPLE BUBBLE SORT
        System.out.println("Before Simple Bubble Sort " + numbers);
        long startTime1 = System.currentTimeMillis();
        numbers.simpleBubbleSort();
        System.out.println("After Simple Bubble Sort " + numbers);
        long endTime1 = System.currentTimeMillis();
        System.out.println("Simple Bubble Sort of " + numbers.size() + " elements took "  + (endTime1 - startTime1)  + " Milliseconds");
        Collections.shuffle(numbers);
        System.out.println("-----------------------------------------");

        // BUBBLE SORT
        System.out.println("Before Bubble Sort " + numbers);
        long startTime2 = System.currentTimeMillis();
        numbers.bubbleSort();
        System.out.println("After Bubble Sort " + numbers);
        long endTime2 = System.currentTimeMillis();
        System.out.println("Bubble Sort of " + numbers.size() + " elements took "  + (endTime2 - startTime2)  + " Milliseconds");
        Collections.shuffle(numbers);
        System.out.println("-----------------------------------------");

        // INSERTION SORT
        System.out.println("Before Insertion Sort " + numbers);
        long startTime3 = System.currentTimeMillis();
        numbers.insertionSort();
        System.out.println("After Insertion Sort " + numbers);
        long endTime3 = System.currentTimeMillis();
        System.out.println("Insertion sort of " + numbers.size() + " elements took "  + (endTime3 - startTime3)  + " Milliseconds");
        Collections.shuffle(numbers);
        System.out.println("-----------------------------------------");

        // SELECTION SORT
        System.out.println("Before Selection Sort " + numbers);
        long startTime = System.currentTimeMillis();
        numbers.selectionSort();
        System.out.println("After Selection Sort " + numbers);
        long endTime = System.currentTimeMillis();
        System.out.println("Selection Sort of " + numbers.size() + " elements took "  + (endTime - startTime)  + " Milliseconds");
        Collections.shuffle(numbers);
        System.out.println("-----------------------------------------");

        // MERGE SORT TODO
//        System.out.println("Before Merge Sort " + numbers);
//        long startTime4 = System.currentTimeMillis();
//        numbers.mergeSort();
//        System.out.println("After Merge Sort " + numbers);
//        long endTime4 = System.currentTimeMillis();
//        System.out.println("Merge Sort of " + numbers.size() + " elements took "  + (endTime4 - startTime4)  + " Milliseconds");
//        Collections.shuffle(numbers);
//        System.out.println("-----------------------------------------");

        // QUICK SORT TODO
        System.out.println("Before Quick Sort " + numbers);
        long startTime5 = System.currentTimeMillis();
        numbers.quickSort(0, 9);
        System.out.println("After Quick Sort " + numbers);
        long endTime5 = System.currentTimeMillis();
        System.out.println("Quick Sort of " + numbers.size() + " elements took "  + (endTime5 - startTime5)  + " Milliseconds");
        Collections.shuffle(numbers);
        System.out.println("-----------------------------------------");
    }
}
