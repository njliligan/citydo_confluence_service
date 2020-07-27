package cn.gingost.system.entity;

import cn.gingost.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

/**
 * @author:lezzy
 * @Date:2020/7/27 13:51
 */

@Entity
@Getter
@Setter
@Table(name = "role")
@Where(clause = "is_delete=0")
public class Role extends BaseEntity {

    @Column(name = "nick_name")
    private String nickName;

    @Column(name = "role_name")
    private String roleName;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;
}
