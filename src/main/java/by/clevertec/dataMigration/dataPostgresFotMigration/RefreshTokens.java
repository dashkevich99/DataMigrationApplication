package by.clevertec.dataMigration.dataPostgresFotMigration;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@NoArgsConstructor

@Entity
@Table(name = "refresh_tokens")
public class RefreshTokens {
    @Id
    @Column(name = "token_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer tokenId;

    @Column (name = "expires_at")
    private Timestamp expiresAt;

    @Column (name = "issued_at")
    private Timestamp issuedAt;

    @Column (name = "token_value")
    private String tokenValue;

    public RefreshTokens(Timestamp expiresAt, Timestamp issuedAt, String tokenValue) {
        this.expiresAt = expiresAt;
        this.issuedAt = issuedAt;
        this.tokenValue = tokenValue;
    }
}
