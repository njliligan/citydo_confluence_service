package cn.gingost.system.repository;

import cn.gingost.system.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author:lezzy
 * @Date:2020/7/24 17:49
 */
public interface UserRepository extends JpaRepository<User,Long>, JpaSpecificationExecutor<User> {
}
