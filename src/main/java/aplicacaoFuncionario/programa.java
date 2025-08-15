/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacaoFuncionario;

import etidades.Funcionario;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        
        List<Funcionario> list= new ArrayList<>(); //criar a lista list, um armario vazio que vai guardar meus funcionarios que vou criar
        
        System.out.println("Quantos funcionarios vao ser registrados : ");
        int n=sc.nextInt();
        
        for(int i =0; i< n;i++){               //Esse primeiro for  serve para add os funcionarios
            System.out.println();
            System.out.println("Funcionario #"+(i+1)+" :");
            System.out.println();
            System.out.print("ID : ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome : ");
            String nome=sc.nextLine();
            System.out.print("Salario: ");
            Double salario=sc.nextDouble();
            
            Funcionario fun= new Funcionario(nome,salario,id);//criando um funcionario que vai ter nome,salario,id
            
            list.add(fun); // adicionado meus funcionarios a minha lista meu armario que estava vazio la em cima 
           
                
            }
            
        //Aqui vamos verificar se o id existe usando nossa funcao auxiiar pocisao  se existir pergunta a porcentage e incrementa o salario se nao existe imprime a messagem nao existe
        
        System.out.println("Digite o ID do funcionario que vai receber o aumneto");
        int idSalario=sc.nextInt();
        Integer pos= posicao(list,idSalario);
        if(pos == null){
            System.out.println("Esse Id nao existe");
      }
        else{
            System.out.println("Qual a porcentagem : ");
            int  porcentagem =sc.nextInt();
            list.get(pos).incrementoSalarial(porcentagem);
        }
        
        System.out.println("Lista de funcionarios\n");
       for(Funcionario fun : list){
           System.out.println(fun);
       }
        
        
        sc.close();
    }
        
    //criando uma funcao auxiliar para ver a posicao do id e se nao achar retornar null 
    // vou usar funcao lambda
    
     public static Integer posicao (List<Funcionario> list,int id) {
         for(int i=0; i<list.size(); i++){
             if(list.get(i).getId() == id) {
                 return i;
             }
         }
         return null;
     }
    
}
     
   

