package Factory;

import clasesDAO.CartaSemanalDAO;
import clasesDAO.UsuarioGeneralDAO;
import clasesDAO.VentaDAO;
import clasesDAOImpJdbc.ComidaDAOjdbc;
import clasesDAOImpJdbc.MenuDAOjdbc;
import clasesDAOImpJdbc.SugerenciaDAOjdbc;
import clasesDAOImpJdbc.UsuarioGeneralDAOjdbc;
import clasesDAOImpJdbc.VentaDAOjdbc;
import clasesDAO.CartaSemanalDAO;
import clasesDAO.UsuarioGeneralDAO;
import clasesDAO.ComidaDAO;
import clasesDAO.MenuDAO;
import clasesDAO.SugerenciaDAO;
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


    public static SugerenciaDAO getSugerenciaDAO() {
	   return new SugerenciaDAOjdbc();
    }

    public static UsuarioGeneralDAO getUsuarioGeneralDAO() {
       return new UsuarioGeneralDAOjdbc();
    }
    
    public static VentaDAO getVentaDAO() {
        return new VentaDAOjdbc();
    }




}
