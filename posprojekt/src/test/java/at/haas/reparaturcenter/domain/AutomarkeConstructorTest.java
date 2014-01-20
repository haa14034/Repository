package at.haas.reparaturcenter.domain;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import at.haas.reparaturcenter.domain.Automarke;

@RunWith(value = Parameterized.class)
public class AutomarkeConstructorTest {
	private String marke;

    private String gruppe;

    private int anfangsjahrgang;

    public AutomarkeConstructorTest(String marke, String gruppe, int anfangsjahrgang) {
        this.marke = marke;
        this.gruppe = gruppe;
        this.anfangsjahrgang = anfangsjahrgang;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{ //
                {null, null, 0}, //
                {null, "GM", 0}, //
                {null, null, 1990}, //
                {"Chrysler Group", "", 1990}};
        return Arrays.asList(data);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenCreatingWithNullArguments() {
        new Automarke(marke, gruppe, anfangsjahrgang);
    }
}
