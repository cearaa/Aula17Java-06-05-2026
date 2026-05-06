    package br.com.fiap.bean;

    import java.time.LocalDate;
    import java.time.Period;

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
            setDataDeNascimento(dataDeNascimento);
            setValorHoraDeTrabalho(valorHoraDeTrabalho);
        }

        //Métodos getters/setters
        public String getNome() {return nome;}
        public void setNome(String nome) {this.nome = nome;}
        public LocalDate getDataDeNascimento() {return dataDeNascimento;}
        public void setDataDeNascimento(LocalDate dataDeNascimento) {
            LocalDate dataMinima = LocalDate.of(1900, 1, 1);
            LocalDate hoje = LocalDate.now();
            if (!dataDeNascimento.isBefore(dataMinima) && (!dataDeNascimento.isAfter(hoje))) {
                this.dataDeNascimento = dataDeNascimento;
            } else {
                System.out.println("Data inválida!");
            }
        }
        public float getValorHoraDeTrabalho() {return valorHoraDeTrabalho;}
        public void setValorHoraDeTrabalho(float valorHoraDeTrabalho) {
            if (valorHoraDeTrabalho > 0)
                this.valorHoraDeTrabalho = valorHoraDeTrabalho;}

        //Métodos da classe
        public float calcularSalario(){
            return (valorHoraDeTrabalho * 40) * 4;
        }
        public int calcularIdade(){
            LocalDate hoje = LocalDate.now();
            return Period.between(this.dataDeNascimento, hoje).getYears();
        }
    }
