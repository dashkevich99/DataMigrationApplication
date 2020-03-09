package by.clevertec.dataMigration.repositoryPostgresFotMigration;

import by.clevertec.dataMigration.dataPostgresFotMigration.RefreshTokens;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RefreshTokensRepository extends JpaRepository<RefreshTokens, Long> {
    List<RefreshTokens> findByTokenValue (String refreshTokens);
}
