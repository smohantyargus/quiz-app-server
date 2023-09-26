package com.sarbajit.quizapi.services.implement;

import com.sarbajit.quizapi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class userDetailServiceImpl implements UserDetailsService {

    @Autowired
    private com.sarbajit.quizapi.repo.userRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user=this.userRepository.findByuserName(s);
        if(user==null)
        {
            System.out.println("User not found exception");
            throw new UsernameNotFoundException("No user found");
        }
        return user;
    }
}
