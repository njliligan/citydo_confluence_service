package cn.gingost;

import cn.gingost.utils.SpringContextHolder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:lezzy
 * @Date:2020/7/24 17:43
 */

@SpringBootApplication
@RestController
public class AppRun {
    public static void main(String[] args) {
        SpringApplication.run(AppRun.class);
    }

    @Bean
    public SpringContextHolder springContextHolder() {
        return new SpringContextHolder();
    }

    @GetMapping("/")
    public String index(){
        return "citydo confluence service is running success";
    }
}
