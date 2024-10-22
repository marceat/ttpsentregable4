package Factory;

import clasesDAO.UsuarioDAO;

public class FactoryDAO {
		
	public static CartaSemanalDAO getCartaSemanalDAO() {
		return new CartaSemanalDAOjdbc();
	}
}
