/** Package contenant les entités */
package fr.diginamic.entities;

import javax.persistence.Embeddable;

/** Entité Adresse */
@Embeddable
public class Adresse {
	
	/** numero */
	private Integer numero;
	/** rue */
	private String rue;
	/** ville */
	private String ville;
	/** codePostal */
	private String codePostal;
	
	public Adresse() {
		
	}
	
	/** Constructeur
	 * @param numero
	 * @param rue
	 * @param ville
	 * @param codePostal
	 */
	public Adresse(Integer numero, String rue, String ville, String codePostal) {
		super();
		this.numero = numero;
		this.rue = rue;
		this.ville = ville;
		this.codePostal = codePostal;
	}
	
	@Override
	public String toString() {
		return "Adresse [numero=" + numero + ", rue=" + rue + ", ville=" + ville + ", codePostal=" + codePostal + "]";
	}

	/** Getter
	 * @return the numero
	 */
	public Integer getNumero() {
		return numero;
	}

	/** Setter
	 * @param numero the numero to set
	 */
	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	/** Getter
	 * @return the rue
	 */
	public String getRue() {
		return rue;
	}

	/** Setter
	 * @param rue the rue to set
	 */
	public void setRue(String rue) {
		this.rue = rue;
	}

	/** Getter
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}

	/** Setter
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

	/** Getter
	 * @return the codePostal
	 */
	public String getCodePostal() {
		return codePostal;
	}

	/** Setter
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}	
}