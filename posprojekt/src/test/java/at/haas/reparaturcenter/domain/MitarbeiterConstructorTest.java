package at.haas.reparaturcenter.domain;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import at.haas.reparaturcenter.domain.Mitarbeiter;

@RunWith(value = Parameterized.class)
public class MitarbeiterConstructorTest {
	private int mId;
    
    private String name;

    private double lohn;
    
    private String spezialisierung;

    public MitarbeiterConstructorTest(int mId, String name, double lohn, String spezialisierung) {
        this.mId = mId;
        this.name = name;
        this.lohn = lohn;
        this.spezialisierung = spezialisierung;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{ //
                {0,"Name", 100.0, ""}, //
                {0, "", 100.0, "Spezialisierung"},
                {0, null, 100.0, "Spezialisierung"},
                {0, "Name", 100.0, null}};
        return Arrays.asList(data);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenCreatingWithNullArguments() {
        new Mitarbeiter(mId, name, lohn, spezialisierung);
    }
}
