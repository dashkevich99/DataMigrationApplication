package by.clevertec.dataMigration.repositoryPostgresFotMigration;

import by.clevertec.dataMigration.dataPostgresFotMigration.RegistrationStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegistrationStatusRepository extends JpaRepository<RegistrationStatus, Long> {
    List<RegistrationStatus> findByStatus(String status);
}