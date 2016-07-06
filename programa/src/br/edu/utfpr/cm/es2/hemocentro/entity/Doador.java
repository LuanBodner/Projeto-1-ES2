package br.edu.utfpr.cm.es2.hemocentro.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.edu.utfpr.cm.es2.hemocentro.dao.EntidadeBase;

/**
 * Entity implementation class for Entity: usuário
 *
 */
@Entity
@NamedQueries({ @NamedQuery(name = "Doador.buscaTodos", query = "SELECT u FROM Doador u"),
        @NamedQuery(name = "Doador.buscaPorId", query = "SELECT u FROM Doador u WHERE u.id = :id") })
@Table(name = "doador")
public class Doador implements Serializable, EntidadeBase {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 100)
    private String nome;
    @Column(length = 100)
    private String nomeDoPai;
    @Column(length = 100)
    private String nomeDaMae;

    private char sexo;
    @Temporal(TemporalType.DATE)
    private Date dataDeNascimento;
    @Column(length = 20)
    private String estadoCivil;
    @Column(length = 30)
    private String naturalidade;
    @Column(length = 2)
    private String uf;
    @Column(length = 30)
    private String nacionalidade;
    private char typoDoDocumento;
    @Column(length = 15)
    private String numeroDoDocumento;
    @Column(length = 10)
    private String orgaoExpedidor;
    @Column(length = 30)
    private String profissao;
    @Column(length = 30)
    private String trabalhoAtual;
    @Column(length = 100)
    private String enderecoComercial;
    @Column(length = 100)
    private String enderecoResidencial;
    @Column(length = 100)
    private String email;
    private static final long serialVersionUID = 1L;

    public Doador() {
        super();
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeDoPai() {
        return this.nomeDoPai;
    }

    public void setNomeDoPai(String nomeDoPai) {
        this.nomeDoPai = nomeDoPai;
    }

    public String getNomeDaMae() {
        return this.nomeDaMae;
    }

    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Date getDataDeNascimento() {
        return this.dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getEstadoCivil() {
        return this.estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNaturalidade() {
        return this.naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getUf() {
        return this.uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public char getTypoDoDocumento() {
        return this.typoDoDocumento;
    }

    public void setTypoDoDocumento(char typoDoDocumento) {
        this.typoDoDocumento = typoDoDocumento;
    }

    public String getNumeroDoDocumento() {
        return this.numeroDoDocumento;
    }

    public void setNumeroDoDocumento(String numeroDoDocumento) {
        this.numeroDoDocumento = numeroDoDocumento;
    }

    public String getOrgaoExpedidor() {
        return this.orgaoExpedidor;
    }

    public void setOrgaoExpedidor(String orgaoExpedidor) {
        this.orgaoExpedidor = orgaoExpedidor;
    }

    public String getProfissao() {
        return this.profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getTrabalhoAtual() {
        return this.trabalhoAtual;
    }

    public void setTrabalhoAtual(String trabalhoAtual) {
        this.trabalhoAtual = trabalhoAtual;
    }

    public String getEnderecoComercial() {
        return this.enderecoComercial;
    }

    public void setEnderecoComercial(String enderecoComercial) {
        this.enderecoComercial = enderecoComercial;
    }

    public String getEnderecoResidencial() {
        return this.enderecoResidencial;
    }

    public void setEnderecoResidencial(String enderecoResidencial) {
        this.enderecoResidencial = enderecoResidencial;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format(
                "Doador [id=%s, nome=%s, nomeDoPai=%s, nomeDaMae=%s, sexo=%s, dataDeNascimento=%s, estadoCivil=%s, naturalidade=%s, uf=%s, nacionalidade=%s, typoDoDocumento=%s, numeroDoDocumento=%s, orgaoExpedidor=%s, profissao=%s, trabalhoAtual=%s, enderecoComercial=%s, enderecoResidencial=%s, email=%s, getId()=%s, getNome()=%s, getNomeDoPai()=%s, getNomeDaMae()=%s, getSexo()=%s, getDataDeNascimento()=%s, getEstadoCivil()=%s, getNaturalidade()=%s, getUf()=%s, getNacionalidade()=%s, getTypoDoDocumento()=%s, getNumeroDoDocumento()=%s, getOrgaoExpedidor()=%s, getProfissao()=%s, getTrabalhoAtual()=%s, getEnderecoComercial()=%s, getEnderecoResidencial()=%s, getEmail()=%s, getClass()=%s, hashCode()=%s, toString()=%s]",
                id, nome, nomeDoPai, nomeDaMae, sexo, dataDeNascimento, estadoCivil, naturalidade, uf, nacionalidade,
                typoDoDocumento, numeroDoDocumento, orgaoExpedidor, profissao, trabalhoAtual, enderecoComercial,
                enderecoResidencial, email, getId(), getNome(), getNomeDoPai(), getNomeDaMae(), getSexo(),
                getDataDeNascimento(), getEstadoCivil(), getNaturalidade(), getUf(), getNacionalidade(),
                getTypoDoDocumento(), getNumeroDoDocumento(), getOrgaoExpedidor(), getProfissao(), getTrabalhoAtual(),
                getEnderecoComercial(), getEnderecoResidencial(), getEmail(), getClass(), hashCode(), super.toString());
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dataDeNascimento == null) ? 0 : dataDeNascimento.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((enderecoComercial == null) ? 0 : enderecoComercial.hashCode());
        result = prime * result + ((enderecoResidencial == null) ? 0 : enderecoResidencial.hashCode());
        result = prime * result + ((estadoCivil == null) ? 0 : estadoCivil.hashCode());
        result = prime * result + (int) (id ^ (id >>> 32));
        result = prime * result + ((nacionalidade == null) ? 0 : nacionalidade.hashCode());
        result = prime * result + ((naturalidade == null) ? 0 : naturalidade.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((nomeDaMae == null) ? 0 : nomeDaMae.hashCode());
        result = prime * result + ((nomeDoPai == null) ? 0 : nomeDoPai.hashCode());
        result = prime * result + ((numeroDoDocumento == null) ? 0 : numeroDoDocumento.hashCode());
        result = prime * result + ((orgaoExpedidor == null) ? 0 : orgaoExpedidor.hashCode());
        result = prime * result + ((profissao == null) ? 0 : profissao.hashCode());
        result = prime * result + sexo;
        result = prime * result + ((trabalhoAtual == null) ? 0 : trabalhoAtual.hashCode());
        result = prime * result + typoDoDocumento;
        result = prime * result + ((uf == null) ? 0 : uf.hashCode());
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Doador)) {
            return false;
        }
        Doador other = (Doador) obj;
        if (dataDeNascimento == null) {
            if (other.dataDeNascimento != null) {
                return false;
            }
        } else if (!dataDeNascimento.equals(other.dataDeNascimento)) {
            return false;
        }
        if (email == null) {
            if (other.email != null) {
                return false;
            }
        } else if (!email.equals(other.email)) {
            return false;
        }
        if (enderecoComercial == null) {
            if (other.enderecoComercial != null) {
                return false;
            }
        } else if (!enderecoComercial.equals(other.enderecoComercial)) {
            return false;
        }
        if (enderecoResidencial == null) {
            if (other.enderecoResidencial != null) {
                return false;
            }
        } else if (!enderecoResidencial.equals(other.enderecoResidencial)) {
            return false;
        }
        if (estadoCivil == null) {
            if (other.estadoCivil != null) {
                return false;
            }
        } else if (!estadoCivil.equals(other.estadoCivil)) {
            return false;
        }
        if (id != other.id) {
            return false;
        }
        if (nacionalidade == null) {
            if (other.nacionalidade != null) {
                return false;
            }
        } else if (!nacionalidade.equals(other.nacionalidade)) {
            return false;
        }
        if (naturalidade == null) {
            if (other.naturalidade != null) {
                return false;
            }
        } else if (!naturalidade.equals(other.naturalidade)) {
            return false;
        }
        if (nome == null) {
            if (other.nome != null) {
                return false;
            }
        } else if (!nome.equals(other.nome)) {
            return false;
        }
        if (nomeDaMae == null) {
            if (other.nomeDaMae != null) {
                return false;
            }
        } else if (!nomeDaMae.equals(other.nomeDaMae)) {
            return false;
        }
        if (nomeDoPai == null) {
            if (other.nomeDoPai != null) {
                return false;
            }
        } else if (!nomeDoPai.equals(other.nomeDoPai)) {
            return false;
        }
        if (numeroDoDocumento == null) {
            if (other.numeroDoDocumento != null) {
                return false;
            }
        } else if (!numeroDoDocumento.equals(other.numeroDoDocumento)) {
            return false;
        }
        if (orgaoExpedidor == null) {
            if (other.orgaoExpedidor != null) {
                return false;
            }
        } else if (!orgaoExpedidor.equals(other.orgaoExpedidor)) {
            return false;
        }
        if (profissao == null) {
            if (other.profissao != null) {
                return false;
            }
        } else if (!profissao.equals(other.profissao)) {
            return false;
        }
        if (sexo != other.sexo) {
            return false;
        }
        if (trabalhoAtual == null) {
            if (other.trabalhoAtual != null) {
                return false;
            }
        } else if (!trabalhoAtual.equals(other.trabalhoAtual)) {
            return false;
        }
        if (typoDoDocumento != other.typoDoDocumento) {
            return false;
        }
        if (uf == null) {
            if (other.uf != null) {
                return false;
            }
        } else if (!uf.equals(other.uf)) {
            return false;
        }
        return true;
    }
}
