import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Mike Mills", 123789456, 30000.00, "Homeware");
    }

    @Test
    public void canGetNInumber() {
        assertEquals(123789456, manager.getNInumber());
    }

    @Test
    public void canGetName() {
        assertEquals("Mike Mills", manager.getName());
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Homeware", manager.getDeptName());
    }

    @Test
    public void CanRaiseSalary() {
        manager.raiseSalary(500.00);
        assertEquals(30500.00, manager.getSalary(), 00.00);
    }

    @Test
    public void canPayBonus() {
        manager.payBonus();
        assertEquals(300.00, manager.payBonus(), 00.00);
    }
}
