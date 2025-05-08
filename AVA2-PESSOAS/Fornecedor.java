/**
 * Subclasse Fornecedor herda de PessoaJuridica
 */
public class Fornecedor extends PessoaJuridica {
    private String tipoProduto;
    private boolean restricao;

    /**
     * Construtor completo público
     * @param id       herdado de Pessoa
     * @param nome     herdado de Pessoa
     * @param cnpj     herdado de PessoaJuridica
     * @param inscricao herdado de PessoaJuridica
     * @param fantasia herdado de PessoaJuridica
     * @param tipoProd tipo de produto fornecido
     * @param restr    indica se há restrição
     */
    public Fornecedor(int id, String nome,
                      String cnpj, String inscricao, String fantasia,
                      String tipoProduto, boolean restricao) {
        super(id, nome, cnpj, inscricao, fantasia);
        this.tipoProduto = tipoProduto;
        this.restricao   = restricao;
    }

    /**
     * Método privado de manutenção de empregado
     */
    private void manterEmpregado() { }
}
