package clasesDAO;
import java.util.List;

import clasesNormales.Menu;

public interface MenuDAO {
	
	Menu encontrarMenuPorId(int id);
	boolean actualizarMenu(Menu unMenu);
	boolean agregarMenu(Menu unMenu);
	boolean eliminarMenu(Menu unMenu);
	List<Menu> listarMenues();
	
	
}
