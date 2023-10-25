/**
 * 
 */
package fr.diginamic;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import fr.diginamic.entities.Adresse;
import fr.diginamic.entities.AssuranceVie;
import fr.diginamic.entities.Banque;
import fr.diginamic.entities.Client;
import fr.diginamic.entities.LivretA;

/**
 * 
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("banque-jpa");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		Adresse adresse = new Adresse(17, "beaucaire", "paris", "75000");
		List<Client> clients = new ArrayList<Client>();
		List<Banque> banques = new ArrayList<Banque>();
		transaction.begin();
		
		
		
		
		
		Client client = new Client();
		client.setAdresse(adresse);
		client.setDateNaissance(new java.util.Date(90, 7, 6));
		client.setNom("Doe");
		client.setPrenom("John");
		clients.add(client);
		Banque banque = new Banque();
		banque.setNom("Revolut");
		banques.add(banque);
		banque.setClients(clients);
		client.setBanques(banques);
		LivretA livretA = new LivretA();
		livretA.setNumero("102211657996");
		livretA.setSolde("-150,20€");
		livretA.setTaux(2.5);
		livretA.setClient(client);
		
		em.persist(livretA);
		em.persist(banque);
		em.persist(client);
		
		transaction.commit();	
	}
}