
public class Menu {
	
	private String id;
	private String nombreMenu;
	private String entrada;
	private String platoPrincipal;
	private String postre;
	private String bebida;
	private String tipoMenu; //Vegetariano, no vegetariano, sin gluten, sin restricciones.
	private int precio;
	
	public Menu (String nombreMenu, String entrada, String principal, String postre, String bebida, String tipoMenu, int precio) {
		this.nombreMenu = nombreMenu;
		this.entrada = entrada;
		this.platoPrincipal = principal;
		this.postre = postre;
		this.bebida = bebida;
		this.tipoMenu = tipoMenu;
		this.precio = precio;
	}

	public String getEntrada() {
		return entrada;
	}

	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}

	public String getPlatoPrincipal() {
		return platoPrincipal;
	}

	public void setPlatoPrincipal(String platoPrincipal) {
		this.platoPrincipal = platoPrincipal;
	}

	public String getPostre() {
		return postre;
	}

	public void setPostre(String postre) {
		this.postre = postre;
	}

	public String getBebida() {
		return bebida;
	}

	public void setBebida(String bebida) {
		this.bebida = bebida;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombreMenu() {
		return nombreMenu;
	}

	public void setNombreMenu(String nombreMenu) {
		this.nombreMenu = nombreMenu;
	}

	public String getTipoMenu() {
		return tipoMenu;
	}

	public void setTipoMenu(String tipoMenu) {
		this.tipoMenu = tipoMenu;
	}
	
	
}
