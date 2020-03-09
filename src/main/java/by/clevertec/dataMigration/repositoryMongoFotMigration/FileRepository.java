package by.clevertec.dataMigration.repositoryMongoFotMigration;

import by.clevertec.dataMigration.dataMongoFotMigration.File;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FileRepository extends MongoRepository<File, Long> {
}