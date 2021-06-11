package ec.edu.ups.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.modelo.Tarjeta;



@Stateless
public class tarjetaFacade extends AbstractFacade<Tarjeta>{
	
	@PersistenceContext(unitName = "JPA")
    private EntityManager em;
	
	public tarjetaFacade() {
		super(Tarjeta.class);
	}
	
	@Override
    protected EntityManager getEntityManager() {
        return em;
    }
}
