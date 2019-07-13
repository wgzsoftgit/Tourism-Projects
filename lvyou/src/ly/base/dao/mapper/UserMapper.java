package ly.base.dao.mapper;

import java.util.List;
import java.util.Map;

import ly.base.po.domain.User;
import ly.base.po.domain.UserExample;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer userId);

    

    int insertSelective(User record);
    int insert(User record);//添加
    List<User> selectUsers();//查询所有用户信息
    
    List<User> findProductPageBean(Map<String,Object> data);//分页查询用户
    
    int getTotalCount();//用户总数
    
    User selectByUsername(String userName);//根据用户名查询查询
    
    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}