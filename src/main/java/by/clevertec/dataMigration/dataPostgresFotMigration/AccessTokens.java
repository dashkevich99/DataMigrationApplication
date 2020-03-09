package by.clevertec.dataMigration.dataPostgresFotMigration;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@Entity
@Table(name = "access_tokens")
public class AccessTokens {
    @Id
    @Column(name = "token_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private BigInteger tokenId;

    @Column (name = "expires_at")
    private Timestamp expiresAt;

    @Column (name = "issued_at")
    private Timestamp issuedAt;

    @Column (name = "token_value")
    private String tokenValue;

    @Column (name = "refresh_token_token_id")
    @NonNull
    private Integer refreshTokenTokenId;

    @Column (name = "subject_user_id")
    @NonNull
    private String subjectUserId;

    public AccessTokens(Timestamp expiresAt, Timestamp issuedAt, String tokenValue, @NonNull Integer refreshTokenTokenId, @NonNull String subjectUserId) {
        this.expiresAt = expiresAt;
        this.issuedAt = issuedAt;
        this.tokenValue = tokenValue;
        this.refreshTokenTokenId = refreshTokenTokenId;
        this.subjectUserId = subjectUserId;
    }

}
