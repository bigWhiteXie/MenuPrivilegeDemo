package com.codeXie.controller;

import com.codeXie.pojo.Tree;
import com.codeXie.pojo.UrlItem;
import com.codeXie.pojo.User;
import com.codeXie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("login")
    public Boolean login(String uname, String pwd, HttpSession session){
        User user = userService.loginService(uname, pwd);
        if(user != null){
            session.setAttribute("user",user);
            //根据角色id得到可访问的url
            List<UrlItem> list = userService.selUrlService(user.getRid());
            session.setAttribute("url",list);
        }
        return user != null;
    }
}
