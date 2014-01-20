package at.haas.reparaturcenter.domain;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class ReparaturConstructorTest {
	private int rId;
    
    private double preis;

    private double selbstkosten;
    
    private Date eingangsdatum;
    
    private Date retourgabedatum;
    
    private int reparaturen;
    
    private int services;
    
    private Kunde kunde;
    
    private Mitarbeiter mitarbeiter;
    
    private Automarke automarke;

    public ReparaturConstructorTest(int rId, double preis, double selbstkosten, Date eingangsdatum,
								Date retourgabedatum, int reparaturen, int services, Kunde kunde,
								Mitarbeiter mitarbeiter, Automarke automarke){
        this.rId = rId;
        this.preis = preis;
        this.selbstkosten = selbstkosten;
        this.eingangsdatum = eingangsdatum;
        this.retourgabedatum = retourgabedatum;
        this.reparaturen = reparaturen;
        this.services = services;
        this.kunde = kunde;
        this.mitarbeiter = mitarbeiter;
        this.automarke = automarke;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
    	Kunde k = new Kunde (0, "name", "adresse", 1010, true);
    	Mitarbeiter m = new Mitarbeiter (0, "name", 3000.0, "Motor");
    	Automarke a = new Automarke("Dodge", "Chrysler Group", 1950);
        Object[][] data = new Object[][]{ //
                {0,1000.0, 100.0, null, new Date(), 2, 2, k, m, a},
                {0,1000.0, 100.0, new Date(), null, 2, 2, k, m, a},
                {0,1000.0, 100.0, new Date(), new Date(), 2, 2, null, m, a},
                {0,1000.0, 100.0, new Date(), new Date(), 2, 2, k, null, a},
                {0,1000.0, 100.0, new Date(), new Date(), 2, 2, k, m, null}};
        return Arrays.asList(data);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenCreatingWithNullArguments() {
        new Reparatur(rId, preis, selbstkosten, eingangsdatum, retourgabedatum, reparaturen,
        			services, kunde, mitarbeiter, automarke);
    }
}
