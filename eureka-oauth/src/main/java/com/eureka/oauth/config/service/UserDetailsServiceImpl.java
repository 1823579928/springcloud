package com.eureka.oauth.config.service;

import com.eureka.oauth.entity.TbPermission;
import com.eureka.oauth.entity.TbUser;
import com.eureka.oauth.service.TbPermissionService;
import com.eureka.oauth.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {


    @Autowired
    private TbUserService tbUserService;
    @Autowired
    private TbPermissionService tbPermissionService;

//    自定义service获取用户和权限信息
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        根据用户名获取用户
        TbUser tbUser = tbUserService.getByUserName(username);
        ArrayList<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        if (tbUser!=null){
//            根据用户id获取所有权限
            List<TbPermission> tbPermissions = tbPermissionService.seleceByUserId(tbUser.getId());
//            将权限添加到权限集合
            tbPermissions.forEach(tbPermission -> {
                GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(tbPermission.getEnname());
                grantedAuthorities.add(grantedAuthority);
            });
        }
        return new User(tbUser.getUsername(),tbUser.getPassword(),grantedAuthorities);
    }
}
