package clasesDAOImpJpa;

import java.util.ArrayList;
import java.util.List;

import clasesDAO.CartaSemanalDAO;
import clasesNormales.CartaSemanal;
import clasesNormales.Comida;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class CartaSemanalDAOjpa implements CartaSemanalDAO {
	

	@Override
	public CartaSemanal obtenerCartaSemanalPorId(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUP");
		EntityManager em = emf.createEntityManager();
		EntityTransaction etx = em.getTransaction();
		CartaSemanal cartaObtenida = null;
		
		// etx.begin();
		try {
			cartaObtenida = em.find(CartaSemanal.class, id);
		} catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
		return cartaObtenida;
	}

	@Override
	public boolean actualizarCartaSemanal(CartaSemanal unaCartaSemanal) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUP");
		EntityManager em = emf.createEntityManager();
		EntityTransaction etx = em.getTransaction();
		boolean actualizado=false;
		
		try {
			//Query query = em.createQuery("UPDATE carta_semanal"
			//		+ "SET lunes='"+unaCartaSemanal.getLunes()+"',"
			//		+ "martes='"+unaCartaSemanal.getMartes()+"',"
			//		+ "miercoles='"+unaCartaSemanal.getMiercoles()+"',"
			//		+ "jueves='"+unaCartaSemanal.getJueves()+"',"
			//		+ "viernes='"+unaCartaSemanal.getViernes()+"'"
			//		+ "WHERE id='"+unaCartaSemanal.getId()+"' ");
			etx.begin();
			//em.persist(unaCartaSemanal);
			em.merge(unaCartaSemanal);
			etx.commit();
			actualizado = true;
			
		} catch (Exception e) {
            e.printStackTrace();
            actualizado = false;
        } finally {
            em.close();
        }
		
		return actualizado;
	}

	public boolean agregarCartaSemanal(CartaSemanal unaCartaSemanal) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUP");
		EntityManager em = emf.createEntityManager();
		EntityTransaction etx = em.getTransaction();
		boolean actualizado=false;
		
		try {
			etx.begin();
			em.persist(unaCartaSemanal);
			em.merge(unaCartaSemanal);
			etx.commit();
			actualizado=true;
			
		} catch (Exception e) {
            e.printStackTrace();
            actualizado=false;
        } finally {
            em.close();
        }
		return actualizado;

	}

	@Override
	public boolean eliminarCartaSemanal(CartaSemanal unaCartaSemanal) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUP");
		EntityManager em = emf.createEntityManager();
		EntityTransaction etx = em.getTransaction();
		boolean eliminado=false;
		
		try {
			etx.begin();
			unaCartaSemanal = em.merge(unaCartaSemanal);
			em.remove(unaCartaSemanal);
			etx.commit();
			eliminado=true;
			
		} catch (Exception e) {
            e.printStackTrace();
            eliminado=false;
        } finally {
            em.close();
        }
		return eliminado;
	}

	@Override
	public List<CartaSemanal> listarCartaSemanales() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUP");
		EntityManager em = emf.createEntityManager();
		EntityTransaction etx = em.getTransaction();
		List<CartaSemanal> listaDeCartas = null;
		
		try {
			Query query = em.createQuery("SELECT c FROM CartaSemanal c", CartaSemanal.class);
			listaDeCartas = query.getResultList();

		} catch (Exception e) {
            e.printStackTrace();
            
        } finally {
            em.close();
        }
		
		return listaDeCartas;
	}

}
