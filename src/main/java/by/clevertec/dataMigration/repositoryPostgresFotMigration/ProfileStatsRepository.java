package by.clevertec.dataMigration.repositoryPostgresFotMigration;

import by.clevertec.dataMigration.dataPostgresFotMigration.ProfileStats;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProfileStatsRepository extends JpaRepository<ProfileStats, Long> {
    List<ProfileStats> findByFriendsAndPostsAndSubscribers(Integer friends, Integer posts, Integer subscribers);
}