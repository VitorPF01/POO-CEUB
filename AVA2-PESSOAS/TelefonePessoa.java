/**
 * Classe TelefonePessoa
 * – Atributos privados
 * – Métodos públicos: adicionar, remover, alterar
 * – Dependência: pode pertencer a PF ou PJ (1..*)
 */
class TelefonePessoa {
    private String numeroTelefone;
    private TipoFone tipoTelefone;

    /**
     * Construtor completo
     * @param numero  número de telefone
     * @param tipo    tipo (Residencial, Comercial, Móvel)
     */
    public TelefonePessoa(String numero, TipoFone tipo) {
        this.numeroTelefone = numero;
        this.tipoTelefone   = tipo;
    }

    public void adicionarTelefone() { }
    public void removerTelefone()   { }
    public void alterarTelefone()   { }
}
