package encje;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "samochody")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_car")
    private Long idCar;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "seats")
    private int seats;

    @Column(name = "trunk")
    private int trunk;

    private int szyby;

    @OneToMany(mappedBy = "car")
    private List<Reservation> carReservations = new ArrayList<>();


    public void addReservation(Reservation reservation) {
        carReservations.add(reservation);
        reservation.setCar(this);
    }
}
