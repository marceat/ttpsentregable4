package clasesDAO;
import java.util.List;

import clasesNormales.Comida;

public interface ComidaDAO {
	
	Comida obtenerComidaPorId(int id);
	boolean actualizarComida(Comida unaComida);
	boolean agregarComida(Comida unaComida);
	boolean eliminarComida(Comida unaComida);
	List<Comida> listarComidas();

}
