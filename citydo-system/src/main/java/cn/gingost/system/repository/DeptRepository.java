package cn.gingost.system.repository;

import cn.gingost.system.entity.Dept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author:lezzy
 * @Date:2020/7/27 11:57
 */
public interface DeptRepository extends JpaRepository<Dept,Long>, JpaSpecificationExecutor<Dept> {
}
