package ly.base.services.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ly.base.dao.mapper.VideoMapper;

import ly.base.po.domain.Video;

import ly.base.services.VideoService;
import ly.base.tools.PageBean;
@Service
public class VideoServiceImpl implements VideoService {
	@Autowired
	public VideoMapper videoMapper;
	@Override
	public void insertVideo(Video video) {
		videoMapper.insert(video);
		
	}
	@Override
	public PageBean<Video> findPageBeanqiantai(int currentPage) {
		PageBean<Video> pageBean = new PageBean<Video>();
		//1.当前页数		---- 前台用户点击的页数
		pageBean.setCurrentPage(currentPage);
		System.out.println("currentPage当前页数：  "+currentPage);
		//2.当前页面显示条数	---- 默认设定
		int currentCount = 4;
		pageBean.setCurrentCount(currentCount);
		
		//3.总条数			---- 向dao层传递请求,从数据库中获取
		int totalCount = videoMapper.getTotalCount();
		System.out.println("totalCount用户总数量：  "+totalCount);
		pageBean.setTotalCount(totalCount);
		
		
		int totalPage = (int) Math.ceil(1.0*totalCount/currentCount);
		pageBean.setTotalPage(totalPage);
		System.out.println("totalPage总页数   ：  "+totalPage);
		
		int startIndex = (currentPage-1)*currentCount;
		
		 Map<String, Object> data = new HashedMap();
	        data.put("startIndex", startIndex);
	        data.put("currentCount", currentCount);
		List<Video> products = videoMapper.findProductPageBean(data);
		pageBean.setProducts(products);
		System.out.println("User###   "+products);
		System.out.println("startIndex开始查询：  "+startIndex+  "  currentCount结束查询： "+currentCount);
		return pageBean;
	}
	@Override
	public PageBean<Video> findPageBean(int currentPage) {
		PageBean<Video> pageBean = new PageBean<Video>();
		//1.当前页数		---- 前台用户点击的页数
		pageBean.setCurrentPage(currentPage);
		System.out.println("currentPage当前页数：  "+currentPage);
		//2.当前页面显示条数	---- 默认设定
		int currentCount = 1;
		pageBean.setCurrentCount(currentCount);
		
		//3.总条数			---- 向dao层传递请求,从数据库中获取
		int totalCount = videoMapper.getTotalCount();
		System.out.println("totalCount用户总数量：  "+totalCount);
		pageBean.setTotalCount(totalCount);
		
		
		int totalPage = (int) Math.ceil(1.0*totalCount/currentCount);
		pageBean.setTotalPage(totalPage);
		System.out.println("totalPage总页数   ：  "+totalPage);
		
		int startIndex = (currentPage-1)*currentCount;
		
		 Map<String, Object> data = new HashedMap();
	        data.put("startIndex", startIndex);
	        data.put("currentCount", currentCount);
		List<Video> products = videoMapper.findProductPageBean(data);
		pageBean.setProducts(products);
		System.out.println("User###   "+products);
		System.out.println("startIndex开始查询：  "+startIndex+  "  currentCount结束查询： "+currentCount);
		return pageBean;
	}
	@Override
	public void delByVideolist(Integer wayId) {
		videoMapper.deleteByPrimaryKey(wayId);
		
	}
	@Override
	public Video selectVideoID(Integer wayId) {
		Video video=videoMapper.selectByPrimaryKey(wayId);
		return video;
	}
	@Override
	public Integer updateVideo(Video video) {
		return videoMapper.updateByPrimaryKeySelective(video);
		
	}
	

}
