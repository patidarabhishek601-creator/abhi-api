package quick_cache.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import quick_cache.api.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {
}
