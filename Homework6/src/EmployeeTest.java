import org.junit.*;
import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    private Employee e;

    @Before
    public void setupEmployee() {
        e = new Employee("Martina", "Oleksiuk", 2, 1000);
    }

    @Test
    public void testRaiseSalary() {
        System.out.print("Test expected salary raise");
        assertEquals(1100, e.raiseSalary(), 0);
    }

    @Test
    public void testSalaryWithDaysOff() {
        System.out.print("Test salary with day offs");
        assertEquals(868, e.salaryWithDaysOff(4), 0);
    }

}
