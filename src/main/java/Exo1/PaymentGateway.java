package Exo1;
import java.util.UUID;

public class PaymentGateway {

    public PaymentGateway(){
        // ... DO NOTHING HERE
    }
    public String makePayment( double montant){
        String transac_id = UUID.randomUUID().toString();
        return transac_id;
    }
}
