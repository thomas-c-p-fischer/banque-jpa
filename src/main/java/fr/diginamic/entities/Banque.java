/** Package contenant les entités */
package fr.diginamic.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/** Entité Banque */
@Entity
@Table(name= "BANQUE")
public class Banque {
	
	/** id */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	/** nom */
	@Column(name = "NOM", nullable = false, length = 100)
	private String nom;
	
	/** clients */
	@ManyToMany
	@JoinTable(name = "CLIENTS_BANQUES",
				joinColumns = @JoinColumn(name="ID_BANQUE", referencedColumnName = "ID"),
				inverseJoinColumns = @JoinColumn(name="ID_CLIENT", referencedColumnName = "ID"))
	private List<Client> clients;

	/** Constructeur
	 * 
	 */
	public Banque() {
	}

	@Override
	public String toString() {
		return "Banque [id=" + id + ", nom=" + nom + "]";
	}

	/** Getter
	 * @return the id
	 */
	public Integer getId() {
		return id;
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
	 * @return the clients
	 */
	public List<Client> getClients() {
		return clients;
	}

	/** Setter
	 * @param clients the clients to set
	 */
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
}