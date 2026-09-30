public class mainarray {
    public static void main(String[] args) {

        int[] arr = new int[10];

        // Store values 1 to 10
        for (int i = 0; i < 10; i++) {
            arr[i] = i + 1;
        }

        // Print the array
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}