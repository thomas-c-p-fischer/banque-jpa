/** Package contenant les entités */
package fr.diginamic.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/** Entité fille LivretA*/
@Entity
public class LivretA extends AbstractCompte {
	
	/** taux */
	@Column(name = "TAUX", nullable = false)
	private double taux;
	
	/** client */
	@ManyToOne
	@JoinColumn(name = "ID_CLIENT")
	private Client client;
	
	/** operations */
	@OneToMany(mappedBy = "livretA")
	private List<Virement> virements;
	
	/** Constructeur
	 * 
	 */
	public LivretA() {
	}

	@Override
	public String toString() {
		return "LivretA [taux=" + taux + "]";
	}

	/** Getter
	 * @return the taux
	 */
	public double getTaux() {
		return taux;
	}

	/** Setter
	 * @param taux the taux to set
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}

	/** Getter
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/** Getter
	 * @return the virements
	 */
	public List<Virement> getVirements() {
		return virements;
	}

	/** Setter
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	/** Setter
	 * @param virements the virements to set
	 */
	public void setVirements(List<Virement> virements) {
		this.virements = virements;
	}	
}