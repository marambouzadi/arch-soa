package tn.esprit.marambouzadi4cce2.domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;
import java.util.List;


@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idVehicule;
    String immatriculation ;
    String marque;
    String modele;
    @Enumerated(value = EnumType.STRING)
    CategorieVehiculoe catégorie;
    BigDecimal tarifJournalier;
    @Enumerated(value = EnumType.STRING)
    StatutVehicule statut;
    @ManyToOne
    Agence agence;
    @ManyToMany
    Set<Equipement> equipement;
    @OneToMany(mappedBy = "vehicule")
    List<Reservation> reservation;

}
