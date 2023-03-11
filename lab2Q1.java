import java.util.Arrays;

public class lab2_Q1 {
    public static void main(String[] args) {
        int[] C = {1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(C));
        reverse(C, 5);
    }

    public static void reverse(int[] arr, int size) {
        int[] copyArray = new int[size];

        for(int i = 0; i < arr.length; ++i) {
            copyArray[i] = arr[arr.length - 1 - i];
        }
      arr=copyArray;
        System.out.println(Arrays.toString(arr));
    }

}
