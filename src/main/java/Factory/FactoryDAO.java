package Factory;

import clasesDAO.CartaSemanalDAO;
import clasesDAO.UsuarioGeneralDAO;
import clasesDAO.VentaDAO;
import clasesDAO.CartaSemanalDAO;
import clasesDAO.UsuarioGeneralDAO;
import clasesDAO.ComidaDAO;
import clasesDAO.MenuDAO;
import clasesDAO.SugerenciaDAO;
import clasesDAO.ComidaDAO;
import clasesDAO.MenuDAO;
import clasesDAOImpJpa.CartaSemanalDAOjpa;
import clasesDAOImpJpa.ComidaDAOjpa;
import clasesDAOImpJpa.MenuDAOjpa;
import clasesDAOImpJpa.SugerenciaDAOjpa;
import clasesDAOImpJpa.UsuarioGeneralDAOjpa;
import clasesDAOImpJpa.VentaDAOjpa;


public class FactoryDAO {
		
	public static CartaSemanalDAO getCartaSemanalDAO() {
		return new CartaSemanalDAOjpa();
	}
	
	public static ComidaDAO getComidaDAO() {
		return new ComidaDAOjpa();
	}
	
	public static MenuDAO getMenuDAO() {
		return new MenuDAOjpa();
	}


    public static SugerenciaDAO getSugerenciaDAO() {
	   return new SugerenciaDAOjpa();
    }

    public static UsuarioGeneralDAO getUsuarioGeneralDAO() {
       return new UsuarioGeneralDAOjpa();
    }
    
    public static VentaDAO getVentaDAO() {
        return new VentaDAOjpa();
    }




}
