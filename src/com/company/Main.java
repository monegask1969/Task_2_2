package com.company;

import java.util.Scanner;

import static com.company.Increasing_elements.increase;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of matrix: ");
        int n = scanner.nextInt();
        int[][] matrix;
        matrix = new int[n][n];
        for (int i = 0; i < n; i++) {

            for(int j=0; j < n; j++){
                matrix[i][j] = ((int)(Math.random() * 31) - 15);
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println();

        }
       increase(matrix); // строки (столбцы) матрицы в порядке возрастания значений

    }
}
