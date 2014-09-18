import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class Processo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idProcesso;
	
	private Date dataProcesso;
	
	@ManyToOne
	private Candidato candidato;

	public Long getIdProcesso() {
		return idProcesso;
	}

	public void setIdProcesso(Long idProcesso) {
		this.idProcesso = idProcesso;
	}

	public Date getDataProcesso() {
		return dataProcesso;
	}

	public void setDataProcesso(Date dataProcesso) {
		this.dataProcesso = dataProcesso;
	}

	public Candidato getCandidato() {
		return candidato;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}

	
}
