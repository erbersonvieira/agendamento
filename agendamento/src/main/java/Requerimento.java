import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Requerimento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idRequerimento;
	
	private String nomeRequerimento;

	public Long getIdRequerimento() {
		return idRequerimento;
	}

	public void setIdRequerimento(Long idRequerimento) {
		this.idRequerimento = idRequerimento;
	}

	public String getNomeRequerimento() {
		return nomeRequerimento;
	}

	public void setNomeRequerimento(String nomeRequerimento) {
		this.nomeRequerimento = nomeRequerimento;
	}

}
