import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Candidato {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idCandidato;
	
	@Column(unique = true)
	private String cpfCandidato;
	
	private String nomeCandidato;
	
	private char sexo;
	
	@OneToMany(mappedBy="candidato", cascade=CascadeType.PERSIST)
	private Collection<Processo> processos;

	public Long getIdCandidato() {
		return idCandidato;
	}

	public void setIdCandidato(Long idCandidato) {
		this.idCandidato = idCandidato;
	}

	public String getCpfCandidato() {
		return cpfCandidato;
	}

	public void setCpfCandidato(String cpfCandidato) {
		this.cpfCandidato = cpfCandidato;
	}

	public String getNomeCandidato() {
		return nomeCandidato;
	}

	public void setNomeCandidato(String nomeCandidato) {
		this.nomeCandidato = nomeCandidato;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Collection<Processo> getProcessos() {
		return processos;
	}

	public void setProcessos(Collection<Processo> processos) {
		this.processos = processos;
	}

	
	
	
	
}
