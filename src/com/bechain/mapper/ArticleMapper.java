package com.bechain.mapper;

import java.util.List;

import com.bechain.bean.Article;

public interface ArticleMapper {
	//保存文章
	int saveArticle(Article article);
	//删除文章
	int deleteArticle(Article article);
	//修改文章
	int updateArticle(Article article);
	//查询文章
	Article selectArticle(Article article);
	//查询所有文章
	List<Article> selectAllArticle();
}
