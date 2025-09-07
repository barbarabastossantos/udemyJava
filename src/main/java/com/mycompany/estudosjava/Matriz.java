/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estudosjava;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Matriz {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int n=sc.nextInt();
        
        int mat [][] = new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               mat[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("\n Diagonal principal \n");
             for(int i=0;i<n;i++){
                 System.out.print(mat[i][i] +" ");
             }   
                
                
                int count=0;
                
                for(int i=0;i<n;i++){
                    for(int j=0;j<n;j++){
                        if(mat[i][j]<0){
                            count++;
                        }
                    }
                }
                System.out.println("\n Numeros negaticos:");
                System.out.println(count);
                sc.close();
                }
}
