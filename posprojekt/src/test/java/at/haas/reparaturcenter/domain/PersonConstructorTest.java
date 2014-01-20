package at.haas.reparaturcenter.domain;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import at.haas.reparaturcenter.domain.Person;

@RunWith(value = Parameterized.class)
public class PersonConstructorTest {
    private String name;

    public PersonConstructorTest(String name) {
        this.name = name;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{ //
                {null},
                {""}//
                };
        return Arrays.asList(data);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenCreatingWithNullArguments() {
        new Person(name);
    }
}
