/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionariosemana3;

/**
 *
 * @author celso
 */
public class Aluno {
    private String nome;
    private int matricula;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    @Override
    public String toString() {
        // String msg = this.nome + "\n" + this.matricula;
        String msg = "Aluno matriculado: " + this.nome + "\nMatricula: " + this.matricula + "\nBem vindo!!"; // Questao 2
        return msg;
    }
}
