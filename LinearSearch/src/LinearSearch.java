public class LinearSearch {
    public static void main(String[] args) {
        int[] list = {2, 5, 8, 11, 45, 67, 79, 89, 90, 100};
    }

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}

