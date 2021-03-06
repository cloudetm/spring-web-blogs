package pl.dmichalski.rss.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dmichalski.rss.entity.UserEntity;

/**
 * Author: Daniel
 */
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserEntity findByName(String name);

}
