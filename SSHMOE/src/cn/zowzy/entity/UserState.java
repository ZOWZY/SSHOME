package cn.zowzy.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 
*  
* �����ƣ�UserState   
* ��������    �û�״̬��
* �����ˣ�ZJH   
* ����ʱ�䣺2017��3��29�� ����9:41:04     
*
 */
public class UserState {
	
	private Integer usid;//�û�״̬ID
	private String description;  //�û�״̬����
	
	
	private Set<User> userSet=new HashSet<User>();
	
	
	
	
	
	public Set<User> getUserSet() {
		return userSet;
	}
	public void setUserSet(Set<User> userSet) {
		this.userSet = userSet;
	}
	
	
	public Integer getUsid() {
		return usid;
	}
	public void setUsid(Integer usid) {
		this.usid = usid;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	

}