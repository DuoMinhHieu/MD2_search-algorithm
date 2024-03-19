public class Main {
    public static void main(String[] args) {
        int[] list = {2, 5, 8, 11, 45, 67, 79, 89, 90, 100};
        System.out.println(linearSearch(list, 2));   /* 0 */
        System.out.println(linearSearch(list, 11));  /* 3 */
        System.out.println(linearSearch(list, 79));  /* 6 */
        System.out.println(linearSearch(list, 1));   /* -1 */
        System.out.println(linearSearch(list, 5));   /* 1 */
        System.out.println(linearSearch(list, 80));  /* -1 */
    }

    private static Object linearSearch(int[] list, int i) {
        return null;
    }
}