package tn.esprit.marambouzadi4cce2.domain;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

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
     @OneToMany(mappedBy = "agence")
     List<Vehicule> vehicules;
     @OneToMany(mappedBy = "agence")
     List<Employe> employes;
}

