public class Main {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,8, 6};
        int el = 10;
        Search(arr, el);
    }

    public static void Search(int[] array, int val) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == val) {
                System.out.print(i + " ");
                count++;
            }
        }
        if (count == 0)
            System.out.print(-1);
    }
}
