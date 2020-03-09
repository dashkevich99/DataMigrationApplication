package by.clevertec.dataMigration.dataPostgresFotMigration;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@Entity
@Table(name = "role")
public class Role {
    @Id
    @Column(name = "role_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer roleId;

    @Column (name = "role")
    @NotEmpty
    private String role;

    public Role(@NotEmpty String role) {
        this.role = role;
    }
}

