// Classe Pessoa
public class Pessoa {
    // Atributos da Classe Pessoa
    private String nomePessoa;
    private double pesoPessoa;
    private double alturaPessoa;
    private double imcPessoa;

    // Construtor da Classe Pessoa
    public Pessoa(String nomePessoa, double pesoPessoa, double alturaPessoa) {
        this.nomePessoa = nomePessoa;
        this.pesoPessoa = pesoPessoa;
        this.alturaPessoa = alturaPessoa;
        this.imcPessoa = calcularImcPessoa(pesoPessoa, alturaPessoa); // Calcula o IMC ao criar a pessoa
    }

    // Método para cálculo do IMC da Classe Pessoa
    private static double calcularImcPessoa(double peso, double altura) {
        // Fórmula do IMC = Peso ÷ (Altura × Altura)
        return peso / (Math.pow(altura, 2));
    }

    // Método para mostrar a Pessoa e resultado do cálculo do IMC
    public void mostrarImcPessoa() {
        // Exibindo o nome, peso, altura e IMC com formatação
        System.out.println("Nome: " + this.nomePessoa);
        System.out.println("Peso: " + this.pesoPessoa + " kg");
        System.out.println("Altura: " + this.alturaPessoa + " m");
        System.out.printf("IMC: %.2f\n", this.imcPessoa);  // Exibindo o IMC com 2 casas decimais

        // Classificando o IMC
        if (this.imcPessoa < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (this.imcPessoa >= 18.5 && this.imcPessoa < 24.9) {
            System.out.println("Classificação: Peso normal");
        } else if (this.imcPessoa >= 25 && this.imcPessoa < 29.9) {
            System.out.println("Classificação: Acima do peso");
        } else {
            System.out.println("Classificação: Obesidade");
        }
    }
}
