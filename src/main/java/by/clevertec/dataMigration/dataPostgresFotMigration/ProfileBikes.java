package by.clevertec.dataMigration.dataPostgresFotMigration;

import by.clevertec.dataMigration.dataPostgresFotMigration.id.ProfileBikesId;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor

@Entity
@Table(name = "profile_bikes")
@IdClass(ProfileBikesId.class)
public class ProfileBikes implements Serializable {
    @Id
    @Column(name = "profile_profile_id")
    private String profileProfileId;

    @Id
    @Column (name = "bikes_id")
    private Integer bikesId;

    public ProfileBikes(String profileProfileId, Integer bikesId) {
        this.profileProfileId = profileProfileId;
        this.bikesId = bikesId;
    }
}
