package clasesNormales;
import java.awt.Image;
import java.io.File;

public abstract class UsuarioGeneral {
	private int dni;
	private String nombre;
	private String apellido;
	private String email;
	private String contraseña;
	private String preferenciasAlientarias;
	private String rol;
	private Image fotoPerfil;
	
	public UsuarioGeneral(int unDni, String unNombre, String unApellido, String unEmail, String unaContraseña, String prefe, Image foto) {
		this.dni = unDni;
		this.nombre = unNombre;
		this.apellido = unApellido;
		this.email = unEmail;
		this.contraseña = unaContraseña;
		this.preferenciasAlientarias = prefe;
		this.fotoPerfil = foto;
	}
	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContraseña() {
		return contraseña;
	}
	public String getPreferenciasAlientarias() {
		return preferenciasAlientarias;
	}

	public void setPreferenciasAlientarias(String preferenciasAlientarias) {
		this.preferenciasAlientarias = preferenciasAlientarias;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public Image getFotoPerfil() {
		return fotoPerfil;
	}
	public void setFotoPerfil(Image fotoPerfil) {
		this.fotoPerfil = fotoPerfil;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}
	
}
