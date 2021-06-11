package ec.edu.ups.controlador;

import java.io.Serializable;

import javax.ejb.EJB;

import ec.edu.ups.ejb.pedidoFacade;

public class pedidoBean implements Serializable{

	private static final long serialVersionUID = 1L;

	@EJB
	private pedidoFacade ejbCategoryFacade;
}
