package com.qhm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.qhm.pojo.Article;
import com.qhm.service.ArticleService;

/** 

* @author 作者 QHM: 

* @version 创建时间：2020年2月20日 下午7:22:42 

* 类说明 

*/
@Controller
public class ArticleController {

	@Autowired
	ArticleService articleService; 
	
	@RequestMapping("list")
	public String list(Model model,Article article){
		
		
		List<Article> listArticleBycondition=articleService.list(article);
		
		model.addAttribute("listArticleBycondition",listArticleBycondition);
		
		return "list";
	}
	
	
	
	
	
	
	
	
}
