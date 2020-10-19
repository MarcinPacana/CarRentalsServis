package encje;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;


@Setter
@Getter
@Entity
@Table(name = "rezerwacje")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;

    @Column(name = "nazwa_rezerwacji")
    private String nameReservation;

    @Column(name = "od")
    private LocalDate from_date;

    @Column(name = "do")
    private LocalDate to_date;

    @ManyToOne
    @JoinColumn(name = "id_car_fk")
    private Car car;

    @ManyToOne
    @JoinColumn(name = "id_user_fk")
    private User user;


}
