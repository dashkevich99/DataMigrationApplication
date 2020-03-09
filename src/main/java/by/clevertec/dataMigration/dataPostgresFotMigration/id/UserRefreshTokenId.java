package by.clevertec.dataMigration.dataPostgresFotMigration.id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRefreshTokenId implements Serializable {
    private String userUserId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserRefreshTokenId that = (UserRefreshTokenId) o;
        return Objects.equals(userUserId, that.userUserId) &&
                Objects.equals(refreshTokenId, that.refreshTokenId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userUserId, refreshTokenId);
    }

    private Integer refreshTokenId;
}
