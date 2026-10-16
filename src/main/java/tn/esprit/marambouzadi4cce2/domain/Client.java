package tn.esprit.marambouzadi4cce2.domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;


@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idClient;
    String nom;
    String prenom;
    String email;
    String telephone;
    String numPermis;
    LocalDate dateInscription;
    @OneToMany(mappedBy = "client")
    List<Reservation> reservation;
}