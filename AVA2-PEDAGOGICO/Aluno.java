/**
 * Classe Aluno - Subclasse de Pessoa.
 * @author Prof. Me. Denys Alves da Silva
 * @version 02.4 (22/05/2025)
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

class Aluno extends Pessoa {
    private String cpfAluno;              // CPF específico do aluno
    private String codTurmaMatriculada;   // Código da turma que o aluno está matriculado

    private List<Turma> turmaAluno = new ArrayList<>(); // composição (1..n)
    private List<AlunoAtividade> atividadeAluno = new ArrayList<>(); // composição (1..n)

    /**
     * Construtor da classe Aluno.
     * @PARAM cpf CPF herdado.
     * @PARAM matricula Matrícula herdada.
     * @PARAM nomePessoa Nome herdado.
     * @PARAM cpfAluno CPF do aluno.
     * @PARAM codTurmaMatriculada Código da turma.
     */
    public Aluno(String cpf, String matricula, String nomePessoa, String cpfAluno, String codTurmaMatriculada) {
        super(cpf, matricula, nomePessoa);
        this.cpfAluno = cpfAluno;
        this.codTurmaMatriculada = codTurmaMatriculada;
    }

    public void manterAluno() {
        // O código funcional seria aqui, porém nesta disciplina estamos estudando a estrutura da codificação POO.
    }
}