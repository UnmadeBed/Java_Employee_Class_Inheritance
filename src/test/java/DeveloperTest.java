import Techstaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Carlos", 123456789, 45000.00);
    }

    @Test
    public void canGetNInumber() {
        assertEquals(123456789, developer.getNInumber());
    }

    @Test
    public void canGetName() {
        assertEquals("Carlos", developer.getName());
    }


    @Test
    public void CanRaiseSalary() {
        developer.raiseSalary(500.00);
        assertEquals(45500.00, developer.getSalary(), 00.00);
    }

    @Test
    public void canPayBonus() {
        developer.payBonus();
        assertEquals(450.00, developer.payBonus(), 00.00);
    }
}
