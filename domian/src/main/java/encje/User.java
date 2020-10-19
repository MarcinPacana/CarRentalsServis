package encje;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "urzytkownicy")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_urzytkownika")
    private Long idUser;

    @Column(name = "imie", nullable = false, length = 30)
    private String firstName;

    @Column(name = "nazwisko", nullable = false, length = 30)
    private String lastName;

    @Column(name = "data_urodzenia")
    private LocalDate birthOfDay;

    @Column(name = "mail",length = 50)
    private String mail;

    @Column(name = "haslo", length = 50)
    private String password;

    @Column(name = "urzytkownik_aktywny", nullable = false)
    private boolean isActive = false;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    @OneToMany(mappedBy = "user")
    private List<Reservation> userReservations = new ArrayList<>();



    public void addReserwation (Reservation reservation){
        userReservations.add(reservation);
        reservation.setUser(this);
    }

}
