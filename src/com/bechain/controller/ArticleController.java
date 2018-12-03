package com.bechain.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bechain.bean.Article;
import com.bechain.service.ArticleService;

/**
 * 文章的控制器
 */

@Controller
public class ArticleController {

	@Autowired
	private ArticleService articleService;

	/**
	 * 保存文章
	 */
	@RequestMapping("/saveArticle")
	public String saveArticle(@RequestParam("colId") String classify, @RequestParam("title") String title,
			@RequestParam("author") String wirter, @RequestParam("content") String body, HttpSession session) {
		System.out.println(title + "   " + classify + "   " + wirter + "     " + body + "      ");
		Article article = new Article();
		Date date = new Date();
		String imageFilePath = "/WebRoot/upload/images/1.jpg";
		article.setTitle(title);
		article.setClassify(classify);
		article.setDate(date);
		article.setWriter(wirter);
		article.setBody(body);
		article.setIco(imageFilePath);
		articleService.saveArticle(article);
		return "redirect:index.jsp";
	}

	/**
	 * 查询所有文章的id,title
	 */
	@RequestMapping("/selectAllArticle")
	@ResponseBody
	public List<Article> selectAllArticle() {
		List<Article> articles = new ArrayList<Article>();
		articles = articleService.selectAllArticle();
		return articles;
	}

	/**
	 * 根据id更新文章
	 */
	@RequestMapping("/updateArticle")
	public String updateArticle(@RequestParam("colId") String classify, @RequestParam("title") String title,
			@RequestParam("author") String wirter, @RequestParam("content") String body, HttpSession session) {
		Article article = new Article();
		Date date = new Date();
		String imageFilePath = "/WebRoot/upload/images/1.jpg";
		article.setTitle(title);
		article.setClassify(classify);
		article.setDate(date);
		article.setWriter(wirter);
		article.setBody(body);
		article.setIco(imageFilePath);
		//此处id需要前台返回
		article.setId(100000);
		articleService.updateArticle(article);
		return "redirect:index.jsp";
	}
	
	/**
	 * 根据id删除文章
	 */
	@RequestMapping("/deleteArticle")
	public String deleteArticle(Article article){
		article.setId(100006);
		articleService.deleteArticle(article);
		return "redirect:index.jsp";
	}
}
