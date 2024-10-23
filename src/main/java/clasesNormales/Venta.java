package clasesNormales;
import java.awt.Image;
import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="VENTA")
public class Venta {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	@ManyToOne
	UsuarioGeneral usuario;
	
	@OneToMany
	List<Menu> menues;
	
	@OneToMany
	List<Comida> comidas;
	
	Date fecha;
	int precioTotal;
	String qr;
	
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
	public String getQr() {
		return qr;
	}
	public void setQr(String qr) {
		this.qr = qr;
	}
	
}
