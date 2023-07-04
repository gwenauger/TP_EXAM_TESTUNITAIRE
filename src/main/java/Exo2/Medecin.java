package Exo2;
import java.time.LocalDateTime;

public class Medecin {
    public int pk_id;
    public String name;
    public int limit_reservation;

    public Medecin(int pk_id, String name, int limit_reservation) {
        this.pk_id = pk_id;
        this.name = name;
        this.limit_reservation = limit_reservation;
    }
}