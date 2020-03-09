package by.clevertec.dataMigration.repositoryPostgresFotMigration;

import by.clevertec.dataMigration.dataPostgresFotMigration.BikeTypes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BikeTypesRepository extends JpaRepository<BikeTypes, Long> {
    List<BikeTypes> findByBikeType (String bikeType);
}