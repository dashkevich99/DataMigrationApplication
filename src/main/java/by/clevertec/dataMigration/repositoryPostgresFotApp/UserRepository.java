package by.clevertec.dataMigration.repositoryPostgresFotApp;

import by.clevertec.dataMigration.dataPostgresFotApp.UserApp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserApp, String> {

}