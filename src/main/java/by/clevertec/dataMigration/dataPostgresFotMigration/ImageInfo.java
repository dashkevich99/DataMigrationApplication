package by.clevertec.dataMigration.dataPostgresFotMigration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "image_info")
public class ImageInfo {
    @Id
    @Column (name = "id")
    private String id;

    @Column (name = "img_url")
    private String imgUrl;
}
