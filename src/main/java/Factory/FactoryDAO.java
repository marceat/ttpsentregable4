package Factory;

import clasesDAO.UsuarioGeneralDAO;

public class FactoryDAO {
		
	public static CartaSemanalDAO getCartaSemanalDAO() {
		return new CartaSemanalDAOjdbc();
	}
}
