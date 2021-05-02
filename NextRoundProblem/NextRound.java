package NextRoundProblem;

import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, k;
        n = input.nextInt();
        k = input.nextInt();
        input.nextLine();
        int sum = 0;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (array[i] >= array[k-1] && array[i] > 0) {
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}
