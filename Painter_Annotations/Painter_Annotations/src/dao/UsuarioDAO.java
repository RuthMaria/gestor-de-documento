package dao;

import modelo.Usuario;
import org.hibernate.Query;
import org.hibernate.Session;

public class UsuarioDAO {
	Session s = HibernateUtil.getSessionFactory().getCurrentSession();

	public boolean salvar(Usuario us) {
		try {
			s.beginTransaction();
			s.save(us);
			s.getTransaction().commit();

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Usuario recuperarPeloLogin(String str) {
		try {   
			s.beginTransaction();
			Query sql = s.createQuery("from Usuario where login='" + str + "'");
			Usuario us = (Usuario) sql.uniqueResult();
			s.getTransaction().commit();
			return us;
		} catch (Exception e) {
			return null;
		}
	}

	public boolean atualizar(Usuario us) {
		try {
			s.beginTransaction();
			s.update(us);
			s.getTransaction().commit();

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean remover(Usuario us) {
		try {
			s.beginTransaction();
			s.delete(us);
			s.getTransaction().commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
