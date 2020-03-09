package by.clevertec.dataMigration.dataPostgresFotMigration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user_data")
public class UserData {
    @Id
    @Column(name = "user_id")
    private String userId;

    @Column (name = "email")
    private String email;

    @Column (name = "email_verified")
    private Boolean emailVerified;

    @Column (name = "img_url")
    private String imgUrl;

    @Column (name = "full_name")
    private String fullName;

    @NonNull
    @Column (name = "registration_status_id")
    private Integer registrationStatusId;
}
