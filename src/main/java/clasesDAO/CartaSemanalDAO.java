package clasesDAO;
import java.util.List;

import clasesNormales.CartaSemanal;

public interface CartaSemanalDAO {
	
	CartaSemanal obtenerCartaSemanalPorId(int id);
	boolean actualizarCartaSemanal(CartaSemanal unaCartaSemanal);
	boolean agregarCartaSemanal(CartaSemanal unaCartaSemanal);
	boolean eliminarCartaSemanal(CartaSemanal unaCartaSemanal);
	List<CartaSemanal> listarCartaSemanales();

}
