package cn.gingost.security.service;

import cn.gingost.security.domain.JwtProperties;
import cn.gingost.security.domain.OnlineUser;
import cn.gingost.utils.RedisUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author:lezzy
 * @Date:2020/7/27 15:40
 */
@Service
@AllArgsConstructor
public class OnlineUserService {
    private final JwtProperties jwtProperties;
    private RedisUtils redisUtils;

    public OnlineUser getOne(String key){
        return (OnlineUser)redisUtils.get(key);
    }
}
