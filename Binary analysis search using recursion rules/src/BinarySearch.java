public class BinarySearch {
    public static int binarySearch(int[] arr, int key, int left, int right) {
        if (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid] < key) {
                return binarySearch(arr, key, mid + 1, right);
            } else {
                return binarySearch(arr, key, left, mid - 1);
            }
        }

        return -1;
    }
}