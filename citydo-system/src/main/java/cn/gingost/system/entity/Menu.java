package cn.gingost.system.entity;

import cn.gingost.base.BaseEntity;
import lombok.Data;
import org.hibernate.annotations.Where;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author:lezzy
 * @Date:2020/7/27 14:06
 */

@Data
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
}
