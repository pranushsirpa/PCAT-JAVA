public class BruteForceSort {
    public static void bruteForceSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
          int[] array = InitializeArray.initializeArray(10, 1, 100);
          System.out.println("Original Array:");
        printArray(array);
        bruteForceSort(array);
        System.out.println("\nSorted Array:");
        printArray(array);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}



b) Write a function named PerformLinearSearch that searches for a specific element in an array 
and returns the index of the element if found or -1 if not found.



public class LinearSearch {
    public static int performLinearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        
        int[] array = InitializeArray.initializeArray(10, 1, 100);
        System.out.println("Array:");
        printArray(array);
        int target = 42;
        int index = performLinearSearch(array, target);
 
        if (index != -1) {
            System.out.println("\nElement " + target + " found at index " + index);
        } else {
            System.out.println("\nElement " + target + " not found in the array");
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

