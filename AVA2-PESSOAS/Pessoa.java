/**
 * Superclasse abstrata Pessoa
 */
public abstract class Pessoa {
    protected int idPessoa;
    protected String nomePessoa;

    /**
     * Construtor completo protegido
     * @param id     identificador da pessoa
     * @param nome   nome da pessoa
     */
    protected Pessoa(int id, String nome) {
        this.idPessoa   = id;
        this.nomePessoa = nome;
    }
}
