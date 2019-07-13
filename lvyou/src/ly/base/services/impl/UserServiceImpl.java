package ly.base.services.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import ly.base.dao.mapper.UserMapper;
import ly.base.po.domain.User;
import ly.base.services.UserService;
import ly.base.tools.PageBean;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	public UserMapper userMapper;
	
	public void insertUser(User user) {
		userMapper.insert(user);
	}
	@Override
	public List<User> selectUsers() {
	List<User> list=userMapper.selectUsers();
		return list;
	}
	@Override
	public void delByUserlist(Integer userId) {
		userMapper.deleteByPrimaryKey(userId);
		
	}
	@Override
	public User selectUserID(Integer userId) {
		User user=userMapper.selectByPrimaryKey(userId);
		return user;
	}
	@Override
	public PageBean<User> findPageBean(int currentPage) {
		PageBean<User> pageBean = new PageBean<User>();
		//1.当前页数		---- 前台用户点击的页数
		pageBean.setCurrentPage(currentPage);
		System.out.println("currentPage当前页数：  "+currentPage);
		//2.当前页面显示条数	---- 默认设定
		int currentCount = 6;
		pageBean.setCurrentCount(currentCount);
		
		//3.总条数			---- 向dao层传递请求,从数据库中获取
		int totalCount = userMapper.getTotalCount();
		System.out.println("totalCount用户总数量：  "+totalCount);
		pageBean.setTotalCount(totalCount);
		
		//4.总页数			---- 向上取整,double(总条数/当前页面显示条数).ceil
		/*
		 * 		总条数   	当前页面显示条数		总页数
		 * 		 10			4			 3
		 *  	 11			4			 3
		 *   	 12			4			 3
		 *   	 13			4			 4		
		 */
		int totalPage = (int) Math.ceil(1.0*totalCount/currentCount);
		// int totlePage = totle%count==0?totle/count:(totle/count)+1;
		pageBean.setTotalPage(totalPage);
		System.out.println("totalPage总页数   ：  "+totalPage);
		//5.每页显示的数据		---- 起始索引==(当前页面-1)* 每页显示条数;
	
		/*
		 * 	      当前页数   		起始索引		 每页显示条数
		 * 		1		  0				4           --- 0,1,2,3
		 * 		2		  4				4			--- 4,5,6,7
		 * 		3		  8				4			--- 8,9,10,11
		 * 		4		  12 			4			--- 12,13,14,15
		 */
		int startIndex = (currentPage-1)*currentCount;
		
	/*	List<User> products = userMapper.findProductPageBean(startIndex,currentCount);*/
		 Map<String, Object> data = new HashedMap();
	        data.put("startIndex", startIndex);
	        data.put("currentCount", currentCount);
		List<User> products = userMapper.findProductPageBean(data);
		pageBean.setProducts(products);
		System.out.println("User###   "+products);
		System.out.println("startIndex开始查询：  "+startIndex+  "  currentCount结束查询： "+currentCount);
		return pageBean;

	}
	@Override
	public Integer updateUser(User user) {
		return userMapper.updateByPrimaryKeySelective(user);
		
	}
	@Override
	public User selectByUsername(String userName) {
		User user =userMapper.selectByUsername(userName);
		return user;
	}
	
	

}
