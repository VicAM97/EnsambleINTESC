package controlador;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class ControladorVistaArchivo implements Initializable {

	@FXML
	private TextField txtFolioArch;
	
	@FXML
	private TextField txtFechaArch;
	
	@FXML
	private TextField txtClienteArch;
	
	@FXML
	private TextField txtCelArch;
	
	@FXML
	private TextField txtCorreoArch;
	
	@FXML
	private TextField txtAgrDescripcionArch;
	
	@FXML
	private TextArea txtDescArch;
	
	@FXML
	private Button btnEnviarArch;
	
	@FXML
	private Button btnAbrirTicketArch;
	
	@FXML
	private Button btnCerrarVentanaArch;
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {		
	}
	
	@FXML
	private void EnviarDescArch(ActionEvent event){
		
		try{
			
		} catch(NumberFormatException e) {
			
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText(null);
			alert.setTitle("Error");
			alert.setContentText("Formato incorrecto");
			alert.showAndWait();
		}

	}
	
	@FXML
	private void AbrTcktArch(ActionEvent event){
		
		try{
			
		} catch(NumberFormatException e) {
			
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText(null);
			alert.setTitle("Error");
			alert.setContentText("Formato incorrecto");
			alert.showAndWait();
		}

	}
	@FXML
	private void CerrVtnaArch(ActionEvent event){
		Stage stage = (Stage) this.btnCerrarVentanaArch.getScene().getWindow();
	     stage.close();
	}
}