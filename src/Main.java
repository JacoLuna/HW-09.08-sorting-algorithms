import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[4];
        Random rnd = new Random();

        System.out.println("Original array");
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(1,100);
            System.out.print(array[i] + " ");
        }

//        System.out.println("\ninsertion sorted array");
//        insertionSort(array);
//        printArray(array);

//        System.out.println("\nselection sorted array");
//        selectionSort(array);
//        printArray(array);

        System.out.println("\nmerge sorted array");
        mergeSort(array);
        printArray(array);
    }

    public static void printArray(int[] array){
        for (int value : array){
            System.out.print(value + " ");
        }
    }

    //start Insertion sort
    public static void insertionSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int aux = array[i];
            int index = i - 1;
            while (index >= 0 && array[index] > aux){
                array[index + 1] = array[index];
                index--;
            }
            array[index + 1] = aux;
        }
    }
    //end Insertion sort
    //start selection sort
    public static void selectionSort(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            int minIndex = i;
            for (int j = minIndex + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            int minValue = array[minIndex];
            array[minIndex] = array[i];
            array[i] = minValue;
        }

    }
    //end selection sort
    //start bubble sort
    public static void bubbleSort(int[] array){
    }
    //end bubble sort
    //start merge sort
    public static void mergeSort(int[] array){
        if (array.length < 2){
            return;
        }
        int middleIndex = array.length / 2;
        int[] leftPart = new int[middleIndex];
        int[] rightPart = new int[array.length - middleIndex];

        for (int i = 0; i < middleIndex; i++) {
            leftPart[i] = array[i];
        }
        for (int i = middleIndex; i < array.length; i++) {
            rightPart[i - middleIndex] = array[i];
        }
        mergeSort(leftPart);
        mergeSort(rightPart);

        merge(array, leftPart, rightPart);
    }
    public static void merge(int[] array,int[]  leftPart, int[] rightPart){
        int leftIndex=0, rightIndex=0, mergeIndex=0;

        while (leftIndex < leftPart.length && rightIndex < rightPart.length){
            if (leftPart[leftIndex] <= rightPart[rightIndex]){
                array[mergeIndex] = leftPart[leftIndex];
                leftIndex++;
            }
            else{
                array[mergeIndex] = rightPart[rightIndex];
                rightIndex++;
            }
            mergeIndex++;
        }
        while (leftIndex < leftPart.length){
            array[mergeIndex] = leftPart[leftIndex];
            leftIndex++;
            mergeIndex++;
        }
        while (rightIndex < rightPart.length){
            array[mergeIndex] = rightPart[rightIndex];
            rightIndex++;
            mergeIndex++;
        }
    }
    //end merge sort
    //start quick sort
    public static void quickSort(int[] array){
    }
    //end quick sort
}