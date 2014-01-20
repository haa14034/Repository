package at.haas.reparaturcenter.domain;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import at.haas.reparaturcenter.domain.Kunde;

@RunWith(value = Parameterized.class)
public class KundeConstructorTest {
	private int kId;

    private String adresse;
    
    private String name;

    private int plz;
    
    private boolean geschlecht;

    public KundeConstructorTest(int kId, String name, String adresse, int plz, boolean geschlecht) {
        this.kId = kId;
        this.name = name;
        this.adresse = adresse;
        this.plz = plz;
        this.geschlecht = geschlecht;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{ //
                {0,"Name", null, 0, true}, //
                {0, null, "Adresse", 0, false},
                {0, "", "Adresse", 0, false}};
        return Arrays.asList(data);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenCreatingWithNullArguments() {
        new Kunde(kId, name, adresse, plz, geschlecht);
    }
}
