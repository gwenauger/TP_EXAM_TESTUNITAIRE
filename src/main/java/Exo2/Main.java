package Exo2;
import java.time.LocalDateTime;
import Exo2.ReservationTest;


public class Main {
    public static void main(String[] args){
        ReservationTest res = new ReservationTest();
        //System.out.println("Réservation normale sans erreur");
        //res.testReservationValid();
        //System.out.println("Réservation avec Medecin invalide");
        //res.testReservationMedecinIdInvalid();
        //System.out.println("Réservation avec Patient invalide");
        //res.testReservationPatientIdInvalid();
        System.out.println("Réservation avec Date invalide");
        res.testReservationDateIndisponible();

    }

}