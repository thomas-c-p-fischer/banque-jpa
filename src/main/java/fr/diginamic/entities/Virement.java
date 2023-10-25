/** Package contenant les entités */
package fr.diginamic.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/** Entité fille Virement*/
@Entity
public class Virement extends AbstractOperation {
	
	/** beneficiare */
	@Column(name = "BENEFICIAIRE", nullable = false, length = 150)
	private String beneficiare;

	@ManyToOne
	@JoinColumn(name = "ID_ASSURANCE_VIE")
	private AssuranceVie assuranceVie;
	
	@ManyToOne
	@JoinColumn(name = "ID_LIVRET_A")
	private LivretA livretA;
	
	/** Constructeur
	 * 
	 */
	public Virement() {
	}

	@Override
	public String toString() {
		return "Virement [beneficiare=" + beneficiare + "]";
	}

	/** Getter
	 * @return the beneficiare
	 */
	public String getBeneficiare() {
		return beneficiare;
	}

	/** Setter
	 * @param beneficiare the beneficiare to set
	 */
	public void setBeneficiare(String beneficiare) {
		this.beneficiare = beneficiare;
	}

	/** Getter
	 * @return the assuranceVie
	 */
	public AssuranceVie getAssuranceVie() {
		return assuranceVie;
	}

	/** Getter
	 * @return the livretA
	 */
	public LivretA getLivretA() {
		return livretA;
	}

	/** Setter
	 * @param assuranceVie the assuranceVie to set
	 */
	public void setAssuranceVie(AssuranceVie assuranceVie) {
		this.assuranceVie = assuranceVie;
	}

	/** Setter
	 * @param livretA the livretA to set
	 */
	public void setLivretA(LivretA livretA) {
		this.livretA = livretA;
	}
}