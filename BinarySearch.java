public class BinarySearch {
    public static int lastOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                left = mid + 1; // search right half
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 9, 9, 10, 10, 11, 12};
        int target = 10;
        int index = lastOccurrence(arr, target);
        System.out.println("Last occurrence of " + target + " is at index: " + index);
    }
}