package tn.esprit.marambouzadi4cce2.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long idAgence;
     String nom;
     String ville;
     String adresse;
     String telephone;
}

