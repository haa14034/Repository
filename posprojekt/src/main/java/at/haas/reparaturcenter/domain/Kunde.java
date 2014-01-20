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
@Table(name = "kunde")
public class Kunde extends Person{

	private static final long serialVersionUID = 1L;

	@NotNull
    @Column(name = "kId", nullable = false)
	private int kId;
	
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
	
	protected Kunde() {
        // required for JPA
    }
	
	public Kunde(int kId, String name, String adresse, int plz, boolean geschlecht){
		super(name);
		Ensure.notEmpty("name", name);
		Ensure.notEmpty("adresse", adresse);
		setKid(kId);
		setAdresse(adresse);
		setPlz(plz);
		setGeschlecht(geschlecht);
		this.reparaturen = new ArrayList<Reparatur>();
	}

	public int getKId() {
		return kId;
	}

	public void setKid(int kId) {
		this.kId = kId;
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
