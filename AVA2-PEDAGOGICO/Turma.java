/**
 * Classe Turma - Representa uma turma de alunos no sistema educacional.
 * @author Prof. Me. Denys Alves da Silva
 * @version 02.4 (22/05/2025)
 */
package pedagogico;

class Turma {
    private String codTurma;         // Código da turma
    private String descricaoTurma;   // Descrição textual da turma

    /**
     * Construtor da classe Turma.
     * @PARAM codTurma Código identificador.
     * @PARAM descricaoTurma Descrição da turma.
     */
    public Turma(String codTurma, String descricaoTurma) {
        this.codTurma = codTurma;
        this.descricaoTurma = descricaoTurma;
    }

    public void manterTurma() { }
}