public class Main {
    public static void main(String[] args) {
        int[] list = {2, 5, 8, 11, 45, 67, 79, 89, 90, 100};
        System.out.println(LinearSearch.linearSearch(list, 2));
        System.out.println(LinearSearch.linearSearch(list, 11));
        System.out.println(LinearSearch.linearSearch(list, 79));
        System.out.println(LinearSearch.linearSearch(list, 1));
        System.out.println(LinearSearch.linearSearch(list, 5));
        System.out.println(LinearSearch.linearSearch(list, 80));
    }
}