package com.company;

import java.util.Arrays;

/**
 * Created by Max on 08.01.2016.
 */
public class Increasing_elements {
    public static void increase(int[][] matrix){
        System.out.println("Values sorted matrix: ");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                Arrays.sort(matrix[j]);
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println();
        }
    }
}
