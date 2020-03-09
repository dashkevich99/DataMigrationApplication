package by.clevertec.dataMigration.dataPostgresFotMigration;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@Entity
@Table(name = "registration_status")
public class RegistrationStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "registration_status_id")
    private Integer registrationStatusId;

    @Column (name = "status")
    @NotEmpty
    private String status;

    public RegistrationStatus(@NotEmpty String status) {
        this.status = status;
    }
}
