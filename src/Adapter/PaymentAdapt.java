package Adapter;

public class PaymentAdapt implements paymentAdapter{
    private YourApplicationPaymentSystem yourApplicationPaymentSystem;
    private ThirdPartyPaymentSystem thirdPartyPaymentSystem;


    public PaymentAdapt(YourApplicationPaymentSystem yourApplicationPaymentSystem, ThirdPartyPaymentSystem thirdPartyPaymentSystem) {
        this.yourApplicationPaymentSystem = yourApplicationPaymentSystem;
        this.thirdPartyPaymentSystem = thirdPartyPaymentSystem;
    }

    @Override
    public  void callPayment(){
        thirdPartyPaymentSystem.receivePayment();
    }

}
