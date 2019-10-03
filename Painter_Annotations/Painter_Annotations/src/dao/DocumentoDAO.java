package dao;

import java.util.List;
import modelo.Documento;
import modelo.PalavraChave;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class DocumentoDAO {
	Session s = HibernateUtil.getSessionFactory().getCurrentSession();

	public boolean salvar(Documento doc) {
		try {
			s.beginTransaction();
			s.save(doc);
			s.getTransaction().commit();

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean atualizar(Documento doc) {
		try {
			s.beginTransaction();
			s.update(doc);
			s.getTransaction().commit();

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean remover(Documento doc) {
		try {
			s.beginTransaction();
			s.delete(doc);
			s.getTransaction().commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}        
        
        public List<Documento> buscarPorEspecie (String especie) {
            try {
                s.beginTransaction();
                Criterion parametro = Restrictions.like("especie", "%" + especie + "%");
                Criteria busca = s.createCriteria(Documento.class).add(parametro);
                List<Documento> resultado = busca.list();
                s.getTransaction().commit();
                return resultado;
            } catch (Exception e) {
                return null;
            }
        }
        
        public List<Documento> buscarPorDataFinal (String dataFinal) {
            try {
                s.beginTransaction();
                Criterion parametro = Restrictions.like("dataFinal",  "%"+dataFinal+ "%");
                Criteria busca = s.createCriteria(Documento.class).add(parametro);
                List<Documento> resultado = busca.list();
                s.getTransaction().commit();
                return resultado;
            } catch (Exception e) {
                return null;
            }
        }
        
        public List<Documento> buscarPorDataInicial (String dataInicial) {
            try {
                s.beginTransaction();
                Criterion parametro = Restrictions.like("dataInicial","%" + dataInicial + "%");
                Criteria busca = s.createCriteria(Documento.class).add(parametro);
                List<Documento> resultado = busca.list();
                s.getTransaction().commit();
                return resultado;
            } catch (Exception e) {
                return null;
            }
        }
        
    public List<Documento> buscarPorPalavraChave(List <PalavraChave> palavras) {

        try {
            String busca = "";     
            for (int i = 0; i < palavras.size(); i++) {
                    
                    if (i < palavras.size() - 1) {
                        busca += "id_palavra = '" + palavras.get(i).getId() + "' or ";
                    } else {
                        busca += "id_palavra = '" + (palavras.get(i).getId() + "'");
                    }
                }
            
            s.beginTransaction();
            Query sql = s.createSQLQuery("select distinct documento_palavraChave.id_doc from documento_palavraChave where "+busca);
                                
            List<Integer> id_docs = sql.list();

            if (!id_docs.isEmpty()) {
                busca = "";
                
                for (int i = 0; i < id_docs.size(); i++) {
                    
                    if (i < id_docs.size() - 1) {
                        busca += "id_doc = '" + id_docs.get(i) + "' or ";
                    } else {
                        busca += "id_doc = '" + (id_docs.get(i) + "'");
                    }
                }
                
                try {
                    
                    sql = s.createQuery("from Documento where " + busca);
                    List<Documento> documentos = (List<Documento>) sql.list();
                    s.getTransaction().commit();
                    
                    return documentos;
                    
                } catch (Exception e) {
                    System.out.println("Há documentos, porém houve erro de busca");
                    return null;
                }
                
            } else {
                System.out.println("A busca não retornou nenhum documento");
                return null;
            }

        } catch (Exception e) {
            System.out.println("Erro de busca em documento_palavraChave");
            return null;
        }

    }      
        
}
