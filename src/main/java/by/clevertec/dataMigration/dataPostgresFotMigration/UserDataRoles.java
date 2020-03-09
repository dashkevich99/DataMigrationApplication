package by.clevertec.dataMigration.dataPostgresFotMigration;

import by.clevertec.dataMigration.dataPostgresFotMigration.id.UserDataRolesId;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
@Table(name = "user_data_roles")
@IdClass(UserDataRolesId.class)
public class UserDataRoles implements Serializable {
    @Column(name = "user_user_id")
    @Id
    private String userUserId;

    @Column (name = "roles_role_id")
    @Id
    private Integer roleRoleId;

    public UserDataRoles(String userUserId, Integer roleRoleId) {
        this.userUserId = userUserId;
        this.roleRoleId = roleRoleId;
    }
}
