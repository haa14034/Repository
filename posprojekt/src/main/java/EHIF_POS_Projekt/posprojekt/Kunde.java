package EHIF_POS_Projekt.posprojekt;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "kunde")
public class Kunde extends Person{

	private static final long serialVersionUID = 1L;

	@NotNull
    @Column(name = "kid", nullable = false)
	private int kid;
	
	@Size(max = 30)
	@NotNull
    @Column(name = "adresse", nullable = false, length = 30)
	private String adresse;
	
	@NotNull
    @Column(name = "plz", nullable = false)
	private int plz;
	
	@NotNull
    @Column(name = "geschlecht", nullable = false)
	private boolean geschlecht;
	
	@OneToMany(targetEntity=Reparatur.class, mappedBy="kunde")
	private Collection<Reparatur> reparaturen;
	
	public Kunde(int kid, String name, String adresse, int plz, boolean geschlecht){
		super(name);
		setKid(kid);
		setAdresse(adresse);
		setPlz(plz);
		setGeschlecht(geschlecht);
	}

	public int getKid() {
		return kid;
	}

	public void setKid(int kid) {
		this.kid = kid;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getPlz() {
		return plz;
	}

	public void setPlz(int plz) {
		this.plz = plz;
	}

	public boolean isGeschlecht() {
		return geschlecht;
	}

	public void setGeschlecht(boolean geschlecht) {
		this.geschlecht = geschlecht;
	}
}
