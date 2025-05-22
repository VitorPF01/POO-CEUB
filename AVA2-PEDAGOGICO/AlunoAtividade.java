/**
 * Classe AlunoAtividade - Representa a relação entre um aluno e uma atividade feita.
 * @author Prof. Me. Denys Alves da Silva
 * @version 02.4 (22/05/2025)
 */
package pedagogico;

import java.time.LocalDate;

class AlunoAtividade {
    private String matriculaAluno;     // Matrícula do aluno
    private String codAtividade;       // Código da atividade
    private LocalDate dataResposta;    // Data da resposta
    private float notaAtividade;       // Nota obtida

    private Atividade atividade;       // Atividade associada à atividade do aluno (1..1)

    /**
     * Construtor da classe AlunoAtividade.
     * @PARAM matriculaAluno Matrícula do aluno.
     * @PARAM codAtividade Código da atividade.
     * @PARAM dataResposta Data da resposta.
     * @PARAM notaAtividade Nota atribuída.
     */
    public AlunoAtividade(String matriculaAluno, String codAtividade, LocalDate dataResposta, double notaAtividade) {
        this.matriculaAluno = matriculaAluno;
        this.codAtividade = codAtividade;
        this.dataResposta = dataResposta;
        this.notaAtividade = notaAtividade;
    }

    public void corrigirLancarNota() { }
    public void informarNota() { }
}