package HW3;

public class TestEmployeeCard {

    public static void testEmployeeCard(String name, double effective, double salary, boolean isWoman) {
        EmployeeCard employeeCard = new EmployeeCard(name,effective,salary,isWoman);
        System.out.println (employeeCard.toString());




    }

}
