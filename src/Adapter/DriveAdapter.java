package Adapter;

public class DriveAdapter {
    public static void main(String[] args) {
        YourApplicationPaymentSystem yourApplicationPaymentSystem=new YourApplicationPaymentSystem();
        ThirdPartyPaymentSystem thirdPartyPaymentSystem=new ThirdPartyPaymentSystem();

        paymentAdapter adapter=new PaymentAdapt(yourApplicationPaymentSystem, thirdPartyPaymentSystem);
        adapter.callPayment();

    }
}
