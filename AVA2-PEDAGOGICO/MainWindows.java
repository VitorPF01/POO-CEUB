/**
 * Classe principal MainWindows - Simula o uso das classes do projeto com interação básica via console.
 * Pode ser executado em ambiente Windows com interface interativa no console.
 * 
 * @author Prof. Me. Denys Alves da Silva
 * @version 02.4 (22/05/2025)
 */

package pedagogico;

import java.util.Scanner;
import java.time.LocalDate;

public class MainWindows {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEMA DE CADASTRO DE POO ===");

        // Coletar dados do aluno
        System.out.print("Digite o CPF do aluno: ");
        String cpfAluno = scanner.nextLine();

        System.out.print("Digite a matrícula do aluno: ");
        String matriculaAluno = scanner.nextLine();

        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();

        System.out.print("Digite o código da turma do aluno: ");
        String codTurma = scanner.nextLine();

        // Criar objeto Aluno
        Aluno aluno = new Aluno(cpfAluno, matriculaAluno, nomeAluno, cpfAluno, codTurma);
        System.out.println("Aluno cadastrado com sucesso!");

        // Coletar dados do professor
        System.out.print("\nDigite o CPF do professor: ");
        String cpfProfessor = scanner.nextLine();

        System.out.print("Digite a matrícula do professor: ");
        String matriculaProfessor = scanner.nextLine();

        System.out.print("Digite o nome do professor: ");
        String nomeProfessor = scanner.nextLine();

        System.out.print("Digite a chave de acesso do professor: ");
        String chaveAcesso = scanner.nextLine();

        // Criar objeto Professor
        Professor professor = new Professor(cpfProfessor, matriculaProfessor, nomeProfessor, cpfProfessor, chaveAcesso);
        System.out.println("Professor cadastrado com sucesso!");

        // Criar uma atividade padrão
        Atividade atividade = new Atividade(
            "ATV001",
            cpfProfessor,
            LocalDate.now(),
            "Explique o que é encapsulamento em POO.",
            "Resposta correta esperada.",
            10.0,
            LocalDate.now().plusDays(5)
        );
        System.out.println("Atividade criada com sucesso!");

        scanner.close();
    }
}