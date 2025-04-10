public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nome = "Maria";
        cliente.cpf = "12345678900";
        cliente.endereco = "Rua A, 123";
        cliente.telefone = "99999-0000";

        Vendedor vendedor = new Vendedor();
        vendedor.nome = "João";
        vendedor.matricula = "001";

        Pedido pedido = new Pedido("PED123", vendedor, cliente);

        ItemPedido item1 = new ItemPedido();
        item1.codigoProduto = "P001";
        item1.descricaoProduto = "Teclado";
        item1.quantidade = 2;
        item1.precoUnitario = 150.00;

        pedido.adicionarItem(item1);
        pedido.aplicarDesconto(10); // 10% de desconto

        System.out.println("Valor total: " + pedido.valorTotal);
        System.out.println("Status: " + pedido.status);
    }
}
