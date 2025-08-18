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
public class SomaNumerosPares {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Digite um numero inteiro -> ");
        int n=sc.nextInt();
        int soma=0;
        for(int i=1;i<=n;i++){
            if(i %2==0){
                System.out.println(" par -> "+ i);
                soma+=i;
            }
            
        }
        System.out.println("A soma desses numeros pares   e "+ soma);
        sc.close();
    }
}
