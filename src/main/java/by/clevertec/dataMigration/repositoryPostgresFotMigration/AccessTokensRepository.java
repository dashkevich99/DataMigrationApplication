package by.clevertec.dataMigration.repositoryPostgresFotMigration;

import by.clevertec.dataMigration.dataPostgresFotMigration.AccessTokens;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccessTokensRepository extends JpaRepository<AccessTokens, Long> {
    List<AccessTokens> findByTokenValue (String accessTokens);
}