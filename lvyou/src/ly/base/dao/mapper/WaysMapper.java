package ly.base.dao.mapper;

import java.util.List;
import java.util.Map;


import ly.base.po.domain.Ways;
import ly.base.po.domain.WaysExample;
import org.apache.ibatis.annotations.Param;

public interface WaysMapper {
    int countByExample(WaysExample example);

    int deleteByExample(WaysExample example);

    int deleteByPrimaryKey(Integer wayId);

    int insert(Ways record);

    int insertSelective(Ways record);

    int getTotalCount();//用户总数
    
    List<Ways> findProductPageBean(Map<String,Object> data);//分页查询用户
    List<Ways> findWaysnine();//查询9条记录
    
    List<Ways> selectByExample(WaysExample example);

    Ways selectByPrimaryKey(Integer wayId);

    int updateByExampleSelective(@Param("record") Ways record, @Param("example") WaysExample example);

    int updateByExample(@Param("record") Ways record, @Param("example") WaysExample example);

    int updateByPrimaryKeySelective(Ways record);

    int updateByPrimaryKey(Ways record);
}