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
import fr.diginamic.entities.Virement;

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
		List<Virement> virementsAssuranceVie = new ArrayList<Virement>();
		List<Virement> virementsLivret = new ArrayList<Virement>();
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
		AssuranceVie assuranceVie = new AssuranceVie();
		assuranceVie.setClient(client);
		assuranceVie.setDateFin(new java.util.Date(150, 7, 6));
		assuranceVie.setNumero("654874654684");
		assuranceVie.setSolde("1500€");
		assuranceVie.setTaux(1.2);
		Virement virement = new Virement();
		virement.setAssuranceVie(assuranceVie);
		virement.setBeneficiare("soeur");
		virement.setDate(new java.util.Date());
		virement.setMontant(150.5);
		virement.setMotif("Cadeaux");
		virementsAssuranceVie.add(virement);
		assuranceVie.setVirements(virementsAssuranceVie);
		Virement virement1 = new Virement();
		virement1.setLivretA(livretA);
		virement1.setBeneficiare("frere");
		virement1.setDate(new java.util.Date());
		virement1.setMontant(178.5);
		virement1.setMotif("remboursement");
		virementsLivret.add(virement1);
		livretA.setVirements(virementsLivret);
		
		em.persist(virement);
		em.persist(virement1);
		em.persist(assuranceVie);
		em.persist(livretA);
		em.persist(banque);
		em.persist(client);
		
		transaction.commit();	
	}
}