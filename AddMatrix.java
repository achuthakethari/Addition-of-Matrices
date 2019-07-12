package AddMatrix;

import java.util.Scanner;

public class AddMatrix {
    public static void main(String[] args) {

        System.out.println("enter the m");
        Scanner ui = new Scanner(System.in);
        int m = ui.nextInt();
        System.out.println("enter the n");
        int n = ui.nextInt();

        int a[][] = new int[m][n];
        int b[][] = new int[m][n];
        int sum[][] = new int[m][n];

        System.out.println("enter the first matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Scanner num = new Scanner(System.in);
                a[i][j] = num.nextInt();
                
            }
            System.out.printf("\n");
        }

        System.out.println("enter the second matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Scanner num = new Scanner(System.in);
                b[i][j] = num.nextInt();

            }
            System.out.printf("\n");
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum[i][j] = a[i][j] + b[i][j];

            }
            System.out.printf("\n");
        }

        System.out.println("sum of two matrix is");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(sum[i][j] + "\t");

            }
            System.out.printf("\n");
        }

    }
}