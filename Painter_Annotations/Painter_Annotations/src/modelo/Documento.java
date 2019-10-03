package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.Type;

@Entity
public class Documento implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private int id_doc;
    @Column(columnDefinition="text")
    private  String imagem;
    private String proveniencia;
    private String organizacao;
    private String especie;
    private String quantidade;
    private String conservacao;
    @Column(columnDefinition="text")
    private String descricao;    
    @Column(columnDefinition="text")
    private String observacao;
    private String preenchimento;
    private String revisao;
    private String loginDono;
    private String dataFinal;
    private String dataInicial;
    private String identificadorDocumento;
    private String localizacao;
    
    @ManyToOne
    
    private Usuario ultimoUsuario;
    @ManyToMany(cascade = CascadeType.REFRESH)
    @JoinTable(name = "documento_palavraChave", joinColumns = {
        @JoinColumn(name = "id_doc")}, inverseJoinColumns = {
        @JoinColumn(name = "id_palavra")})
    private List<PalavraChave> palavras;

    public Documento() {
    }

    public Documento(String imagem, String proveniencia, String organizacao,
            String especie, String quantidade, String conservacao,
            String descricao, String observacao, String preenchimento,
            String revisao, String loginDono, String dataFinal, String dataInicial, 
            Usuario ultimoUsuario, String identificadorDocumento, String localizacao) {
        this.imagem = imagem;
        this.proveniencia = proveniencia;
        this.organizacao = organizacao;
        this.especie = especie;
        this.quantidade = quantidade;
        this.conservacao = conservacao;
        this.descricao = descricao;
        this.observacao = observacao;
        this.preenchimento = preenchimento;
        this.revisao = revisao;
        this.loginDono = loginDono;
        this.dataFinal = dataFinal;
        this.dataInicial = dataInicial;
        this.ultimoUsuario = ultimoUsuario;
        this.palavras = new ArrayList<PalavraChave>();
        this.identificadorDocumento = identificadorDocumento;
        this.localizacao = localizacao;
    }

    public int getId_doc() {
        return id_doc;
    }

    public void setId_doc(int id_doc) {
        this.id_doc = id_doc;
    }
    
    public String getImagem() {
        return imagem;
    }
    
    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public int getId() {
        return id_doc;
    }

    public void setId(int id) {
        this.id_doc = id;
    }

    public String getProveniencia() {
        return proveniencia;
    }

    public void setProveniencia(String proveniencia) {
        this.proveniencia = proveniencia;
    }

    public String getOrganizacao() {
        return organizacao;
    }

    public void setOrganizacao(String organizacao) {
        this.organizacao = organizacao;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getConservacao() {
        return conservacao;
    }

    public void setConservacao(String conservacao) {
        this.conservacao = conservacao;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getPreenchimento() {
        return preenchimento;
    }

    public void setPreenchimento(String preenchimento) {
        this.preenchimento = preenchimento;
    }

    public String getRevisao() {
        return revisao;
    }

    public void setRevisao(String revisao) {
        this.revisao = revisao;
    }

    public String getLoginDono() {
        return loginDono;
    }

    public void setLoginDono(String loginDono) {
        this.loginDono = loginDono;
    }

    public String getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(String dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Usuario getUltimoUsuario() {
        return ultimoUsuario;
    }

    public void setUltimoUsuario(Usuario ultimoUsuario) {
        this.ultimoUsuario = ultimoUsuario;
    }

    public List<PalavraChave> getPalavras() {
        return palavras;
    }

    public void setPalavras(List<PalavraChave> palavras) {
        this.palavras = palavras;
    }

    public void addPalavra(PalavraChave p) {
        this.palavras.add(p);
    }
    
    public void removePalavra(PalavraChave p) {
        this.palavras.remove(p);
    }

    public String getIdentificacaoDocumento() {
        return identificadorDocumento;
    }
       
    public void setIdentificacaoDocumento(String identificacaoDocumento) {
        this.identificadorDocumento = identificacaoDocumento;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
