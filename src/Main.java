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
        System.out.println("\nselection sorted array");
        selectionSort(array);
        for (int value : array){
            System.out.print(value + " ");
        }
    }

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
    public static void bubbleSort(int[] array){
    }
    public static void mergeSort(int[] array){
    }
    public static void quickSort(int[] array){

    }
}