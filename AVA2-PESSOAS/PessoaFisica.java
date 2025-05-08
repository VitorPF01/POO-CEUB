import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Subclasse PessoaFisica herda de Pessoa
 */
public class PessoaFisica extends Pessoa {
    private String cpfPessoaFisica;
    private Date dataNascimento;

    // Agregação ou Dependência: uma PF pode ter 0..* telefones
    private List<TelefonePessoa> telefones = new ArrayList<>();
    // Agregação ou Dependência: uma PF pode ter 0..* endereços
    private List<EnderecoPessoa> enderecos = new ArrayList<>();

    /**
     * Construtor completo público
     * @param id       herdado de Pessoa
     * @param nome     herdado de Pessoa
     * @param cpf      CPF da pessoa física
     * @param nascimento data de nascimento
     */
    public PessoaFisica(int id, String nome, String cpf, Date nascimento) {
        super(id, nome);                 // chama construtor da superclasse Pessoa
        this.cpfPessoaFisica = cpf;
        this.dataNascimento  = nascimento;
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
     * Método de manutenção de pessoa física
     */
    public void manterPessoaFisica() { }
}
