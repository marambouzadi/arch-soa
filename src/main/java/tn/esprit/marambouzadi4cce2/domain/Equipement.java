package tn.esprit.marambouzadi4cce2.domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.io.Serializable;
import java.util.Set;

@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Equipement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idEquipement;
    String libelle;
    @ManyToMany(mappedBy = "equipement")
    Set<Vehicule> vehicule;

}