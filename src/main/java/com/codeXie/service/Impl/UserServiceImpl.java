package com.codeXie.service.Impl;

import com.codeXie.mapper.UserMapper;
import com.codeXie.pojo.UrlItem;
import com.codeXie.pojo.User;
import com.codeXie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User loginService(String uname, String pwd) {
        return userMapper.selOneMapper(uname,pwd);
    }

    @Override
    public List<UrlItem> selUrlService(Integer rid) {
        return userMapper.selUrlMapper(rid);
    }
}
