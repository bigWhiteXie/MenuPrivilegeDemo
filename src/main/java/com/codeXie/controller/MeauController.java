package com.codeXie.controller;

import com.codeXie.pojo.Meau;
import com.codeXie.pojo.Tree;
import com.codeXie.pojo.User;
import com.codeXie.service.MeauService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MeauController {
    @Autowired
    MeauService meauService;

    @ResponseBody
    @RequestMapping("menuInfo")
    public List<Tree> menuInfo(@RequestParam(defaultValue = "0") String id, HttpSession session){
        User user = (User) session.getAttribute("user");
        List<Meau> meaus = meauService.meauService(user.getRid(), Integer.valueOf(id));
        List<Tree> list = new ArrayList<>();
        for(Meau meau:meaus){
            Tree tree = new Tree();
            tree.setId(meau.getMid());
            tree.setText(meau.getMname());
            tree.setState(meau.getState()==1?"open":"closed");
            Map<String,Object> map = new HashMap<>();
            map.put("url",meau.getMurl());
            tree.setAttributes(map);
            list.add(tree);
        }
        return list;
    }
}
