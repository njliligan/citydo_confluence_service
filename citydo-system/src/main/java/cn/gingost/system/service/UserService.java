package cn.gingost.system.service;

import cn.gingost.system.entity.User;

/**
 * @author:lezzy
 * @Date:2020/7/27 20:15
 */
public interface UserService {
    User findUserByName(String username);
}
