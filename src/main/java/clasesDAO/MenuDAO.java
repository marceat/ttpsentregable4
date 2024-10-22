package clasesDAO;
import java.util.List;

import clasesNormales.Menu;

public interface MenuDAO {
	
	public abstract Menu encontrarMenuPorId(int id);
	
	public abstract boolean actualizarMenu(Menu unMenu);
	
	public abstract boolean agregarMenu(Menu unMenu);
	
	public abstract boolean eliminarMenu(Menu unMenu);
	
	public abstract List<Menu> listarMenues();
	
	
}
