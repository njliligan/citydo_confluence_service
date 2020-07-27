package cn.gingost.system.entity;

import cn.gingost.base.BaseEntity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.Set;

/**
 * @author:lezzy
 * @Date:2020/7/27 14:06
 */

@Getter
@Setter
@Entity
@Table(name = "menu")
@Where(clause = "is_delete=0")
public class Menu extends BaseEntity {

    @Column(name = "nick_name")
    private String nickName;

    @Column(name = "p_id")
    private Long pId;

    @Column(name = "permission")
    private String permission;

    @Column(name = "sort")
    private Integer sort;

    @ManyToMany(mappedBy = "menus",fetch = FetchType.EAGER)
    private Set<Role> roles;
}
