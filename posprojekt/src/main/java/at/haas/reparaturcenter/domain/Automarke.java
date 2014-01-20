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
@Table(name = "automarke")
public class Automarke extends BasePersistable {
	
	private static final long serialVersionUID = 1L;

	@Size(max = 30)
	@NotNull
    @Column(name = "marke", nullable = false, length = 30)
	private String marke;
	
	@Size(max = 30)
	@NotNull
    @Column(name = "gruppe", nullable = false, length = 30)
	private String gruppe;
	
	@NotNull
    @Column(name = "anfangsjahrgang", nullable = false)
	private int anfangsjahrgang;
	
	@OneToMany(targetEntity=Reparatur.class, mappedBy="automarke")
	private Collection<Reparatur> reparaturen;
	
	protected Automarke() {
        // required for JPA
    }
	
	public Automarke(String marke, String gruppe, int anfangsjahrgang){
		Ensure.notEmpty("marke", marke);
		Ensure.notEmpty("gruppe", gruppe);
		setMarke(marke);
		setGruppe(gruppe);
		setAnfangsjahrgang(anfangsjahrgang);
		this.reparaturen = new ArrayList<Reparatur>();
	}

	public String getMarke() {
		return marke;
	}

	public void setMarke(String marke) {
		this.marke = marke;
	}

	public String getGruppe() {
		return gruppe;
	}

	public void setGruppe(String gruppe) {
		this.gruppe = gruppe;
	}

	public int getAnfangsjahrgang() {
		return anfangsjahrgang;
	}

	public void setAnfangsjahrgang(int anfangsjahrgang) {
		this.anfangsjahrgang = anfangsjahrgang;
	}
}
