package ly.base.services;

import java.util.List;

import ly.base.po.domain.Activity;
import ly.base.po.domain.User;
import ly.base.tools.PageBean;

public interface UserService {

	
	public List<User> selectUsers();//查询所有用户5个
	public PageBean<User> findPageBean(int currentPage);//分页查询 
	public void insertUser(User user);//添加
	public void delByUserlist(Integer userId);//删除userId用户字段
	public User selectUserID(Integer userId);//修改userId用户
	public Integer updateUser(User user);//更新userId用户数据
	public User selectByUsername(String userName);//根据用户名查询
	
	
}
