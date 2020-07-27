package cn.gingost.system.rest;

import cn.gingost.base.BaseQuery;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:lezzy
 * @Date:2020/7/27 15:58
 */

@RestController
@RequestMapping("api/user/")
@AllArgsConstructor
@Api(tags = "系统：用户管理")
public class UserController {

    @ApiOperation("查询用户")
    @GetMapping("findUser")
    public ResponseEntity findUser(BaseQuery baseQuery){
        return new ResponseEntity(HttpStatus.OK);
    }
}
