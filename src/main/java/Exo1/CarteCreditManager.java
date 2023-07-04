package Exo1;

public class CarteCreditManager {

    public CarteCreditManager(){
        // ... DO NOTHING HERE
    }

    public Boolean verifyCard( String numCarte,  String cvv){
        // Props
        Boolean is_number_valid =  numCarte.length() == 16 ? true : false; // C'est une ternaire quoi vrai ou faux si cond respectée
        Boolean is_cvv_valid    =  cvv.length() == 3 ? true : false; // C'est une ternaire quoi vrai ou faux si cond respectée

        if(!is_cvv_valid && !is_number_valid) {
            System.out.println("Les informations de votre carte sont éronnées");
            return false;
        }else if(!is_cvv_valid) {
            System.out.println("Votre CVV est invalide");
            return false;
        }
        else if(!is_number_valid) {
            System.out.println("Votre numéro de carte est invalide");
            return false;
        } else if (is_cvv_valid && is_number_valid) {
            System.out.println("Veuillez ne pas quitter cette fenêtre paiement en cours");
            return true;
        }

        return false;
    }
}
