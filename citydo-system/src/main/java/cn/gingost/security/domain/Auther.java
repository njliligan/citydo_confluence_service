package cn.gingost.security.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author:lezzy
 * @Date:2020/7/27 17:04
 */

@Data
@ApiModel("登录授权")
public class Auther {

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("用户名")
    private String password;

    @ApiModelProperty("验证码id")
    private String uuid;

    @ApiModelProperty("验证码结果")
    private String code;
}
