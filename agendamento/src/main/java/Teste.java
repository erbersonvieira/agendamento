import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Teste {

	
	

	public static void main(String[] args) {
		

		EntityManagerFactory fac = Persistence.createEntityManagerFactory("dbcontatos");
		EntityManager manager = fac.createEntityManager();
		
		System.out.println("Teste");
		
//		1-Inserir um novo registro.
		
		/*Exame exame = new Exame();
		exame.setNomeExame("Psicotécnico");
		
		manager.getTransaction().begin();
		manager.persist(exame);
		manager.getTransaction().commit();
*/
		
		/* Exemplo de inserção de 1 candidato com 2 processos
		Candidato c1 = new Candidato();
		c1.setCpfCandidato("01234567890");
		c1.setNomeCandidato("Erberson");
		c1.setSexo('M');
		
	
		Processo p1 = new Processo();
		p1.setDataProcesso(new Date());
		
		Processo p2 = new Processo();
		p2.setDataProcesso(new Date());
		
		manager.getTransaction().begin();

		manager.persist(c1);
		
		p1.setCandidato(c1);
		p2.setCandidato(c1);
		
		manager.persist(p1);
		manager.persist(p2);
		
		manager.getTransaction().commit();
		*/

		

		

		
		
		
		
		
		
	}

}
