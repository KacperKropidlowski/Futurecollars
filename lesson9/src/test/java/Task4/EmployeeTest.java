package Task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EmployeeTest {

    @Test
    void shouldRetrieveEmployeeDescription() {
        //given
        Employee employee = new Employee("John", "Smith");
        //when
        String actualEmployeeInfo = employee.getEmployeeInfo();
        //then
        Assertions.assertNotNull(actualEmployeeInfo);
        Assertions.assertEquals("Employee name : John Smith", actualEmployeeInfo);
    }

    @Test
    void shouldRetrieveEmployeeDetailsWithAge() {
        //given
        Employee employee = new Employee("John", "Smith", 45);
        //when
        String actualEmployeeDetails = employee.getEmployeeDetails();
        //then
        Assertions.assertNotNull(actualEmployeeDetails);
        Assertions.assertEquals("Employee details : John Smith is 45", actualEmployeeDetails);
    }


    @Test
    void shouldRetrieveBaseSalary() {
        //given
        Employee employee = new Employee("John", "Smith", 45, 3000);
        //when
        double actualBaseSalary = employee.getBaseSalary();
        //then
        Assertions.assertEquals(3000, actualBaseSalary);
    }


    @Test
    void shouldRetrieveBaseSalaryWithBonus() {
        //given
        Employee employee = new Employee("John", "Smith", 45, 3000, 500);
        //when
        double actualTotalSalary = employee.getTotalSalary();
        //then
        Assertions.assertEquals(3500, actualTotalSalary);
    }

    @Test
    void shouldRetrieveEmployeeBonus() {
        //given

        Employee employee = new Employee("John", "Smith", 45, 3000, 500);
        //when
        double actualBonus = employee.getBonus();
        //then
        Assertions.assertEquals(500, actualBonus);
    }

}