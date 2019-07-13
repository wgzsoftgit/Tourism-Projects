package ly.base.services.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ly.base.dao.mapper.MessageMapper;
import ly.base.po.domain.Message;
import ly.base.services.MessageService;
import ly.base.tools.PageBean;
@Service
public class MessageServiceImpl implements MessageService {
	@Autowired
	public MessageMapper messageMapper;
	@Override
	public void insertMessage(Message message) {
		messageMapper.insert(message);
		
	}
	@Override
	public PageBean<Message> findPageBean(int currentPage) {
		PageBean<Message> pageBean = new PageBean<Message>();
		//1.当前页数		---- 前台用户点击的页数
		pageBean.setCurrentPage(currentPage);
		System.out.println("currentPage当前页数：  "+currentPage);
		//2.当前页面显示条数	---- 默认设定
		int currentCount = 11;
		pageBean.setCurrentCount(currentCount);
		
		//3.总条数			---- 向dao层传递请求,从数据库中获取
		int totalCount = messageMapper.getTotalCount();
		System.out.println("totalCount用户总数量：  "+totalCount);
		pageBean.setTotalCount(totalCount);
		
		
		int totalPage = (int) Math.ceil(1.0*totalCount/currentCount);
		pageBean.setTotalPage(totalPage);
		System.out.println("totalPage总页数   ：  "+totalPage);
		
		int startIndex = (currentPage-1)*currentCount;
		
		 Map<String, Object> data = new HashedMap();
	        data.put("startIndex", startIndex);
	        data.put("currentCount", currentCount);
		List<Message> products = messageMapper.findProductPageBean(data);
		pageBean.setProducts(products);
		System.out.println("User###   "+products);
		System.out.println("startIndex开始查询：  "+startIndex+  "  currentCount结束查询： "+currentCount);
		return pageBean;
	}
	@Override
	public void delByMessagelist(Integer mesId) {
		messageMapper.deleteByPrimaryKey(mesId);
		
	}
	@Override
	public Message selectMessageID(Integer mesId) {
		Message message=messageMapper.selectByPrimaryKey(mesId);
		return message;
	}
	
	@Override
	public Integer updateMessage(Message message) {
	Integer ok=	messageMapper.updateByPrimaryKeySelective(message);
		System.err.println("消息添加成功/失败："+ok);
		return ok;
		
	}
	
}
