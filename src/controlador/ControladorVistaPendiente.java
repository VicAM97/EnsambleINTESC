package controlador;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class ControladorVistaPendiente implements Initializable {

	@FXML
	private TextField txtFolioPend;
	
	@FXML
	private TextField txtFechaPend;
	
	@FXML
	private TextField txtClientePend;
	
	@FXML
	private TextField txtCelPend;
	
	@FXML
	private TextField txtCorreoPend;
	
	@FXML
	private TextField txtAgrDescripcionPend;
	
	@FXML
	private TextArea txtDescPend;
	
	@FXML
	private Button btnEnviarPend;
	
	@FXML
	private Button btnCerrarTicketPend;
	
	@FXML
	private Button btnCerrarVentanaPend;

	@Override
	public void initialize(URL location, ResourceBundle resources) {		
	}
	
	@FXML
	private void EnviarDescPend(ActionEvent event){
		
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
	private void CerrTcktPend(ActionEvent event){
		
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
	private void CerrVtnaPend(ActionEvent event){
		
		try{
			
		} catch(NumberFormatException e) {
			
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText(null);
			alert.setTitle("Error");
			alert.setContentText("Formato incorrecto");
			alert.showAndWait();
		}

	}
}