package Exo2;
import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDateTime;

public class ReservationTest {
    @Test
    public void testReservationValid() {

        Medecin medecin = new Medecin(1, "Dr. Dupont", 3);
        Patient patient = new Patient(1, "John Doe");
        LocalDateTime date = LocalDateTime.of(2023, 7, 4, 10, 0, 0);
        Reservation reservation = new Reservation(patient, medecin, date);

        assertTrue(reservation.reserver());
        // assertEquals(true,reservation.reserver()); You could use both
    }

    @Test
    public void testReservationPatientIdInvalid() {
        Patient patient = new Patient(-1, "John Doe");
        Medecin medecin = new Medecin(1, "Dr. Dupont", 3);
        LocalDateTime date = LocalDateTime.of(2023, 7, 4, 10, 0, 0);
        Reservation reservation = new Reservation(patient, medecin, date);

        assertFalse(reservation.reserver());
        // assertEquals(false,reservation.reserver()); You could use both
    }

    @Test
    public void testReservationMedecinIdInvalid() {
        Patient patient = new Patient(1, "John Doe");
        Medecin medecin = new Medecin(-1, "Dr. Dupont", 3);
        LocalDateTime date = LocalDateTime.of(2023, 7, 4, 10, 0, 0);
        Reservation reservation = new Reservation(patient, medecin, date);

        assertFalse(reservation.reserver());
        // assertEquals(false,reservation.reserver()); You could use both
    }

    @Test
    public void testReservationDateIndisponible() {

        Medecin medecin = new Medecin(1, "Dr. Dupont", 3);
        Patient patient = new Patient(1, "John Doe");

        LocalDateTime date = LocalDateTime.of(2023, 7, 4, 10, 0, 0);
        Reservation reservation = new Reservation(patient, medecin, date);
        assertFalse(reservation.reserver());
    }
}
