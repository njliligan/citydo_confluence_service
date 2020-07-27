package cn.gingost.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author:lezzy
 * @Date:2020/7/27 11:57
 */
public interface DeptRepository extends JpaRepository<DeptRepository,Long>, JpaSpecificationExecutor<DeptRepository> {
}
