package tn.esprit.marambouzadi4cce2.domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

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
    @ToString.Exclude
    @Builder.Default
    Set<Equipement> equipements = new HashSet<>();
}
