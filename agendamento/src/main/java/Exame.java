import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Exame {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idExame;
	
	private String nomeExame;

	public Long getIdExame() {
		return idExame;
	}

	public void setIdExame(Long idExame) {
		this.idExame = idExame;
	}

	public String getNomeExame() {
		return nomeExame;
	}

	public void setNomeExame(String nomeExame) {
		this.nomeExame = nomeExame;
	}
	

	
	
}
