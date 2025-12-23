public class BinaryFirstOccurence {
    public static int firstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                right = mid - 1; // search left half
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
        int index = firstOccurrence(arr, target);
        System.out.println("First occurrence of " + target + " is at index: " + index);
    }

}
