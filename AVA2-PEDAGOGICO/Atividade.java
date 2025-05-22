/**
 * Classe Atividade - Representa uma atividade criada por um professor.
 * @author Prof. Me. Denys Alves da Silva
 * @version 02.4 (22/05/2025)
 */
package pedagogico;

import java.time.LocalDate;

class Atividade {
    private String codAtividade;         // Código da atividade
    private String cpfProfessor;         // CPF do professor que criou
    private LocalDate dataElaboracao;    // Data de elaboração
    private String textoAtividade;       // Enunciado da atividade
    private String respostaAtividade;    // Gabarito
    private float valorAtividade;       // Valor da atividade
    private LocalDate dataEntrega;       // Data de entrega

    /**
     * Construtor da classe Atividade.
     * @PARAM codAtividade Código da atividade.
     * @PARAM cpfProfessor CPF do professor.
     * @PARAM dataElaboracao Data de criação.
     * @PARAM textoAtividade Enunciado.
     * @PARAM respostaAtividade Gabarito.
     * @PARAM valorAtividade Valor total.
     * @PARAM dataEntrega Data de entrega.
     */
    public Atividade(String codAtividade, String cpfProfessor, LocalDate dataElaboracao, String textoAtividade, String respostaAtividade, double valorAtividade, LocalDate dataEntrega) {
        this.codAtividade = codAtividade;
        this.cpfProfessor = cpfProfessor;
        this.dataElaboracao = dataElaboracao;
        this.textoAtividade = textoAtividade;
        this.respostaAtividade = respostaAtividade;
        this.valorAtividade = valorAtividade;
        this.dataEntrega = dataEntrega;
    }

    public void manterAtividade() { }
    public void enviarTurma() { }
    public void enviarAluno() { }
}