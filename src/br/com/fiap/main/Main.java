package br.com.fiap.main;

import br.com.fiap.bean.Funcionario;
import br.com.fiap.bean.Garcom;
import br.com.fiap.bean.Gerente;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        String auxiliar, nome, exibe, escolha = "sim";
        float valorHoraDeTrabalho, salario;
        LocalDate dataDeNascimento;

        while (escolha.equalsIgnoreCase("sim")){
            try {
                nome = JOptionPane.showInputDialog("Dígite seu nome: ");
                auxiliar = JOptionPane.showInputDialog("Digite sua data de Nascimento ( yyyy/MM/dd ): ");
                dataDeNascimento = LocalDate.parse(auxiliar);
                auxiliar = JOptionPane.showInputDialog("Dígite valor hora de trabalho: ");
                valorHoraDeTrabalho = Float.parseFloat(auxiliar);
                auxiliar = JOptionPane.showInputDialog("Qual é o tipo de Funcionário? \n1.Funcionário normal \n2.Garçom \n3.Gerente");
                int opcao = Integer.parseInt(auxiliar);
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                switch (opcao){
                    case 1:
                        Funcionario normal = new Funcionario(nome, dataDeNascimento, valorHoraDeTrabalho);
                        salario = normal.calcularSalario();
                        exibe = String.format("Nome: %s \nData de Nascimento: %s \nSalário: %.2f", normal.getNome(), normal.getDataDeNascimento().format(formato), salario);
                        break;
                    case 2:
                        auxiliar = JOptionPane.showInputDialog("Dígite o valor da gorjeta: ");
                        float gorjeta = Float.parseFloat(auxiliar);
                        Garcom garcom = new Garcom(nome, dataDeNascimento, valorHoraDeTrabalho, gorjeta);
                        salario = garcom.calcularSalario();
                        exibe = String.format("Nome: %s \nData de Nascimento: %s \nGorjeta: %.2f \nSalário: %.2f", garcom.getNome(), garcom.getDataDeNascimento().format(formato), gorjeta,  salario);
                        break;
                    case 3:
                        auxiliar = JOptionPane.showInputDialog("Dígite o valor do bonus: ");
                        float bonus = Float.parseFloat(auxiliar);
                        Gerente gerente = new Gerente(nome, dataDeNascimento, valorHoraDeTrabalho, bonus);
                        salario = gerente.calcularSalario();
                        exibe = String.format("Nome: %s \nData de Nascimento: %s \nBônus: %.2f \nSalário: %.2f", gerente.getNome(), gerente.getDataDeNascimento().format(formato), bonus,  salario);
                        break;
                    default:
                        exibe =  "Escolha inválida! :(";
                }
                JOptionPane.showMessageDialog(null, exibe);
                escolha = JOptionPane.showInputDialog("Deseja continuar?");
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Programa encerrado, volte sempre!!");
    }

}
