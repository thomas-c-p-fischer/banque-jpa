/** Package contenant les entités */
package fr.diginamic.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/** Entité Client */
@Entity
@Table(name="CLIENT")
public class Client {
	
	/** id */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	/** nom */
	@Column(name = "NOM", length = 100, nullable = false)
	private String nom;
	
	/** prenom */
	@Column(name = "PRENOM", length = 100, nullable = false)
	private String prenom;
	
	/** dateNaissance */
	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_NAISSANCE", nullable = false)
	private Date dateNaissance;
	
	/** adresse */
	@Embedded
	private Adresse adresse;
	
	/** livretAs */
	@OneToMany(mappedBy = "client")
	private List<LivretA> livretAs;
	
	/** assuranceVies */
	@OneToMany(mappedBy = "client")
	private List<AssuranceVie> assuranceVies;
	
	@ManyToMany
	@JoinTable(name = "CLIENTS_BANQUES",
				joinColumns = @JoinColumn(name="ID_CLIENT", referencedColumnName = "ID"),
				inverseJoinColumns = @JoinColumn(name="ID_BANQUE", referencedColumnName = "ID"))
	private List<Banque> banques;

	/** Constructeur
	 * 
	 */
	public Client() {
	}

	
	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance
				+ ", adresse=" + adresse + "]";
	}

	/** Getter
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/** Setter
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/** Setter
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/** Getter
	 * @return the dateNaissance
	 */
	public Date getDateNaissance() {
		return dateNaissance;
	}

	/** Setter
	 * @param dateNaissance the dateNaissance to set
	 */
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	/** Getter
	 * @return the adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}
	
	/** Getter
	 * @return the banques
	 */
	public List<Banque> getBanques() {
		return banques;
	}


	/** Setter
	 * @param adresse the adresse to set
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}


	/** Setter
	 * @param livretAs the livretAs to set
	 */
	public void setLivretAs(List<LivretA> livretAs) {
		this.livretAs = livretAs;
	}


	/** Setter
	 * @param assuranceVies the assuranceVies to set
	 */
	public void setAssuranceVies(List<AssuranceVie> assuranceVies) {
		this.assuranceVies = assuranceVies;
	}


	/** Setter
	 * @param banques the banques to set
	 */
	public void setBanques(List<Banque> banques) {
		this.banques = banques;
	}
}