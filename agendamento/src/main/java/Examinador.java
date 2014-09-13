import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Examinador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idExaminador;
	
	private String nomeExaminador;
	
	@Column(unique = true)
	private String cpfExaminador;

	public Long getIdExaminador() {
		return idExaminador;
	}

	public void setIdExaminador(Long idExaminador) {
		this.idExaminador = idExaminador;
	}

	public String getNomeExaminador() {
		return nomeExaminador;
	}

	public void setNomeExaminador(String nomeExaminador) {
		this.nomeExaminador = nomeExaminador;
	}

	public String getCpfExaminador() {
		return cpfExaminador;
	}

	public void setCpfExaminador(String cpfExaminador) {
		this.cpfExaminador = cpfExaminador;
	}
	
	
	

}
