package ejb.business.Face;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ejb.business.UsuarioBusiness;


@Stateless
public class  UsuarioBusinessFaces implements UsuarioBusiness {
	@PersistenceContext(unitName = "taddumPU")
	 private EntityManager em;
	
	
	public void ConsultaUser(long userId) {}
	/**
	 * Consulta de tabela Usuario_Id 
	 */

	
	
}
