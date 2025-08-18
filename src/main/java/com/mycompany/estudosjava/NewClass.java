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
public class NewClass {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        System.out.println("digite um numero : ");
        int n=sc.nextInt();
        int soma=0;
        for(int i=1;i<=n;i++){
          
          soma=soma+i;
       
        }
        System.out.println(soma);
    
    }
}
