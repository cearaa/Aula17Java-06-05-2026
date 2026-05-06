package br.com.fiap.main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String auxiliar, nome, exibe, escolha = "sim";
        float valorHora, salario;

        while (escolha.equalsIgnoreCase("sim")){
            try {
                nome = JOptionPane.showInputDialog("Dígite seu nome: ");
                auxiliar = JOptionPane.showInputDialog("Dígite valor hora de trabalho: ");
                valorHora = Float.parseFloat(auxiliar);
                auxiliar = JOptionPane.showInputDialog("Qual é o tipo de Funcionário? \n1.Funcionário normal \n2.Garçom \n3.Gerente");
                int opcao = Integer.parseInt(auxiliar);
                switch (opcao){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
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
