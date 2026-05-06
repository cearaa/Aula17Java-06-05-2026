package br.com.fiap.bean;

import java.time.LocalDate;

public class Funcionario {
    //Atributos
    private String nome;
    private LocalDate dataDeNascimento;
    private float valorHoraDeTrabalho;

    //Construtor vazio
    public Funcionario(){}

    //Construtor com parametro
    public Funcionario(String nome, LocalDate dataDeNascimento, float valorHoraDeTrabalho) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.valorHoraDeTrabalho = valorHoraDeTrabalho;
    }

    //Métodos getters/setters

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public LocalDate getDataDeNascimento() {return dataDeNascimento;}
    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        }
    public float getValorHoraDeTrabalho() {return valorHoraDeTrabalho;}
    public void setValorHoraDeTrabalho(float valorHoraDeTrabalho) {this.valorHoraDeTrabalho = valorHoraDeTrabalho;}

    //Métodos da classe
    public float calcularSalario(){
        return (valorHoraDeTrabalho * 40) * 4;
    }
    public int calcularidade(){
        return;
    }
}
