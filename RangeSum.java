public class RangeSum {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = RangeSum(numbers, 2, 5);

        System.out.println("The sum of elements 2 through 5 is " + sum);
    }

    public static int RangeSum(int[] array, int start, int end) {
        if (start > end) {
            return 0;
        } else {
            return array[start] + RangeSum(array, start + 1, end);
        }
    }
}
