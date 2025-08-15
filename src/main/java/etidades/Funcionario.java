/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package etidades;

/**
 *
 * @author usuario
 */
public class Funcionario {
    private String nome;
    private Double salario;
    private Integer id;
    
    public Funcionario(){
        
    }

    public Funcionario(String nome, Double salario, Integer id) {
        this.nome = nome;
        this.salario = salario;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }

    public Integer getId() {
        return id;
    }
    
    
    public void incrementoSalarial(int porcentagem){
        salario+=salario*porcentagem/100;
    }
    
    public String toString(){
        return id + " , "+nome+" , "+salario;
    }
}
    
