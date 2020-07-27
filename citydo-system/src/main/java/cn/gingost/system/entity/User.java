package cn.gingost.system.entity;

import cn.gingost.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Set;

/**
 * @author:lezzy
 * @Date:2020/7/24 17:48
 */

@Data
@Table(name = "user")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Where(clause = "is_delete=0")
public class User extends BaseEntity {

    @Column(name = "nick_name")
    @NotBlank(groups = {Create.class, Update.class})
    private String nickName;

    @NotBlank
    @Column(name = "sex")
    private String sex;

    @NotBlank
    @Column(name = "password")
    private String password;

    @NotBlank
    @Column(name = "phone")
    private String phone;

    @NotBlank
    @Column(name = "email")
    private String email;

    @NotBlank
    @Column(name = "card")
    private String card;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "dept_id")
    private Dept dept;

    @ManyToMany
    @JoinTable(name = "user_role", joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")}, inverseJoinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id")})
    private Set<Role> roles;

    @OneToOne(cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
    private Job job;
}
