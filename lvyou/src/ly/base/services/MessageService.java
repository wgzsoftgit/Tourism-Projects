package ly.base.services;


import ly.base.po.domain.Message;
import ly.base.tools.PageBean;

public interface MessageService {
	public void insertMessage(Message message);//添加留言板

	public PageBean<Message> findPageBean(int currentPage);////分页查询 

	public void delByMessagelist(Integer mesId);//删除mesId留言板字段

	public Message selectMessageID(Integer mesId);//修改mesId留言板
	
	public Integer updateMessage(Message message);//更新mesId留言板数据

}
