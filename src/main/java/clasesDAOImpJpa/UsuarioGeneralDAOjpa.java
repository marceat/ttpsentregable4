package clasesDAOImpJpa;

import java.util.List;

import org.hibernate.query.Query;

import clasesDAO.UsuarioGeneralDAO;
import clasesNormales.UsuarioGeneral;
import clasesNormales.Venta;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class UsuarioGeneralDAOjpa implements UsuarioGeneralDAO{

	@Override
	public UsuarioGeneral encontrarPorDni(int dni) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUP");
	    EntityManager em = emf.createEntityManager();
	    UsuarioGeneral usuario = null;

	   try {
		  usuario= em.find(UsuarioGeneral.class,dni);
	    } catch (Exception e) {
	        e.printStackTrace(); //Maneja la excepción adecuadamente en un entorno real
	    } finally {
	        em.close();
	    }
	    
	    return usuario;
	}

	@Override
	public boolean actualizarDatos(UsuarioGeneral usuario) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUP");
		EntityManager em = emf.createEntityManager();
		EntityTransaction etx = em.getTransaction();
		  boolean actualizado = false;

		    try {
		        etx.begin();
		    
		        em.merge(usuario);
		        etx.commit();
		        actualizado = true;
		    } catch (Exception e) {
		        if (etx.isActive()) {
		            etx.rollback();
		        }
		        e.printStackTrace(); // Maneja la excepción adecuadamente en un entorno real
		    } finally {
		        em.close();
		    }

		    return actualizado;
	}

	@Override
	public boolean iniciarSesion(String dni, int contraseña) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean cerrarSesion() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean crearUsuario(UsuarioGeneral unUsuario) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUP");
		EntityManager em = emf.createEntityManager();
		EntityTransaction etx = em.getTransaction();
	    boolean creado=false;
	    try {
	        etx.begin();
	        em.persist(unUsuario);
	        em.merge(unUsuario);
	        etx.commit();
	        creado = true;
	    } catch (Exception e) {
	        if (etx.isActive()) {
	            etx.rollback();
	        }
	        e.printStackTrace(); // Maneja la excepción adecuadamente en un entorno real
	    } finally {
	        em.close();
	    }

	    return creado;
	}

	@Override
	public boolean eliminarUsuario(UsuarioGeneral unUsuario) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUP");
		   EntityManager em = emf.createEntityManager();
		   EntityTransaction etx = em.getTransaction();
		   boolean eliminado = false;

		   try {
			     etx.begin();
			     // Adjuntar la entidad al contexto de persistencia si no está ya en él
			        unUsuario = em.merge(unUsuario);
			        em.remove(unUsuario);
			        etx.commit();
			        eliminado = true;
			    } catch (Exception e) {
			        if (etx.isActive()) {
			            etx.rollback();
			        }
			        e.printStackTrace();
			    } finally {
			        em.close();
			    }

			    return eliminado;

	}

	@Override
	public List<UsuarioGeneral> listarUsuariosComunes() {
		  EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUP");
		  EntityManager em = emf.createEntityManager();
		  List<UsuarioGeneral> usuarios = null;

		    try {
		        TypedQuery<UsuarioGeneral> query = em.createQuery("SELECT u FROM UsuarioGeneral u ", UsuarioGeneral.class);
		        usuarios = query.getResultList();
		    } catch (Exception e) {
		        e.printStackTrace(); // Maneja la excepción adecuadamente en un entorno real
		    } finally {
		        em.close();
		    }
		    
		    return usuarios;

	}

	@Override
	public List<UsuarioGeneral> listarUsuariosResponsablesDeTurno() {
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUP");
		  EntityManager em = emf.createEntityManager();
		  List<UsuarioGeneral> usuarios = null;

		    try {
		    	TypedQuery<UsuarioGeneral> query = em.createQuery("SELECT u FROM UsuarioGeneral u WHERE u.rol = :rol", UsuarioGeneral.class);
		    	query.setParameter("rol", "responsable");

		        usuarios = query.getResultList();
		    } catch (Exception e) {
		        e.printStackTrace(); // Maneja la excepción adecuadamente en un entorno real
		    } finally {
		        em.close();
		    }
		    
		    return usuarios;
	}
	
	
}