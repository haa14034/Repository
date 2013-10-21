package EHIF_POS_Projekt.posprojekt;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "reparatur")
public class Reparatur extends BasePersistable{
	private static final long serialVersionUID;
	
	@NotNull
    @Column(name = "name", nullable = false)
	private int id;
	
	@NotNull
    @Column(name = "preis", nullable = false)
	private double preis;
	
	@NotNull
    @Column(name = "name", nullable = false)
	private double selbstkosten;
	
	@NotNull
    @Column(name = "eingangsdatum", nullable = false)
	private Date eingangsdatum;
	
	@NotNull
    @Column(name = "retourgabedatum", nullable = false)
	private Date retourgabedatum;
	
	@NotNull
    @Column(name = "reparaturen", nullable = false)
	private int reparaturen;
	
	@NotNull
    @Column(name = "services", nullable = false)
	private int services;
	
	@ManyToOne
	private Kunde kunde;
	
	@ManyToOne
	private Mitarbeiter mitarbeiter;
	
	@ManyToOne
	private Automarke automarke;
	
	public Reparatur(int id, double preis, double selbstkosten, Date eingangsdatum,
						Date retourgabedatum, int reparaturen, int services, Kunde kunde,
						Mitarbeiter mitarbeiter, Automarke automarke){
		setId(id);
		setPreis(preis);
		setSelbstkosten(selbstkosten);
		setEingangsdatum(eingangsdatum);
		setRetourgabedatum(retourgabedatum);
		setReparaturen(reparaturen);
		setServices(services);
		setKunde(kunde);
		setMitarbeiter(mitarbeiter);
		setAutomarke(automarke);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public double getSelbstkosten() {
		return selbstkosten;
	}

	public void setSelbstkosten(double selbstkosten) {
		this.selbstkosten = selbstkosten;
	}

	public Date getEingangsdatum() {
		return eingangsdatum;
	}

	public void setEingangsdatum(Date eingangsdatum) {
		this.eingangsdatum = eingangsdatum;
	}

	public Date getRetourgabedatum() {
		return retourgabedatum;
	}

	public void setRetourgabedatum(Date retourgabedatum) {
		this.retourgabedatum = retourgabedatum;
	}

	public int getReparaturen() {
		return reparaturen;
	}

	public void setReparaturen(int reparaturen) {
		this.reparaturen = reparaturen;
	}

	public int getServices() {
		return services;
	}

	public void setServices(int services) {
		this.services = services;
	}

	public Kunde getKunde() {
		return kunde;
	}

	public void setKunde(Kunde kunde) {
		this.kunde = kunde;
	}

	public Mitarbeiter getMitarbeiter() {
		return mitarbeiter;
	}

	public void setMitarbeiter(Mitarbeiter mitarbeiter) {
		this.mitarbeiter = mitarbeiter;
	}

	public Automarke getAutomarke() {
		return automarke;
	}

	public void setAutomarke(Automarke automarke) {
		this.automarke = automarke;
	}
}
