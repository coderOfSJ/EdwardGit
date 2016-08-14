package com.tiptop.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tiptop.model.Websites;
import com.tiptop.service.IWebsitesService;

@Controller
@RequestMapping("/websites")
public class WebsitesController {
	@Resource
	private IWebsitesService websitesService;
	
	@RequestMapping("/getWebsitesById")
	public String getWebsitesById(HttpServletRequest request,Model model){
		int websitesId = Integer.parseInt(request.getParameter("websitesId"));
		Websites websites = this.websitesService.getWebsitesById(websitesId);
		model.addAttribute("websites",websites);
		return "index";
	}
	
	@RequestMapping("/deleteWebsitesById")
	public String deleteWebsitesById(HttpServletRequest request){
		int websitesId = Integer.parseInt(request.getParameter("websitesId"));
		int websitesIddeleted = this.websitesService.deleteWebsitesById(websitesId);
		System.out.println(websitesIddeleted);
		return "index";
	}
	
	@RequestMapping("/addWebsites")
	public String addWebsites(Websites websites){
		int websitesIdAdded = this.websitesService.addWebsites(websites);
		System.out.println(websitesIdAdded);
		return "index";
	}
	
	@RequestMapping("/updateWebsites")
	public String updateWebsites(Websites websites){
		int websitesIdUpdated = this.websitesService.updateWebsites(websites);
		System.out.println(websitesIdUpdated);
		return "index";
	}
	
	@RequestMapping("/findAllWebsites")
	public String findAllWebsites(){
		List<Websites> list = this.websitesService.findAllWebsites();
		return "index";
	}
}
