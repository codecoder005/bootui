package com.popcorn.bootui.service;

import com.popcorn.bootui.entity.UserEntity;
import com.popcorn.bootui.reposiroty.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {
    private final UserRepository userRepository;

    public List<UserEntity> getAllUsers() {
        log.info("fetching all users from database");
        return userRepository.findAll();
    }
}
