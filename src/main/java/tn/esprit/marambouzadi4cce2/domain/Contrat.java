package tn.esprit.marambouzadi4cce2.domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Set;

@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Contrat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idContrat;
    LocalDate dateSignature;
    BigDecimal montantTotal;
    boolean valide;

    @OneToOne(mappedBy = "contrat")
    Reservation reservations;
    @OneToMany(mappedBy = "contrat", cascade = CascadeType.ALL)
    Set<Paiement> paiement;




}