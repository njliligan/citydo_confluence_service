package cn.gingost.system.domain;

import cn.gingost.base.BaseEntity;
import lombok.Data;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

/**
 * @author:lezzy
 * @Date:2020/7/24 17:48
 */

@Data
@Table(name = "user")
@Entity
@Where(clause = "is_delete=0")
public class User extends BaseEntity {

    @Column(name = "nick_name")
    @NotBlank(groups = {Create.class,Update.class})
    private String nickName;

    @NotBlank
    @Column(name = "sex")
    private String sex;

    @NotBlank
    @Column(name = "phone")
    private String phone;

    @NotBlank
    @Column(name = "email")
    private String email;

    @NotBlank
    @Column(name = "card")
    private String card;

    @ManyToOne(cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
    @JoinColumn(name = "dept_id")
    private Dept dept;

}
