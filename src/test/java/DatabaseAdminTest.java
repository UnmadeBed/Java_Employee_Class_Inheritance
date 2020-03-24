import Techstaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Kathy", 987654321, 45000.00 );
    }

    @Test
    public void canGetNInumber() {
        assertEquals(987654321, databaseAdmin.getNInumber());
    }

    @Test
    public void canGetName() {
        assertEquals("Kathy", databaseAdmin.getName());
    }


    @Test
    public void CanRaiseSalary() {
        databaseAdmin.raiseSalary(500.00);
        assertEquals(45500.00, databaseAdmin.getSalary(), 00.00);
    }

    @Test
    public void canPayBonus() {
        databaseAdmin.payBonus();
        assertEquals(450.00, databaseAdmin.payBonus(), 00.00);
    }
}
