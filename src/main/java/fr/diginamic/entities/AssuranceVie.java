/** Package contenant les entités */
package fr.diginamic.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/** Entité fille AssuranceVie */
 @Entity
public class AssuranceVie extends AbstractCompte {
	
	/** dateFin */
	@Temporal(TemporalType.DATE)
	@Column(name="DATE_FIN", nullable = false)
	private Date dateFin;
	
	/** taux */
	@Column(name = "TAUX", nullable = false)
	private double taux;
	
	/** client */
	@ManyToOne
	@JoinColumn(name = "ID_CLIENT")
	private Client client;
	
	/** operations */
	@OneToMany(mappedBy = "assuranceVie")
	private List<Virement> virements;
	
	/** Constructeur
	 * @param dateFin
	 * @param taux
	 */
	public AssuranceVie(Date dateFin, double taux) {
	}

	@Override
	public String toString() {
		return "AssuranceVie [dateFin=" + dateFin + ", taux=" + taux + "]";
	}

	/** Getter
	 * @return the dateFin
	 */
	public Date getDateFin() {
		return dateFin;
	}

	/** Setter
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
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
}