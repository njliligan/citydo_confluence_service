package cn.gingost.system.service.impl;

import cn.gingost.system.entity.User;
import cn.gingost.system.repository.UserRepository;
import cn.gingost.system.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author:lezzy
 * @Date:2020/7/27 20:17
 */

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    @Override
    public User findUserByName(String username) {
        return userRepository.findUserByNickName(username);
    }
}
