package com.codeXie.mapper;

import com.codeXie.pojo.Meau;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MeauMapper {
    @Select("select * from t_menu where mid in (select mid from r_menu where rid=#{rid}) and parentid=#{pid}")
    List<Meau> selMeauMapper(@Param("rid") Integer rid, @Param("pid") Integer pid);

}
