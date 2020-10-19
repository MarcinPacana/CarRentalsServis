package encje;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "adresy")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_adres")
    private Long idAddress;

    @Column(name = "miasto")
    private String city;

    @Column(name = "kod_pocztowy")
    private int zipCode;

    @Column(name = "ulica")
    private String street;

    @Column(name = "numer_domu")
    private String houseNumber;

    @Column(name = "numer_mieszkania")
    private String apartmentNumber;

    @OneToOne(mappedBy = "address", cascade = CascadeType.ALL)
    private User user;
}
