package com.example.demo.config;

import com.example.demo.dao.UserMapper;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.realm.SimpleAccountRealm;
import org.apache.shiro.subject.PrincipalCollection;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by fly on 2018/10/29.
 */
public class CustomRealm extends AuthorizingRealm {
    @Resource
    private UserMapper userMapper;

    Map<String,Object> map=new HashMap<String, Object>();
    {
        map.put("Rengar","123456");
        super.setName("one");
    }
    Set<String> setroles=new HashSet<>();
    {
        setroles.add("admin");
        setroles.add("user");
        setroles.add("supadmin");
    }
    Set<String> setPermission=new HashSet<>();
    {
        setPermission.add("user:delete");
        setPermission.add("user:select");
    }
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.print("————————————————权限验证————————————————");
        String userName=(String)principalCollection.getPrimaryPrincipal();
        Set<String> roles = setroles;
        Set<String> permissions=setPermission;
        SimpleAuthorizationInfo simpleAuthenticationInfo=new SimpleAuthorizationInfo();
        simpleAuthenticationInfo.setRoles(roles);
        simpleAuthenticationInfo.setStringPermissions(permissions);
        return simpleAuthenticationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.print("————————————————身份验证————————————————");
        //从主体传来的信息中获取用户名
        UsernamePasswordToken token =(UsernamePasswordToken) authenticationToken;
        //通过用户名去数据库获取凭证
        String password = userMapper.selectPasswordByUserName(token.getUsername());
        if(password==null){
            throw new AccountException("用户名不正确");
        }else if(!password.equals(token.getCredentials())){
            throw new AccountException("用户名不正确");
        }else{
            SimpleAuthenticationInfo authenticationInfo =new SimpleAuthenticationInfo(token.getUsername(),password,getName());
            return authenticationInfo;
        }
    }
}
