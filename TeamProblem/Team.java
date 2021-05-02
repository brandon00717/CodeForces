package TeamProblem;

import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int problems;
        int solutions = 0;
        int p, v, t;
        problems = input.nextInt();
        input.nextLine();
        for (int i = 0; i < problems; i++){
            p = input.nextInt();
            v = input.nextInt();
            t = input.nextInt();
            input.nextLine();
            if (p+v+t >= 2) {
                solutions += 1;
            }
        }
        System.out.println(solutions);
    }
}
