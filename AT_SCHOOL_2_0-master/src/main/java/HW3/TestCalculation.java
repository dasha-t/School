package HW3;

public class TestCalculation {
    public static void testDiscount (double salary){
        Calculation calculation= new Calculation();
         calculation.discount(salary);
         System.out.println();
    }
    public static double testCountTicketPrice(int ticketPrice, double discount){
        Calculation calculation1= new Calculation();
        calculation1.countTicketPrice(ticketPrice,discount);
        System.out.println(ticketPrice-discount);
        return ticketPrice - discount;
    }
}
