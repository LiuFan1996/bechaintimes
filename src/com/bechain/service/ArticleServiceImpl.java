package com.bechain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bechain.bean.Article;
import com.bechain.mapper.ArticleMapper;

@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	private ArticleMapper articleMapper;

	@Override
	public int saveArticle(Article article) {
		return articleMapper.saveArticle(article);
	}

	@Override
	public int deleteArticle(Article article) {
		return articleMapper.deleteArticle(article);
	}

	@Override
	public int updateArticle(Article article) {
		return articleMapper.updateArticle(article);
	}

	@Override
	public Article selectArticle(Article article) {
		return articleMapper.selectArticle(article);
	}

	@Override
	public List<Article> selectAllArticle() {
		return articleMapper.selectAllArticle();
	}

}
