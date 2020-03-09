package by.clevertec.dataMigration.repositoryPostgresFotMigration;

import by.clevertec.dataMigration.dataPostgresFotMigration.Relation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RelationRepository extends JpaRepository<Relation, Long> {}