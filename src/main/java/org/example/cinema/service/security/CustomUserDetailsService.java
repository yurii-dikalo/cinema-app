package org.example.cinema.service.security;

import static org.springframework.security.core.userdetails.User.withUsername;

import java.util.Optional;
import org.example.cinema.model.Role;
import org.example.cinema.model.User;
import org.example.cinema.service.UserService;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    private final UserService userService;

    public CustomUserDetailsService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<User> userOptional = userService.findByEmail(email);
        UserBuilder userBuilder;
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            userBuilder = withUsername(email);
            userBuilder.password(user.getPassword());
            userBuilder.roles(user.getRoles()
                    .stream()
                    .map(Role::getRoleName)
                    .toArray(String[]::new));
            return userBuilder.build();
        }
        throw new UsernameNotFoundException("User not found with email: " + email);
    }
}
