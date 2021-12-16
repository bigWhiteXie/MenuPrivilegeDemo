package com.codeXie.service.Impl;

import com.codeXie.mapper.MeauMapper;
import com.codeXie.pojo.Meau;
import com.codeXie.service.MeauService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeauServiceImpl implements MeauService {
    @Autowired
    MeauMapper meauMapper;

    @Override
    public List<Meau> meauService(int rid, int pid) {
        return meauMapper.selMeauMapper(rid,pid);
    }
}
