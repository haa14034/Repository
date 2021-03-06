package at.haas.reparaturcenter.domain;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import at.haas.reparaturcenter.ensure.Ensure;

@Entity
@Table(name = "mitarbeiter")
public class Mitarbeiter extends Person{
	
	private static final long serialVersionUID = 1L;

	@NotNull
    @Column(name = "mId", nullable = false)
	private int mId;
	
	@NotNull
    @Column(name = "lohn", nullable = false)
	private double lohn;
	
	@Size(max = 30)
	@NotNull
    @Column(name = "spezialisierung", nullable = false, length = 30)
	private String spezialisierung;
	
	@OneToMany(targetEntity=Reparatur.class, mappedBy="mitarbeiter")
	private Collection<Reparatur> reparaturen;
	
	protected Mitarbeiter() {
        // required for JPA
    }
	
	public Mitarbeiter(int mId, String name, double lohn, String spezialisierung){
		super(name);
		Ensure.notEmpty("name", name);
		Ensure.notEmpty("spezialisierung", spezialisierung);
		setMId(mId);
		setLohn(lohn);
		setSpezialisierung(spezialisierung);
		this.reparaturen = new ArrayList<Reparatur>();
	}

	public int getMId() {
		return mId;
	}

	public void setMId(int mId) {
		this.mId = mId;
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
