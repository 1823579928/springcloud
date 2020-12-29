package com.eureka.oauth.service;

import com.eureka.oauth.entity.TbUser;

public interface TbUserService{
    TbUser getByUserName(String userName);
}
