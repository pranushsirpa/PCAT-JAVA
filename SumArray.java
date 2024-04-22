public class SumArray {
    public static int sumArray(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return arr[n - 1] + sumArray(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = sumArray(array, array.length);
        System.out.println("Sum of elements in the array: " + sum);
    }
}
