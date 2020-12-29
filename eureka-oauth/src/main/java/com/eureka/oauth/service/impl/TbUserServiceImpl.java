package com.eureka.oauth.service.impl;

import com.eureka.oauth.entity.TbUser;
import com.eureka.oauth.service.TbUserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.eureka.oauth.mapper.TbUserMapper;
import tk.mybatis.mapper.entity.Example;

@Service
public class TbUserServiceImpl implements TbUserService {

    @Resource
    private TbUserMapper tbUserMapper;

    @Override
    public TbUser getByUserName(String userName) {
        Example example = new Example(TbUser.class);
        example.createCriteria().andEqualTo("username",userName);
        return tbUserMapper.selectOneByExample(example);
    }
}
