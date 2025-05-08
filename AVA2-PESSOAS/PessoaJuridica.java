import java.util.ArrayList;
import java.util.List;

/**
 * Subclasse PessoaJuridica herda de Pessoa
 */
public class PessoaJuridica extends Pessoa {
    private String cnpjPessoaJuridica;
    private String inscricaoEsdual;
    private String nomeFantasia;

    // Dependência: uma PJ pode ter 0..* telefones
    private List<TelefonePessoa> telefones = new ArrayList<>();
    // Dependência: uma PJ pode ter 0..* endereços
    private List<EnderecoPessoa> enderecos = new ArrayList<>();

    /**
     * Construtor completo público
     * @param id         herdado de Pessoa
     * @param nome       herdado de Pessoa
     * @param cnpj       CNPJ da empresa
     * @param inscricao  inscrição estadual
     * @param fantasia   nome fantasia
     */
    public PessoaJuridica(int id, String nome,
                          String cnpj, String inscricao, String fantasia) {
        super(id, nome);                 // chama construtor da superclasse Pessoa
        this.cnpjPessoaJuridica = cnpj;
        this.inscricaoEsdual    = inscricao;
        this.nomeFantasia       = fantasia;
    }

    /**
     * Adiciona um telefone à lista (dependência)
     */
    public void adicionarTelefone(TelefonePessoa fone) { }

    /**
     * Adiciona um endereço à lista (dependência)
     */
    public void adicionarEndereco(EnderecoPessoa endereco) { }

    /**
     * Método de manutenção de pessoa jurídica
     */
    public void manterPessoaJuridica() { }
}
