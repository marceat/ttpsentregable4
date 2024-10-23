package Factory;

import clasesDAO.CartaSemanalDAO;
import clasesDAO.ComidaDAO;
import clasesDAO.MenuDAO;
import clasesDAOImpJpa.CartaSemanalDAOJpa;
import clasesDAOImpJpa.ComidaDAOjpa;
import clasesDAOImpJpa.MenuDAOjpa;

public class FactoryDAO {
		
	public static CartaSemanalDAO getCartaSemanalDAO() {
		return new CartaSemanalDAOJpa();
	}
	
	public static ComidaDAO getComidaDAO() {
		return new ComidaDAOjpa();
	}
	
	public static MenuDAO getMenuDAO() {
		return new MenuDAOjpa();
	}
}
