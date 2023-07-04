package Exo1;
import Exo1.PaymentGateway;
import Exo1.CarteCreditManager;

public class PaymentProcessor {
    public PaymentProcessor(){
        // ... DO NOTHING HERE
    }

    public Boolean processPayment(Double montant, String numCart, String cvv){
        // -- Create differents managers
        CarteCreditManager card_manager = new CarteCreditManager();
        Boolean is_card_valid = card_manager.verifyCard(numCart, cvv);

        if(montant < 0 || montant == 0){
            System.out.println("Oh frérot c'est pas un montant valable tu essaies de me douiller je vais te retrouver");
            return false;
        }

        if( is_card_valid ){
            PaymentGateway payment_gateway = new PaymentGateway();
            String transac_id = payment_gateway.makePayment(montant);
            System.out.println("Votre paiement a été pris en compte voici votre identifiant de transaction : "+transac_id);
            return true;
        }else{
            System.out.println("Votre carte n'est pas valide échec de la transaction");
            return false;
        }

    }
}
