package ly.base.services.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ly.base.dao.mapper.WaysMapper;
import ly.base.po.domain.Video;
import ly.base.po.domain.Ways;
import ly.base.services.WaysService;
import ly.base.tools.PageBean;
@Service
public class WaysServiceImpl implements WaysService {
	@Autowired
	public WaysMapper waysMapper;
	@Override
	public void insertWays(Ways ways) {
		waysMapper.insert(ways);
		
	}
	@Override
	public PageBean<Ways> findPageBean(int currentPage) {
		PageBean<Ways> pageBean = new PageBean<Ways>();
		//1.当前页数		---- 前台用户点击的页数
		pageBean.setCurrentPage(currentPage);
		System.out.println("currentPage当前页数：  "+currentPage);
		//2.当前页面显示条数	---- 默认设定
		int currentCount = 10;
		pageBean.setCurrentCount(currentCount);
		
		//3.总条数			---- 向dao层传递请求,从数据库中获取
		int totalCount = waysMapper.getTotalCount();
		System.out.println("totalCount用户总数量：  "+totalCount);
		pageBean.setTotalCount(totalCount);
		
		
		int totalPage = (int) Math.ceil(1.0*totalCount/currentCount);
		pageBean.setTotalPage(totalPage);
		System.out.println("totalPage总页数   ：  "+totalPage);
		
		int startIndex = (currentPage-1)*currentCount;
		
		 Map<String, Object> data = new HashedMap();
	        data.put("startIndex", startIndex);
	        data.put("currentCount", currentCount);
		List<Ways> products = waysMapper.findProductPageBean(data);
		pageBean.setProducts(products);
		System.out.println("User###   "+products);
		System.out.println("startIndex开始查询：  "+startIndex+  "  currentCount结束查询： "+currentCount);
		return pageBean;
	}
	@Override
	public void delByWayslist(Integer wayId) {
		waysMapper.deleteByPrimaryKey(wayId);
		
	}
	@Override
	public Ways selectWaysID(Integer wayId) {
		Ways ways=waysMapper.selectByPrimaryKey(wayId);
		return ways;
	}
	@Override
	public Integer updateWays(Ways ways) {
		return waysMapper.updateByPrimaryKeySelective(ways);
		
	}


}
