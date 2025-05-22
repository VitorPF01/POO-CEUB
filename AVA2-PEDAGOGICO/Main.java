/**
 * Classe principal Main - Responsável por instanciar e testar as classes do projeto.
 * Este código pode ser compilado e executado diretamente pelo prompt de comando (DOS).
 * Para compilar: javac -d . Main.java
 * Para executar: java pedagogico.Main
 * 
 * @author Prof. Me. Denys Alves da Silva
 * @version 02.4 (22/05/2025)
 */

package pedagogico;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando um objeto do tipo Aluno
        Aluno aluno = new Aluno("12345678900", "MAT001", "João da Silva", "12345678900", "TURMA01");

        // Criando um objeto do tipo Professor
        Professor professor = new Professor("98765432100", "MAT002", "Maria Oliveira", "98765432100", "senha123");

        // Criando uma Atividade
        Atividade atividade = new Atividade(
            "ATV001",
            "98765432100",
            LocalDate.now(),
            "Descreva os conceitos de POO.",
            "Resposta correta",
            10.0,
            LocalDate.now().plusDays(7)
        );

        // Criando uma instância de AlunoAtividade
        AlunoAtividade alunoAtividade = new AlunoAtividade(
            "MAT001",
            "ATV001",
            LocalDate.now(),
            9.5
        );

        // Criando uma Turma
        Turma turma = new Turma("TURMA01", "Turma de POO - 2025");

        // Criando um Acesso
        Acesso acesso = new Acesso("MAT001", "acesso123");

        // Mensagem de execução bem-sucedida
        System.out.println("Objetos criados com sucesso para teste de estrutura POO!");
    }
}