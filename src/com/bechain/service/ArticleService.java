package com.bechain.service;

import java.util.List;

import com.bechain.bean.Article;

public interface ArticleService {
	// ��������
	int saveArticle(Article article);

	// ɾ������
	int deleteArticle(Article article);

	// �޸�����
	int updateArticle(Article article);

	// ��ѯ����
	Article selectArticle(Article article);
	
	//��ѯ��������
	List<Article> selectAllArticle();
}
