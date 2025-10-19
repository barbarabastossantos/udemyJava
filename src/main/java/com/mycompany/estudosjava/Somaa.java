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
public class Somaa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] mat=new int[3][3];
        int[][] mat2=new int[3][3];
        
        System.out.println( " Primeira matriz \n");
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                System.out.print("Digite o numero da posicao ["+i+"]["+j+"] -> ");
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println( " \n Segunda Matriz \n");
         for(int i=0;i<mat2.length;i++){
            for(int j=0;j<mat2[i].length;j++){
                System.out.print("Digite o numero da posicao ["+i+"]["+j+"] -> ");
                mat2[i][j]=sc.nextInt();
            }
        }
        
         int soma=0;
         System.out.println( " ");
         System.out.println( "A soma das duas matrizes e ");
          for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
              soma=mat[i][j]+mat2[i][j];
                System.out.print(soma+" ");
            }
              System.out.println(" ");
        }
          System.out.println("Matriz mat\n");
          for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
              
                System.out.print(mat2[i][j]+" ");
            }
              System.out.println(" ");
        }
          
          System.out.println(" Matriz mat2\n");
          for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
              
                System.out.print(mat[i][j]+" ");
            }
              System.out.println(" ");
        }
        
       sc.close();
    }
}
