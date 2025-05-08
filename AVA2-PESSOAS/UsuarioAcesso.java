/**
 * Classe UsuarioAcesso (associação com Empregado)
 */
class UsuarioAcesso {
    private int contaUsuario;
    private String senhaAcesso;
    private boolean contaAtiva;

    /**
     * Construtor completo
     * @param conta   número da conta
     * @param senha   senha de acesso
     * @param ativa   flag de conta ativa
     */
    public UsuarioAcesso(int conta, String senha, boolean ativa) {
        this.contaUsuario = conta;
        this.senhaAcesso  = senha;
        this.contaAtiva   = ativa;
    }

    private void manterUsuario()    { }
    private void desativarUsuario() { }
}
