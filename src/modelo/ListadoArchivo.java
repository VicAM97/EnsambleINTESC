package modelo;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import modelo.Archivo;

@XmlRootElement(name = "persons")
public class ListadoArchivo {

    private List<Archivo> archivos;

    @XmlElement(name = "archivo")
    public List<Archivo> getPersons() {
        return archivos;
    }

    public void setPersons(List<Archivo> archivos) {
        this.archivos = archivos;
    }
}