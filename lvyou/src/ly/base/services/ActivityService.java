package ly.base.services;

import java.util.List;

import ly.base.po.domain.Activity;
import ly.base.tools.PageBean;

public interface ActivityService {
	public void insertActivity(Activity activity);//添加活动

	public PageBean<Activity> findPageBean(int currentPage);////分页查询 

	public void delByActivitylist(Integer actId);//删除actId活动字段

	public Activity selectActivityID(Integer actId);//修改actId活动
	
	public Integer updateActivity(Activity activity);//更新actId活动数据
	
}
