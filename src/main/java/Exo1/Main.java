package Exo1;
import Exo1.PaymentIntegrationTest;


public class Main {
    public static void main(String[] args) {
        PaymentIntegrationTest make_test = new PaymentIntegrationTest();
        //System.out.println("TEST DE PAIEMENT VALIDE");
        //make_test.paiementGoinWell();

        //System.out.println("TEST DE PAIEMENT INVALIDE ==> CVV");
        //make_test.testCreditCardCVVError();
        System.out.println("TEST DE PAIEMENT INVALIDE ==> MONTANT INVALIDE");
        make_test.testAmountError();
        //System.out.println("TEST DE PAIEMENT INVALIDE ==> NUM CARTE");
        //make_test.testCreditCardNumberError();

    }

}