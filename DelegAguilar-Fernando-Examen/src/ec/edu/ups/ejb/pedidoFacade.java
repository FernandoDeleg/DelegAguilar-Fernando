package ec.edu.ups.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.modelo.pedido;


@Stateless
public class pedidoFacade extends AbstractFacade<pedido>{

	@PersistenceContext(unitName = "JPA")
    private EntityManager em;
	
	public pedidoFacade() {
        super(pedido.class);
    }
	
	@Override
    protected EntityManager getEntityManager() {
        return em;
    }
	
}
