package ca.beogotechnologies.web;

import ca.beogotechnologies.model.User;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping(path = "/api")
public class UserController {
    @GetMapping("/users")
    public ResponseEntity<User> getUsers(Pageable pageable, @RequestParam() Map<String, String> filter) {
        return null;
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id) {
        return null;
    }

    @PostMapping("/users")
    public ResponseEntity<?> insertUser(@RequestBody @Valid User user) {
        return null;
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<User> updateUser(@RequestBody @Valid User user) {
        return null;
    }
}
