package ly.base.dao.mapper;

import java.util.List;
import java.util.Map;

import ly.base.po.domain.Activity;
import ly.base.po.domain.ActivityExample;

import org.apache.ibatis.annotations.Param;

public interface ActivityMapper {
    int countByExample(ActivityExample example);

    int deleteByExample(ActivityExample example);

    int deleteByPrimaryKey(Integer actId);

    int insert(Activity record);

    int insertSelective(Activity record);

    List<Activity> selectByExample(ActivityExample example);

    int getTotalCount();//用户总数
    
    List<Activity> findProductPageBean(Map<String,Object> data);//分页查询用户
    
    List<Activity> findActivitynine();//查询8条就录
    Activity selectByPrimaryKey(Integer actId);

    int updateByExampleSelective(@Param("record") Activity record, @Param("example") ActivityExample example);

    int updateByExample(@Param("record") Activity record, @Param("example") ActivityExample example);

    int updateByPrimaryKeySelective(Activity record);

    int updateByPrimaryKey(Activity record);
}