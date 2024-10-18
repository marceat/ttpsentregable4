import java.awt.Image;
import java.sql.Date;
import java.util.List;

public class Venta {
	int id;
	UsuarioGeneral usuario;
	List<Menu> menues;
	List<Comida> comidas;
	Date fecha;
	int precioTotal;
	Image qr;
	
	public List<Comida> getComidas() {
		return comidas;
	}
	public void setComidas(List<Comida> comidas) {
		this.comidas = comidas;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public UsuarioGeneral getUsuario() {
		return usuario;
	}
	public void setUsuario(UsuarioGeneral usuario) {
		this.usuario = usuario;
	}
	public List<Menu> getMenues() {
		return menues;
	}
	public void setMenues(List<Menu> menues) {
		this.menues = menues;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(int precioTotal) {
		this.precioTotal = precioTotal;
	}
	public Image getQr() {
		return qr;
	}
	public void setQr(Image qr) {
		this.qr = qr;
	}
	
}
