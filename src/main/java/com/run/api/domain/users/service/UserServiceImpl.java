package com.run.api.domain.users.service;

import java.util.List;
import com.run.api.global.dto.user;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.run.api.global.dao.UserMapper;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    @Override
    public List<user> getUserList() {
        return userMapper.getUserList();
    }
    
}