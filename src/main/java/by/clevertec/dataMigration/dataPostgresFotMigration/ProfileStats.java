package by.clevertec.dataMigration.dataPostgresFotMigration;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;

@Data
@NoArgsConstructor
@Entity
@Table(name = "profile_stats")
public class ProfileStats {
    @Id
    @Column(name = "uid")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private BigInteger uid;

    public BigInteger getUid() {
        return uid;
    }

    @Column (name = "friends")
    private Integer friends;

    @Column (name = "posts")
    private Integer posts;

    @Column (name = "subscribers")
    private Integer subscribers;

    public ProfileStats(Integer friends, Integer posts, Integer subscribers) {
        this.friends = friends;
        this.posts = posts;
        this.subscribers = subscribers;
    }
}
