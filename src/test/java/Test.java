import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;

public class Test {

    @org.junit.jupiter.api.Test
    public void Test_Search(){
        Employee employee1 = new Employee("Ivanov", "Ivan", 23, "m", "bachelor", "engineer", "34");
        Employee employee2 = new Employee("Petrov", "Igor", 54, "m", "master", "analyst", "21");
        Employee employee3 = new Employee("Romashkova", "Nina", 63, "f", "master", "secretary", "5");

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        int expected = Main.searchBySurname("Romashkova", "Nina", employees);
        int actual = 2;

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public  void Test_delete(){
        Employee employee1 = new Employee("Ivanov", "Ivan", 23, "m", "bachelor", "engineer", "34");
        Employee employee2 = new Employee("Petrov", "Igor", 54, "m", "master", "analyst", "21");
        Employee employee3 = new Employee("Romashkova", "Nina", 63, "f", "master", "secretary", "5");

        List<Employee> actual = new ArrayList<>();
        actual.add(employee1);
        actual.add(employee3);

        List<Employee> expected = new ArrayList<>();
        expected.add(employee1);
        expected.add(employee2);
        expected.add(employee3);
        Main.deleteEmployee(expected, 1);
        Assertions.assertEquals(expected, actual);
    }


}
