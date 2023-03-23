package lista1;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private LocalDate nascimento;

    public Pessoa() {
        this.nome = "";
        this.nascimento = LocalDate.now();
    }

    public Pessoa(String nome, int dia, int mes, int ano) {
        this.nome = nome;
        this.nascimento = LocalDate.of(ano,mes,dia);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }
    
    public String getNome() {
        return nome;
    }

    public String toString(){
        return "nome: " + nome + "nascimento: " + nascimento;
    }
}



