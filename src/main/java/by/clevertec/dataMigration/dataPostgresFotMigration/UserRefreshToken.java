package by.clevertec.dataMigration.dataPostgresFotMigration;

import by.clevertec.dataMigration.dataPostgresFotMigration.id.UserRefreshTokenId;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
@Table(name = "user_refresh_token")
@IdClass(UserRefreshTokenId.class)
public class UserRefreshToken implements Serializable {
    @Column(name = "user_user_id")
    @Id
    private String userUserId;

    @Column (name = "refresh_token_id")
    @Id
    private Integer refreshTokenId;

    public UserRefreshToken(String userUserId, Integer refreshTokenId) {
        this.userUserId = userUserId;
        this.refreshTokenId = refreshTokenId;
    }
}
