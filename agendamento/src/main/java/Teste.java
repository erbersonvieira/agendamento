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
		
		
		
		
	}

}
