package com.glauberperez.blog.configuration;

import com.glauberperez.blog.model.UserModel;
import com.glauberperez.blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserModel user = userRepository.findByUsername(username);

            if(user == null) {
                throw new UsernameNotFoundException("Username not found!");
            }
            else{
                return new CustomUser(user);
            }

    }
}
