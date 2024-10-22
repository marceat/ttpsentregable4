package Factory;

import clasesDAO.CartaSemanalDAO;
import clasesDAO.ComidaDAO;
import clasesDAO.MenuDAO;
import clasesDAOImpJdbc.CartaSemanalDAOjdbc;
import clasesDAOImpJdbc.ComidaDAOjdbc;
import clasesDAOImpJdbc.MenuDAOjdbc;

public class FactoryDAO {
		
	public static CartaSemanalDAO getCartaSemanalDAO() {
		return new CartaSemanalDAOjdbc();
	}
	
	public static ComidaDAO getComidaDAO() {
		return new ComidaDAOjdbc();
	}
	
	public static MenuDAO getMenuDAO() {
		return new MenuDAOjdbc();
	}
}
