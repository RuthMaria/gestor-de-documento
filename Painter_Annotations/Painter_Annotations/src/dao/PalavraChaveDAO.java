package dao;

import java.util.ArrayList;
import java.util.List;
import modelo.PalavraChave;
import org.hibernate.Query;
import org.hibernate.Session;

public class PalavraChaveDAO {
	Session s = HibernateUtil.getSessionFactory().getCurrentSession();

	public boolean salvar(PalavraChave p) {
		try {
			s.beginTransaction();
			s.save(p);
			s.getTransaction().commit();

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public PalavraChave recuperarPeloId(String str) {
		try {
			s.beginTransaction();
			Query sql = s.createQuery("from PalavraChave where nome='" + str + "'");
			PalavraChave p = (PalavraChave) sql.uniqueResult();
			s.getTransaction().commit();

			return p;
		} catch (Exception e) {
			return null;
		}
	}
        
        public boolean verificaID(int id) {
		try {
			s.beginTransaction();
                        System.out.println(id+"mmmmmmmmmmmmmmmmmmm");
			Query sql = s.createSQLQuery("select distinct documento_palavraChave.id_doc from documento_palavraChave where id_palavra ='" + id + "'");
			List<Integer> IDs = sql.list();		
                        
                        return IDs.isEmpty();
                	     
		} catch (Exception e) {
			return false;
		}
	}
        
        public ArrayList<PalavraChave> recuperarTodas() {
		try {
			s.beginTransaction();
			Query sql = s.createQuery("from PalavraChave");
			List<PalavraChave> palavras = sql.list();
			s.getTransaction().commit();

			return (ArrayList<PalavraChave>) palavras;
		} catch (Exception e) {
			return null;
		}
	}

	public boolean atualizar(PalavraChave p) {
		try {
			s.beginTransaction();
			s.update(p);
			s.getTransaction().commit();

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean remover(PalavraChave p) {
		try {
                       boolean id =  verificaID(p.getId());
                       
                       if(id){
                            s.beginTransaction();
                            s.delete(p);
                            s.getTransaction().commit();
                            return true;
                       }
                       else
                           return false;
                       
		} catch (Exception e) {
			return false;
		}
	}
}
