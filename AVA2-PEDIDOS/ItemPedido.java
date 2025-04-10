public class ItemPedido {
    String codigoProduto;
    String descricaoProduto;
    int quantidade;
    double precoUnitario;

    public double calcularSubtotal() {
        return quantidade * precoUnitario;
    }
}
