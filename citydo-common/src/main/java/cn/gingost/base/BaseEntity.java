package cn.gingost.base;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

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
    @NotNull(message = "主键不能为空", groups = Update.class)
    private Long id;

    @Column(name = "create_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @CreationTimestamp
    private Timestamp createTime;

    @Column(name = "update_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @UpdateTimestamp
    private Timestamp updateTime;

    @Column(name = "operator")
    private String operator=getOperator();

    @Column(name = "is_delete")
    private Boolean isDelete=false;

    private String getOperator(){
        return "lezzy";
    }
    public String getRespOperator(){
        return this.operator;
    }

    public @interface Update {
    }

    public @interface Create {
    }
}
