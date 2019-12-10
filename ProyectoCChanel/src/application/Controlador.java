package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controlador {

	public AnchorPane page;
	public Scene scene;

	@FXML
	private void handleClose() {

		System.exit(0);
	}

	@FXML
	private void newPane() throws IOException {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("View2.fxml"));
		AnchorPane page = (AnchorPane) loader.load();
		Stage sendStage = new Stage();
		Scene scene1 = new Scene(page);
		sendStage.setScene(scene1);
		sendStage.show();
		try {
			page = (AnchorPane) loader.load();
		} catch (IOException e) {
			System.out.println("HOLA");
		}

	}

}
