package ly.base.dao.mapper;

import java.util.List;
import java.util.Map;


import ly.base.po.domain.Scenic;
import ly.base.po.domain.ScenicExample;
import org.apache.ibatis.annotations.Param;

public interface ScenicMapper {
    int countByExample(ScenicExample example);

    int deleteByExample(ScenicExample example);

    int deleteByPrimaryKey(Integer sceId);

    int insert(Scenic record);

    int insertSelective(Scenic record);

    int getTotalCount();//用户总数
    
    List<Scenic> findProductPageBean(Map<String,Object> data);//分页查询用户
    //select * from table_name limit 0,10 //查询10条记录
    List<Scenic> findScenicten();
    List<Scenic> selectByExample(ScenicExample example);

    Scenic selectByPrimaryKey(Integer sceId);

    int updateByExampleSelective(@Param("record") Scenic record, @Param("example") ScenicExample example);

    int updateByExample(@Param("record") Scenic record, @Param("example") ScenicExample example);

    int updateByPrimaryKeySelective(Scenic record);

    int updateByPrimaryKey(Scenic record);
}