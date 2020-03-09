package by.clevertec.dataMigration.dataPostgresFotMigration.id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ProfileBikesId implements Serializable {
    private String profileProfileId;
    private Integer bikesId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProfileBikesId that = (ProfileBikesId) o;
        return Objects.equals(profileProfileId, that.profileProfileId) &&
                Objects.equals(bikesId, that.bikesId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(profileProfileId, bikesId);
    }
}
