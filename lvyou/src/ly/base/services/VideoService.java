package ly.base.services;

import ly.base.po.domain.Scenic;
import ly.base.po.domain.Video;

import ly.base.tools.PageBean;

public interface VideoService {

	public void insertVideo(Video video);//添加直播

	public PageBean<Video> findPageBean(int currentPage);////分页查询 

	public void delByVideolist(Integer wayId);//删除wayId直播字段

	public Video selectVideoID(Integer wayId);//修改wayId直播
	
	public Integer updateVideo(Video video);//更新wayId直播数据
	public PageBean<Video> findPageBeanqiantai(int currentPage);

}
