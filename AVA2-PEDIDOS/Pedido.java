import java.time.LocalDateTime;
import java.util.ArrayList;

public class Pedido {
    String id;
    LocalDateTime dataHora;
    Vendedor vendedor;
    Cliente cliente;
    ArrayList<ItemPedido> itens = new ArrayList<>();
    StatusPedido status;
    double valorTotal;

    public Pedido(String id, Vendedor vendedor, Cliente cliente) {
        this.id = id;
        this.dataHora = LocalDateTime.now();
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.status = StatusPedido.PROCESSANDO;
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
        calcularValorTotal();
    }

    public void removerItem(ItemPedido item) {
        itens.remove(item);
        calcularValorTotal();
    }

    public void calcularValorTotal() {
        valorTotal = 0;
        for (ItemPedido item : itens) {
            valorTotal += item.calcularSubtotal();
        }
    }

    public void aplicarDesconto(double percentual) {
        valorTotal = valorTotal - (valorTotal * (percentual / 100));
    }

    public void atualizarStatus(StatusPedido novoStatus) {
        status = novoStatus;
    }
}
