package ly.base.dao.mapper;

import java.util.List;
import java.util.Map;

import ly.base.po.domain.Activity;
import ly.base.po.domain.Video;
import ly.base.po.domain.VideoExample;
import org.apache.ibatis.annotations.Param;

public interface VideoMapper {
    int countByExample(VideoExample example);

    int deleteByExample(VideoExample example);

    int deleteByPrimaryKey(Integer vidId);

    int insert(Video record);

    int insertSelective(Video record);

      int getTotalCount();//用户总数
    
    List<Video> findProductPageBean(Map<String,Object> data);//分页查询用户
    
    List<Video> selectByExample(VideoExample example);

    Video selectByPrimaryKey(Integer vidId);

    int updateByExampleSelective(@Param("record") Video record, @Param("example") VideoExample example);

    int updateByExample(@Param("record") Video record, @Param("example") VideoExample example);

    int updateByPrimaryKeySelective(Video record);

    int updateByPrimaryKey(Video record);
}