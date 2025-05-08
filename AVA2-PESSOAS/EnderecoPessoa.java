
/**
 * Classe EnderecoPessoa
 * – Atributos privados de endereço
 * – Métodos públicos: adicionar, remover, alterar
 * – Dependência: pode pertencer a PF ou PJ (1..*)
 */
class EnderecoPessoa {
    private String logradouroEndereco;
    private String nroEndereco;
    private String complementoEndereco;
    private String bairroEndereco;
    private String cidadeEndereco;
    private TipoUf udEndereco;
    private String cepEndereco;

    /**
     * Construtor completo
     * @param logradouro  tipo de logradouro
     * @param nro          número
     * @param complemento complemento
     * @param bairro      bairro
     * @param cidade      cidade
     * @param uf          unidade da federação
     * @param cep         CEP
     */
    public EnderecoPessoa(String logradouro, String nro, String complemento,
                          String bairro, String cidade, TipoUf uf, String cep) {
        this.logradouroEndereco  = logradouro;
        this.nroEndereco         = nro;
        this.complementoEndereco = complemento;
        this.bairroEndereco      = bairro;
        this.cidadeEndereco      = cidade;
        this.udEndereco          = uf;
        this.cepEndereco         = cep;
    }

    public void adicionarEndereco() { }
    public void removeEndereco()     { }
    public void alterarEndereco()    { }
}
