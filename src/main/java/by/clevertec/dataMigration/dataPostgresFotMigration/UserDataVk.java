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
@Table(name = "user_data_vk")
public class UserDataVk {
    @Id
    @Column(name = "vk_page_id")
    private String vkPageId;

    @Column (name = "vk_email")
    @NonNull
    private String vkEmail;

    @Column (name = "vk_first_name")
    private String vkFirstName;

    @Column (name = "vkLastName")
    private String vkLastName;
}
