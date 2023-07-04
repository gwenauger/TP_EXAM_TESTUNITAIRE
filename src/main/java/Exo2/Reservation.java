package Exo2;
import java.time.LocalDateTime;

public class Reservation {
    private Patient patient;
    private Medecin medecin;
    private LocalDateTime date;

    public Reservation(Patient patient, Medecin medecin, LocalDateTime date) {
        this.patient = patient;
        this.medecin = medecin;
        this.date    = date;
    }

    public boolean reserver() {
        if(this.date instanceof LocalDateTime == false ) {
            System.out.println("La date n'est pas valide");
            return false;
        }
        if(this.date.getHour() >= 20 ) {
            System.out.println("La date voulue n'est pas disponible");
            return false;
        }
        if ( !isValidPatient() && !isValidMedecin()) {
            System.out.println("Le médecin et le patient n'exsite pas");
            return false;
        }else if( !isValidPatient() && isValidMedecin()){
            System.out.println("Le patient n'exsite pas");
            return false;
        }else if( isValidPatient() && !isValidMedecin()){
            System.out.println("Le médecin n'exsite pas");
            return false;
        }
        System.out.println("Le réservation c'est bien passé");
        return true;
    }

    private boolean isValidPatient() {
        return this.patient.pk_id > 0;
    }

    private boolean isValidMedecin() {

        Boolean retrn  = this.medecin.pk_id > 0 ? true : false;
        return  retrn;
    }

}