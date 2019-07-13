package ly.base.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ly.base.dao.mapper.ScenicMapper;

import ly.base.po.domain.Scenic;
import ly.base.services.ScenicService;
import ly.base.tools.PageBean;
@Service
public class ScenicServiceImpl implements ScenicService {
	@Autowired
	public ScenicMapper scenicMapper;
	@Override
	public void insertScenic(Scenic scenic) {
		scenicMapper.insert(scenic);
		
	}
	@Override
	public PageBean<Scenic> findPageBean6(int currentPage) {
		PageBean<Scenic> pageBean = new PageBean<Scenic>();
		//1.当前页数		---- 前台用户点击的页数
		pageBean.setCurrentPage(currentPage);
		System.out.println("currentPage当前页数：  "+currentPage);
		//2.当前页面显示条数	---- 默认设定
		int currentCount = 6;
		pageBean.setCurrentCount(currentCount);
		
		//3.总条数			---- 向dao层传递请求,从数据库中获取
		int totalCount = scenicMapper.getTotalCount();
		System.out.println("totalCount用户总数量：  "+totalCount);
		pageBean.setTotalCount(totalCount);
		
		
		int totalPage = (int) Math.ceil(1.0*totalCount/currentCount);
		pageBean.setTotalPage(totalPage);
		System.out.println("totalPage总页数   ：  "+totalPage);
		
		int startIndex = (currentPage-1)*currentCount;
		
		 Map<String, Object> data = new HashedMap();
	        data.put("startIndex", startIndex);
	        data.put("currentCount", currentCount);
		List<Scenic> products = scenicMapper.findProductPageBean(data);
		pageBean.setProducts(products);
		System.out.println("User###   "+products);
		System.out.println("startIndex开始查询：  "+startIndex+  "  currentCount结束查询： "+currentCount);
		return pageBean;
	}
	@Override
	public PageBean<Scenic> findPageBean(int currentPage) {
		PageBean<Scenic> pageBean = new PageBean<Scenic>();
		//1.当前页数		---- 前台用户点击的页数
		pageBean.setCurrentPage(currentPage);
		System.out.println("currentPage当前页数：  "+currentPage);
		//2.当前页面显示条数	---- 默认设定
		int currentCount = 3;
		pageBean.setCurrentCount(currentCount);
		
		//3.总条数			---- 向dao层传递请求,从数据库中获取
		int totalCount = scenicMapper.getTotalCount();
		System.out.println("totalCount用户总数量：  "+totalCount);
		pageBean.setTotalCount(totalCount);
		
		
		int totalPage = (int) Math.ceil(1.0*totalCount/currentCount);
		pageBean.setTotalPage(totalPage);
		System.out.println("totalPage总页数   ：  "+totalPage);
		
		int startIndex = (currentPage-1)*currentCount;
		
		 Map<String, Object> data = new HashedMap();
	        data.put("startIndex", startIndex);
	        data.put("currentCount", currentCount);
		List<Scenic> products = scenicMapper.findProductPageBean(data);
		pageBean.setProducts(products);
		System.out.println("User###   "+products);
		System.out.println("startIndex开始查询：  "+startIndex+  "  currentCount结束查询： "+currentCount);
		return pageBean;
	}
	@Override
	public void delBySceniclist(Integer actId) {
		scenicMapper.deleteByPrimaryKey(actId);
		
	}
	@Override
	public Scenic selectScenicID(Integer actId) {
		Scenic scenic=scenicMapper.selectByPrimaryKey(actId);
		return scenic;
	}
	@Override
	public Integer updateScenic(Scenic scenic) {
		return scenicMapper.updateByPrimaryKeySelective(scenic);
		
	}
	

}
