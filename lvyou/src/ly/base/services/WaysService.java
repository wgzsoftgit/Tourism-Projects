package ly.base.services;

import java.util.List;

import ly.base.po.domain.Scenic;
import ly.base.po.domain.Video;
import ly.base.po.domain.Ways;
import ly.base.tools.PageBean;

public interface WaysService {

	public void insertWays(Ways ways);//添加路线

	public PageBean<Ways> findPageBean(int currentPage);////分页查询 

	public void delByWayslist(Integer wayId);//删除wayId路线字段

	public Ways selectWaysID(Integer wayId);//修改wayId路线
	
	public Integer updateWays(Ways ways);//更新wayId路线数据
	

}
