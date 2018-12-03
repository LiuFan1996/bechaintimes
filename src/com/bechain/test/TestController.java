package com.bechain.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bechain.bean.Article;
import com.bechain.service.ArticleService;

@Controller
public class TestController {
	
	@Autowired
	private ArticleService articleService;

	@RequestMapping("/articleList")
	@ResponseBody
	public List<Article> articleList(String email, String password, HttpSession session) {
		List<Article> articles = new ArrayList<Article>();
		articles.add(new Article(1, "����", "����1", "����", "����ͼ1", "����", new Date()));
		articles.add(new Article(2, "����", "����2", "����", "����ͼ2", "����", new Date()));
		articles.add(new Article(3, "����", "����3", "����", "����ͼ3", "����", new Date()));
		return articles;
	}

	@RequestMapping("/saveArticleTest")
	public String saveArticleTest(Article article) {
		article=new Article("����", "����1", "����", "����ͼ1", "����1", new Date());
		articleService.saveArticle(article);
		return "redirect:index.jsp";
	}

	
	@RequestMapping("/deleteArticleTest")
	public String deleteArticleTest(Article article){
		article.setId(5);
		articleService.deleteArticle(article);
		return "redirect:index.jsp";
	}
	
	//title,ico,body,date
	@RequestMapping("/updateArticleTest")
	public String updateArticleTest(Article article){
		article.setId(6);
		article.setTitle("xxxxxxx");
		article.setIco("yyyy");
		article.setBody("zzzz");
		article.setDate(new Date());
		articleService.updateArticle(article);
		return "redirect:index.jsp";
	}
	
	@RequestMapping("/selectArticleTest")
	public String selectArticleTest(Article article){
		article.setId(6);
		Article article2=articleService.selectArticle(article);
		System.out.println(article2);
		return "redirect:index.jsp";
	}
}
