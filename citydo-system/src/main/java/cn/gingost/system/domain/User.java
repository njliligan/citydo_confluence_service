package cn.gingost.system.domain;

import cn.gingost.base.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author:lezzy
 * @Date:2020/7/24 17:48
 */

@Data
@Table(name = "user")
@Entity
public class User extends BaseEntity {
}
