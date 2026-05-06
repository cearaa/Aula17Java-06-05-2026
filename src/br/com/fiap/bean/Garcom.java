package br.com.fiap.bean;

import java.time.LocalDate;

public class Garcom extends Funcionario{
    //Atributo
    private float gorjeta;

    //Construtor vazio
    public Garcom(){}

    //Construtor com parametro

    public Garcom(String nome, LocalDate dataDeNascimento, float valorHoraDeTrabalho, float gorjeta) {
        super(nome, dataDeNascimento, valorHoraDeTrabalho);
        this.gorjeta = gorjeta;
    }

    //Métodos getters/setters
    public float getGorjeta() {
        return gorjeta;
    }
    public void setGorjeta(float gorjeta) {
        this.gorjeta = gorjeta;
    }

    //Métodos da classe
    @Override
    public float calcularSalario() {
        return super.calcularSalario() + gorjeta;
    }
}
