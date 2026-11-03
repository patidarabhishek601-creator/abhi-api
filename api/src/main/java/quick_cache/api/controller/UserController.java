package quick_cache.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import quick_cache.api.entity.User;
import quick_cache.api.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService service;
    @PostMapping
    public User create(@RequestBody User user){
        return service.saveUser(user);
    }
    @GetMapping("/{id}")
    public User get(@PathVariable Long id){
        return service.getUser(id);


    }
}
