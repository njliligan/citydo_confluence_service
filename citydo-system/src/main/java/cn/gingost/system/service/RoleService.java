package cn.gingost.system.service;

import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

/**
 * @author:lezzy
 * @Date:2020/7/27 20:16
 */
public interface RoleService {
    Collection<GrantedAuthority> findAllPermission(Long id);
}
