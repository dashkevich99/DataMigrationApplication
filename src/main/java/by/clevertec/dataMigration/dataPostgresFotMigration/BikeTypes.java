package by.clevertec.dataMigration.dataPostgresFotMigration;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@Entity
@Table(name = "bike_types")
public class BikeTypes {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column (name = "bike_type")
    @NotEmpty
    private String bikeType;

    public BikeTypes(@NotEmpty String bikeType) {
        this.bikeType = bikeType;
    }
}
