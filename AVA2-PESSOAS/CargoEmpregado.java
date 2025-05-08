/**
 * Classe CargoEmpregado (agregação com Empregado)
 */
class CargoEmpregado {
    private int cdgCargo;
    private float vlrCargo;

    /**
     * Construtor completo
     * @param cdg   código do cargo
     * @param valor valor do cargo
     */
    public CargoEmpregado(int cdg, float valor) {
        this.cdgCargo = cdg;
        this.vlrCargo = valor;
    }

    /**
     * Método privado de manutenção de cargo
     */
    private void manterCargo() { }
}
