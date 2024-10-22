package clasesDAO;
import java.util.List;

import clasesNormales.UsuarioGeneral;
import clasesNormales.Venta;

public interface VentaDAO {
	
	public abstract Venta obtenerVentaPorId(int id);
	
	public abstract boolean actualizarVenta(Venta unaVenta);
	
	public abstract boolean agregarVenta(Venta unaVenta) ;
	
	public abstract boolean eliminarVenta(Venta unaVenta);
	
	public abstract List<Venta> listarVentas() ;
	
	public abstract void enviarQrPorMail(UsuarioGeneral usuario); 
	

}
