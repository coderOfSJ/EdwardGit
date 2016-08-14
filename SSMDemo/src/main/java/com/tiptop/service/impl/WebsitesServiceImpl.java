package com.tiptop.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tiptop.dao.WebsitesMapper;
import com.tiptop.model.Websites;
import com.tiptop.service.IWebsitesService;

@Service("websitesService")
public class WebsitesServiceImpl implements IWebsitesService {
	@Resource
	private WebsitesMapper websitesMapper;
	@Override
	public Websites getWebsitesById(int websitesId) {
		// TODO Auto-generated method stub
		return this.websitesMapper.selectByPrimaryKey(websitesId);
	}

	@Override
	public int deleteWebsitesById(int websitesId) {
		// TODO Auto-generated method stub
		return this.websitesMapper.deleteByPrimaryKey(websitesId);
	}

	@Override
	public int addWebsites(Websites websites) {
		// TODO Auto-generated method stub
		return this.websitesMapper.insert(websites);
	}

	@Override
	public int updateWebsites(Websites websites) {
		// TODO Auto-generated method stub
		return this.websitesMapper.updateByPrimaryKey(websites);
	}

	@Override
	public List<Websites> findAllWebsites() {
		// TODO Auto-generated method stub
		return this.websitesMapper.findAllWebsites();
	}
	
}
