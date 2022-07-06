package Task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EmployeeBuilderVersionTest {

    @Test
    void shouldRetrieveEmployeeDescription() {
        //given
        EmployeeBuilderVersion employee = new EmployeeBuilderVersion.EmployeeBuilder("John", "Smith")
                .build();

        //when
        String actualEmployeeInfo = employee.getEmployeeInfo();

        //then
        Assertions.assertNotNull(actualEmployeeInfo);
        Assertions.assertEquals("Employee name : John Smith", actualEmployeeInfo);
    }

    @Test
    void shouldRetrieveEmployeeDetailsWithAge() {
        //given
        EmployeeBuilderVersion employee = new EmployeeBuilderVersion.EmployeeBuilder("John", "Smith")
                .age(45)
                .build();

        //when
        String actualEmployeeDetails = employee.getEmployeeDetails();

        //then
        Assertions.assertNotNull(actualEmployeeDetails);
        Assertions.assertEquals("Employee details : John Smith is 45", actualEmployeeDetails);
    }


    @Test
    void shouldRetrieveBaseSalary() {
        //given
        EmployeeBuilderVersion employee = new EmployeeBuilderVersion.EmployeeBuilder("John", "Smith")
                .age(45)
                .baseSalary(3000)
                .build();

        //when
        double actualBaseSalary = employee.getBaseSalary();

        //then
        Assertions.assertEquals(3000, actualBaseSalary);
    }


    @Test
    void shouldRetrieveBaseSalaryWithBonus() {
        //given
        EmployeeBuilderVersion employee = new EmployeeBuilderVersion.EmployeeBuilder("John", "Smith")
                .age(45)
                .baseSalary(3000)
                .bonus(500)
                .build();

        //when
        double actualTotalSalary = employee.getTotalSalary();

        //then
        Assertions.assertEquals(3500, actualTotalSalary);
    }

    @Test
    void shouldRetrieveEmployeeBonus() {
        //given
        EmployeeBuilderVersion employee = new EmployeeBuilderVersion.EmployeeBuilder("John", "Smith")
                .age(45)
                .baseSalary(3000)
                .bonus(500)
                .build();

        //when
        double actualBonus = employee.getBonus();

        //then
        Assertions.assertEquals(500, actualBonus);
    }


}