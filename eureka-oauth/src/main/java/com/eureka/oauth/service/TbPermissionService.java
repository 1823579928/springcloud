package com.eureka.oauth.service;

import com.eureka.oauth.entity.TbPermission;

import java.util.List;

public interface TbPermissionService{
    List<TbPermission> seleceByUserId(Long userId);
}
