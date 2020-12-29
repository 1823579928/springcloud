package com.eureka.oauth.mapper;

import com.eureka.oauth.entity.TbPermission;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface TbPermissionMapper extends Mapper<TbPermission> {
    List<TbPermission> seleceByUserId(Long userId);
}