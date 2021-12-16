package com.codeXie.service;

import com.codeXie.pojo.UrlItem;
import com.codeXie.pojo.User;

import java.util.List;

public interface UserService {
    User loginService(String uname,String pwd);

    List<UrlItem> selUrlService(Integer rid);
}
