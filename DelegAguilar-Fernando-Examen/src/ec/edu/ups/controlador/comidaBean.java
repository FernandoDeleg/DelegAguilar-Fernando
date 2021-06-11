package ec.edu.ups.controlador;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;


import ec.edu.ups.ejb.comidaFacade;

import ec.edu.ups.modelo.comida;


@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class comidaBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@EJB
    private comidaFacade comidaFacade;
	
	private int codigo;
	private String nombre;
	private Double precioUnitario;
	public comidaBean() {
		
	}
	public comidaFacade getcomidaFacade() {
		return comidaFacade;
	}
	public void setcomidaFacade(comidaFacade comidaFacade) {
		this.comidaFacade = comidaFacade;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(Double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	
public void guardarDatos() {
        
          
        
        comida comida = new comida();
        
        comida.setNombre(this.nombre);
        comida.setPrecioUnitario(this.precioUnitario);
        comidaFacade.create(comida);
        
        
    }
}
