/** Package contenant les entités */
package fr.diginamic.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/** Entité mère AbstractOperation  */
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class AbstractOperation {
	
	/** id */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	/** date */
	@Temporal(TemporalType.DATE)
	@Column(name="DATE")
	private Date date;
	
	/** montant */
	@Column(name = "MONTANT", nullable = false)
	private double montant;
	
	
	/** motif */
	@Column(name = "MOTIF")
	private String motif;
	
	/** Constructeur
	 * 
	 */
	public AbstractOperation() {
	}


	@Override
	public String toString() {
		return "AbstractOperation [id=" + id + ", date=" + date + ", montant=" + montant + ", motif=" + motif + "]";
	}


	/** Getter
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}


	/** Getter
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}


	/** Getter
	 * @return the montant
	 */
	public double getMontant() {
		return montant;
	}


	/** Getter
	 * @return the motif
	 */
	public String getMotif() {
		return motif;
	}


	/** Setter
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}


	/** Setter
	 * @param montant the montant to set
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}


	/** Setter
	 * @param motif the motif to set
	 */
	public void setMotif(String motif) {
		this.motif = motif;
	}
}