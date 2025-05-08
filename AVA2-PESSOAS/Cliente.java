/**
 * Classe Cliente associada a PessoaFisica OU PessoaJuridica
 */
public class Cliente {
    private int pontuacaoFidelidade;
    private Float vlrCredito;

    // Associação polimórfica: referenciando Pessoa (PF ou PJ)
    private Pessoa pessoa;

    /**
     * Construtor completo público
     * @param pessoa    instância de PessoaFisica ou PessoaJuridica
     * @param fidelidade pontuação de fidelidade
     * @param credito   valor de crédito
     */
    public Cliente(Pessoa pessoa, int fidelidade, Float credito) {
        this.pessoa = pessoa;                 // associação polimórfica
        this.pontuacaoFidelidade = fidelidade;
        this.vlrCredito          = credito;
    }

    public void manterCliente() { }
    private void calcularFidelidade() { }
}
