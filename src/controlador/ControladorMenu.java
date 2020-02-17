package controlador;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import modelo.Archivo;

import java.util.Date;
import java.util.ResourceBundle;
import java.util.logging.Level;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import com.sun.istack.internal.logging.Logger;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ControladorMenu implements Initializable {

	@FXML
	private Tab tabPendientes;
	@FXML
	private Tab tabArchivados;
    @FXML
    private TableView<Archivo> tablaPendientes;
    @FXML
    private TableColumn<Archivo, String> colFolioP;
    @FXML
    private TableColumn<Archivo, Date> colFechaP;
    @FXML
    private TableColumn<Archivo, String> colClienteP;
    @FXML
    private TableColumn<Archivo, Integer> colTelefonoP;
    @FXML
    private TableColumn<Archivo, String> colCorreoP;
    
    @FXML
    private TableView<Archivo> tablaArchivados;
    @FXML
    private TableColumn<Archivo, String> colFolioA;
    @FXML
    private TableColumn<Archivo, Date> colFechaA;
    @FXML
    private TableColumn<Archivo, String> colClienteA;
    @FXML
    private TableColumn<Archivo, Integer> colTelefonoA;
    @FXML
    private TableColumn<Archivo, String> colCorreoA;
    
   
	

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        

    }    


    @FXML
    private void mostrarPendientes() {
    	
    	try{
    		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    		DocumentBuilder builder =  factory.newDocumentBuilder();
    		
    		Document documento = builder.parse(new File("/utileria/pendientes.xml"));
    		
    		
    		
    	}catch (ParserConfigurationException | SAXException | IOException ex) {
    		Logger.getLogger(ControladorMenu.class.getName(), null).log(Level.SEVERE, null, ex);
    	}
        
    }
    
    @FXML
    private void mostrarArchivados() {
    	try{
    		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    		DocumentBuilder builder =  factory.newDocumentBuilder();
    		
    		Document documento = builder.parse(new File("/utileria/archivados.xml"));
    		
    		
    		
    	}catch (ParserConfigurationException | SAXException | IOException ex) {
    		Logger.getLogger(ControladorMenu.class.getName(), null).log(Level.SEVERE, null, ex);
    	}
        
    }
    
}
