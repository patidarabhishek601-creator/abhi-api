package quick_cache.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import quick_cache.api.entity.User;
import quick_cache.api.repository.UserRepository;
@Service
public class UserService {
    @Autowired
    private UserRepository repo;
    @Cacheable(value = "users" , key = "#id")
    public User getUser(Long id){
        System.out.println("DB Se la raha hu...");
        return repo.findById(id).orElse(null);
    }
    @CacheEvict(value = "users",key = "#user.id")
    public User saveUser(User user){
        return repo.save(user);
    }
}
