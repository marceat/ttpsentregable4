package clasesNormales;
import java.util.List;
import jakarta.persistence.*;


public class CartaSemanal {
	//comentario
	int id;
	
	@Id
	List<Menu> lunes;
	List<Menu> martes;
	List<Menu> miercoles;
	List<Menu> jueves;
	List<Menu> viernes;
	
	public CartaSemanal() {}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Menu> getLunes() {
		return lunes;
	}
	public void setLunes(List<Menu> lunes) {
		this.lunes = lunes;
	}
	public List<Menu> getMartes() {
		return martes;
	}
	public void setMartes(List<Menu> martes) {
		this.martes = martes;
	}
	public List<Menu> getMiercoles() {
		return miercoles;
	}
	public void setMiercoles(List<Menu> miercoles) {
		this.miercoles = miercoles;
	}
	public List<Menu> getJueves() {
		return jueves;
	}
	public void setJueves(List<Menu> jueves) {
		this.jueves = jueves;
	}
	public List<Menu> getViernes() {
		return viernes;
	}
	public void setViernes(List<Menu> viernes) {
		this.viernes = viernes;
	}
	

}
