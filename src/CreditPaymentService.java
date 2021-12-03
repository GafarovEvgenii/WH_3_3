public class CreditPaymentService {
    public double calculate(double amount , double period) {
        double precent = 9.99;
        double time = (-period * 12);
        double a = (1+((precent/(12*100))));

        double monthPayment = amount*((precent/(12*100))/(1-(Math.pow (a, time))));
        int monthPaymentTotal= (int) monthPayment;
        return monthPaymentTotal;

    }


}
