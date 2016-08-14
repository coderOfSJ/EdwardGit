package com.tiptop.service;

import java.util.List;

import com.tiptop.model.Websites;

public interface IWebsitesService {
	//通过id查询网站
	Websites getWebsitesById(int websitesId);
	//通过id删除网站
	int deleteWebsitesById(int websitesId);
	//增加网站
	int addWebsites(Websites websites);
	//修改网站
	int updateWebsites(Websites websites);
	//获取全部网站
	List<Websites> findAllWebsites();
}
