package Exo1;
import Exo1.PaymentGateway;
import Exo1.CarteCreditManager;
import Exo1.PaymentProcessor;
import org.junit.*;
import static org.junit.Assert.assertEquals;

public class PaymentIntegrationTest {

    @Test
    public void paiementGoinWell(){ // Le nom de fonction commente ce qu'elle fait
        // Test if paiement is going well and see if it return true
        PaymentProcessor do_payment = new PaymentProcessor();
        assertEquals(true, do_payment.processPayment(69.00,"0123456789123456","420"));
    }

    @Test
    public void testCreditCardCVVError(){ // Le nom de fonction commente ce qu'elle fait
        // Make a CVV error and see if return is
        PaymentProcessor do_payment = new PaymentProcessor();
        assertEquals(false, do_payment.processPayment(69.00,"0123456789123456","42"));
    }

    @Test
    public void testCreditCardNumberError(){ // Le nom de fonction commente ce qu'elle fait
        // Make a CARD NUMBER error and see if return is
        PaymentProcessor do_payment = new PaymentProcessor();
        assertEquals(false, do_payment.processPayment(69.00,"012345678912346","420"));
    }

    @Test
    public void testAmountError(){ // Le nom de fonction commente ce qu'elle fait
        // Amount error
        PaymentProcessor do_payment = new PaymentProcessor();
        assertEquals(false, do_payment.processPayment(-69.00,"0123456782912346","420"));
    }
}
