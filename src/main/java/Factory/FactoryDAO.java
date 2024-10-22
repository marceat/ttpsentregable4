package Factory;

import clasesDAO.CartaSemanalDAO;
import clasesDAO.UsuarioGeneralDAO;
import clasesDAO.VentaDAO;
import clasesDAOImpJdbc.CartaSemanalDAOjdbc;
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
import clasesDAOImpJdbc.CartaSemanalDAOjdbc;

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
