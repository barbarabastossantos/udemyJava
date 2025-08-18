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
public class Media {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("QUantos numeros quer informar para calcular a media -> ");
        int n=sc.nextInt();
        
        int[] vect=new int[n];
        int soma=0;
        for(int i=0;i<vect.length;i++){
            System.out.println("Digite o "+(i+1)+" numero -> ");
            int num=sc.nextInt();
             soma+=num;
         
        }
        int result=soma/vect.length;
        System.out.println("A media desses numeros e "+result);
        
        
        
        sc.close();
    }
}
