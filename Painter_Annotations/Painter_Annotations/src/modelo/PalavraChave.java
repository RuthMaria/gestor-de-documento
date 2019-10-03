package modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity
public class PalavraChave implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_palavra;
	private String nome;
        
    @Override
    public String toString() {
        return nome;
    }


    public PalavraChave() {
    }

	public PalavraChave(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id_palavra;
	}
	public void setId(int id) {
		this.id_palavra = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
