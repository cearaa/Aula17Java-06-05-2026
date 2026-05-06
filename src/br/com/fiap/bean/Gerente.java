package br.com.fiap.bean;

import java.time.LocalDate;

public class Gerente extends Funcionario{
    //Atributos
    private float bonus;

    //Construtor vazio
    public Gerente(){}

    //Construtor com parametro
    public Gerente(String nome, LocalDate dataDeNascimento, float valorHoraDeTrabalho, float bonus) {
        super(nome, dataDeNascimento, valorHoraDeTrabalho);
        this.bonus = bonus;
    }
    //Métodos getters/setters

    public float getBonus() {
        return bonus;
    }
    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    //Métodos da classe
    @Override
    public float calcularSalario() {
        return super.calcularSalario() * (1 + bonus / 100);
    }
}
