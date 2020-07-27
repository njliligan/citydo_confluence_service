package cn.gingost.base;

import cn.gingost.annotation.Query;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Collection;

/**
 * @author:lezzy
 * @Date:2020/7/27 11:59
 */

@Data
public class BaseQuery {

    @Query
    public Long id;

    @Query(type = Query.Type.IN,propName = "id")
    public Collection<Long> ids;

    @Query(type = Query.Type.BETWEEN)
    public Collection<Timestamp> createTime;

    @Query(type = Query.Type.BETWEEN)
    public Collection<Timestamp> updateTime;

}
