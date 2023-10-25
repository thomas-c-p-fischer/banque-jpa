/** Package contenant les entités */
package fr.diginamic.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

/** Entité mère Compte */
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class AbstractCompte {
	
	/** id */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	/** numero */
	@Column(name = "NUMERO", nullable = false, length = 100)
	private String numero;
	
	/** solde */
	@Column(name = "SOLDE", nullable = false, length = 100)
	private String solde;
	
	/** Constructeur
	 * 
	 */
	public AbstractCompte() {
	}

	@Override
	public String toString() {
		return "AbstractCompte [id=" + id + ", numero=" + numero + ", solde=" + solde + "]";
	}

	/** Getter
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/** Getter
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/** Setter
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/** Getter
	 * @return the solde
	 */
	public String getSolde() {
		return solde;
	}

	/** Setter
	 * @param solde the solde to set
	 */
	public void setSolde(String solde) {
		this.solde = solde;
	}
}