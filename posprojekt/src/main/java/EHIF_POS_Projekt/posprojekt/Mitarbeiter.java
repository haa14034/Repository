package EHIF_POS_Projekt.posprojekt;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "mitarbeiter")
public class Mitarbeiter extends Person{
	
	private static final long serialVersionUID = 1L;

	@NotNull
    @Column(name = "mid", nullable = false)
	private int mid;
	
	@NotNull
    @Column(name = "lohn", nullable = false)
	private double lohn;
	
	@Size(max = 30)
	@NotNull
    @Column(name = "spezialisierung", nullable = false, length = 30)
	private String spezialisierung;
	
	@OneToMany(targetEntity=Reparatur.class, mappedBy="mitarbeiter")
	private Collection<Reparatur> reparaturen;
	
	public Mitarbeiter(int mid, String name, double lohn, String spezialisierung){
		super(name);
		setMid(mid);
		setLohn(lohn);
		setSpezialisierung(spezialisierung);
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public double getLohn() {
		return lohn;
	}

	public void setLohn(double lohn) {
		this.lohn = lohn;
	}

	public String getSpezialisierung() {
		return spezialisierung;
	}

	public void setSpezialisierung(String spezialisierung) {
		this.spezialisierung = spezialisierung;
	}
}
