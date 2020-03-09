package by.clevertec.dataMigration.repositoryPostgresFotMigration;

import by.clevertec.dataMigration.dataPostgresFotMigration.ImageInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImageInfoRepository extends JpaRepository<ImageInfo, Long> {
    List<ImageInfo> findByImgUrl (String imageInfo);
}