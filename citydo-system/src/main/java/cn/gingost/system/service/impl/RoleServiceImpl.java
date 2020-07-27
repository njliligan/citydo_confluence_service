package cn.gingost.system.service.impl;

import cn.gingost.system.entity.Menu;
import cn.gingost.system.entity.Role;
import cn.gingost.system.entity.User;
import cn.gingost.system.repository.RoleRepository;
import cn.gingost.system.repository.UserRepository;
import cn.gingost.system.service.RoleService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author:lezzy
 * @Date:2020/7/27 20:29
 */

@Service
@AllArgsConstructor
public class RoleServiceImpl implements RoleService {

    private RoleRepository roleRepository;
    private UserRepository userRepository;

    @Override
    public Collection<? extends GrantedAuthority> findAllPermission(Long id) {
        User user = userRepository.findById(id).orElseGet(User::new);
        Set<Role> roles = user.getRoles();
        Set<String> permisson=roles.stream().filter(role -> !StringUtils.isEmpty(role.getRoleName())).map(Role::getNickName).collect(Collectors.toSet());
        permisson.addAll(roles.stream().flatMap(role -> role.getMenus().stream()).filter(menu -> !StringUtils.isEmpty(menu.getPermission())).map(Menu::getPermission).collect(Collectors.toSet()));
        return permisson.stream().map(SimpleGrantedAuthority::new).collect(Collectors.toSet());
    }
}
