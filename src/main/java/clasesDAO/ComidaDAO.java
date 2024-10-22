package clasesDAO;
import java.util.List;

import clasesNormales.Comida;

public interface ComidaDAO {
	
	public abstract Comida obtenerComidaPorId(int id);
	
	public abstract boolean actualizarComida(Comida unaComida);
	
	public abstract boolean agregarComida(Comida unaComida);
	
	public abstract boolean eliminarComida(Comida unaComida);
	
	public abstract List<Comida> listarComidas();

}
