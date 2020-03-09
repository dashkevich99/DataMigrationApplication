package by.clevertec.dataMigration.dataPostgresFotMigration.id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDataRolesId implements Serializable {
    private String userUserId;
    private Integer roleRoleId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDataRolesId that = (UserDataRolesId) o;
        return Objects.equals(userUserId, that.userUserId) &&
                Objects.equals(roleRoleId, that.roleRoleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userUserId, roleRoleId);
    }
}
