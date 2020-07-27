package cn.gingost.security.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author:lezzy
 * @Date:2020/7/27 15:37
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OnlineUser {
    private String userName;
    private String nickName;
    private String job;
    private String browser;
    private String ip;
    private String address;
    private String key;
    private Date loginTime;
}
