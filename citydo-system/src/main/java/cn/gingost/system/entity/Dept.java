package cn.gingost.system.entity;

import cn.gingost.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Set;

/**
 * @author:lezzy
 * @Date:2020/7/24 17:48
 */

@Getter
@Setter
@Entity
@Table(name = "dept")
@Where(clause = "is_delete=0")
public class Dept extends BaseEntity {

    @Column(name = "nick_name")
    @NotBlank(message = "部门名不能为空",groups = {Create.class,Update.class})
    private String nickName;

    @Column(name = "p_id")
    @NotNull
    private Long pId;

    @OneToMany(mappedBy = "dept",cascade = CascadeType.MERGE)
    private Set<User> users;

    @Column(name = "u_id")
    private Long uId;

}
