/**
 * Classe Professor - Subclasse de Pessoa.
 * @author Prof. Me. Denys Alves da Silva
 * @version 02.4 (22/05/2025)
 */
package pedagogico;

import java.util.ArrayList;
import java.util.List;

class Professor extends Pessoa {
    private String cpfProfessor;              // CPF específico do professor
    private String chaveAcessoProfessor;      // Chave de acesso do professor

    private List<Atividade> atividadeProfessor = new ArrayList<>(); // composição (1..n)

    /**
     * Construtor da classe Professor.
     * @PARAM cpf CPF herdado.
     * @PARAM matricula Matrícula herdada.
     * @PARAM nomePessoa Nome herdado.
     * @PARAM cpfProfessor CPF do professor.
     * @PARAM chaveAcessoProfessor Chave de acesso.
     */
    public Professor(String cpf, String matricula, String nomePessoa, String cpfProfessor, String chaveAcessoProfessor) {
        super(cpf, matricula, nomePessoa);
        this.cpfProfessor = cpfProfessor;
        this.chaveAcessoProfessor = chaveAcessoProfessor;
    }
}