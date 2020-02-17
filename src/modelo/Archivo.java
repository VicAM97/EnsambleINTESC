package modelo;

import java.time.LocalDate;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Archivo {
    private final StringProperty folio;
    private final ObjectProperty<LocalDate> fecha;
    private final StringProperty cliente;
    private final IntegerProperty telefono;
    private final StringProperty correo;
    private final StringProperty descripcion;
    
    
	public Archivo(StringProperty folio, ObjectProperty<LocalDate> fecha, StringProperty cliente,
			IntegerProperty telefono, StringProperty correo, StringProperty descripcion) {
		this.folio = folio;
		this.fecha = fecha;
		this.cliente = cliente;
		this.telefono = telefono;
		this.correo = correo;
		this.descripcion = descripcion;
		}
	
	public Archivo(StringProperty folio, ObjectProperty<LocalDate> fecha, StringProperty cliente,
			IntegerProperty telefono, StringProperty correo) {
		this.folio = folio;
		this.fecha = fecha;
		this.cliente = cliente;
		this.telefono = telefono;
		this.correo = correo;
		this.descripcion = null;
		}
	
	public String getFolio() {
        return folio.get();
    }

    public void setFolio(String folio) {
        this.folio.set(folio);
    }
    
    public StringProperty folioProperty() {
        return folio;
    }
    
    public LocalDate getfecha() {
        return fecha.get();
    }

    public void setFecha(LocalDate fecha) {
        this.fecha.set(fecha);
    }
    
    public ObjectProperty<LocalDate> fechaProperty() {
        return fecha;
    }
    
    public String getCliente() {
        return folio.get();
    }

    public void setCliente(String cliente) {
        this.cliente.set(cliente);
    }
    
    public StringProperty clienteProperty() {
        return cliente;
    }
	
    public int getTelefono() {
        return telefono.get();
    }

    public void setTelefono(int telefono) {
        this.telefono.set(telefono);
    }

    public IntegerProperty telefonoProperty() {
        return telefono;
    }
    
    public String getCorreo() {
        return correo.get();
    }

    public void setCorreo(String correo) {
        this.correo.set(correo);
    }

    public StringProperty correoProperty() {
        return correo;
    }
    


    public String getDescripcion() {
           return descripcion.get();
       }

       public void setDescripcion(String descripcion) {
           this.descripcion.set(descripcion);
       }

       public StringProperty descripcionProperty() {
           return descripcion;
       }
       
    
}