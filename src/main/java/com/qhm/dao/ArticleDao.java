package com.qhm.dao;

import java.util.List;

import com.qhm.pojo.Article;

/** 

* @author 作者 QHM: 

* @version 创建时间：2020年2月20日 下午7:25:14 

* 类说明 

*/
public interface ArticleDao {

	//通过字段查询
	List<Article> list(Article article);
	
	
	
	
}
