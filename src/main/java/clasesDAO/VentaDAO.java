package clasesDAO;
import java.util.List;

import clasesNormales.UsuarioGeneral;
import clasesNormales.Venta;

public interface VentaDAO {
	
	Venta obtenerVentaPorId(int id);
	boolean actualizarVenta(Venta unaVenta);	
	boolean agregarVenta(Venta unaVenta) ;
	boolean eliminarVenta(Venta unaVenta);	
	List<Venta> listarVentas() ;
	void enviarQrPorMail(UsuarioGeneral usuario); 
	

}
