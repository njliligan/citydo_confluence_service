package cn.gingost.security.service;

import cn.gingost.security.domain.JwtUser;
import cn.gingost.system.entity.User;
import cn.gingost.system.repository.RoleRepository;
import cn.gingost.system.repository.UserRepository;
import cn.gingost.system.service.RoleService;
import cn.gingost.system.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author:lezzy
 * @Date:2020/7/27 20:00
 */
@Service
@AllArgsConstructor
public class UserDetailServiceImpl implements UserDetailsService {
    private UserService userService;
    private RoleService roleService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.findUserByName(username);
        if (Objects.nonNull(user)){
            return createJwtUser(user);
        }else {
            throw new RuntimeException("账号不存在");
        }
    }

    private JwtUser createJwtUser(User user) {
        return new JwtUser(
                user.getId(),
                user.getNickName(),
                user.getPassword(),
                null,
                user.getPhone(),
                user.getEmail(),
                user.getCard(),
                user.getDept(),
                roleService.findAllPermission(user.getId())
        );
    }
}
