package by.clevertec.dataMigration.dataPostgresFotMigration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "profile")
public class Profile {
    @Id
    @Column(name = "profile_id")
    private String profileId;

    @Column (name = "firebase_token")
    private String firebaseToken;

    @Column (name = "birth_date")
    private BigInteger birthDate;

    @Column (name = "first_name")
    private String firstName;

    @Column (name = "gender")
    private String gender;

    @Column (name = "height")
    private Double height;

    @Column (name = "last_name")
    private String lastName;

    @Column (name = "location")
    private String location;

    @Column (name = "weight")
    private Double weight;

    @Column (name = "image_id")
    private String imageId;

    @Column (name = "preview_image_id")
    private String previewImageId;

    @Column (name = "stats_uid")
    private BigInteger statsUid;
}
