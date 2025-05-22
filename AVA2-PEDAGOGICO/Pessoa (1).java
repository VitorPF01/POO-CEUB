/**
 * Classe abstrata Pessoa - Superclasse base para Aluno e Professor.
 * @author Prof. Me. Denys Alves da Silva
 * @version 02.4 (22/05/2025)
 */
package pedagogico;

abstract class Pessoa {
    private String cpf;               // CPF da pessoa
    private String matricula;        // Matrícula única da pessoa
    private String nomePessoa;       // Nome completo da pessoa

    /**
     * Construtor da classe Pessoa.
     * @PARAM cpf CPF da pessoa.
     * @PARAM matricula Matrícula da pessoa.
     * @PARAM nomePessoa Nome da pessoa.
     */
    public Pessoa(String cpf, String matricula, String nomePessoa) {
        this.cpf = cpf;
        this.matricula = matricula;
        this.nomePessoa = nomePessoa;
    }
}