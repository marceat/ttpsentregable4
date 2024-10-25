package clasesDAOImpJpa;

import java.util.List;

import clasesDAO.MenuDAO;
import clasesNormales.Comida;
import clasesNormales.Menu;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class MenuDAOjpa implements MenuDAO {

	@Override
	public Menu encontrarMenuPorId(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUP");
		EntityManager em = emf.createEntityManager();
		EntityTransaction etx = em.getTransaction();
		Menu menuObtenido = null;
		
		try {
			menuObtenido = em.find(Menu.class, id);
			
		} catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
		
		return menuObtenido;
	}

	@Override
	public boolean actualizarMenu(Menu unMenu) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUP");
		EntityManager em = emf.createEntityManager();
		EntityTransaction etx = em.getTransaction();
		boolean actualizado=false;
		
		try {
			
			etx.begin();
			
			em.merge(unMenu);
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
	public boolean agregarMenu(Menu unMenu) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUP");
		EntityManager em = emf.createEntityManager();
		EntityTransaction etx = em.getTransaction();
		boolean actualizado=false;
		
		try {
			etx.begin();
			em.persist(unMenu);
			em.merge(unMenu);
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
	public boolean eliminarMenu(Menu unMenu) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUP");
		EntityManager em = emf.createEntityManager();
		EntityTransaction etx = em.getTransaction();
		boolean eliminado=false;
		
		try {
			etx.begin();
			unMenu = em.merge(unMenu);
			em.remove(unMenu);
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
	public List<Menu> listarMenues() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUP");
		EntityManager em = emf.createEntityManager();
		EntityTransaction etx = em.getTransaction();
		List<Menu> listaDeMenues = null;
		
		try {
			Query query = em.createQuery("SELECT m FROM Menu m", Menu.class);
			listaDeMenues = query.getResultList();

		} catch (Exception e) {
            e.printStackTrace();
            
        } finally {
            em.close();
        }
		
		return listaDeMenues;
	}

}
