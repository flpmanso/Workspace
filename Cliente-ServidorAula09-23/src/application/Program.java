package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Program extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Pessoa Fisica");
			AnchorPane root = new AnchorPane();
			root = FXMLLoader.load(getClass().getResource("/view/vwPessoaFisica.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		launch(args);

	}
}
