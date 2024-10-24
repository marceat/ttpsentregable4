package clasesDAOImpJpa;

import java.util.List;

import clasesDAO.ComidaDAO;
import clasesNormales.CartaSemanal;
import clasesNormales.Comida;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class ComidaDAOjpa implements ComidaDAO {

	@Override
	public Comida obtenerComidaPorId(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUP");
		EntityManager em = emf.createEntityManager();
		EntityTransaction etx = em.getTransaction();
		Comida comidaObtenida = null;
		
		// etx.begin();
		try {
			//Query query = em.createQuery("SELECT all FROM 'comida' WHERE id='"+id+"' ");
			// ComidaObtenida = (Comida) query.getSingleResult();  //Página 22, del pdf "JPA" !! 
			comidaObtenida = em.find(Comida.class, id);
			
		} catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
		
		return comidaObtenida;
	}

	@Override
	public boolean actualizarComida(Comida unaComida) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUP");
		EntityManager em = emf.createEntityManager();
		EntityTransaction etx = em.getTransaction();
		boolean actualizado=false;
		
		try {
			
			etx.begin();
			//em.persist(unaComida);
			em.merge(unaComida);
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

	@Override
	public boolean agregarComida(Comida unaComida) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUP");
		EntityManager em = emf.createEntityManager();
		EntityTransaction etx = em.getTransaction();
		boolean actualizado=false;
		
		try {
			etx.begin();
			em.merge(unaComida);
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
	public boolean eliminarComida(Comida unaComida) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUP");
		EntityManager em = emf.createEntityManager();
		EntityTransaction etx = em.getTransaction();
		boolean eliminado=false;
		
		try {
			etx.begin();
			unaComida = em.merge(unaComida);
			em.remove(unaComida);
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
	public List<Comida> listarComidas() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUP");
		EntityManager em = emf.createEntityManager();
		EntityTransaction etx = em.getTransaction();
		List<Comida> listaDeComidas = null;
		
		try {
			Query query = em.createQuery("SELECT c FROM Comida c", Comida.class);
			listaDeComidas = query.getResultList();

		} catch (Exception e) {
            e.printStackTrace();
            
        } finally {
            em.close();
        }
		
		return listaDeComidas;
	}

}
