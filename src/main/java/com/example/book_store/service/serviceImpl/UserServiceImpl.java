package com.example.book_store.service.serviceImpl;

import com.example.book_store.model.entity.User;
import com.example.book_store.repository.UserRepo;
import com.example.book_store.security.MyUserDetails;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserDetailsService {

    private final UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepo.findByUsername(username);
        if (user.isEmpty()){
            throw new UsernameNotFoundException("Нет пользователя с таким логином");
        }

        return new MyUserDetails(user.get());
    }
}
