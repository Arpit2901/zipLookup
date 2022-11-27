

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.bhavana.beans.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/com/bhavana/resources/my_bean_configuration.xml")
public class TestEmployee {
	@Autowired
	private Employee employee;
	public TestEmployee() {
		System.out.println("In Constructor");
	}
	@Test
	public void testEmployee1() {
		System.out.println("In Test employee 1");
		System.out.println(employee);
		assertTrue(employee!=null);
	}
	//@DirtiesContext
	@Test
	public void testEmployee2() {
		System.out.println("In Test employee 2" + employee.getSalary());
		System.out.println(employee);
		assertTrue(employee.getSalary()==60);
	}
}
