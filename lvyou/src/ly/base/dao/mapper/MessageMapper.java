package ly.base.dao.mapper;

import java.util.List;
import java.util.Map;

import ly.base.po.domain.Activity;
import ly.base.po.domain.Message;
import ly.base.po.domain.MessageExample;
import org.apache.ibatis.annotations.Param;

public interface MessageMapper {
    int countByExample(MessageExample example);

    int deleteByExample(MessageExample example);

    int deleteByPrimaryKey(Integer mesId);

    int insert(Message record);

    int insertSelective(Message record);

    int getTotalCount();//用户总数
    
    List<Message> findProductPageBean(Map<String,Object> data);//分页查询用户
    List<Message> selectByExample(MessageExample example);

    Message selectByPrimaryKey(Integer mesId);

    int updateByExampleSelective(@Param("record") Message record, @Param("example") MessageExample example);

    int updateByExample(@Param("record") Message record, @Param("example") MessageExample example);

    int updateByPrimaryKeySelective(Message record);//添加

    int updateByPrimaryKey(Message record);
}