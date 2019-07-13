package ly.base.services;


import java.util.List;

import ly.base.po.domain.Message;
import ly.base.po.domain.Scenic;
import ly.base.tools.PageBean;

public interface ScenicService {
	public void insertScenic(Scenic cenic);//添加景点

	public PageBean<Scenic> findPageBean(int currentPage);////分页查询 
	public PageBean<Scenic> findPageBean6(int currentPage);

	public void delBySceniclist(Integer sceId);//删除actId景点字段

	public Scenic selectScenicID(Integer sceId);//修改actId景点
	
	public Integer updateScenic(Scenic scenic);//更新actId景点数据
	

}
