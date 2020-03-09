package by.clevertec.dataMigration.repositoryPostgresFotMigration;

import by.clevertec.dataMigration.dataPostgresFotMigration.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {}