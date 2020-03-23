package HW3;

public class Test {
    public static void main(String[]args){
        //test TestCalculation
        TestCalculation a = new TestCalculation();
        a.testDiscount(3);
        a.testDiscount(7);
        a.testDiscount(11);
        a.testDiscount(17);

        TestCalculation b = new TestCalculation();
        b.testCountTicketPrice(10,5);

        // Вывести несколько сотрудников с разнымии параметрами.
        // Используйте метод toString для вывода информации о работнике.
        // Пример: Имя работника - Антон. Его возраст - 28 лет. Его зарплата - 15.5 в час. Пол - мужской.

        TestEmployeeCard c = new TestEmployeeCard();
        c.testEmployeeCard("Антон",28,15.5, true);
        c.testEmployeeCard("Антон",28,15.5, false);

    }
}
