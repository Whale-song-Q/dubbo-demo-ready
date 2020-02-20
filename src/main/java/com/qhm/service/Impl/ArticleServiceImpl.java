package com.qhm.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qhm.dao.ArticleDao;
import com.qhm.pojo.Article;
import com.qhm.service.ArticleService;

/** 

* @author 作者 QHM: 

* @version 创建时间：2020年2月20日 下午7:26:08 

* 类说明 

*/
@Service
public class ArticleServiceImpl implements ArticleService{

	
	@Resource
	ArticleDao articleDao;
	
	
	
	@Override
	public List<Article> list(Article article) {
		// TODO Auto-generated method stub
		return articleDao.list(article);
	}

	
	
	
	
	
	
	
	
	
	
	
}
