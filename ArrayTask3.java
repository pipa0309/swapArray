//forCheck

import java.util.Scanner;

public class ArrayTask3 {
    public static void main(String[] args) {

        Scanner scanSizeArray = new Scanner(System.in);
        int sizeArray = scanSizeArray.nextInt();
        scanSizeArray.close();

        int[] arr = new int[sizeArray];
        for (int i = 0; i < arr.length; i++) {
            int seqUp = arr[i] = i;
            int seqDow = arr[i] = (arr.length - i);
            swap(seqUp, seqDow);

            int swapResult = arr[i];
            printSwap(swapResult);
        }
    }

    public static void swap(int seqUp, int seqDow) {
        int tmp;
        tmp = seqUp;
        seqUp = seqDow;
        seqDow = tmp;
    }

    public static void printSwap(int swapResult) {
        System.out.print(swapResult + " ");
    }

}
