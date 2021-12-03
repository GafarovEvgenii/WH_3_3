public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double monthPaymentThreeYears = service.calculate (1000000,1);
        System.out.println(monthPaymentThreeYears);

        double monthPaymentTwoYears = service.calculate (1000000,2);
        System.out.println(monthPaymentTwoYears);

        double monthPaymentOneYears = service.calculate (1000000,3);
        System.out.println(monthPaymentOneYears);


    }
}
