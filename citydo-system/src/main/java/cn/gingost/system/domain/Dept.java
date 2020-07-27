package cn.gingost.system.domain;

import cn.gingost.base.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Set;

/**
 * @author:lezzy
 * @Date:2020/7/24 17:48
 */

@Data
@Entity
@Table(name = "dept")
public class Dept extends BaseEntity {

    @Column(name = "nick_name")
    @NotBlank(message = "部门名不能为空",groups = {Create.class,Update.class})
    private String nickName;

    @Column(name = "p_id")
    @NotNull
    private Long pId;

    @OneToMany(mappedBy = "dept",cascade = CascadeType.MERGE)
    private Set<User> users;

}
