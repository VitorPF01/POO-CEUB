/**
 * Classe principal MainJavaFX - Interface gráfica básica utilizando JavaFX.
 * Permite cadastrar um Aluno e um Professor via interface gráfica em ambiente Windows.
 *
 * Para compilar e executar, é necessário ter o JavaFX configurado no ambiente.
 *
 * @author Prof. Me. Denys Alves da Silva
 * @version 02.4 (22/05/2025)
 */

package pedagogico;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainJavaFX extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Sistema de Cadastro POO");

        // Campos de entrada para Aluno
        TextField txtCpfAluno = new TextField();
        txtCpfAluno.setPromptText("CPF do Aluno");

        TextField txtMatriculaAluno = new TextField();
        txtMatriculaAluno.setPromptText("Matrícula do Aluno");

        TextField txtNomeAluno = new TextField();
        txtNomeAluno.setPromptText("Nome do Aluno");

        TextField txtCodTurma = new TextField();
        txtCodTurma.setPromptText("Código da Turma");

        Button btnCadastrarAluno = new Button("Cadastrar Aluno");
        Label lblAlunoStatus = new Label();

        btnCadastrarAluno.setOnAction(e -> {
            Aluno aluno = new Aluno(
                txtCpfAluno.getText(),
                txtMatriculaAluno.getText(),
                txtNomeAluno.getText(),
                txtCpfAluno.getText(),
                txtCodTurma.getText()
            );
            lblAlunoStatus.setText("Aluno cadastrado com sucesso!");
        });

        // Campos de entrada para Professor
        TextField txtCpfProf = new TextField();
        txtCpfProf.setPromptText("CPF do Professor");

        TextField txtMatriculaProf = new TextField();
        txtMatriculaProf.setPromptText("Matrícula do Professor");

        TextField txtNomeProf = new TextField();
        txtNomeProf.setPromptText("Nome do Professor");

        PasswordField txtChaveProf = new PasswordField();
        txtChaveProf.setPromptText("Chave de Acesso");

        Button btnCadastrarProf = new Button("Cadastrar Professor");
        Label lblProfStatus = new Label();

        btnCadastrarProf.setOnAction(e -> {
            Professor prof = new Professor(
                txtCpfProf.getText(),
                txtMatriculaProf.getText(),
                txtNomeProf.getText(),
                txtCpfProf.getText(),
                txtChaveProf.getText()
            );
            lblProfStatus.setText("Professor cadastrado com sucesso!");
        });

        // Layout da interface
        VBox layout = new VBox(10);
        layout.setStyle("-fx-padding: 20;");
        layout.getChildren().addAll(
            new Label("Cadastro de Aluno:"),
            txtCpfAluno, txtMatriculaAluno, txtNomeAluno, txtCodTurma, btnCadastrarAluno, lblAlunoStatus,
            new Label("Cadastro de Professor:"),
            txtCpfProf, txtMatriculaProf, txtNomeProf, txtChaveProf, btnCadastrarProf, lblProfStatus
        );

        Scene scene = new Scene(layout, 400, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}