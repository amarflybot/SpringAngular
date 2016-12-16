package demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by amarendra on 6/12/16.
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    Collection<User> findByName(String name);
}
