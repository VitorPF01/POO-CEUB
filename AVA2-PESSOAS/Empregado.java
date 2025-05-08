import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Subclasse Empregado herda de PessoaFisica
 */
public class Empregado extends PessoaFisica {
    private String matriculaEmpregado;
    private Date dataAdmissao;

    // Agregação: um Empregado tem exatamente 1 CargoEmpregado
    private CargoEmpregado cargo;

    // Associação: um Empregado pode ter 0..1 UsuarioAcesso
    private UsuarioAcesso usuarioAcesso;

    /**
     * Construtor completo público
     * @param id         herdado de Pessoa
     * @param nome       herdado de Pessoa
     * @param cpf        herdado de PessoaFisica
     * @param nascimento herdado de PessoaFisica
     * @param matricula  matrícula do empregado
     * @param admissao   data de admissão
     * @param cargo      cargo agregado ao empregado
     */
    public Empregado(int id, String nome, String cpf, Date nascimento,
                     String matricula, Date admissao,
                     CargoEmpregado cargo) {
        super(id, nome, cpf, nascimento);
        this.matriculaEmpregado = matricula;
        this.dataAdmissao       = admissao;
        this.cargo              = cargo;   // agregação
    }

    /**
     * Define o usuário de acesso (associação 0..1)
     */
    public void setUsuarioAcesso(UsuarioAcesso usuario) {
        this.usuarioAcesso = usuario;
    }

    /**
     * Método público de manutenção de fornecedor
     */
    public void manterFornecedor() { }

    /**
     * Método privado para bloquear fornecedor
     */
    private void bloquearFornecedor() { }
}
