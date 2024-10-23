package clasesDAOImpJdbc;
import java.util.List;

import clasesDAO.MenuDAO;
import clasesNormales.Menu;

public class MenuDAOjdbc implements MenuDAO{
	
	@Override
	public Menu encontrarMenuPorId(int id) {
		return null;
	}
	@Override
	public boolean actualizarMenu(Menu unMenu) {
		return true;
	}
	@Override
	public boolean agregarMenu(Menu unMenu) {
		return true;
	}
	@Override
	public boolean eliminarMenu(Menu unMenu) {
		return true;
	}
	@Override
	public List<Menu> listarMenues(){
		return null;
	}
	
	
}