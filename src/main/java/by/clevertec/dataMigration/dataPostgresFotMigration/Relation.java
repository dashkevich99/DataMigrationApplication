package by.clevertec.dataMigration.dataPostgresFotMigration;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;

@Data
@NoArgsConstructor
@Entity
@Table(name = "relation")
public class Relation {

    public Relation(String type, String targetProfileId, String userProfileId) {
        this.type = type;
        this.targetProfileId = targetProfileId;
        this.userProfileId = userProfileId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private BigInteger id;

    @Column (name = "type")
    private String type;

    @Column (name = "target_profile_id")
    private String targetProfileId;

    @Column (name = "user_profile_id")
    private String userProfileId;
}
