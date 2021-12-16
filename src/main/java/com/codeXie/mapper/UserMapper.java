package com.codeXie.mapper;

import com.codeXie.pojo.UrlItem;
import com.codeXie.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("select * from t_user where uname=#{uname} and pwd = #{pwd}")
    User selOneMapper(@Param("uname") String uname,@Param("pwd") String pwd);

    @Select("select * from t_url where urlid in (select urlid from r_url where rid=#{rid})")
    List<UrlItem> selUrlMapper(@Param("rid") Integer rid);
}
