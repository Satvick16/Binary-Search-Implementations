import java.util.Arrays;

public class IterativeBinarySearch {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5, 8, 13};
        binarySearch(numbers, 13);
    }

    public static boolean binarySearch(int[] numbers, int toFind) {
        Arrays.sort(numbers);
        int start = 0;
        int end = numbers.length - 1;
        int mid = start + (end - start) / 2;

        while (end - start >= 0) {
            if (numbers[mid] == toFind) {
                return true;
            } else if (numbers[mid] > toFind) {
                end = mid - 1;
                mid = start + (end - start) / 2;
            } else {
                start = mid + 1;
                mid = start + (end - start) / 2;
            }
        }
        return false;
    }
}
