package com.tiptop.WebsitesServiceTest;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.tiptop.model.Websites;
import com.tiptop.service.IWebsitesService;

@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})

public class MybaitisTest {

	private static Logger logger = Logger.getLogger(MybaitisTest.class);
	@Resource
	private IWebsitesService websitesService;
	
	@Test
	public void test1(){
		Websites websites = websitesService.getWebsitesById(1);
		logger.info(JSON.toJSON(websites));
	}
	
	@Test
	public void test2(){
		Websites websites = new Websites();
		String name = "hupu";
		String url  ="www.hupu.com";
		websites.setName(name);
		websites.setUrl(url);
		websitesService.addWebsites(websites);
		logger.info(JSON.toJSON(websites));
	}
	
	@Test
	public void test3(){
		List<Websites> list = websitesService.findAllWebsites();
		for(Websites websites : list){
			logger.info(JSON.toJSON(websites));
		}
	}
}
