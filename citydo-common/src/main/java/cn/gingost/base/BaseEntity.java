package cn.gingost.base;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * @author:lezzy
 * @Date:2020/7/24 17:54
 */

@Getter
@Setter
@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "BIGINT(20) comment '主键id'")
    @NotNull(message = "主键不能为空", groups =Update.class)
    private Long id;

    public @interface Update {
    }
}
