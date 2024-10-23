package clasesNormales;
import java.util.List;
import jakarta.persistence.*;


@Entity
@Table(name="CARTA_SEMANAL")
public class CartaSemanal {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	@OneToMany
	private List<Menu> lunes;
	
	@OneToMany
	private List<Menu> martes;
	
	@OneToMany
	private List<Menu> miercoles;
	
	@OneToMany
	private List<Menu> jueves;
	
	@OneToMany
	private List<Menu> viernes;
	
	public CartaSemanal() {}
	
	public CartaSemanal(List<Menu> lun, List<Menu> mar, List<Menu> mie, List<Menu> jue, List<Menu> vie) {
		this.setLunes(lun);
		this.setMartes(mar);
		this.setMiercoles(mie);
		this.setJueves(jue);
		this.setViernes(vie);
	}
	
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
