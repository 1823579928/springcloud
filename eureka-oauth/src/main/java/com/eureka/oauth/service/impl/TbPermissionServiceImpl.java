package com.eureka.oauth.service.impl;

import com.eureka.oauth.entity.TbPermission;
import com.eureka.oauth.service.TbPermissionService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.eureka.oauth.mapper.TbPermissionMapper;

import java.util.List;

@Service
public class TbPermissionServiceImpl implements TbPermissionService {

    @Resource
    private TbPermissionMapper tbPermissionMapper;

    @Override
    public List<TbPermission> seleceByUserId(Long userId) {
        return tbPermissionMapper.seleceByUserId(userId);
    }
}
