package clasesDAO;
import java.util.List;

import clasesNormales.CartaSemanal;

public interface CartaSemanalDAO {
	
	public abstract CartaSemanal obtenerCartaSemanalPorId(int id);
	public abstract boolean actualizarCartaSemanal(CartaSemanal unaCartaSemanal);
	public abstract boolean agregarCartaSemanal(CartaSemanal unaCartaSemanal);
	public abstract boolean eliminarCartaSemanal(CartaSemanal unaCartaSemanal);
	public abstract List<CartaSemanal> listarCartaSemanales();

}
