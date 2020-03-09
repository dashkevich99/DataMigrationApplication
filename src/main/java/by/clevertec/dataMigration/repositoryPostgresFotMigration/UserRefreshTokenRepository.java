package by.clevertec.dataMigration.repositoryPostgresFotMigration;

import by.clevertec.dataMigration.dataPostgresFotMigration.UserRefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRefreshTokenRepository extends JpaRepository<UserRefreshToken, Long> {

}
